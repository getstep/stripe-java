// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionUpdateParams extends ApiParamRequest {
  @SerializedName("expand")
  List<String> expand;

  @SerializedName("metadata")
  Map<String, String> metadata;

  private TransactionUpdateParams(List<String> expand, Map<String, String> metadata) {
    this.expand = expand;
    this.metadata = metadata;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.issuing.TransactionUpdateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, String> metadata;

    public TransactionUpdateParams build() {
      return new TransactionUpdateParams(expand, metadata);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }
  }
}
