# PtmControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchPostTranslationalModificationsByPtmFilterPOST**](PtmControllerApi.md#fetchPostTranslationalModificationsByPtmFilterPOST) | **POST** /ptm/experimental | Retrieves PTM entries by Ensembl Transcript IDs |
| [**fetchPostTranslationalModificationsGET**](PtmControllerApi.md#fetchPostTranslationalModificationsGET) | **GET** /ptm/experimental | Retrieves PTM entries by Ensembl Transcript ID |


<a id="fetchPostTranslationalModificationsByPtmFilterPOST"></a>
# **fetchPostTranslationalModificationsByPtmFilterPOST**
> List&lt;PostTranslationalModification&gt; fetchPostTranslationalModificationsByPtmFilterPOST(ptmFilter)

Retrieves PTM entries by Ensembl Transcript IDs

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.PtmControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    PtmControllerApi apiInstance = new PtmControllerApi(defaultClient);
    PtmFilter ptmFilter = new PtmFilter(); // PtmFilter | List of Ensembl transcript IDs. For example [\"ENST00000420316\", \"ENST00000646891\", \"ENST00000371953\"]
    try {
      List<PostTranslationalModification> result = apiInstance.fetchPostTranslationalModificationsByPtmFilterPOST(ptmFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PtmControllerApi#fetchPostTranslationalModificationsByPtmFilterPOST");
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
| **ptmFilter** | [**PtmFilter**](PtmFilter.md)| List of Ensembl transcript IDs. For example [\&quot;ENST00000420316\&quot;, \&quot;ENST00000646891\&quot;, \&quot;ENST00000371953\&quot;] | |

### Return type

[**List&lt;PostTranslationalModification&gt;**](PostTranslationalModification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchPostTranslationalModificationsGET"></a>
# **fetchPostTranslationalModificationsGET**
> List&lt;PostTranslationalModification&gt; fetchPostTranslationalModificationsGET(ensemblTranscriptId)

Retrieves PTM entries by Ensembl Transcript ID

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.PtmControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    PtmControllerApi apiInstance = new PtmControllerApi(defaultClient);
    String ensemblTranscriptId = "ensemblTranscriptId_example"; // String | Ensembl Transcript ID. For example ENST00000646891
    try {
      List<PostTranslationalModification> result = apiInstance.fetchPostTranslationalModificationsGET(ensemblTranscriptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PtmControllerApi#fetchPostTranslationalModificationsGET");
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
| **ensemblTranscriptId** | **String**| Ensembl Transcript ID. For example ENST00000646891 | [optional] |

### Return type

[**List&lt;PostTranslationalModification&gt;**](PostTranslationalModification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

