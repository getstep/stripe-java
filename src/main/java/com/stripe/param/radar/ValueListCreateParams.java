// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueListCreateParams extends ApiParamRequest {
  @SerializedName("alias")
  String alias;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("item_type")
  ItemType itemType;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("name")
  String name;

  private ValueListCreateParams(
      String alias,
      List<String> expand,
      ItemType itemType,
      Map<String, String> metadata,
      String name) {
    this.alias = alias;
    this.expand = expand;
    this.itemType = itemType;
    this.metadata = metadata;
    this.name = name;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.radar.ValueListCreateParams.Builder();
  }

  public static class Builder {
    private String alias;

    private List<String> expand;

    private ItemType itemType;

    private Map<String, String> metadata;

    private String name;

    public ValueListCreateParams build() {
      return new ValueListCreateParams(alias, expand, itemType, metadata, name);
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

    public Builder setAlias(String alias) {
      this.alias = alias;
      return this;
    }

    public Builder setItemType(ItemType itemType) {
      this.itemType = itemType;
      return this;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }
  }

  public enum ItemType {
    @SerializedName("card_bin")
    CARD_BIN("card_bin"),

    @SerializedName("card_fingerprint")
    CARD_FINGERPRINT("card_fingerprint"),

    @SerializedName("case_sensitive_string")
    CASE_SENSITIVE_STRING("case_sensitive_string"),

    @SerializedName("country")
    COUNTRY("country"),

    @SerializedName("email")
    EMAIL("email"),

    @SerializedName("ip_address")
    IP_ADDRESS("ip_address"),

    @SerializedName("string")
    STRING("string");

    private final String value;

    ItemType(String value) {
      this.value = value;
    }
  }
}
