// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class ReaderListParams extends ApiParamRequest {
  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("limit")
  Long limit;

  @SerializedName("location")
  String location;

  @SerializedName("operator_account")
  String operatorAccount;

  @SerializedName("starting_after")
  String startingAfter;

  @SerializedName("status")
  String status;

  private ReaderListParams(
      String endingBefore,
      List<String> expand,
      Long limit,
      String location,
      String operatorAccount,
      String startingAfter,
      String status) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.location = location;
    this.operatorAccount = operatorAccount;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.terminal.ReaderListParams.Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String location;

    private String operatorAccount;

    private String startingAfter;

    private String status;

    public ReaderListParams build() {
      return new ReaderListParams(
          endingBefore, expand, limit, location, operatorAccount, startingAfter, status);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
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

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setOperatorAccount(String operatorAccount) {
      this.operatorAccount = operatorAccount;
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
}
