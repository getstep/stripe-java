// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class BitcoinTransactionCollectionListParams extends ApiParamRequest {
  @SerializedName("customer")
  String customer;

  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("limit")
  Long limit;

  @SerializedName("starting_after")
  String startingAfter;

  private BitcoinTransactionCollectionListParams(
      String customer, String endingBefore, List<String> expand, Long limit, String startingAfter) {
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.startingAfter = startingAfter;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.BitcoinTransactionCollectionListParams.Builder();
  }

  public static class Builder {
    private String customer;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String startingAfter;

    public BitcoinTransactionCollectionListParams build() {
      return new BitcoinTransactionCollectionListParams(
          customer, endingBefore, expand, limit, startingAfter);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
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
  }
}
