# CancerHotspotsControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchHotspotAnnotationByGenomicLocationGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationGET) | **GET** /cancer_hotspots/genomic/{genomicLocation} | Retrieves hotspot annotations for a specific genomic location
[**fetchHotspotAnnotationByGenomicLocationPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationPOST) | **POST** /cancer_hotspots/genomic | Retrieves hotspot annotations for the provided list of genomic locations
[**fetchHotspotAnnotationByHgvsGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsGET) | **GET** /cancer_hotspots/hgvs/{variant} | Retrieves hotspot annotations for a specific variant
[**fetchHotspotAnnotationByHgvsPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsPOST) | **POST** /cancer_hotspots/hgvs | Retrieves hotspot annotations for the provided list of variants


<a name="fetchHotspotAnnotationByGenomicLocationGET"></a>
# **fetchHotspotAnnotationByGenomicLocationGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByGenomicLocationGET(genomicLocation)

Retrieves hotspot annotations for a specific genomic location

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
String genomicLocation = "genomicLocation_example"; // String | A genomic location. For example 7,140453136,140453136,A,T
try {
    List<Hotspot> result = apiInstance.fetchHotspotAnnotationByGenomicLocationGET(genomicLocation);
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

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByGenomicLocationPOST"></a>
# **fetchHotspotAnnotationByGenomicLocationPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByGenomicLocationPOST(genomicLocations)

Retrieves hotspot annotations for the provided list of genomic locations

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
List<GenomicLocation> genomicLocations = Arrays.asList(new GenomicLocation()); // List<GenomicLocation> | List of genomic locations.
try {
    List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByGenomicLocationPOST(genomicLocations);
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

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByHgvsGET"></a>
# **fetchHotspotAnnotationByHgvsGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByHgvsGET(variant)

Retrieves hotspot annotations for a specific variant

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
String variant = "variant_example"; // String | A variant. For example 7:g.140453136A>T
try {
    List<Hotspot> result = apiInstance.fetchHotspotAnnotationByHgvsGET(variant);
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

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchHotspotAnnotationByHgvsPOST"></a>
# **fetchHotspotAnnotationByHgvsPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByHgvsPOST(variants)

Retrieves hotspot annotations for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CancerHotspotsControllerApi;


CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
try {
    List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByHgvsPOST(variants);
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

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

