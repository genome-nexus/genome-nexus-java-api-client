# AnnotationControllerApi

All URIs are relative to *http://www.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVariantAnnotationByGenomicLocationGET**](AnnotationControllerApi.md#fetchVariantAnnotationByGenomicLocationGET) | **GET** /annotation/genomic/{genomicLocation} | Retrieves VEP annotation for the provided genomic location
[**fetchVariantAnnotationByGenomicLocationPOST**](AnnotationControllerApi.md#fetchVariantAnnotationByGenomicLocationPOST) | **POST** /annotation/genomic | Retrieves VEP annotation for the provided list of genomic locations
[**fetchVariantAnnotationByIdGET**](AnnotationControllerApi.md#fetchVariantAnnotationByIdGET) | **GET** /annotation/dbsnp/{variantId} | Retrieves VEP annotation for the give dbSNP id
[**fetchVariantAnnotationByIdPOST**](AnnotationControllerApi.md#fetchVariantAnnotationByIdPOST) | **POST** /annotation/dbsnp/ | Retrieves VEP annotation for the provided list of dbSNP ids
[**fetchVariantAnnotationGET**](AnnotationControllerApi.md#fetchVariantAnnotationGET) | **GET** /annotation/{variant} | Retrieves VEP annotation for the provided variant
[**fetchVariantAnnotationPOST**](AnnotationControllerApi.md#fetchVariantAnnotationPOST) | **POST** /annotation | Retrieves VEP annotation for the provided list of variants


<a name="fetchVariantAnnotationByGenomicLocationGET"></a>
# **fetchVariantAnnotationByGenomicLocationGET**
> VariantAnnotation fetchVariantAnnotationByGenomicLocationGET(genomicLocation, isoformOverrideSource, token, fields)

Retrieves VEP annotation for the provided genomic location

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
String genomicLocation = "genomicLocation_example"; // String | A genomic location. For example 7,140453136,140453136,A,T
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
try {
    VariantAnnotation result = apiInstance.fetchVariantAnnotationByGenomicLocationGET(genomicLocation, isoformOverrideSource, token, fields);
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
 **token** | **String**| Map of tokens. For example {\&quot;source1\&quot;:\&quot;put-your-token1-here\&quot;,\&quot;source2\&quot;:\&quot;put-your-token2-here\&quot;} | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \&quot;annotation_summary\&quot; if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal} | [optional] [default to annotation_summary] [enum: annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal]

### Return type

[**VariantAnnotation**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationByGenomicLocationPOST"></a>
# **fetchVariantAnnotationByGenomicLocationPOST**
> List&lt;VariantAnnotation&gt; fetchVariantAnnotationByGenomicLocationPOST(genomicLocations, isoformOverrideSource, token, fields)

Retrieves VEP annotation for the provided list of genomic locations

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
List<GenomicLocation> genomicLocations = Arrays.asList(new GenomicLocation()); // List<GenomicLocation> | List of Genomic Locations
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
try {
    List<VariantAnnotation> result = apiInstance.fetchVariantAnnotationByGenomicLocationPOST(genomicLocations, isoformOverrideSource, token, fields);
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
 **token** | **String**| Map of tokens. For example {\&quot;source1\&quot;:\&quot;put-your-token1-here\&quot;,\&quot;source2\&quot;:\&quot;put-your-token2-here\&quot;} | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \&quot;annotation_summary\&quot; if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal} | [optional] [default to annotation_summary] [enum: annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal]

### Return type

[**List&lt;VariantAnnotation&gt;**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationByIdGET"></a>
# **fetchVariantAnnotationByIdGET**
> VariantAnnotation fetchVariantAnnotationByIdGET(variantId, isoformOverrideSource, token, fields)

Retrieves VEP annotation for the give dbSNP id

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
String variantId = "variantId_example"; // String | dbSNP id. For example rs116035550.
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
try {
    VariantAnnotation result = apiInstance.fetchVariantAnnotationByIdGET(variantId, isoformOverrideSource, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationByIdGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | **String**| dbSNP id. For example rs116035550. |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **token** | **String**| Map of tokens. For example {\&quot;source1\&quot;:\&quot;put-your-token1-here\&quot;,\&quot;source2\&quot;:\&quot;put-your-token2-here\&quot;} | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \&quot;annotation_summary\&quot; if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal} | [optional] [default to annotation_summary] [enum: annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal]

### Return type

[**VariantAnnotation**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationByIdPOST"></a>
# **fetchVariantAnnotationByIdPOST**
> List&lt;VariantAnnotation&gt; fetchVariantAnnotationByIdPOST(variantIds, isoformOverrideSource, token, fields)

Retrieves VEP annotation for the provided list of dbSNP ids

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
List<String> variantIds = Arrays.asList(new List<String>()); // List<String> | List of variant IDs. For example [\"rs116035550\"]
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
try {
    List<VariantAnnotation> result = apiInstance.fetchVariantAnnotationByIdPOST(variantIds, isoformOverrideSource, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationByIdPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantIds** | **List&lt;String&gt;**| List of variant IDs. For example [\&quot;rs116035550\&quot;] |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **token** | **String**| Map of tokens. For example {\&quot;source1\&quot;:\&quot;put-your-token1-here\&quot;,\&quot;source2\&quot;:\&quot;put-your-token2-here\&quot;} | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \&quot;annotation_summary\&quot; if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal} | [optional] [default to annotation_summary] [enum: annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal]

### Return type

[**List&lt;VariantAnnotation&gt;**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationGET"></a>
# **fetchVariantAnnotationGET**
> VariantAnnotation fetchVariantAnnotationGET(variant, isoformOverrideSource, token, fields)

Retrieves VEP annotation for the provided variant

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
String variant = "variant_example"; // String | Variant. For example 17:g.41242962_41242963insGA
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
try {
    VariantAnnotation result = apiInstance.fetchVariantAnnotationGET(variant, isoformOverrideSource, token, fields);
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
 **token** | **String**| Map of tokens. For example {\&quot;source1\&quot;:\&quot;put-your-token1-here\&quot;,\&quot;source2\&quot;:\&quot;put-your-token2-here\&quot;} | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \&quot;annotation_summary\&quot; if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal} | [optional] [default to annotation_summary] [enum: annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal]

### Return type

[**VariantAnnotation**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchVariantAnnotationPOST"></a>
# **fetchVariantAnnotationPOST**
> List&lt;VariantAnnotation&gt; fetchVariantAnnotationPOST(variants, isoformOverrideSource, token, fields)

Retrieves VEP annotation for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.AnnotationControllerApi;


AnnotationControllerApi apiInstance = new AnnotationControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"X:g.66937331T>A\",\"17:g.41242962_41242963insGA\"] (GRCh37) or [\"1:g.182712A>C\", \"2:g.265023C>T\", \"3:g.319781del\", \"19:g.110753dup\", \"1:g.1385015_1387562del\"] (GRCh38)
String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
try {
    List<VariantAnnotation> result = apiInstance.fetchVariantAnnotationPOST(variants, isoformOverrideSource, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (GRCh37) or [\&quot;1:g.182712A&gt;C\&quot;, \&quot;2:g.265023C&gt;T\&quot;, \&quot;3:g.319781del\&quot;, \&quot;19:g.110753dup\&quot;, \&quot;1:g.1385015_1387562del\&quot;] (GRCh38) |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional]
 **token** | **String**| Map of tokens. For example {\&quot;source1\&quot;:\&quot;put-your-token1-here\&quot;,\&quot;source2\&quot;:\&quot;put-your-token2-here\&quot;} | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \&quot;annotation_summary\&quot; if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal} | [optional] [default to annotation_summary] [enum: annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal]

### Return type

[**List&lt;VariantAnnotation&gt;**](VariantAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

