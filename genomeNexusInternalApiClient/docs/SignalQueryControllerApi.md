# SignalQueryControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchSignalByKeywordGETUsingGET**](SignalQueryControllerApi.md#searchSignalByKeywordGETUsingGET) | **GET** /signal/search | Performs search by gene, protein change, variant or region. |


<a id="searchSignalByKeywordGETUsingGET"></a>
# **searchSignalByKeywordGETUsingGET**
> List&lt;SignalQuery&gt; searchSignalByKeywordGETUsingGET(keyword, limit)

Performs search by gene, protein change, variant or region.

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.SignalQueryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    SignalQueryControllerApi apiInstance = new SignalQueryControllerApi(defaultClient);
    String keyword = "keyword_example"; // String | keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G>A
    Integer limit = 56; // Integer | Max number of matching results to return
    try {
      List<SignalQuery> result = apiInstance.searchSignalByKeywordGETUsingGET(keyword, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignalQueryControllerApi#searchSignalByKeywordGETUsingGET");
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
| **keyword** | **String**| keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G&gt;A | |
| **limit** | **Integer**| Max number of matching results to return | [optional] |

### Return type

[**List&lt;SignalQuery&gt;**](SignalQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

