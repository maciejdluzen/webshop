/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */

/*
 * Calculation
 * You use the Calculation service for SAP Omnichannel Promotion Pricing in your sales channel application to determine the effective sales prices by applying promotional rules in the relevant customer context. The service can be called for a single product or for an entire shopping cart. The calculation is based on the data you uploaded to the cloud environment, and sends back prices and additional information about customer rewards to the calling application.
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sap.cloud.sdk.generated.promopricing.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * The price of the line item before the price derivation rule was applied.
 */
@ApiModel(description = "The price of the line item before the price derivation rule was applied.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class PreviousPrice 
// CHECKSTYLE:ON
{
  @JsonProperty("value")
  @SerializedName("value")
  private BigDecimal value;

  @JsonProperty("Currency")
  @SerializedName("Currency")
  private String currency;


   /**
   * Set the value of this {@link PreviousPrice} instance and return the same instance.
   *
   * @param value  The value of this {@link PreviousPrice}
   * Minimum: 0
   * @return The same instance of this {@link PreviousPrice} class
   */
   @Nonnull public PreviousPrice value(@Nonnull final BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * Minimum: 0
   * @return value  The value of this {@link PreviousPrice} instance.
  **/
  @ApiModelProperty(value = "")
  @Nonnull public BigDecimal getValue() {
    return value;
  }

  /**
  * Set the value of this {@link PreviousPrice} instance.
  *
  * @param value  The value of this {@link PreviousPrice}
  * Minimum: 0
  */
  public void setValue( @Nonnull final BigDecimal value) {
    this.value = value;
  }

   /**
   * Set the currency of this {@link PreviousPrice} instance and return the same instance.
   *
   * @param currency  Uppercase currency is expected in uppercase ISO format.
   * @return The same instance of this {@link PreviousPrice} class
   */
   @Nonnull public PreviousPrice currency(@Nonnull final String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Uppercase currency is expected in uppercase ISO format.
   * @return currency  The currency of this {@link PreviousPrice} instance.
  **/
  @ApiModelProperty(value = "Uppercase currency is expected in uppercase ISO format.")
  @Nonnull public String getCurrency() {
    return currency;
  }

  /**
  * Set the currency of this {@link PreviousPrice} instance.
  *
  * @param currency  Uppercase currency is expected in uppercase ISO format.
  */
  public void setCurrency( @Nonnull final String currency) {
    this.currency = currency;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final PreviousPrice previousPrice = (PreviousPrice) o;
    return Objects.equals(this.value, previousPrice.value) &&
        Objects.equals(this.currency, previousPrice.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PreviousPrice {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

