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
import com.sap.cloud.sdk.generated.promopricing.model.LoyaltyAccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * LoyaltyAccountCommonData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

// CHECKSTYLE:OFF
public class LoyaltyAccountCommonData 
// CHECKSTYLE:ON
{
  @JsonProperty("CustomerID")
  @SerializedName("CustomerID")
  private String customerID;

  @JsonProperty("LoyaltyProgram")
  @SerializedName("LoyaltyProgram")
  private List<LoyaltyAccountType> loyaltyProgram = new ArrayList<>();

  @JsonProperty("CustomerIsEmployeeFlag")
  @SerializedName("CustomerIsEmployeeFlag")
  private Boolean customerIsEmployeeFlag;


   /**
   * Set the customerID of this {@link LoyaltyAccountCommonData} instance and return the same instance.
   *
   * @param customerID  Identifies the customer of the loyalty account. Must be set, but currently the value is not used.
   * @return The same instance of this {@link LoyaltyAccountCommonData} class
   */
   @Nonnull public LoyaltyAccountCommonData customerID(@Nonnull final String customerID) {
    this.customerID = customerID;
    return this;
  }

   /**
   * Identifies the customer of the loyalty account. Must be set, but currently the value is not used.
   * @return customerID  The customerID of this {@link LoyaltyAccountCommonData} instance.
  **/
  @ApiModelProperty(value = "Identifies the customer of the loyalty account. Must be set, but currently the value is not used.")
  @Nonnull public String getCustomerID() {
    return customerID;
  }

  /**
  * Set the customerID of this {@link LoyaltyAccountCommonData} instance.
  *
  * @param customerID  Identifies the customer of the loyalty account. Must be set, but currently the value is not used.
  */
  public void setCustomerID( @Nonnull final String customerID) {
    this.customerID = customerID;
  }

   /**
   * Set the loyaltyProgram of this {@link LoyaltyAccountCommonData} instance and return the same instance.
   *
   * @param loyaltyProgram  List of loyalty programs to which this customer is assigned for this loyalty account.
   * @return The same instance of this {@link LoyaltyAccountCommonData} class
   */
   @Nonnull public LoyaltyAccountCommonData loyaltyProgram(@Nonnull final List<LoyaltyAccountType> loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
    return this;
  }
  /**
  * Add one LoyaltyProgram instance to this {@link LoyaltyAccountCommonData}.
  * @param loyaltyProgramItem The LoyaltyProgram that should be added
  * @return The same instance of type {@link LoyaltyAccountCommonData}
  */
  @Nonnull public LoyaltyAccountCommonData addLoyaltyProgramItem( @Nonnull final LoyaltyAccountType loyaltyProgramItem) {
    if (this.loyaltyProgram == null) {
      this.loyaltyProgram = new ArrayList<>();
    }
    this.loyaltyProgram.add(loyaltyProgramItem);
    return this;
  }

   /**
   * List of loyalty programs to which this customer is assigned for this loyalty account.
   * @return loyaltyProgram  The loyaltyProgram of this {@link LoyaltyAccountCommonData} instance.
  **/
  @ApiModelProperty(value = "List of loyalty programs to which this customer is assigned for this loyalty account.")
  @Nonnull public List<LoyaltyAccountType> getLoyaltyProgram() {
    return loyaltyProgram;
  }

  /**
  * Set the loyaltyProgram of this {@link LoyaltyAccountCommonData} instance.
  *
  * @param loyaltyProgram  List of loyalty programs to which this customer is assigned for this loyalty account.
  */
  public void setLoyaltyProgram( @Nonnull final List<LoyaltyAccountType> loyaltyProgram) {
    this.loyaltyProgram = loyaltyProgram;
  }

   /**
   * Set the customerIsEmployeeFlag of this {@link LoyaltyAccountCommonData} instance and return the same instance.
   *
   * @param customerIsEmployeeFlag  Indicates if the specified customer is also an employee. Currently not used.
   * @return The same instance of this {@link LoyaltyAccountCommonData} class
   */
   @Nonnull public LoyaltyAccountCommonData customerIsEmployeeFlag(@Nonnull final Boolean customerIsEmployeeFlag) {
    this.customerIsEmployeeFlag = customerIsEmployeeFlag;
    return this;
  }

   /**
   * Indicates if the specified customer is also an employee. Currently not used.
   * @return customerIsEmployeeFlag  The customerIsEmployeeFlag of this {@link LoyaltyAccountCommonData} instance.
  **/
  @ApiModelProperty(value = "Indicates if the specified customer is also an employee. Currently not used.")
  @Nonnull public Boolean isCustomerIsEmployeeFlag() {
    return customerIsEmployeeFlag;
  }

  /**
  * Set the customerIsEmployeeFlag of this {@link LoyaltyAccountCommonData} instance.
  *
  * @param customerIsEmployeeFlag  Indicates if the specified customer is also an employee. Currently not used.
  */
  public void setCustomerIsEmployeeFlag( @Nonnull final Boolean customerIsEmployeeFlag) {
    this.customerIsEmployeeFlag = customerIsEmployeeFlag;
  }
  @Override
  public boolean equals(@Nonnull final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final LoyaltyAccountCommonData loyaltyAccountCommonData = (LoyaltyAccountCommonData) o;
    return Objects.equals(this.customerID, loyaltyAccountCommonData.customerID) &&
        Objects.equals(this.loyaltyProgram, loyaltyAccountCommonData.loyaltyProgram) &&
        Objects.equals(this.customerIsEmployeeFlag, loyaltyAccountCommonData.customerIsEmployeeFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, loyaltyProgram, customerIsEmployeeFlag);
  }


  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyAccountCommonData {\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    loyaltyProgram: ").append(toIndentedString(loyaltyProgram)).append("\n");
    sb.append("    customerIsEmployeeFlag: ").append(toIndentedString(customerIsEmployeeFlag)).append("\n");
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
