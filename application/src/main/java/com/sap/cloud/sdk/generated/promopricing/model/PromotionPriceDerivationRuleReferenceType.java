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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * Specifies the price derivation rule to which a line item contributed to.
 */
@ApiModel(description = "Specifies the price derivation rule to which a line item contributed to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class PromotionPriceDerivationRuleReferenceType 
// CHECKSTYLE:ON
{
  @JsonProperty("PromotionID")
  @SerializedName("PromotionID")
  private String promotionID;

  @JsonProperty("PriceDerivationRuleID")
  @SerializedName("PriceDerivationRuleID")
  private String priceDerivationRuleID;

  @JsonProperty("ReferenceQuantity")
  @SerializedName("ReferenceQuantity")
  private BigDecimal referenceQuantity;

  @JsonProperty("any")
  @SerializedName("any")
  private List<Object> any = new ArrayList<>();


   /**
   * Set the promotionID of this {@link PromotionPriceDerivationRuleReferenceType} instance and return the same instance.
   *
   * @param promotionID  Identifies a promotion. Positive number.
   * @return The same instance of this {@link PromotionPriceDerivationRuleReferenceType} class
   */
   @Nonnull public PromotionPriceDerivationRuleReferenceType promotionID(@Nonnull final String promotionID) {
    this.promotionID = promotionID;
    return this;
  }

   /**
   * Identifies a promotion. Positive number.
   * @return promotionID  The promotionID of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  **/
  @ApiModelProperty(required = true, value = "Identifies a promotion. Positive number.")
  @Nonnull public String getPromotionID() {
    return promotionID;
  }

  /**
  * Set the promotionID of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  *
  * @param promotionID  Identifies a promotion. Positive number.
  */
  public void setPromotionID( @Nonnull final String promotionID) {
    this.promotionID = promotionID;
  }

   /**
   * Set the priceDerivationRuleID of this {@link PromotionPriceDerivationRuleReferenceType} instance and return the same instance.
   *
   * @param priceDerivationRuleID  Identifies a price derivation rule. Decimal representation of a 64 bit integer value.
   * @return The same instance of this {@link PromotionPriceDerivationRuleReferenceType} class
   */
   @Nonnull public PromotionPriceDerivationRuleReferenceType priceDerivationRuleID(@Nonnull final String priceDerivationRuleID) {
    this.priceDerivationRuleID = priceDerivationRuleID;
    return this;
  }

   /**
   * Identifies a price derivation rule. Decimal representation of a 64 bit integer value.
   * @return priceDerivationRuleID  The priceDerivationRuleID of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  **/
  @ApiModelProperty(required = true, value = "Identifies a price derivation rule. Decimal representation of a 64 bit integer value.")
  @Nonnull public String getPriceDerivationRuleID() {
    return priceDerivationRuleID;
  }

  /**
  * Set the priceDerivationRuleID of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  *
  * @param priceDerivationRuleID  Identifies a price derivation rule. Decimal representation of a 64 bit integer value.
  */
  public void setPriceDerivationRuleID( @Nonnull final String priceDerivationRuleID) {
    this.priceDerivationRuleID = priceDerivationRuleID;
  }

   /**
   * Set the referenceQuantity of this {@link PromotionPriceDerivationRuleReferenceType} instance and return the same instance.
   *
   * @param referenceQuantity  The quantity relevant for the applied price derivation rule.
   * Minimum: 0
   * @return The same instance of this {@link PromotionPriceDerivationRuleReferenceType} class
   */
   @Nonnull public PromotionPriceDerivationRuleReferenceType referenceQuantity(@Nonnull final BigDecimal referenceQuantity) {
    this.referenceQuantity = referenceQuantity;
    return this;
  }

   /**
   * The quantity relevant for the applied price derivation rule.
   * Minimum: 0
   * @return referenceQuantity  The referenceQuantity of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  **/
  @ApiModelProperty(required = true, value = "The quantity relevant for the applied price derivation rule.")
  @Nonnull public BigDecimal getReferenceQuantity() {
    return referenceQuantity;
  }

  /**
  * Set the referenceQuantity of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  *
  * @param referenceQuantity  The quantity relevant for the applied price derivation rule.
  * Minimum: 0
  */
  public void setReferenceQuantity( @Nonnull final BigDecimal referenceQuantity) {
    this.referenceQuantity = referenceQuantity;
  }

   /**
   * Set the any of this {@link PromotionPriceDerivationRuleReferenceType} instance and return the same instance.
   *
   * @param any  This is currently not supported.
   * @return The same instance of this {@link PromotionPriceDerivationRuleReferenceType} class
   */
   @Nonnull public PromotionPriceDerivationRuleReferenceType any(@Nonnull final List<Object> any) {
    this.any = any;
    return this;
  }
  /**
  * Add one Any instance to this {@link PromotionPriceDerivationRuleReferenceType}.
  * @param anyItem The Any that should be added
  * @return The same instance of type {@link PromotionPriceDerivationRuleReferenceType}
  */
  @Nonnull public PromotionPriceDerivationRuleReferenceType addAnyItem( @Nonnull final Object anyItem) {
    if (this.any == null) {
      this.any = new ArrayList<>();
    }
    this.any.add(anyItem);
    return this;
  }

   /**
   * This is currently not supported.
   * @return any  The any of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  **/
  @ApiModelProperty(value = "This is currently not supported.")
  @Nonnull public List<Object> getAny() {
    return any;
  }

  /**
  * Set the any of this {@link PromotionPriceDerivationRuleReferenceType} instance.
  *
  * @param any  This is currently not supported.
  */
  public void setAny( @Nonnull final List<Object> any) {
    this.any = any;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final PromotionPriceDerivationRuleReferenceType promotionPriceDerivationRuleReferenceType = (PromotionPriceDerivationRuleReferenceType) o;
    return Objects.equals(this.promotionID, promotionPriceDerivationRuleReferenceType.promotionID) &&
        Objects.equals(this.priceDerivationRuleID, promotionPriceDerivationRuleReferenceType.priceDerivationRuleID) &&
        Objects.equals(this.referenceQuantity, promotionPriceDerivationRuleReferenceType.referenceQuantity) &&
        Objects.equals(this.any, promotionPriceDerivationRuleReferenceType.any);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionID, priceDerivationRuleID, referenceQuantity, any);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PromotionPriceDerivationRuleReferenceType {\n");
    sb.append("    promotionID: ").append(toIndentedString(promotionID)).append("\n");
    sb.append("    priceDerivationRuleID: ").append(toIndentedString(priceDerivationRuleID)).append("\n");
    sb.append("    referenceQuantity: ").append(toIndentedString(referenceQuantity)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
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

