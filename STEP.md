# Overview
We are on the private forked version of the SDK. This is because Stripe doesn't support
Issuing Settlement and Card Design features in their public SDK.

# Build Locally
To build locally, run:

```
./gradlew build -x test -x spotlessCheck
```

Skip tests because they don't work without a Stripe test server that we don't have access to.

It is not uncommon to get JDK version error.
```
Starting a Gradle Daemon (subsequent builds will be faster)

FAILURE: Build failed with an exception.

* Where:
Build file '/Users/andrey/workspace/getstep/stripe-java/build.gradle' line: 31

* What went wrong:
A problem occurred evaluating root project 'stripe-java'.
> JDK 17 is required to build Stripe
```
For the above error make sure you have `JAVA_HOME` set to the requested version.

```
asdf list-all java |grep temurin
asdf install java temurin-17.0.12+7
export JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-17.0.12+7/Contents/Home
```

# Publish to jitpack
We are hosting built library at JitPack.

1. Look at the latest `sha` for the `step` branch, take first 8 chars.
    ```
    git log | head -1
    commit 26989b1ab7c938c91b2e640b444ed430dd026891
    ```
2. Update `gradle/libs.versions.toml` in `server` repository with the `sha` from above.
    ```
    stripeJava = "26989b1a"
    ```
3. The dependency fetch above will trigger a build on JitPack for the given sha.
4. Go to https://jitpack.io/#getstep/stripe-java to see all the available builds.

# Update Stripe SDK
## Rebase `master` branch
To rebase master first check if you have upstream set-up.

```
git remote -v

origin	git@github.com:getstep/stripe-java.git (fetch)
origin	git@github.com:getstep/stripe-java.git (push)
upstream	https://github.com/stripe/stripe-java.git (fetch)
upstream	https://github.com/stripe/stripe-java.git (push)
```

If you don't see `upstream` in the output, add one. You have to do it only once.

```
git remote add upstream https://github.com/stripe/stripe-java.git
```

Now fetch upstream and rebase master.

```
git checkout master
git fetch upstream
git rebase upstream/master
git push origin master
```

Confirm in UI that the branch is even with stripe:master.
```
This branch is even with stripe:master.
```

## Checkout `step` branch
```
git checkout step
```
If the command above does not work, and you are in a detached state, use the following command.
```
git checkout master
git checkout --track origin/step
```

If there's a message about diverged branches.
```
git checkout step
warning: refname 'step' is ambiguous.
Switched to branch 'step'
Your branch and 'origin/step' have diverged,
and have 15 and 308 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)
```
Then reset the branch.
```
git reset --hard origin/step
HEAD is now at f44c911a35 Support Card.wallets
```

## Backup `step` branch
Check current Stripe SDK version of `step` branch.
```
git checkout step
git log |grep "Bump version to" | head -1

Bump version to 19.37.0
```

Create a backup branch of `step` with SDK version.
```
git checkout step
git checkout -b step-with-19.37.0 # use version from above
git push
```

Confirm that last commits on both `step` and `step-with-26.9.0` are the same.
```
git checkout step-with-26.9.0 # you should be on this branch already
git show --summary

commit 6ec4cc9f92d321fa17473400dfa52e16e92ca8f9 (HEAD -> step-with-26.9.0, origin/step-with-26.9.0, origin/step, step)
Author: Jason Li <jason.li@step.com>
Date:   Wed Sep 4 10:47:07 2024 -0400

    add back in volumeDecimal (#35)
```

```
git checkout step
git show --summary

commit 6ec4cc9f92d321fa17473400dfa52e16e92ca8f9 (HEAD -> step, origin/step-with-26.9.0, origin/step, step-with-26.9.0)
Author: Jason Li <jason.li@step.com>
Date:   Wed Sep 4 10:47:07 2024 -0400

    add back in volumeDecimal (#35)
```

## Rebase `step` branch from `master`
Note the latest version of Stripe SDK.
```
git checkout master
git log |grep "Bump version to" | head -1

Bump version to 19.45.0
```

Create staging version of rebase branch, in case things go sideways and rebase against master. Do not work on `step` backup branch.
```
git checkout step
git checkout -b am.step-with-19.45.0 # use version from above
git rebase master
git push
```
Resolve any conflicts and build the SDK locally.

## Rebase `step` branch from a tag
If you are updating to a specific version, you can rebase from a tag. Let's say we are updating to `26.12.0-beta.1`.
Update repository with the latest tags from upstream/origin.
```
git fetch --all --tags --prune
```
Create a staging version of the rebase branch.
```
git checkout step
git checkout -b am.step-with-26.12.0-beta.1 # use tag name
# rebase staged branch from master onto beta tag
git rebase --onto v26.12.0-beta.1 master am.step-with-26.12.0-beta.1
# resolve any conflicts
git push
```
Resolve any conflicts and build the SDK locally.

## Test staging branch
Update `gradle/libs.versions.toml` in `server` repository with the latest commit of
your staging branch (first 8 characters of sha-1).
```
stripeJava = "26989b1a"
```
Build and test.

## Push staging branch to `step`
Once you are satisfied with test results, push your staging branch to `step` branch.
Because we have both `step` tag and `step` branch, we have to specify which one we are pushing.
```
git push -f origin am.step-with-19.45.0:refs/heads/step
```
Confirm that `step` branch has the same last commit as your staging branch.
This completes the Stripe SDK update.
