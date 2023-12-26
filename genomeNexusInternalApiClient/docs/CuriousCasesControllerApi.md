# CuriousCasesControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchCuriousCasesGET**](CuriousCasesControllerApi.md#fetchCuriousCasesGET) | **GET** /curious_cases/{genomicLocation} | Retrieves Curious Cases info by a genomic location |


<a id="fetchCuriousCasesGET"></a>
# **fetchCuriousCasesGET**
> CuriousCases fetchCuriousCasesGET(genomicLocation)

Retrieves Curious Cases info by a genomic location

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CuriousCasesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CuriousCasesControllerApi apiInstance = new CuriousCasesControllerApi(defaultClient);
    String genomicLocation = "genomicLocation_example"; // String | Genomic location, for example: 7,116411883,116411905,TTCTTTCTCTCTGTTTTAAGATC,-
    try {
      CuriousCases result = apiInstance.fetchCuriousCasesGET(genomicLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CuriousCasesControllerApi#fetchCuriousCasesGET");
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
| **genomicLocation** | **String**| Genomic location, for example: 7,116411883,116411905,TTCTTTCTCTCTGTTTTAAGATC,- | |

### Return type

[**CuriousCases**](CuriousCases.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

