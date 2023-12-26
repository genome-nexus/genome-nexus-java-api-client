# SearchControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchAnnotationByKeywordGETUsingGET**](SearchControllerApi.md#searchAnnotationByKeywordGETUsingGET) | **GET** /search | Performs index search. |


<a id="searchAnnotationByKeywordGETUsingGET"></a>
# **searchAnnotationByKeywordGETUsingGET**
> List&lt;IndexSearch&gt; searchAnnotationByKeywordGETUsingGET(keyword, limit)

Performs index search.

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.SearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    SearchControllerApi apiInstance = new SearchControllerApi(defaultClient);
    String keyword = "keyword_example"; // String | keyword. For example 13:g.32890665G>A, TP53 p.R273C, BRAF c.1799T>A
    Integer limit = 56; // Integer | Max number of matching results to return
    try {
      List<IndexSearch> result = apiInstance.searchAnnotationByKeywordGETUsingGET(keyword, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchControllerApi#searchAnnotationByKeywordGETUsingGET");
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
| **keyword** | **String**| keyword. For example 13:g.32890665G&gt;A, TP53 p.R273C, BRAF c.1799T&gt;A | |
| **limit** | **Integer**| Max number of matching results to return | [optional] |

### Return type

[**List&lt;IndexSearch&gt;**](IndexSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

