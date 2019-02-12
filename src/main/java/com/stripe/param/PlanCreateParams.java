// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanCreateParams extends ApiParamRequest {
  @SerializedName("active")
  Boolean active;

  @SerializedName("aggregate_usage")
  AggregateUsage aggregateUsage;

  @SerializedName("amount")
  Long amount;

  @SerializedName("billing_scheme")
  BillingScheme billingScheme;

  @SerializedName("currency")
  String currency;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("id")
  String id;

  @SerializedName("interval")
  Interval interval;

  @SerializedName("interval_count")
  Long intervalCount;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("name")
  String name;

  @SerializedName("nickname")
  String nickname;

  @SerializedName("product")
  Object product;

  @SerializedName("statement_descriptor")
  String statementDescriptor;

  @SerializedName("tiers")
  List<Tiers> tiers;

  @SerializedName("tiers_mode")
  TiersMode tiersMode;

  @SerializedName("transform_usage")
  TransformUsage transformUsage;

  @SerializedName("trial_period_days")
  Long trialPeriodDays;

  @SerializedName("usage_type")
  UsageType usageType;

  private PlanCreateParams(
      Boolean active,
      AggregateUsage aggregateUsage,
      Long amount,
      BillingScheme billingScheme,
      String currency,
      List<String> expand,
      String id,
      Interval interval,
      Long intervalCount,
      Map<String, String> metadata,
      String name,
      String nickname,
      Object product,
      String statementDescriptor,
      List<Tiers> tiers,
      TiersMode tiersMode,
      TransformUsage transformUsage,
      Long trialPeriodDays,
      UsageType usageType) {
    this.active = active;
    this.aggregateUsage = aggregateUsage;
    this.amount = amount;
    this.billingScheme = billingScheme;
    this.currency = currency;
    this.expand = expand;
    this.id = id;
    this.interval = interval;
    this.intervalCount = intervalCount;
    this.metadata = metadata;
    this.name = name;
    this.nickname = nickname;
    this.product = product;
    this.statementDescriptor = statementDescriptor;
    this.tiers = tiers;
    this.tiersMode = tiersMode;
    this.transformUsage = transformUsage;
    this.trialPeriodDays = trialPeriodDays;
    this.usageType = usageType;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.PlanCreateParams.Builder();
  }

  public static class Builder {
    private Boolean active;

    private AggregateUsage aggregateUsage;

    private Long amount;

    private BillingScheme billingScheme;

    private String currency;

    private List<String> expand;

    private String id;

    private Interval interval;

    private Long intervalCount;

    private Map<String, String> metadata;

    private String name;

    private String nickname;

    private Object product;

    private String statementDescriptor;

    private List<Tiers> tiers;

    private TiersMode tiersMode;

    private TransformUsage transformUsage;

    private Long trialPeriodDays;

    private UsageType usageType;

    public PlanCreateParams build() {
      return new PlanCreateParams(
          active,
          aggregateUsage,
          amount,
          billingScheme,
          currency,
          expand,
          id,
          interval,
          intervalCount,
          metadata,
          name,
          nickname,
          product,
          statementDescriptor,
          tiers,
          tiersMode,
          transformUsage,
          trialPeriodDays,
          usageType);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder addTiers(Tiers.Builder element) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.add(element.build());
      return this;
    }

    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    public Builder setAggregateUsage(AggregateUsage aggregateUsage) {
      this.aggregateUsage = aggregateUsage;
      return this;
    }

    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setBillingScheme(BillingScheme billingScheme) {
      this.billingScheme = billingScheme;
      return this;
    }

    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public Builder setInterval(Interval interval) {
      this.interval = interval;
      return this;
    }

    public Builder setIntervalCount(Long intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    public Builder setProduct(Product.Builder product) {
      this.product = product.build();
      return this;
    }

    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    public Builder setTiersMode(TiersMode tiersMode) {
      this.tiersMode = tiersMode;
      return this;
    }

    public Builder setTransformUsage(TransformUsage.Builder transformUsage) {
      this.transformUsage = transformUsage.build();
      return this;
    }

    public Builder setTrialPeriodDays(Long trialPeriodDays) {
      this.trialPeriodDays = trialPeriodDays;
      return this;
    }

    public Builder setUsageType(UsageType usageType) {
      this.usageType = usageType;
      return this;
    }
  }

  public static class Product {
    @SerializedName("active")
    Boolean active;

    @SerializedName("id")
    String id;

    @SerializedName("metadata")
    Map<String, String> metadata;

    @SerializedName("name")
    String name;

    @SerializedName("statement_descriptor")
    String statementDescriptor;

    @SerializedName("unit_label")
    String unitLabel;

    private Product(
        Boolean active,
        String id,
        Map<String, String> metadata,
        String name,
        String statementDescriptor,
        String unitLabel) {
      this.active = active;
      this.id = id;
      this.metadata = metadata;
      this.name = name;
      this.statementDescriptor = statementDescriptor;
      this.unitLabel = unitLabel;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.PlanCreateParams.Product.Builder();
    }

    public static class Builder {
      private Boolean active;

      private String id;

      private Map<String, String> metadata;

      private String name;

      private String statementDescriptor;

      private String unitLabel;

      public Product build() {
        return new Product(active, id, metadata, name, statementDescriptor, unitLabel);
      }

      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      public Builder setActive(Boolean active) {
        this.active = active;
        return this;
      }

      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      public Builder setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }

      public Builder setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
        return this;
      }
    }
  }

  public static class Tiers {
    @SerializedName("flat_amount")
    Long flatAmount;

    @SerializedName("unit_amount")
    Long unitAmount;

    @SerializedName("up_to")
    Object upTo;

    private Tiers(Long flatAmount, Long unitAmount, Object upTo) {
      this.flatAmount = flatAmount;
      this.unitAmount = unitAmount;
      this.upTo = upTo;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.PlanCreateParams.Tiers.Builder();
    }

    public static class Builder {
      private Long flatAmount;

      private Long unitAmount;

      private Object upTo;

      public Tiers build() {
        return new Tiers(flatAmount, unitAmount, upTo);
      }

      public Builder setFlatAmount(Long flatAmount) {
        this.flatAmount = flatAmount;
        return this;
      }

      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      public Builder setUpTo(Long upTo) {
        this.upTo = upTo;
        return this;
      }

      public Builder setUpTo(UpTo upTo) {
        this.upTo = upTo;
        return this;
      }
    }

    public enum UpTo {
      @SerializedName("inf")
      INF("inf");

      private final String value;

      UpTo(String value) {
        this.value = value;
      }
    }
  }

  public static class TransformUsage {
    @SerializedName("divide_by")
    Long divideBy;

    @SerializedName("round")
    Round round;

    private TransformUsage(Long divideBy, Round round) {
      this.divideBy = divideBy;
      this.round = round;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.PlanCreateParams.TransformUsage.Builder();
    }

    public static class Builder {
      private Long divideBy;

      private Round round;

      public TransformUsage build() {
        return new TransformUsage(divideBy, round);
      }

      public Builder setDivideBy(Long divideBy) {
        this.divideBy = divideBy;
        return this;
      }

      public Builder setRound(Round round) {
        this.round = round;
        return this;
      }
    }

    public enum Round {
      @SerializedName("down")
      DOWN("down"),

      @SerializedName("up")
      UP("up");

      private final String value;

      Round(String value) {
        this.value = value;
      }
    }
  }

  public enum AggregateUsage {
    @SerializedName("last_during_period")
    LAST_DURING_PERIOD("last_during_period"),

    @SerializedName("last_ever")
    LAST_EVER("last_ever"),

    @SerializedName("max")
    MAX("max"),

    @SerializedName("sum")
    SUM("sum");

    private final String value;

    AggregateUsage(String value) {
      this.value = value;
    }
  }

  public enum BillingScheme {
    @SerializedName("per_unit")
    PER_UNIT("per_unit"),

    @SerializedName("tiered")
    TIERED("tiered");

    private final String value;

    BillingScheme(String value) {
      this.value = value;
    }
  }

  public enum Interval {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("month")
    MONTH("month"),

    @SerializedName("week")
    WEEK("week"),

    @SerializedName("year")
    YEAR("year");

    private final String value;

    Interval(String value) {
      this.value = value;
    }
  }

  public enum TiersMode {
    @SerializedName("graduated")
    GRADUATED("graduated"),

    @SerializedName("volume")
    VOLUME("volume");

    private final String value;

    TiersMode(String value) {
      this.value = value;
    }
  }

  public enum UsageType {
    @SerializedName("licensed")
    LICENSED("licensed"),

    @SerializedName("metered")
    METERED("metered");

    private final String value;

    UsageType(String value) {
      this.value = value;
    }
  }
}
