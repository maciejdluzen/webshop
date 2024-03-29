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
 * Specifies how the regular sales price should be rounded after multiplying the unit price with the provided quantity.
 */
@ApiModel(description = "Specifies how the regular sales price should be rounded after multiplying the unit price with the provided quantity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class RoundingRuleType 
// CHECKSTYLE:ON
{
  @JsonProperty("any")
  @SerializedName("any")
  private List<Object> any = new ArrayList<>();

  /**
   * Specifies the rounding direction. Default value is Commercial.
   */
  public enum RoundingMethodEnum {
    /**
    * The UP option of this RoundingRuleType
    */
    UP("Up"),
    
    /**
    * The DOWN option of this RoundingRuleType
    */
    DOWN("Down"),
    
    /**
    * The COMMERCIAL option of this RoundingRuleType
    */
    COMMERCIAL("Commercial");

    private String value;

    RoundingMethodEnum(String value) {
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
    * @return The enum value of type RoundingRuleType
    */
    @JsonCreator
    @Nonnull public static RoundingMethodEnum fromValue(@Nonnull final String value) {
      for (RoundingMethodEnum b : RoundingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("RoundingMethod")
  @SerializedName("RoundingMethod")
  private RoundingMethodEnum roundingMethod;

  @JsonProperty("Multiple")
  @SerializedName("Multiple")
  private BigDecimal multiple;


   /**
   * Set the any of this {@link RoundingRuleType} instance and return the same instance.
   *
   * @param any  This is currently not supported.
   * @return The same instance of this {@link RoundingRuleType} class
   */
   @Nonnull public RoundingRuleType any(@Nonnull final List<Object> any) {
    this.any = any;
    return this;
  }
  /**
  * Add one Any instance to this {@link RoundingRuleType}.
  * @param anyItem The Any that should be added
  * @return The same instance of type {@link RoundingRuleType}
  */
  @Nonnull public RoundingRuleType addAnyItem( @Nonnull final Object anyItem) {
    if (this.any == null) {
      this.any = new ArrayList<>();
    }
    this.any.add(anyItem);
    return this;
  }

   /**
   * This is currently not supported.
   * @return any  The any of this {@link RoundingRuleType} instance.
  **/
  @ApiModelProperty(value = "This is currently not supported.")
  @Nonnull public List<Object> getAny() {
    return any;
  }

  /**
  * Set the any of this {@link RoundingRuleType} instance.
  *
  * @param any  This is currently not supported.
  */
  public void setAny( @Nonnull final List<Object> any) {
    this.any = any;
  }

   /**
   * Set the roundingMethod of this {@link RoundingRuleType} instance and return the same instance.
   *
   * @param roundingMethod  Specifies the rounding direction. Default value is Commercial.
   * @return The same instance of this {@link RoundingRuleType} class
   */
   @Nonnull public RoundingRuleType roundingMethod(@Nonnull final RoundingMethodEnum roundingMethod) {
    this.roundingMethod = roundingMethod;
    return this;
  }

   /**
   * Specifies the rounding direction. Default value is Commercial.
   * @return roundingMethod  The roundingMethod of this {@link RoundingRuleType} instance.
  **/
  @ApiModelProperty(value = "Specifies the rounding direction. Default value is Commercial.")
  @Nonnull public RoundingMethodEnum getRoundingMethod() {
    return roundingMethod;
  }

  /**
  * Set the roundingMethod of this {@link RoundingRuleType} instance.
  *
  * @param roundingMethod  Specifies the rounding direction. Default value is Commercial.
  */
  public void setRoundingMethod( @Nonnull final RoundingMethodEnum roundingMethod) {
    this.roundingMethod = roundingMethod;
  }

   /**
   * Set the multiple of this {@link RoundingRuleType} instance and return the same instance.
   *
   * @param multiple  The rounding result must be an integer multiple of the specified value. Example: If the value to be rounded is 12.345, rounding method is Commercial and Multple is 0.05, then the rounding result is 12.35. Default value is 0.01. 
   * Minimum: 0
   * @return The same instance of this {@link RoundingRuleType} class
   */
   @Nonnull public RoundingRuleType multiple(@Nonnull final BigDecimal multiple) {
    this.multiple = multiple;
    return this;
  }

   /**
   * The rounding result must be an integer multiple of the specified value. Example: If the value to be rounded is 12.345, rounding method is Commercial and Multple is 0.05, then the rounding result is 12.35. Default value is 0.01. 
   * Minimum: 0
   * @return multiple  The multiple of this {@link RoundingRuleType} instance.
  **/
  @ApiModelProperty(example = "0.01", value = "The rounding result must be an integer multiple of the specified value. Example: If the value to be rounded is 12.345, rounding method is Commercial and Multple is 0.05, then the rounding result is 12.35. Default value is 0.01. ")
  @Nonnull public BigDecimal getMultiple() {
    return multiple;
  }

  /**
  * Set the multiple of this {@link RoundingRuleType} instance.
  *
  * @param multiple  The rounding result must be an integer multiple of the specified value. Example: If the value to be rounded is 12.345, rounding method is Commercial and Multple is 0.05, then the rounding result is 12.35. Default value is 0.01. 
  * Minimum: 0
  */
  public void setMultiple( @Nonnull final BigDecimal multiple) {
    this.multiple = multiple;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final RoundingRuleType roundingRuleType = (RoundingRuleType) o;
    return Objects.equals(this.any, roundingRuleType.any) &&
        Objects.equals(this.roundingMethod, roundingRuleType.roundingMethod) &&
        Objects.equals(this.multiple, roundingRuleType.multiple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(any, roundingMethod, multiple);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class RoundingRuleType {\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    roundingMethod: ").append(toIndentedString(roundingMethod)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
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

