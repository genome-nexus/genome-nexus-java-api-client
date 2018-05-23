# IsoformOverrideControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAllIsoformOverridesGET**](IsoformOverrideControllerApi.md#fetchAllIsoformOverridesGET) | **GET** /isoform_override/{source} | Gets the isoform override information for the specified source
[**fetchIsoformOverrideGET**](IsoformOverrideControllerApi.md#fetchIsoformOverrideGET) | **GET** /isoform_override/{source}/{transcriptId} | Gets the isoform override information for the specified source and transcript id
[**fetchIsoformOverridePOST**](IsoformOverrideControllerApi.md#fetchIsoformOverridePOST) | **POST** /isoform_override | Gets the isoform override information for the specified source and the list of transcript ids
[**fetchIsoformOverrideSourcesGET**](IsoformOverrideControllerApi.md#fetchIsoformOverrideSourcesGET) | **GET** /isoform_override/sources | Gets a list of available isoform override data sources


<a name="fetchAllIsoformOverridesGET"></a>
# **fetchAllIsoformOverridesGET**
> List&lt;IsoformOverride&gt; fetchAllIsoformOverridesGET(source)

Gets the isoform override information for the specified source

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.IsoformOverrideControllerApi;


IsoformOverrideControllerApi apiInstance = new IsoformOverrideControllerApi();
String source = "source_example"; // String | Override source. For example uniprot
try {
    List<IsoformOverride> result = apiInstance.fetchAllIsoformOverridesGET(source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IsoformOverrideControllerApi#fetchAllIsoformOverridesGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| Override source. For example uniprot |

### Return type

[**List&lt;IsoformOverride&gt;**](IsoformOverride.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchIsoformOverrideGET"></a>
# **fetchIsoformOverrideGET**
> IsoformOverride fetchIsoformOverrideGET(source, transcriptId)

Gets the isoform override information for the specified source and transcript id

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.IsoformOverrideControllerApi;


IsoformOverrideControllerApi apiInstance = new IsoformOverrideControllerApi();
String source = "source_example"; // String | Override source. For example uniprot.
String transcriptId = "transcriptId_example"; // String | Transcript id. For example ENST00000361125.
try {
    IsoformOverride result = apiInstance.fetchIsoformOverrideGET(source, transcriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IsoformOverrideControllerApi#fetchIsoformOverrideGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| Override source. For example uniprot. |
 **transcriptId** | **String**| Transcript id. For example ENST00000361125. |

### Return type

[**IsoformOverride**](IsoformOverride.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchIsoformOverridePOST"></a>
# **fetchIsoformOverridePOST**
> List&lt;IsoformOverride&gt; fetchIsoformOverridePOST(source, transcriptIds)

Gets the isoform override information for the specified source and the list of transcript ids

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.IsoformOverrideControllerApi;


IsoformOverrideControllerApi apiInstance = new IsoformOverrideControllerApi();
String source = "source_example"; // String | Override source. For example uniprot
List<String> transcriptIds = Arrays.asList(new List<String>()); // List<String> | List of transcript ids. For example [\"ENST00000361125\",\"ENST00000443649\"]. 
try {
    List<IsoformOverride> result = apiInstance.fetchIsoformOverridePOST(source, transcriptIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IsoformOverrideControllerApi#fetchIsoformOverridePOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| Override source. For example uniprot |
 **transcriptIds** | **List&lt;String&gt;**| List of transcript ids. For example [\&quot;ENST00000361125\&quot;,\&quot;ENST00000443649\&quot;].  |

### Return type

[**List&lt;IsoformOverride&gt;**](IsoformOverride.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchIsoformOverrideSourcesGET"></a>
# **fetchIsoformOverrideSourcesGET**
> List&lt;String&gt; fetchIsoformOverrideSourcesGET()

Gets a list of available isoform override data sources

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.IsoformOverrideControllerApi;


IsoformOverrideControllerApi apiInstance = new IsoformOverrideControllerApi();
try {
    List<String> result = apiInstance.fetchIsoformOverrideSourcesGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IsoformOverrideControllerApi#fetchIsoformOverrideSourcesGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

