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
import com.sap.cloud.sdk.generated.promopricing.model.BusinessError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * Holds response specific information of an ARTSHeader.
 */
@ApiModel(description = "Holds response specific information of an ARTSHeader.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class Response 
// CHECKSTYLE:ON
{
  @JsonProperty("any")
  @SerializedName("any")
  private List<Object> any = new ArrayList<>();

  @JsonProperty("RequestID")
  @SerializedName("RequestID")
  private String requestID;

  @JsonProperty("ResponseTimestamp")
  @SerializedName("ResponseTimestamp")
  private String responseTimestamp;

  @JsonProperty("BusinessError")
  @SerializedName("BusinessError")
  private List<BusinessError> businessError = new ArrayList<>();

  /**
   * Indicates if the message was successful (OK) or not (Rejected).
   */
  public enum ResponseCodeEnum {
    /**
    * The REJECTED option of this Response
    */
    REJECTED("Rejected"),
    
    /**
    * The OK option of this Response
    */
    OK("OK");

    private String value;

    ResponseCodeEnum(String value) {
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
    * @return The enum value of type Response
    */
    @JsonCreator
    @Nonnull public static ResponseCodeEnum fromValue(@Nonnull final String value) {
      for (ResponseCodeEnum b : ResponseCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ResponseCode")
  @SerializedName("ResponseCode")
  private ResponseCodeEnum responseCode;


   /**
   * Set the any of this {@link Response} instance and return the same instance.
   *
   * @param any  This is currently not supported.
   * @return The same instance of this {@link Response} class
   */
   @Nonnull public Response any(@Nonnull final List<Object> any) {
    this.any = any;
    return this;
  }
  /**
  * Add one Any instance to this {@link Response}.
  * @param anyItem The Any that should be added
  * @return The same instance of type {@link Response}
  */
  @Nonnull public Response addAnyItem( @Nonnull final Object anyItem) {
    if (this.any == null) {
      this.any = new ArrayList<>();
    }
    this.any.add(anyItem);
    return this;
  }

   /**
   * This is currently not supported.
   * @return any  The any of this {@link Response} instance.
  **/
  @ApiModelProperty(value = "This is currently not supported.")
  @Nonnull public List<Object> getAny() {
    return any;
  }

  /**
  * Set the any of this {@link Response} instance.
  *
  * @param any  This is currently not supported.
  */
  public void setAny( @Nonnull final List<Object> any) {
    this.any = any;
  }

   /**
   * Set the requestID of this {@link Response} instance and return the same instance.
   *
   * @param requestID  Identfier of the request to which this response relates.
   * @return The same instance of this {@link Response} class
   */
   @Nonnull public Response requestID(@Nonnull final String requestID) {
    this.requestID = requestID;
    return this;
  }

   /**
   * Identfier of the request to which this response relates.
   * @return requestID  The requestID of this {@link Response} instance.
  **/
  @ApiModelProperty(required = true, value = "Identfier of the request to which this response relates.")
  @Nonnull public String getRequestID() {
    return requestID;
  }

  /**
  * Set the requestID of this {@link Response} instance.
  *
  * @param requestID  Identfier of the request to which this response relates.
  */
  public void setRequestID( @Nonnull final String requestID) {
    this.requestID = requestID;
  }

   /**
   * Set the responseTimestamp of this {@link Response} instance and return the same instance.
   *
   * @param responseTimestamp  Timestamp of the request to which this response relates.
   * @return The same instance of this {@link Response} class
   */
   @Nonnull public Response responseTimestamp(@Nonnull final String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
    return this;
  }

   /**
   * Timestamp of the request to which this response relates.
   * @return responseTimestamp  The responseTimestamp of this {@link Response} instance.
  **/
  @ApiModelProperty(value = "Timestamp of the request to which this response relates.")
  @Nonnull public String getResponseTimestamp() {
    return responseTimestamp;
  }

  /**
  * Set the responseTimestamp of this {@link Response} instance.
  *
  * @param responseTimestamp  Timestamp of the request to which this response relates.
  */
  public void setResponseTimestamp( @Nonnull final String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
  }

   /**
   * Set the businessError of this {@link Response} instance and return the same instance.
   *
   * @param businessError  The list of business errors created during the processing of the corresponding request.
   * @return The same instance of this {@link Response} class
   */
   @Nonnull public Response businessError(@Nonnull final List<BusinessError> businessError) {
    this.businessError = businessError;
    return this;
  }
  /**
  * Add one BusinessError instance to this {@link Response}.
  * @param businessErrorItem The BusinessError that should be added
  * @return The same instance of type {@link Response}
  */
  @Nonnull public Response addBusinessErrorItem( @Nonnull final BusinessError businessErrorItem) {
    if (this.businessError == null) {
      this.businessError = new ArrayList<>();
    }
    this.businessError.add(businessErrorItem);
    return this;
  }

   /**
   * The list of business errors created during the processing of the corresponding request.
   * @return businessError  The businessError of this {@link Response} instance.
  **/
  @ApiModelProperty(value = "The list of business errors created during the processing of the corresponding request.")
  @Nonnull public List<BusinessError> getBusinessError() {
    return businessError;
  }

  /**
  * Set the businessError of this {@link Response} instance.
  *
  * @param businessError  The list of business errors created during the processing of the corresponding request.
  */
  public void setBusinessError( @Nonnull final List<BusinessError> businessError) {
    this.businessError = businessError;
  }

   /**
   * Set the responseCode of this {@link Response} instance and return the same instance.
   *
   * @param responseCode  Indicates if the message was successful (OK) or not (Rejected).
   * @return The same instance of this {@link Response} class
   */
   @Nonnull public Response responseCode(@Nonnull final ResponseCodeEnum responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Indicates if the message was successful (OK) or not (Rejected).
   * @return responseCode  The responseCode of this {@link Response} instance.
  **/
  @ApiModelProperty(value = "Indicates if the message was successful (OK) or not (Rejected).")
  @Nonnull public ResponseCodeEnum getResponseCode() {
    return responseCode;
  }

  /**
  * Set the responseCode of this {@link Response} instance.
  *
  * @param responseCode  Indicates if the message was successful (OK) or not (Rejected).
  */
  public void setResponseCode( @Nonnull final ResponseCodeEnum responseCode) {
    this.responseCode = responseCode;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Response response = (Response) o;
    return Objects.equals(this.any, response.any) &&
        Objects.equals(this.requestID, response.requestID) &&
        Objects.equals(this.responseTimestamp, response.responseTimestamp) &&
        Objects.equals(this.businessError, response.businessError) &&
        Objects.equals(this.responseCode, response.responseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(any, requestID, responseTimestamp, businessError, responseCode);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    responseTimestamp: ").append(toIndentedString(responseTimestamp)).append("\n");
    sb.append("    businessError: ").append(toIndentedString(businessError)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
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

