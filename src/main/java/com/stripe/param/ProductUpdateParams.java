// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ProductUpdateParams extends ApiRequestParams {
  /** Whether the product is available for purchase. */
  @SerializedName("active")
  Boolean active;

  /**
   * A list of up to 5 alphanumeric attributes that each SKU can provide values for (e.g.,
   * `["color", "size"]`). If a value for `attributes` is specified, the list specified will replace
   * the existing attributes list on this product. Any attributes not present after the update will
   * be deleted from the SKUs for this product.
   */
  @SerializedName("attributes")
  List<String> attributes;

  /** A short one-line description of the product, meant to be displayable to the customer. */
  @SerializedName("caption")
  String caption;

  /**
   * An array of Connect application names or identifiers that should not be able to order the SKUs
   * for this product.
   */
  @SerializedName("deactivate_on")
  List<String> deactivateOn;

  /** The product's description, meant to be displayable to the customer. */
  @SerializedName("description")
  String description;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** A list of up to 8 URLs of images for this product, meant to be displayable to the customer. */
  @SerializedName("images")
  List<String> images;

  /**
   * A set of key-value pairs that you can attach to a product object. It can be useful for storing
   * additional information about the product in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The product's name, meant to be displayable to the customer. Applicable to both `service` and
   * `good` types.
   */
  @SerializedName("name")
  String name;

  /**
   * The dimensions of this product for shipping purposes. A SKU associated with this product can
   * override this value by having its own `package_dimensions`.
   */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;

  /** Whether this product is shipped (i.e., physical goods). Defaults to `true`. */
  @SerializedName("shippable")
  Boolean shippable;

  /**
   * An arbitrary string to be displayed on your customer's credit card statement. This may be up to
   * 22 characters. The statement description may not include "' characters, and will appear on your
   * customer's statement in capital letters. Non-ASCII characters are automatically stripped. While
   * most banks display this information consistently, some may display it incorrectly or not at
   * all. It must contain at least one letter. May only be set if type=`service`.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * A label that represents units of this product, such as seat(s), in Stripe and on customers’
   * receipts and invoices. Only available on products of type=`service`.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /** A URL of a publicly-accessible webpage for this product. */
  @SerializedName("url")
  String url;

  private ProductUpdateParams(
      Boolean active,
      List<String> attributes,
      String caption,
      List<String> deactivateOn,
      String description,
      List<String> expand,
      List<String> images,
      Map<String, String> metadata,
      String name,
      PackageDimensions packageDimensions,
      Boolean shippable,
      String statementDescriptor,
      String unitLabel,
      String url) {
    this.active = active;
    this.attributes = attributes;
    this.caption = caption;
    this.deactivateOn = deactivateOn;
    this.description = description;
    this.expand = expand;
    this.images = images;
    this.metadata = metadata;
    this.name = name;
    this.packageDimensions = packageDimensions;
    this.shippable = shippable;
    this.statementDescriptor = statementDescriptor;
    this.unitLabel = unitLabel;
    this.url = url;
  }

  public static Builder builder() {
    return new com.stripe.param.ProductUpdateParams.Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> attributes;

    private String caption;

    private List<String> deactivateOn;

    private String description;

    private List<String> expand;

    private List<String> images;

    private Map<String, String> metadata;

    private String name;

    private PackageDimensions packageDimensions;

    private Boolean shippable;

    private String statementDescriptor;

    private String unitLabel;

    private String url;

    /** Finalize and obtain parameter instance from this builder. */
    public ProductUpdateParams build() {
      return new ProductUpdateParams(
          this.active,
          this.attributes,
          this.caption,
          this.deactivateOn,
          this.description,
          this.expand,
          this.images,
          this.metadata,
          this.name,
          this.packageDimensions,
          this.shippable,
          this.statementDescriptor,
          this.unitLabel,
          this.url);
    }

    /**
     * Add all elements to `attributes` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#attributes} for the field documentation.
     */
    public Builder addAllAttribute(List<String> elements) {
      if (this.attributes == null) {
        this.attributes = new ArrayList<>();
      }
      this.attributes.addAll(elements);
      return this;
    }

    /**
     * Add all elements to `deactivateOn` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#deactivateOn} for the field documentation.
     */
    public Builder addAllDeactivateOn(List<String> elements) {
      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.addAll(elements);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add all elements to `images` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#images} for the field documentation.
     */
    public Builder addAllImage(List<String> elements) {
      if (this.images == null) {
        this.images = new ArrayList<>();
      }
      this.images.addAll(elements);
      return this;
    }

    /**
     * Add an element to `attributes` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#attributes} for the field documentation.
     */
    public Builder addAttribute(String element) {
      if (this.attributes == null) {
        this.attributes = new ArrayList<>();
      }
      this.attributes.add(element);
      return this;
    }

    /**
     * Add an element to `deactivateOn` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#deactivateOn} for the field documentation.
     */
    public Builder addDeactivateOn(String element) {
      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.add(element);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add an element to `images` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductUpdateParams#images} for the field documentation.
     */
    public Builder addImage(String element) {
      if (this.images == null) {
        this.images = new ArrayList<>();
      }
      this.images.add(element);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ProductUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /** Whether the product is available for purchase. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /** A short one-line description of the product, meant to be displayable to the customer. */
    public Builder setCaption(String caption) {
      this.caption = caption;
      return this;
    }

    /** The product's description, meant to be displayable to the customer. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The product's name, meant to be displayable to the customer. Applicable to both `service` and
     * `good` types.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The dimensions of this product for shipping purposes. A SKU associated with this product can
     * override this value by having its own `package_dimensions`.
     */
    public Builder setPackageDimensions(PackageDimensions packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /** Whether this product is shipped (i.e., physical goods). Defaults to `true`. */
    public Builder setShippable(Boolean shippable) {
      this.shippable = shippable;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's credit card statement. This may be up
     * to 22 characters. The statement description may not include "' characters, and will appear on
     * your customer's statement in capital letters. Non-ASCII characters are automatically
     * stripped. While most banks display this information consistently, some may display it
     * incorrectly or not at all. It must contain at least one letter. May only be set if
     * type=`service`.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * A label that represents units of this product, such as seat(s), in Stripe and on customers’
     * receipts and invoices. Only available on products of type=`service`.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /** A URL of a publicly-accessible webpage for this product. */
    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }
  }

  @Getter
  public static class PackageDimensions {
    /** Height, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("height")
    BigDecimal height;

    /** Length, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("length")
    BigDecimal length;

    /** Weight, in ounces. Maximum precision is 2 decimal places. */
    @SerializedName("weight")
    BigDecimal weight;

    /** Width, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("width")
    BigDecimal width;

    private PackageDimensions(
        BigDecimal height, BigDecimal length, BigDecimal weight, BigDecimal width) {
      this.height = height;
      this.length = length;
      this.weight = weight;
      this.width = width;
    }

    public static Builder builder() {
      return new com.stripe.param.ProductUpdateParams.PackageDimensions.Builder();
    }

    public static class Builder {
      private BigDecimal height;

      private BigDecimal length;

      private BigDecimal weight;

      private BigDecimal width;

      /** Finalize and obtain parameter instance from this builder. */
      public PackageDimensions build() {
        return new PackageDimensions(this.height, this.length, this.weight, this.width);
      }

      /** Height, in inches. Maximum precision is 2 decimal places. */
      public Builder setHeight(BigDecimal height) {
        this.height = height;
        return this;
      }

      /** Length, in inches. Maximum precision is 2 decimal places. */
      public Builder setLength(BigDecimal length) {
        this.length = length;
        return this;
      }

      /** Weight, in ounces. Maximum precision is 2 decimal places. */
      public Builder setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
      }

      /** Width, in inches. Maximum precision is 2 decimal places. */
      public Builder setWidth(BigDecimal width) {
        this.width = width;
        return this;
      }
    }
  }
}
