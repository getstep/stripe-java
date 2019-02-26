// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ExternalAccountCollectionCreateParams extends ApiRequestParams {
  /**
   * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/stripe.js), or a
   * dictionary containing a user's bank account details.
   */
  @SerializedName("bank_account")
  Object bankAccount;

  /**
   * When set to true, or if this is the first external account added in this currency, this account
   * becomes the default external account for its currency.
   */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** Please refer to full [documentation](https://stripe.com/docs/api) instead. */
  @SerializedName("external_account")
  Object externalAccount;

  /**
   * A set of key-value pairs that you can attach to an external account object. It can be useful
   * for storing additional information about the external account in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private ExternalAccountCollectionCreateParams(
      Object bankAccount,
      Boolean defaultForCurrency,
      List<String> expand,
      Object externalAccount,
      Map<String, String> metadata) {
    this.bankAccount = bankAccount;
    this.defaultForCurrency = defaultForCurrency;
    this.expand = expand;
    this.externalAccount = externalAccount;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new com.stripe.param.ExternalAccountCollectionCreateParams.Builder();
  }

  public static class Builder {
    private Object bankAccount;

    private Boolean defaultForCurrency;

    private List<String> expand;

    private Object externalAccount;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ExternalAccountCollectionCreateParams build() {
      return new ExternalAccountCollectionCreateParams(
          this.bankAccount,
          this.defaultForCurrency,
          this.expand,
          this.externalAccount,
          this.metadata);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ExternalAccountCollectionCreateParams#expand} for the field documentation.
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
     * ExternalAccountCollectionCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ExternalAccountCollectionCreateParams#metadata} for the field documentation.
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
     * ExternalAccountCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/stripe.js), or
     * a dictionary containing a user's bank account details.
     */
    public Builder setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/stripe.js), or
     * a dictionary containing a user's bank account details.
     */
    public Builder setBankAccount(Map<String, Object> bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * When set to true, or if this is the first external account added in this currency, this
     * account becomes the default external account for its currency.
     */
    public Builder setDefaultForCurrency(Boolean defaultForCurrency) {
      this.defaultForCurrency = defaultForCurrency;
      return this;
    }

    /** Please refer to full [documentation](https://stripe.com/docs/api) instead. */
    public Builder setExternalAccount(String externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /** Please refer to full [documentation](https://stripe.com/docs/api) instead. */
    public Builder setExternalAccount(Map<String, Object> externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }
  }
}
