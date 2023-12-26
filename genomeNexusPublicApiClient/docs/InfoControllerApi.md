# InfoControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchVersionGET**](InfoControllerApi.md#fetchVersionGET) | **GET** /version | Retrieve Genome Nexus Version |


<a id="fetchVersionGET"></a>
# **fetchVersionGET**
> AggregateSourceInfo fetchVersionGET()

Retrieve Genome Nexus Version

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.InfoControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    InfoControllerApi apiInstance = new InfoControllerApi(defaultClient);
    try {
      AggregateSourceInfo result = apiInstance.fetchVersionGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoControllerApi#fetchVersionGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AggregateSourceInfo**](AggregateSourceInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

