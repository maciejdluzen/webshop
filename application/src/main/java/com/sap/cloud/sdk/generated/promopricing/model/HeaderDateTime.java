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
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * Defines the timestamp of the request or the response. It is not used as pricing date.
 */
@ApiModel(description = "Defines the timestamp of the request or the response. It is not used as pricing date.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class HeaderDateTime 
// CHECKSTYLE:ON
{
  @JsonProperty("value")
  @SerializedName("value")
  private String value;


   /**
   * Set the value of this {@link HeaderDateTime} instance and return the same instance.
   *
   * @param value  In format yyyy-MM-dd HH:mm:ss.SSS
   * @return The same instance of this {@link HeaderDateTime} class
   */
   @Nonnull public HeaderDateTime value(@Nonnull final String value) {
    this.value = value;
    return this;
  }

   /**
   * In format yyyy-MM-dd HH:mm:ss.SSS
   * @return value  The value of this {@link HeaderDateTime} instance.
  **/
  @ApiModelProperty(value = "In format yyyy-MM-dd HH:mm:ss.SSS")
  @Nonnull public String getValue() {
    return value;
  }

  /**
  * Set the value of this {@link HeaderDateTime} instance.
  *
  * @param value  In format yyyy-MM-dd HH:mm:ss.SSS
  */
  public void setValue( @Nonnull final String value) {
    this.value = value;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final HeaderDateTime headerDateTime = (HeaderDateTime) o;
    return Objects.equals(this.value, headerDateTime.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class HeaderDateTime {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

