// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TaxTransactionCreateReversalParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The line item amounts to reverse. */
  @SerializedName("line_items")
  List<TaxTransactionCreateReversalParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If {@code partial}, the provided line item amounts are reversed. If {@code full}, the original
   * transaction is fully reversed.
   */
  @SerializedName("mode")
  Mode mode;

  /** The ID of the transaction to partially or fully reverse. */
  @SerializedName("original_transaction")
  String originalTransaction;

  /**
   * A custom identifier for this reversal, such as 'myOrder_123-refund_1'. Must be unique across
   * all transactions.
   */
  @SerializedName("reference")
  String reference;

  private TaxTransactionCreateReversalParams(
      List<String> expand,
      Map<String, Object> extraParams,
      List<TaxTransactionCreateReversalParams.LineItem> lineItems,
      Map<String, String> metadata,
      Mode mode,
      String originalTransaction,
      String reference) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.mode = mode;
    this.originalTransaction = originalTransaction;
    this.reference = reference;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<TaxTransactionCreateReversalParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private Mode mode;

    private String originalTransaction;

    private String reference;

    /** Finalize and obtain parameter instance from this builder. */
    public TaxTransactionCreateReversalParams build() {
      return new TaxTransactionCreateReversalParams(
          this.expand,
          this.extraParams,
          this.lineItems,
          this.metadata,
          this.mode,
          this.originalTransaction,
          this.reference);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TaxTransactionCreateReversalParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TaxTransactionCreateReversalParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * TaxTransactionCreateReversalParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link TaxTransactionCreateReversalParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * TaxTransactionCreateReversalParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(TaxTransactionCreateReversalParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * TaxTransactionCreateReversalParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<TaxTransactionCreateReversalParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * TaxTransactionCreateReversalParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link TaxTransactionCreateReversalParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * If {@code partial}, the provided line item amounts are reversed. If {@code full}, the
     * original transaction is fully reversed.
     */
    public Builder setMode(TaxTransactionCreateReversalParams.Mode mode) {
      this.mode = mode;
      return this;
    }

    /** The ID of the transaction to partially or fully reverse. */
    public Builder setOriginalTransaction(String originalTransaction) {
      this.originalTransaction = originalTransaction;
      return this;
    }

    /**
     * A custom identifier for this reversal, such as 'myOrder_123-refund_1'. Must be unique across
     * all transactions.
     */
    public Builder setReference(String reference) {
      this.reference = reference;
      return this;
    }
  }

  @Getter
  public static class LineItem {
    /** The amount to reverse, in negative integer cents. */
    @SerializedName("amount")
    Long amount;

    /** The amount of tax to reverse, in negative integer cents. */
    @SerializedName("amount_tax")
    Long amountTax;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** The {@code id} of the line item to reverse in the original transaction. */
    @SerializedName("original_line_item")
    String originalLineItem;

    /** The quantity reversed. */
    @SerializedName("quantity")
    Long quantity;

    /** A custom identifier for this line item in the reversal transaction, such as 'L1-refund'. */
    @SerializedName("reference")
    String reference;

    private LineItem(
        Long amount,
        Long amountTax,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String originalLineItem,
        Long quantity,
        String reference) {
      this.amount = amount;
      this.amountTax = amountTax;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.originalLineItem = originalLineItem;
      this.quantity = quantity;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Long amountTax;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String originalLineItem;

      private Long quantity;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public TaxTransactionCreateReversalParams.LineItem build() {
        return new TaxTransactionCreateReversalParams.LineItem(
            this.amount,
            this.amountTax,
            this.extraParams,
            this.metadata,
            this.originalLineItem,
            this.quantity,
            this.reference);
      }

      /** The amount to reverse, in negative integer cents. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** The amount of tax to reverse, in negative integer cents. */
      public Builder setAmountTax(Long amountTax) {
        this.amountTax = amountTax;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TaxTransactionCreateReversalParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link TaxTransactionCreateReversalParams.LineItem#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TaxTransactionCreateReversalParams.LineItem#metadata} for the field documentation.
       */
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link TaxTransactionCreateReversalParams.LineItem#metadata} for the field
       * documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** The {@code id} of the line item to reverse in the original transaction. */
      public Builder setOriginalLineItem(String originalLineItem) {
        this.originalLineItem = originalLineItem;
        return this;
      }

      /** The quantity reversed. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * A custom identifier for this line item in the reversal transaction, such as 'L1-refund'.
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }
  }

  public enum Mode implements ApiRequestParams.EnumParam {
    @SerializedName("full")
    FULL("full"),

    @SerializedName("partial")
    PARTIAL("partial");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Mode(String value) {
      this.value = value;
    }
  }
}
