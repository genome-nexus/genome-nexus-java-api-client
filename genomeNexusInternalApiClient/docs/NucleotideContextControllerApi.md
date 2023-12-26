# NucleotideContextControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchNucleotideContextAnnotationGET**](NucleotideContextControllerApi.md#fetchNucleotideContextAnnotationGET) | **GET** /nucleotide_context/{variant} | Retrieves nucleotide context information for the provided list of variants |
| [**postNucleotideContextAnnotation**](NucleotideContextControllerApi.md#postNucleotideContextAnnotation) | **POST** /nucleotide_context | Retrieves nucleotide context information for the provided list of variants |


<a id="fetchNucleotideContextAnnotationGET"></a>
# **fetchNucleotideContextAnnotationGET**
> NucleotideContext fetchNucleotideContextAnnotationGET(variant)

Retrieves nucleotide context information for the provided list of variants

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.NucleotideContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    NucleotideContextControllerApi apiInstance = new NucleotideContextControllerApi(defaultClient);
    String variant = "variant_example"; // String | A variant. For example 7:g.140453136A>T
    try {
      NucleotideContext result = apiInstance.fetchNucleotideContextAnnotationGET(variant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NucleotideContextControllerApi#fetchNucleotideContextAnnotationGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **variant** | **String**| A variant. For example 7:g.140453136A&gt;T | |

### Return type

[**NucleotideContext**](NucleotideContext.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postNucleotideContextAnnotation"></a>
# **postNucleotideContextAnnotation**
> List&lt;NucleotideContext&gt; postNucleotideContextAnnotation(variants)

Retrieves nucleotide context information for the provided list of variants

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.NucleotideContextControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    NucleotideContextControllerApi apiInstance = new NucleotideContextControllerApi(defaultClient);
    List<String> variants = Arrays.asList(); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
    try {
      List<NucleotideContext> result = apiInstance.postNucleotideContextAnnotation(variants);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NucleotideContextControllerApi#postNucleotideContextAnnotation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **variants** | [**List&lt;String&gt;**](String.md)| List of variants. For example [\&quot;7:g.140453136A&gt;T\&quot;,\&quot;12:g.25398285C&gt;A\&quot;] | |

### Return type

[**List&lt;NucleotideContext&gt;**](NucleotideContext.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

