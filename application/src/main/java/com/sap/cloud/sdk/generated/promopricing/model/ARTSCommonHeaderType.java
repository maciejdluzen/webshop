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
import com.sap.cloud.sdk.generated.promopricing.model.BusinessUnitCommonData;
import com.sap.cloud.sdk.generated.promopricing.model.HeaderDateTime;
import com.sap.cloud.sdk.generated.promopricing.model.MessageID;
import com.sap.cloud.sdk.generated.promopricing.model.Response;
import com.sap.cloud.sdk.generated.promopricing.model.WorkstationIDCommonData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * Contains basic information for the request or the response.
 */
@ApiModel(description = "Contains basic information for the request or the response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class ARTSCommonHeaderType 
// CHECKSTYLE:ON
{
  @JsonProperty("MessageID")
  @SerializedName("MessageID")
  private MessageID messageID;

  @JsonProperty("DateTime")
  @SerializedName("DateTime")
  private List<HeaderDateTime> dateTime = new ArrayList<>();

  @JsonProperty("Response")
  @SerializedName("Response")
  private Response response;

  @JsonProperty("Requestor")
  @SerializedName("Requestor")
  private String requestor;

  @JsonProperty("BusinessUnit")
  @SerializedName("BusinessUnit")
  private List<BusinessUnitCommonData> businessUnit = new ArrayList<>();

  @JsonProperty("WorkstationID")
  @SerializedName("WorkstationID")
  private WorkstationIDCommonData workstationID;

  @JsonProperty("RequestedLanguage")
  @SerializedName("RequestedLanguage")
  private String requestedLanguage;

  @JsonProperty("RequestedMultiLanguage")
  @SerializedName("RequestedMultiLanguage")
  private List<String> requestedMultiLanguage = new ArrayList<>();

  @JsonProperty("any")
  @SerializedName("any")
  private List<Object> any = new ArrayList<>();

  @JsonProperty("MasterDataSourceSystemID")
  @SerializedName("MasterDataSourceSystemID")
  private String masterDataSourceSystemID;

  /**
   * Describes what to do with the provided data.
   */
  public enum ActionCodeEnum {
    /**
    * The CALCULATE option of this ARTSCommonHeaderType
    */
    CALCULATE("Calculate");

    private String value;

    ActionCodeEnum(String value) {
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
    * @return The enum value of type ARTSCommonHeaderType
    */
    @JsonCreator
    @Nonnull public static ActionCodeEnum fromValue(@Nonnull final String value) {
      for (ActionCodeEnum b : ActionCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ActionCode")
  @SerializedName("ActionCode")
  private ActionCodeEnum actionCode;

  /**
   * Defines whether this is a calculation request or a calculation response if the consumer only sends type \&quot;Request\&quot;.
   */
  public enum MessageTypeEnum {
    /**
    * The REQUEST option of this ARTSCommonHeaderType
    */
    REQUEST("Request"),
    
    /**
    * The RESPONSE option of this ARTSCommonHeaderType
    */
    RESPONSE("Response");

    private String value;

    MessageTypeEnum(String value) {
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
    * @return The enum value of type ARTSCommonHeaderType
    */
    @JsonCreator
    @Nonnull public static MessageTypeEnum fromValue(@Nonnull final String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("MessageType")
  @SerializedName("MessageType")
  private MessageTypeEnum messageType;


   /**
   * Set the messageID of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param messageID  The messageID of this {@link ARTSCommonHeaderType}
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType messageID(@Nonnull final MessageID messageID) {
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID  The messageID of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(required = true, value = "")
  @Nonnull public MessageID getMessageID() {
    return messageID;
  }

  /**
  * Set the messageID of this {@link ARTSCommonHeaderType} instance.
  *
  * @param messageID  The messageID of this {@link ARTSCommonHeaderType}
  */
  public void setMessageID( @Nonnull final MessageID messageID) {
    this.messageID = messageID;
  }

   /**
   * Set the dateTime of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param dateTime  The date and time when the request was created. Although this is an array, only 1 entry is allowed.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType dateTime(@Nonnull final List<HeaderDateTime> dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  /**
  * Add one DateTime instance to this {@link ARTSCommonHeaderType}.
  * @param dateTimeItem The DateTime that should be added
  * @return The same instance of type {@link ARTSCommonHeaderType}
  */
  @Nonnull public ARTSCommonHeaderType addDateTimeItem( @Nonnull final HeaderDateTime dateTimeItem) {
    if (this.dateTime == null) {
      this.dateTime = new ArrayList<>();
    }
    this.dateTime.add(dateTimeItem);
    return this;
  }

   /**
   * The date and time when the request was created. Although this is an array, only 1 entry is allowed.
   * @return dateTime  The dateTime of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "The date and time when the request was created. Although this is an array, only 1 entry is allowed.")
  @Nonnull public List<HeaderDateTime> getDateTime() {
    return dateTime;
  }

  /**
  * Set the dateTime of this {@link ARTSCommonHeaderType} instance.
  *
  * @param dateTime  The date and time when the request was created. Although this is an array, only 1 entry is allowed.
  */
  public void setDateTime( @Nonnull final List<HeaderDateTime> dateTime) {
    this.dateTime = dateTime;
  }

   /**
   * Set the response of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param response  The response of this {@link ARTSCommonHeaderType}
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType response(@Nonnull final Response response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response  The response of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "")
  @Nonnull public Response getResponse() {
    return response;
  }

  /**
  * Set the response of this {@link ARTSCommonHeaderType} instance.
  *
  * @param response  The response of this {@link ARTSCommonHeaderType}
  */
  public void setResponse( @Nonnull final Response response) {
    this.response = response;
  }

   /**
   * Set the requestor of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param requestor  Identifies the agent which sent this message.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType requestor(@Nonnull final String requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Identifies the agent which sent this message.
   * @return requestor  The requestor of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "Identifies the agent which sent this message.")
  @Nonnull public String getRequestor() {
    return requestor;
  }

  /**
  * Set the requestor of this {@link ARTSCommonHeaderType} instance.
  *
  * @param requestor  Identifies the agent which sent this message.
  */
  public void setRequestor( @Nonnull final String requestor) {
    this.requestor = requestor;
  }

   /**
   * Set the businessUnit of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param businessUnit  Business unit for which prices and promotions should be determined. Although this is an array, only 1 entry is allowed.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType businessUnit(@Nonnull final List<BusinessUnitCommonData> businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  /**
  * Add one BusinessUnit instance to this {@link ARTSCommonHeaderType}.
  * @param businessUnitItem The BusinessUnit that should be added
  * @return The same instance of type {@link ARTSCommonHeaderType}
  */
  @Nonnull public ARTSCommonHeaderType addBusinessUnitItem( @Nonnull final BusinessUnitCommonData businessUnitItem) {
    this.businessUnit.add(businessUnitItem);
    return this;
  }

   /**
   * Business unit for which prices and promotions should be determined. Although this is an array, only 1 entry is allowed.
   * @return businessUnit  The businessUnit of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(required = true, value = "Business unit for which prices and promotions should be determined. Although this is an array, only 1 entry is allowed.")
  @Nonnull public List<BusinessUnitCommonData> getBusinessUnit() {
    return businessUnit;
  }

  /**
  * Set the businessUnit of this {@link ARTSCommonHeaderType} instance.
  *
  * @param businessUnit  Business unit for which prices and promotions should be determined. Although this is an array, only 1 entry is allowed.
  */
  public void setBusinessUnit( @Nonnull final List<BusinessUnitCommonData> businessUnit) {
    this.businessUnit = businessUnit;
  }

   /**
   * Set the workstationID of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param workstationID  The workstationID of this {@link ARTSCommonHeaderType}
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType workstationID(@Nonnull final WorkstationIDCommonData workstationID) {
    this.workstationID = workstationID;
    return this;
  }

   /**
   * Get workstationID
   * @return workstationID  The workstationID of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "")
  @Nonnull public WorkstationIDCommonData getWorkstationID() {
    return workstationID;
  }

  /**
  * Set the workstationID of this {@link ARTSCommonHeaderType} instance.
  *
  * @param workstationID  The workstationID of this {@link ARTSCommonHeaderType}
  */
  public void setWorkstationID( @Nonnull final WorkstationIDCommonData workstationID) {
    this.workstationID = workstationID;
  }

   /**
   * Set the requestedLanguage of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param requestedLanguage  Uppercase ISO code of the language in which language-dependent texts like a promotion description should be returned. Uppercase representation. RequestedLanguage is not applied in conjunction with RequestedMultiLanguage. If not set, any language found will be used with Client API version 1.0. As of Client API version 2.0, use RequestedMultiLanguage instead. 
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType requestedLanguage(@Nonnull final String requestedLanguage) {
    this.requestedLanguage = requestedLanguage;
    return this;
  }

   /**
   * Uppercase ISO code of the language in which language-dependent texts like a promotion description should be returned. Uppercase representation. RequestedLanguage is not applied in conjunction with RequestedMultiLanguage. If not set, any language found will be used with Client API version 1.0. As of Client API version 2.0, use RequestedMultiLanguage instead. 
   * @return requestedLanguage  The requestedLanguage of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "Uppercase ISO code of the language in which language-dependent texts like a promotion description should be returned. Uppercase representation. RequestedLanguage is not applied in conjunction with RequestedMultiLanguage. If not set, any language found will be used with Client API version 1.0. As of Client API version 2.0, use RequestedMultiLanguage instead. ")
  @Nonnull public String getRequestedLanguage() {
    return requestedLanguage;
  }

  /**
  * Set the requestedLanguage of this {@link ARTSCommonHeaderType} instance.
  *
  * @param requestedLanguage  Uppercase ISO code of the language in which language-dependent texts like a promotion description should be returned. Uppercase representation. RequestedLanguage is not applied in conjunction with RequestedMultiLanguage. If not set, any language found will be used with Client API version 1.0. As of Client API version 2.0, use RequestedMultiLanguage instead. 
  */
  public void setRequestedLanguage( @Nonnull final String requestedLanguage) {
    this.requestedLanguage = requestedLanguage;
  }

   /**
   * Set the requestedMultiLanguage of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param requestedMultiLanguage  Uppercase ISO codes of the languages in which language dependent-texts like a promotion description should be returned. Not to be used in conjunction with RequestedLanguage. Requires at least API version 2.0. If not set, all languages found will be used.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType requestedMultiLanguage(@Nonnull final List<String> requestedMultiLanguage) {
    this.requestedMultiLanguage = requestedMultiLanguage;
    return this;
  }
  /**
  * Add one RequestedMultiLanguage instance to this {@link ARTSCommonHeaderType}.
  * @param requestedMultiLanguageItem The RequestedMultiLanguage that should be added
  * @return The same instance of type {@link ARTSCommonHeaderType}
  */
  @Nonnull public ARTSCommonHeaderType addRequestedMultiLanguageItem( @Nonnull final String requestedMultiLanguageItem) {
    if (this.requestedMultiLanguage == null) {
      this.requestedMultiLanguage = new ArrayList<>();
    }
    this.requestedMultiLanguage.add(requestedMultiLanguageItem);
    return this;
  }

   /**
   * Uppercase ISO codes of the languages in which language dependent-texts like a promotion description should be returned. Not to be used in conjunction with RequestedLanguage. Requires at least API version 2.0. If not set, all languages found will be used.
   * @return requestedMultiLanguage  The requestedMultiLanguage of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "Uppercase ISO codes of the languages in which language dependent-texts like a promotion description should be returned. Not to be used in conjunction with RequestedLanguage. Requires at least API version 2.0. If not set, all languages found will be used.")
  @Nonnull public List<String> getRequestedMultiLanguage() {
    return requestedMultiLanguage;
  }

  /**
  * Set the requestedMultiLanguage of this {@link ARTSCommonHeaderType} instance.
  *
  * @param requestedMultiLanguage  Uppercase ISO codes of the languages in which language dependent-texts like a promotion description should be returned. Not to be used in conjunction with RequestedLanguage. Requires at least API version 2.0. If not set, all languages found will be used.
  */
  public void setRequestedMultiLanguage( @Nonnull final List<String> requestedMultiLanguage) {
    this.requestedMultiLanguage = requestedMultiLanguage;
  }

   /**
   * Set the any of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param any  This is currently not supported.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType any(@Nonnull final List<Object> any) {
    this.any = any;
    return this;
  }
  /**
  * Add one Any instance to this {@link ARTSCommonHeaderType}.
  * @param anyItem The Any that should be added
  * @return The same instance of type {@link ARTSCommonHeaderType}
  */
  @Nonnull public ARTSCommonHeaderType addAnyItem( @Nonnull final Object anyItem) {
    if (this.any == null) {
      this.any = new ArrayList<>();
    }
    this.any.add(anyItem);
    return this;
  }

   /**
   * This is currently not supported.
   * @return any  The any of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(value = "This is currently not supported.")
  @Nonnull public List<Object> getAny() {
    return any;
  }

  /**
  * Set the any of this {@link ARTSCommonHeaderType} instance.
  *
  * @param any  This is currently not supported.
  */
  public void setAny( @Nonnull final List<Object> any) {
    this.any = any;
  }

   /**
   * Set the masterDataSourceSystemID of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param masterDataSourceSystemID  Part of the compound key for items, item hierarchy nodes and business units. Each price record and each promotion refers to exactly one master data source system. Supported with Client API version 2.1 or higher. This field is required when using the cloud version of the price calculation. 
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType masterDataSourceSystemID(@Nonnull final String masterDataSourceSystemID) {
    this.masterDataSourceSystemID = masterDataSourceSystemID;
    return this;
  }

   /**
   * Part of the compound key for items, item hierarchy nodes and business units. Each price record and each promotion refers to exactly one master data source system. Supported with Client API version 2.1 or higher. This field is required when using the cloud version of the price calculation. 
   * @return masterDataSourceSystemID  The masterDataSourceSystemID of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(required = true, value = "Part of the compound key for items, item hierarchy nodes and business units. Each price record and each promotion refers to exactly one master data source system. Supported with Client API version 2.1 or higher. This field is required when using the cloud version of the price calculation. ")
  @Nonnull public String getMasterDataSourceSystemID() {
    return masterDataSourceSystemID;
  }

  /**
  * Set the masterDataSourceSystemID of this {@link ARTSCommonHeaderType} instance.
  *
  * @param masterDataSourceSystemID  Part of the compound key for items, item hierarchy nodes and business units. Each price record and each promotion refers to exactly one master data source system. Supported with Client API version 2.1 or higher. This field is required when using the cloud version of the price calculation. 
  */
  public void setMasterDataSourceSystemID( @Nonnull final String masterDataSourceSystemID) {
    this.masterDataSourceSystemID = masterDataSourceSystemID;
  }

   /**
   * Set the actionCode of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param actionCode  Describes what to do with the provided data.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType actionCode(@Nonnull final ActionCodeEnum actionCode) {
    this.actionCode = actionCode;
    return this;
  }

   /**
   * Describes what to do with the provided data.
   * @return actionCode  The actionCode of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(required = true, value = "Describes what to do with the provided data.")
  @Nonnull public ActionCodeEnum getActionCode() {
    return actionCode;
  }

  /**
  * Set the actionCode of this {@link ARTSCommonHeaderType} instance.
  *
  * @param actionCode  Describes what to do with the provided data.
  */
  public void setActionCode( @Nonnull final ActionCodeEnum actionCode) {
    this.actionCode = actionCode;
  }

   /**
   * Set the messageType of this {@link ARTSCommonHeaderType} instance and return the same instance.
   *
   * @param messageType  Defines whether this is a calculation request or a calculation response if the consumer only sends type \&quot;Request\&quot;.
   * @return The same instance of this {@link ARTSCommonHeaderType} class
   */
   @Nonnull public ARTSCommonHeaderType messageType(@Nonnull final MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Defines whether this is a calculation request or a calculation response if the consumer only sends type \&quot;Request\&quot;.
   * @return messageType  The messageType of this {@link ARTSCommonHeaderType} instance.
  **/
  @ApiModelProperty(required = true, value = "Defines whether this is a calculation request or a calculation response if the consumer only sends type \"Request\".")
  @Nonnull public MessageTypeEnum getMessageType() {
    return messageType;
  }

  /**
  * Set the messageType of this {@link ARTSCommonHeaderType} instance.
  *
  * @param messageType  Defines whether this is a calculation request or a calculation response if the consumer only sends type \&quot;Request\&quot;.
  */
  public void setMessageType( @Nonnull final MessageTypeEnum messageType) {
    this.messageType = messageType;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ARTSCommonHeaderType arTSCommonHeaderType = (ARTSCommonHeaderType) o;
    return Objects.equals(this.messageID, arTSCommonHeaderType.messageID) &&
        Objects.equals(this.dateTime, arTSCommonHeaderType.dateTime) &&
        Objects.equals(this.response, arTSCommonHeaderType.response) &&
        Objects.equals(this.requestor, arTSCommonHeaderType.requestor) &&
        Objects.equals(this.businessUnit, arTSCommonHeaderType.businessUnit) &&
        Objects.equals(this.workstationID, arTSCommonHeaderType.workstationID) &&
        Objects.equals(this.requestedLanguage, arTSCommonHeaderType.requestedLanguage) &&
        Objects.equals(this.requestedMultiLanguage, arTSCommonHeaderType.requestedMultiLanguage) &&
        Objects.equals(this.any, arTSCommonHeaderType.any) &&
        Objects.equals(this.masterDataSourceSystemID, arTSCommonHeaderType.masterDataSourceSystemID) &&
        Objects.equals(this.actionCode, arTSCommonHeaderType.actionCode) &&
        Objects.equals(this.messageType, arTSCommonHeaderType.messageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, dateTime, response, requestor, businessUnit, workstationID, requestedLanguage, requestedMultiLanguage, any, masterDataSourceSystemID, actionCode, messageType);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ARTSCommonHeaderType {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    workstationID: ").append(toIndentedString(workstationID)).append("\n");
    sb.append("    requestedLanguage: ").append(toIndentedString(requestedLanguage)).append("\n");
    sb.append("    requestedMultiLanguage: ").append(toIndentedString(requestedMultiLanguage)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    masterDataSourceSystemID: ").append(toIndentedString(masterDataSourceSystemID)).append("\n");
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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
