# SignalMutationControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchSignalMutationsByHgvsgGETUsingGET**](SignalMutationControllerApi.md#fetchSignalMutationsByHgvsgGETUsingGET) | **GET** /signal/mutation/hgvs/{variant} | Retrieves SignalDB mutations by hgvgs variant |
| [**fetchSignalMutationsByHugoSymbolGETUsingGET**](SignalMutationControllerApi.md#fetchSignalMutationsByHugoSymbolGETUsingGET) | **GET** /signal/mutation | Retrieves SignalDB mutations by Hugo Gene Symbol |
| [**fetchSignalMutationsByMutationFilterPOSTUsingPOST**](SignalMutationControllerApi.md#fetchSignalMutationsByMutationFilterPOSTUsingPOST) | **POST** /signal/mutation | Retrieves SignalDB mutations by Mutation Filter |


<a id="fetchSignalMutationsByHgvsgGETUsingGET"></a>
# **fetchSignalMutationsByHgvsgGETUsingGET**
> List&lt;SignalMutation&gt; fetchSignalMutationsByHgvsgGETUsingGET(variant)

Retrieves SignalDB mutations by hgvgs variant

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.SignalMutationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    SignalMutationControllerApi apiInstance = new SignalMutationControllerApi(defaultClient);
    String variant = "variant_example"; // String | A variant. For example 13:g.32890665G>A
    try {
      List<SignalMutation> result = apiInstance.fetchSignalMutationsByHgvsgGETUsingGET(variant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignalMutationControllerApi#fetchSignalMutationsByHgvsgGETUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **variant** | **String**| A variant. For example 13:g.32890665G&gt;A | |

### Return type

[**List&lt;SignalMutation&gt;**](SignalMutation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchSignalMutationsByHugoSymbolGETUsingGET"></a>
# **fetchSignalMutationsByHugoSymbolGETUsingGET**
> List&lt;SignalMutation&gt; fetchSignalMutationsByHugoSymbolGETUsingGET(hugoGeneSymbol)

Retrieves SignalDB mutations by Hugo Gene Symbol

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.SignalMutationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    SignalMutationControllerApi apiInstance = new SignalMutationControllerApi(defaultClient);
    String hugoGeneSymbol = "hugoGeneSymbol_example"; // String | Hugo Symbol. For example BRCA1
    try {
      List<SignalMutation> result = apiInstance.fetchSignalMutationsByHugoSymbolGETUsingGET(hugoGeneSymbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignalMutationControllerApi#fetchSignalMutationsByHugoSymbolGETUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hugoGeneSymbol** | **String**| Hugo Symbol. For example BRCA1 | [optional] |

### Return type

[**List&lt;SignalMutation&gt;**](SignalMutation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchSignalMutationsByMutationFilterPOSTUsingPOST"></a>
# **fetchSignalMutationsByMutationFilterPOSTUsingPOST**
> List&lt;SignalMutation&gt; fetchSignalMutationsByMutationFilterPOSTUsingPOST(mutationFilter)

Retrieves SignalDB mutations by Mutation Filter

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.SignalMutationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    SignalMutationControllerApi apiInstance = new SignalMutationControllerApi(defaultClient);
    SignalMutationFilter mutationFilter = new SignalMutationFilter(); // SignalMutationFilter | List of Hugo Gene Symbols. For example [\"TP53\", \"PIK3CA\", \"BRCA1\"]
    try {
      List<SignalMutation> result = apiInstance.fetchSignalMutationsByMutationFilterPOSTUsingPOST(mutationFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignalMutationControllerApi#fetchSignalMutationsByMutationFilterPOSTUsingPOST");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mutationFilter** | [**SignalMutationFilter**](SignalMutationFilter.md)| List of Hugo Gene Symbols. For example [\&quot;TP53\&quot;, \&quot;PIK3CA\&quot;, \&quot;BRCA1\&quot;] | |

### Return type

[**List&lt;SignalMutation&gt;**](SignalMutation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

