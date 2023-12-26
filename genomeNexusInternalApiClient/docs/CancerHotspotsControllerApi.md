# CancerHotspotsControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchHotspotAnnotationByGenomicLocationGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationGET) | **GET** /cancer_hotspots/genomic/{genomicLocation} | Retrieves hotspot annotations for a specific genomic location |
| [**fetchHotspotAnnotationByGenomicLocationPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationPOST) | **POST** /cancer_hotspots/genomic | Retrieves hotspot annotations for the provided list of genomic locations |
| [**fetchHotspotAnnotationByHgvsGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsGET) | **GET** /cancer_hotspots/hgvs/{variant} | Retrieves hotspot annotations for a specific variant |
| [**fetchHotspotAnnotationByHgvsPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsPOST) | **POST** /cancer_hotspots/hgvs | Retrieves hotspot annotations for the provided list of variants |
| [**fetchHotspotAnnotationByProteinLocationsPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByProteinLocationsPOST) | **POST** /cancer_hotspots/proteinLocations | Retrieves hotspot annotations for the provided list of transcript id, protein location and mutation type |
| [**fetchHotspotAnnotationByTranscriptIdGET**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByTranscriptIdGET) | **GET** /cancer_hotspots/transcript/{transcriptId} | Retrieves hotspot annotations for the provided transcript ID |
| [**fetchHotspotAnnotationByTranscriptIdPOST**](CancerHotspotsControllerApi.md#fetchHotspotAnnotationByTranscriptIdPOST) | **POST** /cancer_hotspots/transcript | Retrieves hotspot annotations for the provided list of transcript ID |


<a id="fetchHotspotAnnotationByGenomicLocationGET"></a>
# **fetchHotspotAnnotationByGenomicLocationGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByGenomicLocationGET(genomicLocation)

Retrieves hotspot annotations for a specific genomic location

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    String genomicLocation = "genomicLocation_example"; // String | A genomic location. For example 7,140453136,140453136,A,T
    try {
      List<Hotspot> result = apiInstance.fetchHotspotAnnotationByGenomicLocationGET(genomicLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByGenomicLocationGET");
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
| **genomicLocation** | **String**| A genomic location. For example 7,140453136,140453136,A,T | |

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchHotspotAnnotationByGenomicLocationPOST"></a>
# **fetchHotspotAnnotationByGenomicLocationPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByGenomicLocationPOST(genomicLocations)

Retrieves hotspot annotations for the provided list of genomic locations

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    List<GenomicLocation> genomicLocations = Arrays.asList(); // List<GenomicLocation> | List of genomic locations.
    try {
      List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByGenomicLocationPOST(genomicLocations);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByGenomicLocationPOST");
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
| **genomicLocations** | [**List&lt;GenomicLocation&gt;**](GenomicLocation.md)| List of genomic locations. | |

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchHotspotAnnotationByHgvsGET"></a>
# **fetchHotspotAnnotationByHgvsGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByHgvsGET(variant)

Retrieves hotspot annotations for a specific variant

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    String variant = "variant_example"; // String | A variant. For example 7:g.140453136A>T
    try {
      List<Hotspot> result = apiInstance.fetchHotspotAnnotationByHgvsGET(variant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByHgvsGET");
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

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchHotspotAnnotationByHgvsPOST"></a>
# **fetchHotspotAnnotationByHgvsPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByHgvsPOST(variants)

Retrieves hotspot annotations for the provided list of variants

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    List<String> variants = Arrays.asList(); // List<String> | List of variants. For example [\"7:g.140453136A>T\",\"12:g.25398285C>A\"]
    try {
      List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByHgvsPOST(variants);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByHgvsPOST");
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

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchHotspotAnnotationByProteinLocationsPOST"></a>
# **fetchHotspotAnnotationByProteinLocationsPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByProteinLocationsPOST(proteinLocations)

Retrieves hotspot annotations for the provided list of transcript id, protein location and mutation type

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    List<ProteinLocation> proteinLocations = Arrays.asList(); // List<ProteinLocation> | List of transcript id, protein start location, protein end location, mutation type. The mutation types are limited to 'Missense_Mutation', 'In_Frame_Ins', 'In_Frame_Del', 'Splice_Site', and 'Splice_Region'
    try {
      List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByProteinLocationsPOST(proteinLocations);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByProteinLocationsPOST");
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
| **proteinLocations** | [**List&lt;ProteinLocation&gt;**](ProteinLocation.md)| List of transcript id, protein start location, protein end location, mutation type. The mutation types are limited to &#39;Missense_Mutation&#39;, &#39;In_Frame_Ins&#39;, &#39;In_Frame_Del&#39;, &#39;Splice_Site&#39;, and &#39;Splice_Region&#39; | |

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchHotspotAnnotationByTranscriptIdGET"></a>
# **fetchHotspotAnnotationByTranscriptIdGET**
> List&lt;Hotspot&gt; fetchHotspotAnnotationByTranscriptIdGET(transcriptId)

Retrieves hotspot annotations for the provided transcript ID

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    String transcriptId = "transcriptId_example"; // String | A Transcript Id. For example ENST00000288602
    try {
      List<Hotspot> result = apiInstance.fetchHotspotAnnotationByTranscriptIdGET(transcriptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByTranscriptIdGET");
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
| **transcriptId** | **String**| A Transcript Id. For example ENST00000288602 | |

### Return type

[**List&lt;Hotspot&gt;**](Hotspot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchHotspotAnnotationByTranscriptIdPOST"></a>
# **fetchHotspotAnnotationByTranscriptIdPOST**
> List&lt;AggregatedHotspots&gt; fetchHotspotAnnotationByTranscriptIdPOST(transcriptIds)

Retrieves hotspot annotations for the provided list of transcript ID

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.CancerHotspotsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    CancerHotspotsControllerApi apiInstance = new CancerHotspotsControllerApi(defaultClient);
    List<String> transcriptIds = Arrays.asList(); // List<String> | List of transcript Id. For example [\"ENST00000288602\",\"ENST00000256078\"]
    try {
      List<AggregatedHotspots> result = apiInstance.fetchHotspotAnnotationByTranscriptIdPOST(transcriptIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerHotspotsControllerApi#fetchHotspotAnnotationByTranscriptIdPOST");
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
| **transcriptIds** | [**List&lt;String&gt;**](String.md)| List of transcript Id. For example [\&quot;ENST00000288602\&quot;,\&quot;ENST00000256078\&quot;] | |

### Return type

[**List&lt;AggregatedHotspots&gt;**](AggregatedHotspots.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

