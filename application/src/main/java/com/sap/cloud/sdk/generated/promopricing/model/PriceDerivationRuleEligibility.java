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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * Contains information about the consumed eligibility if this was a coupon eligibility.
 */
@ApiModel(description = "Contains information about the consumed eligibility if this was a coupon eligibility.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class PriceDerivationRuleEligibility 
// CHECKSTYLE:ON
{
  @JsonProperty("ReferenceID")
  @SerializedName("ReferenceID")
  private String referenceID;

  @JsonProperty("any")
  @SerializedName("any")
  private List<Object> any = new ArrayList<>();

  @JsonProperty("ReferenceSequenceNumber")
  @SerializedName("ReferenceSequenceNumber")
  private Integer referenceSequenceNumber;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    /**
    * The STORECOUPON option of this PriceDerivationRuleEligibility
    */
    STORECOUPON("StoreCoupon");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
    * Get the value of the enum
    * @return The enum value
    */
    @JsonValue
    @Nonnull public String getValue() {
      return value;
    }

    /**
    * Get the String value of the enum value.
    * @return The enum value as String
    */
    @Override
    @Nonnull public String toString() {
      return String.valueOf(value);
    }

    /**
    * Get the enum value from a String value
    * @param value The Strin value
    * @return The enum value of type PriceDerivationRuleEligibility
    */
    @JsonCreator
    @Nonnull public static TypeEnum fromValue(@Nonnull final String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  @SerializedName("Type")
  private TypeEnum type;


   /**
   * Set the referenceID of this {@link PriceDerivationRuleEligibility} instance and return the same instance.
   *
   * @param referenceID  Contains the coupon code for a coupon eligibility.
   * @return The same instance of this {@link PriceDerivationRuleEligibility} class
   */
   @Nonnull public PriceDerivationRuleEligibility referenceID(@Nonnull final String referenceID) {
    this.referenceID = referenceID;
    return this;
  }

   /**
   * Contains the coupon code for a coupon eligibility.
   * @return referenceID  The referenceID of this {@link PriceDerivationRuleEligibility} instance.
  **/
  @ApiModelProperty(value = "Contains the coupon code for a coupon eligibility.")
  @Nonnull public String getReferenceID() {
    return referenceID;
  }

  /**
  * Set the referenceID of this {@link PriceDerivationRuleEligibility} instance.
  *
  * @param referenceID  Contains the coupon code for a coupon eligibility.
  */
  public void setReferenceID( @Nonnull final String referenceID) {
    this.referenceID = referenceID;
  }

   /**
   * Set the any of this {@link PriceDerivationRuleEligibility} instance and return the same instance.
   *
   * @param any  This is currently not supported.
   * @return The same instance of this {@link PriceDerivationRuleEligibility} class
   */
   @Nonnull public PriceDerivationRuleEligibility any(@Nonnull final List<Object> any) {
    this.any = any;
    return this;
  }
  /**
  * Add one Any instance to this {@link PriceDerivationRuleEligibility}.
  * @param anyItem The Any that should be added
  * @return The same instance of type {@link PriceDerivationRuleEligibility}
  */
  @Nonnull public PriceDerivationRuleEligibility addAnyItem( @Nonnull final Object anyItem) {
    if (this.any == null) {
      this.any = new ArrayList<>();
    }
    this.any.add(anyItem);
    return this;
  }

   /**
   * This is currently not supported.
   * @return any  The any of this {@link PriceDerivationRuleEligibility} instance.
  **/
  @ApiModelProperty(value = "This is currently not supported.")
  @Nonnull public List<Object> getAny() {
    return any;
  }

  /**
  * Set the any of this {@link PriceDerivationRuleEligibility} instance.
  *
  * @param any  This is currently not supported.
  */
  public void setAny( @Nonnull final List<Object> any) {
    this.any = any;
  }

   /**
   * Set the referenceSequenceNumber of this {@link PriceDerivationRuleEligibility} instance and return the same instance.
   *
   * @param referenceSequenceNumber  The sequence number of the line item containing the coupon for a coupon eligibility.
   * Minimum: 0
   * Maximum: 32767
   * @return The same instance of this {@link PriceDerivationRuleEligibility} class
   */
   @Nonnull public PriceDerivationRuleEligibility referenceSequenceNumber(@Nonnull final Integer referenceSequenceNumber) {
    this.referenceSequenceNumber = referenceSequenceNumber;
    return this;
  }

   /**
   * The sequence number of the line item containing the coupon for a coupon eligibility.
   * Minimum: 0
   * Maximum: 32767
   * @return referenceSequenceNumber  The referenceSequenceNumber of this {@link PriceDerivationRuleEligibility} instance.
  **/
  @ApiModelProperty(value = "The sequence number of the line item containing the coupon for a coupon eligibility.")
  @Nonnull public Integer getReferenceSequenceNumber() {
    return referenceSequenceNumber;
  }

  /**
  * Set the referenceSequenceNumber of this {@link PriceDerivationRuleEligibility} instance.
  *
  * @param referenceSequenceNumber  The sequence number of the line item containing the coupon for a coupon eligibility.
  * Minimum: 0
  * Maximum: 32767
  */
  public void setReferenceSequenceNumber( @Nonnull final Integer referenceSequenceNumber) {
    this.referenceSequenceNumber = referenceSequenceNumber;
  }

   /**
   * Set the type of this {@link PriceDerivationRuleEligibility} instance and return the same instance.
   *
   * @param type  The type of this {@link PriceDerivationRuleEligibility}
   * @return The same instance of this {@link PriceDerivationRuleEligibility} class
   */
   @Nonnull public PriceDerivationRuleEligibility type(@Nonnull final TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type  The type of this {@link PriceDerivationRuleEligibility} instance.
  **/
  @ApiModelProperty(example = "StoreCoupon", required = true, value = "")
  @Nonnull public TypeEnum getType() {
    return type;
  }

  /**
  * Set the type of this {@link PriceDerivationRuleEligibility} instance.
  *
  * @param type  The type of this {@link PriceDerivationRuleEligibility}
  */
  public void setType( @Nonnull final TypeEnum type) {
    this.type = type;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final PriceDerivationRuleEligibility priceDerivationRuleEligibility = (PriceDerivationRuleEligibility) o;
    return Objects.equals(this.referenceID, priceDerivationRuleEligibility.referenceID) &&
        Objects.equals(this.any, priceDerivationRuleEligibility.any) &&
        Objects.equals(this.referenceSequenceNumber, priceDerivationRuleEligibility.referenceSequenceNumber) &&
        Objects.equals(this.type, priceDerivationRuleEligibility.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceID, any, referenceSequenceNumber, type);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PriceDerivationRuleEligibility {\n");
    sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    referenceSequenceNumber: ").append(toIndentedString(referenceSequenceNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

