# CrossReferenceControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchGeneXrefsGET1**](CrossReferenceControllerApi.md#fetchGeneXrefsGET1) | **GET** /xrefs/{accession} | Perform lookups of Ensembl identifiers and retrieve their external references in other databases |


<a id="fetchGeneXrefsGET1"></a>
# **fetchGeneXrefsGET1**
> List&lt;GeneXref&gt; fetchGeneXrefsGET1(accession)

Perform lookups of Ensembl identifiers and retrieve their external references in other databases

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CrossReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CrossReferenceControllerApi apiInstance = new CrossReferenceControllerApi(defaultClient);
    String accession = "accession_example"; // String | Ensembl gene accession. For example ENSG00000169083
    try {
      List<GeneXref> result = apiInstance.fetchGeneXrefsGET1(accession);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossReferenceControllerApi#fetchGeneXrefsGET1");
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
| **accession** | **String**| Ensembl gene accession. For example ENSG00000169083 | |

### Return type

[**List&lt;GeneXref&gt;**](GeneXref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

