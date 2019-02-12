// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class ApplicationFeeRetrieveParams extends ApiParamRequest {
  @SerializedName("expand")
  List<String> expand;

  private ApplicationFeeRetrieveParams(List<String> expand) {
    this.expand = expand;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.ApplicationFeeRetrieveParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    public ApplicationFeeRetrieveParams build() {
      return new ApplicationFeeRetrieveParams(expand);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }
  }
}
