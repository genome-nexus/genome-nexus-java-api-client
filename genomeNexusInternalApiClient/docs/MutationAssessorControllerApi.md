# MutationAssessorControllerApi

All URIs are relative to *http://www.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchMutationAssessorGET**](MutationAssessorControllerApi.md#fetchMutationAssessorGET) | **GET** /mutation_assessor/{variant} | Retrieves mutation assessor information for the provided list of variants
[**postMutationAssessor**](MutationAssessorControllerApi.md#postMutationAssessor) | **POST** /mutation_assessor | Retrieves mutation assessor information for the provided list of variants


<a name="fetchMutationAssessorGET"></a>
# **fetchMutationAssessorGET**
> MutationAssessor fetchMutationAssessorGET(variant)

Retrieves mutation assessor information for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.MutationAssessorControllerApi;


MutationAssessorControllerApi apiInstance = new MutationAssessorControllerApi();
String variant = "variant_example"; // String | A variant. For example 7:g.140453136A>T
try {
    MutationAssessor result = apiInstance.fetchMutationAssessorGET(variant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutationAssessorControllerApi#fetchMutationAssessorGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| A variant. For example 7:g.140453136A&gt;T |

### Return type

[**MutationAssessor**](MutationAssessor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMutationAssessor"></a>
# **postMutationAssessor**
> List&lt;MutationAssessor&gt; postMutationAssessor(variants)

Retrieves mutation assessor information for the provided list of variants

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.MutationAssessorControllerApi;


MutationAssessorControllerApi apiInstance = new MutationAssessorControllerApi();
List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
try {
    List<MutationAssessor> result = apiInstance.postMutationAssessor(variants);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutationAssessorControllerApi#postMutationAssessor");
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

