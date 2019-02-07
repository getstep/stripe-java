// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypePaperCheck extends StripeObject {
  @SerializedName("mailing_address_city")
  String mailingAddressCity;

  @SerializedName("mailing_address_country")
  String mailingAddressCountry;

  @SerializedName("mailing_address_line1")
  String mailingAddressLine1;

  @SerializedName("mailing_address_line2")
  String mailingAddressLine2;

  @SerializedName("mailing_address_postal_code")
  String mailingAddressPostalCode;

  @SerializedName("mailing_address_state")
  String mailingAddressState;
}
