# NucleotideContextControllerApi

All URIs are relative to *http://localhost:38080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchNucleotideContextAnnotationGET**](NucleotideContextControllerApi.md#fetchNucleotideContextAnnotationGET) | **GET** /nucleotide_context/{variant} | Retrieves nucleotide context information for the provided list of variants
[**postNucleotideContextAnnotation**](NucleotideContextControllerApi.md#postNucleotideContextAnnotation) | **POST** /nucleotide_context | Retrieves nucleotide context information for the provided list of variants


<a name="fetchNucleotideContextAnnotationGET"></a>
# **fetchNucleotideContextAnnotationGET**
> NucleotideContext fetchNucleotideContextAnnotationGET(variant)

Retrieves nucleotide context information for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.NucleotideContextControllerApi;


NucleotideContextControllerApi apiInstance = new NucleotideContextControllerApi();
String variant = "variant_example"; // String | A variant. For example 7:g.140453136A>T
try {
    NucleotideContext result = apiInstance.fetchNucleotideContextAnnotationGET(variant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NucleotideContextControllerApi#fetchNucleotideContextAnnotationGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| A variant. For example 7:g.140453136A&gt;T |

### Return type

[**NucleotideContext**](NucleotideContext.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postNucleotideContextAnnotation"></a>
# **postNucleotideContextAnnotation**
> List&lt;NucleotideContext&gt; postNucleotideContextAnnotation(variants)

Retrieves nucleotide context information for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.NucleotideContextControllerApi;


NucleotideContextControllerApi apiInstance = new NucleotideContextControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
try {
    List<NucleotideContext> result = apiInstance.postNucleotideContextAnnotation(variants);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NucleotideContextControllerApi#postNucleotideContextAnnotation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;7:g.140453136A&gt;T\&quot;,\&quot;12:g.25398285C&gt;A\&quot;] |

### Return type

[**List&lt;NucleotideContext&gt;**](NucleotideContext.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

