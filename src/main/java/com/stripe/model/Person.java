// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PersonUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Person extends ApiResource implements HasId, MetadataStore<Person> {
  /** The account the person is associated with. */
  @SerializedName("account")
  String account;

  @SerializedName("address")
  Address address;

  /** The Kana variation of the person's address (Japan only). */
  @SerializedName("address_kana")
  LegalEntity.JapanAddress addressKana;

  /** The Kanji variation of the person's address (Japan only). */
  @SerializedName("address_kanji")
  LegalEntity.JapanAddress addressKanji;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  @SerializedName("dob")
  LegalEntity.DateOfBirth dob;

  /** The person's email address. */
  @SerializedName("email")
  String email;

  /** The person's first name. */
  @SerializedName("first_name")
  String firstName;

  /** The Kana variation of the person's first name (Japan only). */
  @SerializedName("first_name_kana")
  String firstNameKana;

  /** The Kanji variation of the person's first name (Japan only). */
  @SerializedName("first_name_kanji")
  String firstNameKanji;

  /** The person's gender (International regulations require either "male" or "female"). */
  @SerializedName("gender")
  String gender;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  @SerializedName("id")
  String id;

  /** Whether the person's `id_number` was provided. */
  @SerializedName("id_number_provided")
  Boolean idNumberProvided;

  /** The person's last name. */
  @SerializedName("last_name")
  String lastName;

  /** The Kana variation of the person's last name (Japan only). */
  @SerializedName("last_name_kana")
  String lastNameKana;

  /** The Kanji variation of the person's last name (Japan only). */
  @SerializedName("last_name_kanji")
  String lastNameKanji;

  /** The person's maiden name. */
  @SerializedName("maiden_name")
  String maidenName;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /** The person's phone number. */
  @SerializedName("phone")
  String phone;

  @SerializedName("relationship")
  Relationship relationship;

  /**
   * Information about the requirements for this person, including what information needs to be
   * collected, and by when.
   */
  @SerializedName("requirements")
  Requirements requirements;

  /** Whether the last 4 digits of this person's SSN have been provided. */
  @SerializedName("ssn_last_4_provided")
  Boolean ssnLast4Provided;

  @SerializedName("verification")
  LegalEntity.Verification verification;

  /** Updates an existing person. */
  public Person update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing person. */
  public Person update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/accounts/%s/persons/%s", this.getAccount(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }

  /** Updates an existing person. */
  public Person update(PersonUpdateParams params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/accounts/%s/persons/%s", this.getAccount(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/accounts/%s/persons/%s", this.getAccount(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.DELETE, url, params, Person.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship extends StripeObject {
    /**
     * Whether the person opened the account. This person provides information about themselves, and
     * general information about the account.
     */
    @SerializedName("account_opener")
    Boolean accountOpener;

    /** Whether the person is a director of the account's legal entity. */
    @SerializedName("director")
    Boolean director;

    /** Whether the person is an owner of the account’s legal entity. */
    @SerializedName("owner")
    Boolean owner;

    /** The percent owned by the person of the account's legal entity. */
    @SerializedName("percent_ownership")
    BigDecimal percentOwnership;

    /** The person's title (e.g., CEO, Support Engineer). */
    @SerializedName("title")
    String title;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * Fields that need to be collected to keep the person's account enabled. If not collected by
     * the account's `current_deadline`, these fields are moved to `past_due` and the account is
     * disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * Fields that need to be collected assuming all volume thresholds are reached. As fields are
     * needed, they are moved to `currently_due` and the account's `current_deadline` is set.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by the account's `current_deadline`. These fields need to be
     * collected to enable payouts for the person's account.
     */
    @SerializedName("past_due")
    List<String> pastDue;
  }
}
