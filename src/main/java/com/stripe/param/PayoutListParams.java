// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class PayoutListParams extends ApiParamRequest {
  @SerializedName("arrival_date")
  Object arrivalDate;

  @SerializedName("created")
  Object created;

  @SerializedName("destination")
  String destination;

  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("limit")
  Long limit;

  @SerializedName("starting_after")
  String startingAfter;

  @SerializedName("status")
  String status;

  private PayoutListParams(
      Object arrivalDate,
      Object created,
      String destination,
      String endingBefore,
      List<String> expand,
      Long limit,
      String startingAfter,
      String status) {
    this.arrivalDate = arrivalDate;
    this.created = created;
    this.destination = destination;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.PayoutListParams.Builder();
  }

  public static class Builder {
    private Object arrivalDate;

    private Object created;

    private String destination;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String startingAfter;

    private String status;

    public PayoutListParams build() {
      return new PayoutListParams(
          arrivalDate, created, destination, endingBefore, expand, limit, startingAfter, status);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setArrivalDate(Long arrivalDate) {
      this.arrivalDate = arrivalDate;
      return this;
    }

    public Builder setArrivalDate(ArrivalDate.Builder arrivalDate) {
      this.arrivalDate = arrivalDate.build();
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

    public Builder setDestination(String destination) {
      this.destination = destination;
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

    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }
  }

  public static class ArrivalDate {
    @SerializedName("gt")
    Long gt;

    @SerializedName("gte")
    Long gte;

    @SerializedName("lt")
    Long lt;

    @SerializedName("lte")
    Long lte;

    private ArrivalDate(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.PayoutListParams.ArrivalDate.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      public ArrivalDate build() {
        return new ArrivalDate(gt, gte, lt, lte);
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
      return new com.stripe.param.PayoutListParams.Created.Builder();
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
}
