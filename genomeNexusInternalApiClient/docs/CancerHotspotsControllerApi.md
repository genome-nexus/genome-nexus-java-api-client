# CancerHotspotsControllerApi

All URIs are relative to *http://www.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchHotspotAnnotationByGenomicLocationGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationGET) | **GET** /cancer_hotspots/genomic/{genomicLocation} | Retrieves hotspot annotations for a specific genomic location
[**fetchHotspotAnnotationByGenomicLocationPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationPOST) | **POST** /cancer_hotspots/genomic | Retrieves hotspot annotations for the provided list of genomic locations
[**fetchHotspotAnnotationByHgvsGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsGET) | **GET** /cancer_hotspots/hgvs/{variant} | Retrieves hotspot annotations for a specific variant
[**fetchHotspotAnnotationByHgvsPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsPOST) | **POST** /cancer_hotspots/hgvs | Retrieves hotspot annotations for the provided list of variants
[**fetchHotspotAnnotationByProteinLocationsPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByProteinLocationsPOST) | **POST** /cancer_hotspots/proteinLocations | Retrieves hotspot annotations for the provided list of transcript id, protein location and mutation type
[**fetchHotspotAnnotationByTranscriptIdGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByTranscriptIdGET) | **GET** /cancer_hotspots/transcript/{transcriptId} | Retrieves hotspot annotations for the provided transcript ID
[**fetchHotspotAnnotationByTranscriptIdPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByTranscriptIdPOST) | **POST** /cancer_hotspots/transcript | Retrieves hotspot annotations for the provided list of transcript ID


<a name="fetchHotspotAnnotationByGenomicLocationGET"></a>
# **fetchHotspotAnnotationByGenomicLocationGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByGenomicLocationGET(genomicLocation, version)

Retrieves hotspot annotations for a specific genomic location

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
String genomicLocation = "genomicLocation_example"; // String | A genomic location. For example 7,140453136,140453136,A,T
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<Hotspot> result = apiInstance.fetchHotspotAnnotationByGenomicLocationGET(genomicLocation, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByGenomicLocationGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genomicLocation** | **String**| A genomic location. For example 7,140453136,140453136,A,T |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByGenomicLocationPOST"></a>
# **fetchHotspotAnnotationByGenomicLocationPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByGenomicLocationPOST(genomicLocations, version)

Retrieves hotspot annotations for the provided list of genomic locations

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
List<GenomicLocation> genomicLocations = Arrays.asList(new GenomicLocation()); // List<GenomicLocation> | List of genomic locations.
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByGenomicLocationPOST(genomicLocations, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByGenomicLocationPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genomicLocations** | [**List&lt;GenomicLocation&gt;**](GenomicLocation.md)| List of genomic locations. |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByHgvsGET"></a>
# **fetchHotspotAnnotationByHgvsGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByHgvsGET(variant, version)

Retrieves hotspot annotations for a specific variant

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
String variant = "variant_example"; // String | A variant. For example 7:g.140453136A>T
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<Hotspot> result = apiInstance.fetchHotspotAnnotationByHgvsGET(variant, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByHgvsGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| A variant. For example 7:g.140453136A&gt;T |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByHgvsPOST"></a>
# **fetchHotspotAnnotationByHgvsPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByHgvsPOST(variants, version)

Retrieves hotspot annotations for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByHgvsPOST(variants, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByHgvsPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;7:g.140453136A&gt;T\&quot;,\&quot;12:g.25398285C&gt;A\&quot;] |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByProteinLocationsPOST"></a>
# **fetchHotspotAnnotationByProteinLocationsPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByProteinLocationsPOST(proteinLocations, version)

Retrieves hotspot annotations for the provided list of transcript id, protein location and mutation type

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
List<ProteinLocation> proteinLocations = Arrays.asList(new ProteinLocation()); // List<ProteinLocation> | List of transcript id, protein start location, protein end location, mutation type. The mutation types are limited to 'Missense_Mutation', 'In_Frame_Ins', 'In_Frame_Del', 'Splice_Site', and 'Splice_Region'
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByProteinLocationsPOST(proteinLocations, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByProteinLocationsPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proteinLocations** | [**List&lt;ProteinLocation&gt;**](ProteinLocation.md)| List of transcript id, protein start location, protein end location, mutation type. The mutation types are limited to &#39;Missense_Mutation&#39;, &#39;In_Frame_Ins&#39;, &#39;In_Frame_Del&#39;, &#39;Splice_Site&#39;, and &#39;Splice_Region&#39; |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByTranscriptIdGET"></a>
# **fetchHotspotAnnotationByTranscriptIdGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByTranscriptIdGET(transcriptId, version)

Retrieves hotspot annotations for the provided transcript ID

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
String transcriptId = "transcriptId_example"; // String | A Transcript Id. For example ENST00000288602
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<Hotspot> result = apiInstance.fetchHotspotAnnotationByTranscriptIdGET(transcriptId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByTranscriptIdGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptId** | **String**| A Transcript Id. For example ENST00000288602 |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByTranscriptIdPOST"></a>
# **fetchHotspotAnnotationByTranscriptIdPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByTranscriptIdPOST(transcriptIds, version)

Retrieves hotspot annotations for the provided list of transcript ID

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
List<String> transcriptIds = Arrays.asList(new List<String>()); // List<String> | List of transcript Id. For example [\"ENST00000288602\",\"ENST00000256078\"]
String version = "v3"; // String | Cancer hotspots dataset version to return. 'v2' returns only v2 hotspots. 'v3' returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3
try {
    List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByTranscriptIdPOST(transcriptIds, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByTranscriptIdPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptIds** | **List&lt;String&gt;**| List of transcript Id. For example [\&quot;ENST00000288602\&quot;,\&quot;ENST00000256078\&quot;] |
 **version** | **String**| Cancer hotspots dataset version to return. &#39;v2&#39; returns only v2 hotspots. &#39;v3&#39; returns v2 and v3 hotspots (v3 is a cumulative superset of v2, not v3-only). Default: v3 | [optional] [default to v3] [enum: v2, v3]

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

