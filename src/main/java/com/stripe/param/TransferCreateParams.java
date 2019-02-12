// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransferCreateParams extends ApiParamRequest {
  @SerializedName("amount")
  Long amount;

  @SerializedName("currency")
  String currency;

  @SerializedName("description")
  String description;

  @SerializedName("destination")
  String destination;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("source_transaction")
  String sourceTransaction;

  @SerializedName("source_type")
  SourceType sourceType;

  @SerializedName("transfer_group")
  String transferGroup;

  private TransferCreateParams(
      Long amount,
      String currency,
      String description,
      String destination,
      List<String> expand,
      Map<String, String> metadata,
      String sourceTransaction,
      SourceType sourceType,
      String transferGroup) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.destination = destination;
    this.expand = expand;
    this.metadata = metadata;
    this.sourceTransaction = sourceTransaction;
    this.sourceType = sourceType;
    this.transferGroup = transferGroup;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.TransferCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private String destination;

    private List<String> expand;

    private Map<String, String> metadata;

    private String sourceTransaction;

    private SourceType sourceType;

    private String transferGroup;

    public TransferCreateParams build() {
      return new TransferCreateParams(
          amount,
          currency,
          description,
          destination,
          expand,
          metadata,
          sourceTransaction,
          sourceType,
          transferGroup);
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

    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setDestination(String destination) {
      this.destination = destination;
      return this;
    }

    public Builder setSourceTransaction(String sourceTransaction) {
      this.sourceTransaction = sourceTransaction;
      return this;
    }

    public Builder setSourceType(SourceType sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  public enum SourceType {
    @SerializedName("alipay_account")
    ALIPAY_ACCOUNT("alipay_account"),

    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account"),

    @SerializedName("bitcoin_receiver")
    BITCOIN_RECEIVER("bitcoin_receiver"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("financing")
    FINANCING("financing"),

    @SerializedName("source")
    SOURCE("source"),

    @SerializedName("stripe_account")
    STRIPE_ACCOUNT("stripe_account");

    private final String value;

    SourceType(String value) {
      this.value = value;
    }
  }
}
