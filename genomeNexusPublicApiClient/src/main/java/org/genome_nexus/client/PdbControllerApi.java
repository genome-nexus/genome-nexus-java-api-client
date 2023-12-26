/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import org.genome_nexus.ApiCallback;
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.ApiResponse;
import org.genome_nexus.Configuration;
import org.genome_nexus.Pair;
import org.genome_nexus.ProgressRequestBody;
import org.genome_nexus.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.genome_nexus.client.PdbHeader;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PdbControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PdbControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PdbControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for fetchPdbHeaderGET
     * @param pdbId PDB id, for example 1a37 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchPdbHeaderGETCall(String pdbId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdb/header/{pdbId}"
            .replace("{" + "pdbId" + "}", localVarApiClient.escapeString(pdbId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchPdbHeaderGETValidateBeforeCall(String pdbId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pdbId' is set
        if (pdbId == null) {
            throw new ApiException("Missing the required parameter 'pdbId' when calling fetchPdbHeaderGET(Async)");
        }

        return fetchPdbHeaderGETCall(pdbId, _callback);

    }

    /**
     * Retrieves PDB header info by a PDB id
     * 
     * @param pdbId PDB id, for example 1a37 (required)
     * @return PdbHeader
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PdbHeader fetchPdbHeaderGET(String pdbId) throws ApiException {
        ApiResponse<PdbHeader> localVarResp = fetchPdbHeaderGETWithHttpInfo(pdbId);
        return localVarResp.getData();
    }

    /**
     * Retrieves PDB header info by a PDB id
     * 
     * @param pdbId PDB id, for example 1a37 (required)
     * @return ApiResponse&lt;PdbHeader&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PdbHeader> fetchPdbHeaderGETWithHttpInfo(String pdbId) throws ApiException {
        okhttp3.Call localVarCall = fetchPdbHeaderGETValidateBeforeCall(pdbId, null);
        Type localVarReturnType = new TypeToken<PdbHeader>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves PDB header info by a PDB id (asynchronously)
     * 
     * @param pdbId PDB id, for example 1a37 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchPdbHeaderGETAsync(String pdbId, final ApiCallback<PdbHeader> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchPdbHeaderGETValidateBeforeCall(pdbId, _callback);
        Type localVarReturnType = new TypeToken<PdbHeader>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchPdbHeaderPOST
     * @param pdbIds List of pdb ids, for example [\&quot;1a37\&quot;,\&quot;1a4o\&quot;] (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchPdbHeaderPOSTCall(List<String> pdbIds, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = pdbIds;

        // create path and map variables
        String localVarPath = "/pdb/header";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchPdbHeaderPOSTValidateBeforeCall(List<String> pdbIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pdbIds' is set
        if (pdbIds == null) {
            throw new ApiException("Missing the required parameter 'pdbIds' when calling fetchPdbHeaderPOST(Async)");
        }

        return fetchPdbHeaderPOSTCall(pdbIds, _callback);

    }

    /**
     * Retrieves PDB header info by a PDB id
     * 
     * @param pdbIds List of pdb ids, for example [\&quot;1a37\&quot;,\&quot;1a4o\&quot;] (required)
     * @return List&lt;PdbHeader&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<PdbHeader> fetchPdbHeaderPOST(List<String> pdbIds) throws ApiException {
        ApiResponse<List<PdbHeader>> localVarResp = fetchPdbHeaderPOSTWithHttpInfo(pdbIds);
        return localVarResp.getData();
    }

    /**
     * Retrieves PDB header info by a PDB id
     * 
     * @param pdbIds List of pdb ids, for example [\&quot;1a37\&quot;,\&quot;1a4o\&quot;] (required)
     * @return ApiResponse&lt;List&lt;PdbHeader&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PdbHeader>> fetchPdbHeaderPOSTWithHttpInfo(List<String> pdbIds) throws ApiException {
        okhttp3.Call localVarCall = fetchPdbHeaderPOSTValidateBeforeCall(pdbIds, null);
        Type localVarReturnType = new TypeToken<List<PdbHeader>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves PDB header info by a PDB id (asynchronously)
     * 
     * @param pdbIds List of pdb ids, for example [\&quot;1a37\&quot;,\&quot;1a4o\&quot;] (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchPdbHeaderPOSTAsync(List<String> pdbIds, final ApiCallback<List<PdbHeader>> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchPdbHeaderPOSTValidateBeforeCall(pdbIds, _callback);
        Type localVarReturnType = new TypeToken<List<PdbHeader>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
