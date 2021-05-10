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
 * Percentage discount and the action how it was applied.
 */
@ApiModel(description = "Percentage discount and the action how it was applied.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class Percent 
// CHECKSTYLE:ON
{
  @JsonProperty("value")
  @SerializedName("value")
  private BigDecimal value;

  /**
   * Specifies whether the percentage was added or subtracted.
   */
  public enum ActionEnum {
    /**
    * The ADD option of this Percent
    */
    ADD("Add"),
    
    /**
    * The SUBTRACT option of this Percent
    */
    SUBTRACT("Subtract");

    private String value;

    ActionEnum(String value) {
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
    * @return The enum value of type Percent
    */
    @JsonCreator
    @Nonnull public static ActionEnum fromValue(@Nonnull final String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Action")
  @SerializedName("Action")
  private ActionEnum action;


   /**
   * Set the value of this {@link Percent} instance and return the same instance.
   *
   * @param value  The value that is, for example, used for a percentage discount. It has to be a positive number.
   * Minimum: 0
   * @return The same instance of this {@link Percent} class
   */
   @Nonnull public Percent value(@Nonnull final BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value that is, for example, used for a percentage discount. It has to be a positive number.
   * Minimum: 0
   * @return value  The value of this {@link Percent} instance.
  **/
  @ApiModelProperty(value = "The value that is, for example, used for a percentage discount. It has to be a positive number.")
  @Nonnull public BigDecimal getValue() {
    return value;
  }

  /**
  * Set the value of this {@link Percent} instance.
  *
  * @param value  The value that is, for example, used for a percentage discount. It has to be a positive number.
  * Minimum: 0
  */
  public void setValue( @Nonnull final BigDecimal value) {
    this.value = value;
  }

   /**
   * Set the action of this {@link Percent} instance and return the same instance.
   *
   * @param action  Specifies whether the percentage was added or subtracted.
   * @return The same instance of this {@link Percent} class
   */
   @Nonnull public Percent action(@Nonnull final ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Specifies whether the percentage was added or subtracted.
   * @return action  The action of this {@link Percent} instance.
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the percentage was added or subtracted.")
  @Nonnull public ActionEnum getAction() {
    return action;
  }

  /**
  * Set the action of this {@link Percent} instance.
  *
  * @param action  Specifies whether the percentage was added or subtracted.
  */
  public void setAction( @Nonnull final ActionEnum action) {
    this.action = action;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Percent percent = (Percent) o;
    return Objects.equals(this.value, percent.value) &&
        Objects.equals(this.action, percent.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, action);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Percent {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

