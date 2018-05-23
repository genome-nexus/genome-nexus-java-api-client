# AnnotationSummaryControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVariantAnnotationPOST1**](AnnotationSummaryControllerApi.md#fetchVariantAnnotationPOST1) | **POST** /annotation/summary | Retrieves VEP annotation summary for the provided list of variants
[**fetchVariantAnnotationSummaryGET**](AnnotationSummaryControllerApi.md#fetchVariantAnnotationSummaryGET) | **GET** /annotation/summary/{variant} | Retrieves VEP annotation summary for the provided variant


<a name="fetchVariantAnnotationPOST1"></a>
# **fetchVariantAnnotationPOST1**
> List&lt;VariantAnnotationSummary&gt; fetchVariantAnnotationPOST1(variants, isoformOverrideSource, projection)

Retrieves VEP annotation summary for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationSummaryControllerApi;


AnnotationSummaryControllerApi apiInstance = new AnnotationSummaryControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"X:g.66937331T>A\",\"17:g.41242962_41242963insGA\"]
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String projection = "ALL"; // String | Indicates whether to return summary for all transcripts or only for canonical transcript
try {
    List<VariantAnnotationSummary> result = apiInstance.fetchVariantAnnotationPOST1(variants, isoformOverrideSource, projection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationSummaryControllerApi#fetchVariantAnnotationPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **projection** | **String**| Indicates whether to return summary for all transcripts or only for canonical transcript | [optional] [default to ALL] [enum: ALL, CANONICAL]

### Return type

[**List&lt;VariantAnnotationSummary&gt;**](VariantAnnotationSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationSummaryGET"></a>
# **fetchVariantAnnotationSummaryGET**
> VariantAnnotationSummary fetchVariantAnnotationSummaryGET(variant, isoformOverrideSource, projection)

Retrieves VEP annotation summary for the provided variant

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationSummaryControllerApi;


AnnotationSummaryControllerApi apiInstance = new AnnotationSummaryControllerApi();
String variant = "variant_example"; // String | Variant. For example 17:g.41242962_41242963insGA
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String projection = "ALL"; // String | Indicates whether to return summary for all transcripts or only for canonical transcript
try {
    VariantAnnotationSummary result = apiInstance.fetchVariantAnnotationSummaryGET(variant, isoformOverrideSource, projection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationSummaryControllerApi#fetchVariantAnnotationSummaryGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| Variant. For example 17:g.41242962_41242963insGA |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **projection** | **String**| Indicates whether to return summary for all transcripts or only for canonical transcript | [optional] [default to ALL] [enum: ALL, CANONICAL]

### Return type

[**VariantAnnotationSummary**](VariantAnnotationSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

