# PtmControllerApi

All URIs are relative to *http://localhost:38080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPostTranslationalModificationsByPtmFilterPOST**](PtmControllerApi.md#fetchPostTranslationalModificationsByPtmFilterPOST) | **POST** /ptm/experimental | Retrieves PTM entries by Ensembl Transcript IDs
[**fetchPostTranslationalModificationsGET**](PtmControllerApi.md#fetchPostTranslationalModificationsGET) | **GET** /ptm/experimental | Retrieves PTM entries by Ensembl Transcript ID


<a name="fetchPostTranslationalModificationsByPtmFilterPOST"></a>
# **fetchPostTranslationalModificationsByPtmFilterPOST**
> List&lt;PostTranslationalModification&gt; fetchPostTranslationalModificationsByPtmFilterPOST(ptmFilter)

Retrieves PTM entries by Ensembl Transcript IDs

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PtmControllerApi;


PtmControllerApi apiInstance = new PtmControllerApi();
PtmFilter ptmFilter = new PtmFilter(); // PtmFilter | List of Ensembl transcript IDs. For example [\"ENST00000420316\", \"ENST00000646891\", \"ENST00000371953\"]
try {
    List<PostTranslationalModification> result = apiInstance.fetchPostTranslationalModificationsByPtmFilterPOST(ptmFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PtmControllerApi#fetchPostTranslationalModificationsByPtmFilterPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ptmFilter** | [**PtmFilter**](PtmFilter.md)| List of Ensembl transcript IDs. For example [\&quot;ENST00000420316\&quot;, \&quot;ENST00000646891\&quot;, \&quot;ENST00000371953\&quot;] |

### Return type

[**List&lt;PostTranslationalModification&gt;**](PostTranslationalModification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchPostTranslationalModificationsGET"></a>
# **fetchPostTranslationalModificationsGET**
> List&lt;PostTranslationalModification&gt; fetchPostTranslationalModificationsGET(ensemblTranscriptId)

Retrieves PTM entries by Ensembl Transcript ID

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PtmControllerApi;


PtmControllerApi apiInstance = new PtmControllerApi();
String ensemblTranscriptId = "ensemblTranscriptId_example"; // String | Ensembl Transcript ID. For example ENST00000646891
try {
    List<PostTranslationalModification> result = apiInstance.fetchPostTranslationalModificationsGET(ensemblTranscriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PtmControllerApi#fetchPostTranslationalModificationsGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ensemblTranscriptId** | **String**| Ensembl Transcript ID. For example ENST00000646891 | [optional]

### Return type

[**List&lt;PostTranslationalModification&gt;**](PostTranslationalModification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

