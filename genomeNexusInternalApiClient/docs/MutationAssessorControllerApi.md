# MutationAssessorControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchMutationAssessorAnnotationGET**](MutationAssessorControllerApi.md#fetchMutationAssessorAnnotationGET) | **GET** /mutation_assessor/{variant} | Retrieves mutation assessor information for the provided list of variants
[**postMutationAssessorAnnotation**](MutationAssessorControllerApi.md#postMutationAssessorAnnotation) | **POST** /mutation_assessor | Retrieves mutation assessor information for the provided list of variants


<a name="fetchMutationAssessorAnnotationGET"></a>
# **fetchMutationAssessorAnnotationGET**
> MutationAssessor fetchMutationAssessorAnnotationGET(variant)

Retrieves mutation assessor information for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.MutationAssessorControllerApi;


MutationAssessorControllerApi apiInstance = new MutationAssessorControllerApi();
String variant = "variant_example"; // String | A variants. For example 7:g.140453136A>T
try {
    MutationAssessor result = apiInstance.fetchMutationAssessorAnnotationGET(variant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutationAssessorControllerApi#fetchMutationAssessorAnnotationGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| A variants. For example 7:g.140453136A&gt;T |

### Return type

[**MutationAssessor**](MutationAssessor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMutationAssessorAnnotation"></a>
# **postMutationAssessorAnnotation**
> List&lt;MutationAssessor&gt; postMutationAssessorAnnotation(variants)

Retrieves mutation assessor information for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.MutationAssessorControllerApi;


MutationAssessorControllerApi apiInstance = new MutationAssessorControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
try {
    List<MutationAssessor> result = apiInstance.postMutationAssessorAnnotation(variants);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutationAssessorControllerApi#postMutationAssessorAnnotation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variants** | **List&lt;String&gt;**| List of variants. For example [\&quot;7:g.140453136A&gt;T\&quot;,\&quot;12:g.25398285C&gt;A\&quot;] |

### Return type

[**List&lt;MutationAssessor&gt;**](MutationAssessor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

