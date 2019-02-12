// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentIntentUpdateParams extends ApiParamRequest {
  @SerializedName("amount")
  Long amount;

  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  @SerializedName("currency")
  String currency;

  @SerializedName("customer")
  String customer;

  @SerializedName("description")
  String description;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("level3")
  Level3 level3;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  @SerializedName("receipt_email")
  String receiptEmail;

  @SerializedName("save_payment_method")
  Boolean savePaymentMethod;

  @SerializedName("shipping")
  Shipping shipping;

  @SerializedName("source")
  String source;

  @SerializedName("transfer_group")
  String transferGroup;

  private PaymentIntentUpdateParams(
      Long amount,
      Long applicationFeeAmount,
      String currency,
      String customer,
      String description,
      List<String> expand,
      Level3 level3,
      Map<String, String> metadata,
      List<String> paymentMethodTypes,
      String receiptEmail,
      Boolean savePaymentMethod,
      Shipping shipping,
      String source,
      String transferGroup) {
    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.level3 = level3;
    this.metadata = metadata;
    this.paymentMethodTypes = paymentMethodTypes;
    this.receiptEmail = receiptEmail;
    this.savePaymentMethod = savePaymentMethod;
    this.shipping = shipping;
    this.source = source;
    this.transferGroup = transferGroup;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.PaymentIntentUpdateParams.Builder();
  }

  public static class Builder {
    private Long amount;

    private Long applicationFeeAmount;

    private String currency;

    private String customer;

    private String description;

    private List<String> expand;

    private Level3 level3;

    private Map<String, String> metadata;

    private List<String> paymentMethodTypes;

    private String receiptEmail;

    private Boolean savePaymentMethod;

    private Shipping shipping;

    private String source;

    private String transferGroup;

    public PaymentIntentUpdateParams build() {
      return new PaymentIntentUpdateParams(
          amount,
          applicationFeeAmount,
          currency,
          customer,
          description,
          expand,
          level3,
          metadata,
          paymentMethodTypes,
          receiptEmail,
          savePaymentMethod,
          shipping,
          source,
          transferGroup);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder addPaymentMethodTypes(String element) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
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

    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setLevel3(Level3.Builder level3) {
      this.level3 = level3.build();
      return this;
    }

    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    public Builder setSavePaymentMethod(Boolean savePaymentMethod) {
      this.savePaymentMethod = savePaymentMethod;
      return this;
    }

    public Builder setShipping(Shipping.Builder shipping) {
      this.shipping = shipping.build();
      return this;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  public static class Level3 {
    @SerializedName("customer_reference")
    String customerReference;

    @SerializedName("line_items")
    List<LineItems> lineItems;

    @SerializedName("merchant_reference")
    String merchantReference;

    @SerializedName("shipping_address_zip")
    String shippingAddressZip;

    @SerializedName("shipping_amount")
    Long shippingAmount;

    @SerializedName("shipping_from_zip")
    String shippingFromZip;

    private Level3(
        String customerReference,
        List<LineItems> lineItems,
        String merchantReference,
        String shippingAddressZip,
        Long shippingAmount,
        String shippingFromZip) {
      this.customerReference = customerReference;
      this.lineItems = lineItems;
      this.merchantReference = merchantReference;
      this.shippingAddressZip = shippingAddressZip;
      this.shippingAmount = shippingAmount;
      this.shippingFromZip = shippingFromZip;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.PaymentIntentUpdateParams.Level3.Builder();
    }

    public static class Builder {
      private String customerReference;

      private List<LineItems> lineItems;

      private String merchantReference;

      private String shippingAddressZip;

      private Long shippingAmount;

      private String shippingFromZip;

      public Level3 build() {
        return new Level3(
            customerReference,
            lineItems,
            merchantReference,
            shippingAddressZip,
            shippingAmount,
            shippingFromZip);
      }

      public Builder addLineItems(LineItems.Builder element) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(element.build());
        return this;
      }

      public Builder setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      public Builder setMerchantReference(String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
      }

      public Builder setShippingAddressZip(String shippingAddressZip) {
        this.shippingAddressZip = shippingAddressZip;
        return this;
      }

      public Builder setShippingAmount(Long shippingAmount) {
        this.shippingAmount = shippingAmount;
        return this;
      }

      public Builder setShippingFromZip(String shippingFromZip) {
        this.shippingFromZip = shippingFromZip;
        return this;
      }
    }

    public static class LineItems {
      @SerializedName("discount_amount")
      Long discountAmount;

      @SerializedName("product_code")
      String productCode;

      @SerializedName("product_description")
      String productDescription;

      @SerializedName("quantity")
      Long quantity;

      @SerializedName("tax_amount")
      Long taxAmount;

      @SerializedName("unit_cost")
      Long unitCost;

      private LineItems(
          Long discountAmount,
          String productCode,
          String productDescription,
          Long quantity,
          Long taxAmount,
          Long unitCost) {
        this.discountAmount = discountAmount;
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.taxAmount = taxAmount;
        this.unitCost = unitCost;
      }

      public static Builder newBuilder() {
        return new com.stripe.param.PaymentIntentUpdateParams.Level3.LineItems.Builder();
      }

      public static class Builder {
        private Long discountAmount;

        private String productCode;

        private String productDescription;

        private Long quantity;

        private Long taxAmount;

        private Long unitCost;

        public LineItems build() {
          return new LineItems(
              discountAmount, productCode, productDescription, quantity, taxAmount, unitCost);
        }

        public Builder setDiscountAmount(Long discountAmount) {
          this.discountAmount = discountAmount;
          return this;
        }

        public Builder setProductCode(String productCode) {
          this.productCode = productCode;
          return this;
        }

        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        public Builder setTaxAmount(Long taxAmount) {
          this.taxAmount = taxAmount;
          return this;
        }

        public Builder setUnitCost(Long unitCost) {
          this.unitCost = unitCost;
          return this;
        }
      }
    }
  }

  public static class Shipping {
    @SerializedName("address")
    Address address;

    @SerializedName("carrier")
    String carrier;

    @SerializedName("name")
    String name;

    @SerializedName("phone")
    String phone;

    @SerializedName("tracking_number")
    String trackingNumber;

    private Shipping(
        Address address, String carrier, String name, String phone, String trackingNumber) {
      this.address = address;
      this.carrier = carrier;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.PaymentIntentUpdateParams.Shipping.Builder();
    }

    public static class Builder {
      private Address address;

      private String carrier;

      private String name;

      private String phone;

      private String trackingNumber;

      public Shipping build() {
        return new Shipping(address, carrier, name, phone, trackingNumber);
      }

      public Builder setAddress(Address.Builder address) {
        this.address = address.build();
        return this;
      }

      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }

    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder newBuilder() {
        return new com.stripe.param.PaymentIntentUpdateParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        public Address build() {
          return new Address(city, country, line1, line2, postalCode, state);
        }

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }
}
