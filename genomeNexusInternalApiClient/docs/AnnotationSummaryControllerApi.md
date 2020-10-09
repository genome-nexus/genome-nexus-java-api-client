# AnnotationSummaryControllerApi

All URIs are relative to *http://www.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVariantAnnotationSummaryGET**](AnnotationSummaryControllerApi.md#fetchVariantAnnotationSummaryGET) | **GET** /annotation/summary/{variant} | Retrieves VEP annotation summary for the provided variant
[**fetchVariantAnnotationSummaryPOST**](AnnotationSummaryControllerApi.md#fetchVariantAnnotationSummaryPOST) | **POST** /annotation/summary | Retrieves VEP annotation summary for the provided list of variants


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

<a name="fetchVariantAnnotationSummaryPOST"></a>
# **fetchVariantAnnotationSummaryPOST**
> List&lt;VariantAnnotationSummary&gt; fetchVariantAnnotationSummaryPOST(variants, isoformOverrideSource, projection)

Retrieves VEP annotation summary for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationSummaryControllerApi;


AnnotationSummaryControllerApi apiInstance = new AnnotationSummaryControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"X:g.66937331T>A\",\"17:g.41242962_41242963insGA\"] (GRCh37) or [\"1:g.182712A>C\", \"2:g.265023C>T\", \"3:g.319781del\", \"19:g.110753dup\", \"1:g.1385015_1387562del\"] (GRCh38)
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String projection = "ALL"; // String | Indicates whether to return summary for all transcripts or only for canonical transcript
try {
    List<VariantAnnotationSummary> result = apiInstance.fetchVariantAnnotationSummaryPOST(variants, isoformOverrideSource, projection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationSummaryControllerApi#fetchVariantAnnotationSummaryPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (GRCh37) or [\&quot;1:g.182712A&gt;C\&quot;, \&quot;2:g.265023C&gt;T\&quot;, \&quot;3:g.319781del\&quot;, \&quot;19:g.110753dup\&quot;, \&quot;1:g.1385015_1387562del\&quot;] (GRCh38) |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **projection** | **String**| Indicates whether to return summary for all transcripts or only for canonical transcript | [optional] [default to ALL] [enum: ALL, CANONICAL]

### Return type

[**List&lt;VariantAnnotationSummary&gt;**](VariantAnnotationSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

