// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class WebhookEndpointRetrieveParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  private WebhookEndpointRetrieveParams(List<String> expand) {
    this.expand = expand;
  }

  public static Builder builder() {
    return new com.stripe.param.WebhookEndpointRetrieveParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    /** Finalize and obtain parameter instance from this builder. */
    public WebhookEndpointRetrieveParams build() {
      return new WebhookEndpointRetrieveParams(this.expand);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointRetrieveParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * WebhookEndpointRetrieveParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }
  }
}
