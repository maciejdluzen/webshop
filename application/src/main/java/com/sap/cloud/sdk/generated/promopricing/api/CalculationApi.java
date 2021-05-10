/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.cloud.sdk.generated.promopricing.api;

import com.sap.cloud.sdk.services.rest.core.RestRequestException;
import com.sap.cloud.sdk.services.rest.core.RestResponse;
import com.sap.cloud.sdk.services.rest.core.AbstractRestService;
import com.sap.cloud.sdk.services.rest.apiclient.ApiClient;

import com.sap.cloud.sdk.generated.promopricing.model.PriceCalculate ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.model.PriceCalculateResponse ; //NOPMD

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.annotations.Beta;

import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;

/**
* Calculation in version 1.1.0.
*
* You use the Calculation service for SAP Omnichannel Promotion Pricing in your sales channel application to determine the effective sales prices by applying promotional rules in the relevant customer context. The service can be called for a single product or for an entire shopping cart. The calculation is based on the data you uploaded to the cloud environment, and sends back prices and additional information about customer rewards to the calling application.
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationApi extends AbstractRestService {
    /**
    * Instantiates this API class to invoke operations on the Calculation.
    *
    * @param httpDestination The destination that API should be used with
    */
    public CalculationApi( @Nonnull final HttpDestinationProperties httpDestination )
    {
        super(httpDestination);
    }

    /**
    * Instantiates this API class to invoke operations on the Calculation based on a given {@link ApiClient}.
    *
    * @param apiClient
    *            ApiClient to invoke the API on
    */
    @Beta
    public CalculationApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Calculates a PriceCalculateTransaction</p>
     *<p>Determines regular prices by applying promotional rules for the provided list of items.</p>
     * <p><b>200</b> - Price calculation was successful.
     * <p><b>400</b> - The price could not be calculated. For more information, see the \&quot;Response\&quot; element of the \&quot;ARTSHeader\&quot; in the returned response. 
     * <p><b>0</b> - This error is not related to the Calculation service.
* @param tenantName
        The name of the subdomain in which the service instance/subscription is created. **For the sandbox environment, enter &#39;oppsapihub&#39;.**
* @param priceCalculate
        The transaction for which the price calculation is to be done
* @return PriceCalculateResponse
* @throws RestRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public PriceCalculateResponse calculateViaRestWithTenant( @Nonnull final String tenantName,  @Nonnull final PriceCalculate priceCalculate) throws RestRequestException {
        final Object postBody = priceCalculate;
        
        // verify the required parameter 'tenantName' is set
        if (tenantName == null) {
            throw new RestRequestException("Missing the required parameter 'tenantName' when calling calculateViaRestWithTenant");
        }
        
        // verify the required parameter 'priceCalculate' is set
        if (priceCalculate == null) {
            throw new RestRequestException("Missing the required parameter 'priceCalculate' when calling calculateViaRestWithTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tenantName", tenantName);
        final String path = UriComponentsBuilder.fromPath("/restapi/{tenantName}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "application/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        final String[] authNames = new String[] { "calculation_auth" };

        final ParameterizedTypeReference<PriceCalculateResponse> returnType = new ParameterizedTypeReference<PriceCalculateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
