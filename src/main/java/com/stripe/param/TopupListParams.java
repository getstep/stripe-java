// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class TopupListParams extends ApiParamRequest {
  @SerializedName("amount")
  Object amount;

  @SerializedName("created")
  Object created;

  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("limit")
  Long limit;

  @SerializedName("starting_after")
  String startingAfter;

  @SerializedName("status")
  Status status;

  private TopupListParams(
      Object amount,
      Object created,
      String endingBefore,
      List<String> expand,
      Long limit,
      String startingAfter,
      Status status) {
    this.amount = amount;
    this.created = created;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.TopupListParams.Builder();
  }

  public static class Builder {
    private Object amount;

    private Object created;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String startingAfter;

    private Status status;

    public TopupListParams build() {
      return new TopupListParams(
          amount, created, endingBefore, expand, limit, startingAfter, status);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setAmount(Amount.Builder amount) {
      this.amount = amount.build();
      return this;
    }

    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    public Builder setCreated(Created.Builder created) {
      this.created = created.build();
      return this;
    }

    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }
  }

  public static class Amount {
    @SerializedName("gt")
    Long gt;

    @SerializedName("gte")
    Long gte;

    @SerializedName("lt")
    Long lt;

    @SerializedName("lte")
    Long lte;

    private Amount(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.TopupListParams.Amount.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      public Amount build() {
        return new Amount(gt, gte, lt, lte);
      }

      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public static class Created {
    @SerializedName("gt")
    Long gt;

    @SerializedName("gte")
    Long gte;

    @SerializedName("lt")
    Long lt;

    @SerializedName("lte")
    Long lte;

    private Created(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.TopupListParams.Created.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      public Created build() {
        return new Created(gt, gte, lt, lte);
      }

      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Status {
    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("pending")
    PENDING("pending"),

    @SerializedName("succeeded")
    SUCCEEDED("succeeded");

    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
