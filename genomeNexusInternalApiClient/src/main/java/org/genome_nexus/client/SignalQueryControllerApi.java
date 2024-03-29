/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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


import org.genome_nexus.client.SignalQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalQueryControllerApi {
    private ApiClient apiClient;

    public SignalQueryControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SignalQueryControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for searchSignalByKeywordGETUsingGET
     * @param keyword keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G&gt;A (required)
     * @param limit Max number of matching results to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchSignalByKeywordGETUsingGETCall(String keyword, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/signal/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (keyword != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword", keyword));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchSignalByKeywordGETUsingGETValidateBeforeCall(String keyword, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException("Missing the required parameter 'keyword' when calling searchSignalByKeywordGETUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = searchSignalByKeywordGETUsingGETCall(keyword, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Performs search by gene, protein change, variant or region.
     * 
     * @param keyword keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G&gt;A (required)
     * @param limit Max number of matching results to return (optional)
     * @return List&lt;SignalQuery&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SignalQuery> searchSignalByKeywordGETUsingGET(String keyword, Integer limit) throws ApiException {
        ApiResponse<List<SignalQuery>> resp = searchSignalByKeywordGETUsingGETWithHttpInfo(keyword, limit);
        return resp.getData();
    }

    /**
     * Performs search by gene, protein change, variant or region.
     * 
     * @param keyword keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G&gt;A (required)
     * @param limit Max number of matching results to return (optional)
     * @return ApiResponse&lt;List&lt;SignalQuery&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SignalQuery>> searchSignalByKeywordGETUsingGETWithHttpInfo(String keyword, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchSignalByKeywordGETUsingGETValidateBeforeCall(keyword, limit, null, null);
        Type localVarReturnType = new TypeToken<List<SignalQuery>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Performs search by gene, protein change, variant or region. (asynchronously)
     * 
     * @param keyword keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G&gt;A (required)
     * @param limit Max number of matching results to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchSignalByKeywordGETUsingGETAsync(String keyword, Integer limit, final ApiCallback<List<SignalQuery>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchSignalByKeywordGETUsingGETValidateBeforeCall(keyword, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SignalQuery>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
