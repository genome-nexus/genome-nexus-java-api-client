# MyVariantInfoControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchMyVariantInfoAnnotationGET**](MyVariantInfoControllerApi.md#fetchMyVariantInfoAnnotationGET) | **GET** /my_variant_info/variant/{variant} | Retrieves myvariant information for the provided list of variants |
| [**postMyVariantInfoAnnotation**](MyVariantInfoControllerApi.md#postMyVariantInfoAnnotation) | **POST** /my_variant_info/variant | Retrieves myvariant information for the provided list of variants |


<a id="fetchMyVariantInfoAnnotationGET"></a>
# **fetchMyVariantInfoAnnotationGET**
> MyVariantInfo fetchMyVariantInfoAnnotationGET(variant)

Retrieves myvariant information for the provided list of variants

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.MyVariantInfoControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    MyVariantInfoControllerApi apiInstance = new MyVariantInfoControllerApi(defaultClient);
    String variant = "variant_example"; // String | . For example 7:g.140453136A>T
    try {
      MyVariantInfo result = apiInstance.fetchMyVariantInfoAnnotationGET(variant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyVariantInfoControllerApi#fetchMyVariantInfoAnnotationGET");
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
| **variant** | **String**| . For example 7:g.140453136A&gt;T | |

### Return type

[**MyVariantInfo**](MyVariantInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postMyVariantInfoAnnotation"></a>
# **postMyVariantInfoAnnotation**
> List&lt;MyVariantInfo&gt; postMyVariantInfoAnnotation(variants)

Retrieves myvariant information for the provided list of variants

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.MyVariantInfoControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    MyVariantInfoControllerApi apiInstance = new MyVariantInfoControllerApi(defaultClient);
    List<String> variants = Arrays.asList(); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
    try {
      List<MyVariantInfo> result = apiInstance.postMyVariantInfoAnnotation(variants);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyVariantInfoControllerApi#postMyVariantInfoAnnotation");
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

[**List&lt;MyVariantInfo&gt;**](MyVariantInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

