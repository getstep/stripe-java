// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisputeCreateParams extends ApiParamRequest {
  @SerializedName("amount")
  Long amount;

  @SerializedName("disputed_transaction")
  String disputedTransaction;

  @SerializedName("evidence")
  Evidence evidence;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("reason")
  Reason reason;

  private DisputeCreateParams(
      Long amount,
      String disputedTransaction,
      Evidence evidence,
      List<String> expand,
      Map<String, String> metadata,
      Reason reason) {
    this.amount = amount;
    this.disputedTransaction = disputedTransaction;
    this.evidence = evidence;
    this.expand = expand;
    this.metadata = metadata;
    this.reason = reason;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.issuing.DisputeCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;

    private String disputedTransaction;

    private Evidence evidence;

    private List<String> expand;

    private Map<String, String> metadata;

    private Reason reason;

    public DisputeCreateParams build() {
      return new DisputeCreateParams(
          amount, disputedTransaction, evidence, expand, metadata, reason);
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

    public Builder setDisputedTransaction(String disputedTransaction) {
      this.disputedTransaction = disputedTransaction;
      return this;
    }

    public Builder setEvidence(Evidence.Builder evidence) {
      this.evidence = evidence.build();
      return this;
    }

    public Builder setReason(Reason reason) {
      this.reason = reason;
      return this;
    }
  }

  public static class Evidence {
    @SerializedName("fraudulent")
    Fraudulent fraudulent;

    @SerializedName("other")
    Other other;

    private Evidence(Fraudulent fraudulent, Other other) {
      this.fraudulent = fraudulent;
      this.other = other;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.issuing.DisputeCreateParams.Evidence.Builder();
    }

    public static class Builder {
      private Fraudulent fraudulent;

      private Other other;

      public Evidence build() {
        return new Evidence(fraudulent, other);
      }

      public Builder setFraudulent(Fraudulent.Builder fraudulent) {
        this.fraudulent = fraudulent.build();
        return this;
      }

      public Builder setOther(Other.Builder other) {
        this.other = other.build();
        return this;
      }
    }

    public static class Fraudulent {
      @SerializedName("dispute_explanation")
      String disputeExplanation;

      @SerializedName("uncategorized_file")
      String uncategorizedFile;

      private Fraudulent(String disputeExplanation, String uncategorizedFile) {
        this.disputeExplanation = disputeExplanation;
        this.uncategorizedFile = uncategorizedFile;
      }

      public static Builder newBuilder() {
        return new com.stripe.param.issuing.DisputeCreateParams.Evidence.Fraudulent.Builder();
      }

      public static class Builder {
        private String disputeExplanation;

        private String uncategorizedFile;

        public Fraudulent build() {
          return new Fraudulent(disputeExplanation, uncategorizedFile);
        }

        public Builder setDisputeExplanation(String disputeExplanation) {
          this.disputeExplanation = disputeExplanation;
          return this;
        }

        public Builder setUncategorizedFile(String uncategorizedFile) {
          this.uncategorizedFile = uncategorizedFile;
          return this;
        }
      }
    }

    public static class Other {
      @SerializedName("dispute_explanation")
      String disputeExplanation;

      @SerializedName("uncategorized_file")
      String uncategorizedFile;

      private Other(String disputeExplanation, String uncategorizedFile) {
        this.disputeExplanation = disputeExplanation;
        this.uncategorizedFile = uncategorizedFile;
      }

      public static Builder newBuilder() {
        return new com.stripe.param.issuing.DisputeCreateParams.Evidence.Other.Builder();
      }

      public static class Builder {
        private String disputeExplanation;

        private String uncategorizedFile;

        public Other build() {
          return new Other(disputeExplanation, uncategorizedFile);
        }

        public Builder setDisputeExplanation(String disputeExplanation) {
          this.disputeExplanation = disputeExplanation;
          return this;
        }

        public Builder setUncategorizedFile(String uncategorizedFile) {
          this.uncategorizedFile = uncategorizedFile;
          return this;
        }
      }
    }
  }

  public enum Reason {
    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),

    @SerializedName("other")
    OTHER("other");

    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
