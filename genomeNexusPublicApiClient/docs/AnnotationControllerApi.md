# AnnotationControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVariantAnnotationByGenomicLocationGET**](AnnotationControllerApi.md#fetchVariantAnnotationByGenomicLocationGET) | **GET** /annotation/genomic/{genomicLocation} | Retrieves VEP annotation for the provided genomic location
[**fetchVariantAnnotationByGenomicLocationPOST**](AnnotationControllerApi.md#fetchVariantAnnotationByGenomicLocationPOST) | **POST** /annotation/genomic | Retrieves VEP annotation for the provided list of genomic locations
[**fetchVariantAnnotationGET**](AnnotationControllerApi.md#fetchVariantAnnotationGET) | **GET** /annotation/{variant} | Retrieves VEP annotation for the provided variant
[**fetchVariantAnnotationPOST**](AnnotationControllerApi.md#fetchVariantAnnotationPOST) | **POST** /annotation | Retrieves VEP annotation for the provided list of variants


<a name="fetchVariantAnnotationByGenomicLocationGET"></a>
# **fetchVariantAnnotationByGenomicLocationGET**
> VariantAnnotation fetchVariantAnnotationByGenomicLocationGET(genomicLocation, isoformOverrideSource, fields)

Retrieves VEP annotation for the provided genomic location

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
String genomicLocation = "genomicLocation_example"; // String | A genomic location. For example 7,140453136,140453136,A,T
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
List<String> fields = Arrays.asList("hotspots,mutation_assessor"); // List<String> | Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor
try {
    VariantAnnotation result = apiInstance.fetchVariantAnnotationByGenomicLocationGET(genomicLocation, isoformOverrideSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationByGenomicLocationGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genomicLocation** | **String**| A genomic location. For example 7,140453136,140453136,A,T |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor | [optional] [default to hotspots,mutation_assessor]

### Return type

[**VariantAnnotation**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationByGenomicLocationPOST"></a>
# **fetchVariantAnnotationByGenomicLocationPOST**
> List&lt;VariantAnnotation&gt; fetchVariantAnnotationByGenomicLocationPOST(genomicLocations, isoformOverrideSource, fields)

Retrieves VEP annotation for the provided list of genomic locations

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
List<GenomicLocation> genomicLocations = Arrays.asList(new GenomicLocation()); // List<GenomicLocation> | List of Genomic Locations
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
List<String> fields = Arrays.asList("hotspots,mutation_assessor"); // List<String> | Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor
try {
    List<VariantAnnotation> result = apiInstance.fetchVariantAnnotationByGenomicLocationPOST(genomicLocations, isoformOverrideSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationByGenomicLocationPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genomicLocations** | [**List&lt;GenomicLocation&gt;**](GenomicLocation.md)| List of Genomic Locations |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor | [optional] [default to hotspots,mutation_assessor]

### Return type

[**List&lt;VariantAnnotation&gt;**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationGET"></a>
# **fetchVariantAnnotationGET**
> VariantAnnotation fetchVariantAnnotationGET(variant, isoformOverrideSource, fields)

Retrieves VEP annotation for the provided variant

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
String variant = "variant_example"; // String | Variant. For example 17:g.41242962_41242963insGA
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
List<String> fields = Arrays.asList("hotspots,mutation_assessor"); // List<String> | Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor
try {
    VariantAnnotation result = apiInstance.fetchVariantAnnotationGET(variant, isoformOverrideSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| Variant. For example 17:g.41242962_41242963insGA |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor | [optional] [default to hotspots,mutation_assessor]

### Return type

[**VariantAnnotation**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationPOST"></a>
# **fetchVariantAnnotationPOST**
> List&lt;VariantAnnotation&gt; fetchVariantAnnotationPOST(variants, isoformOverrideSource, fields)

Retrieves VEP annotation for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"X:g.66937331T>A\",\"17:g.41242962_41242963insGA\"]
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
List<String> fields = Arrays.asList("hotspots,mutation_assessor"); // List<String> | Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor
try {
    List<VariantAnnotation> result = apiInstance.fetchVariantAnnotationPOST(variants, isoformOverrideSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include (case-sensitive!). For example: hotspots,mutation_assessor | [optional] [default to hotspots,mutation_assessor]

### Return type

[**List&lt;VariantAnnotation&gt;**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

