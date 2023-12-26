# PdbControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchPdbHeaderGET**](PdbControllerApi.md#fetchPdbHeaderGET) | **GET** /pdb/header/{pdbId} | Retrieves PDB header info by a PDB id |
| [**fetchPdbHeaderPOST**](PdbControllerApi.md#fetchPdbHeaderPOST) | **POST** /pdb/header | Retrieves PDB header info by a PDB id |


<a id="fetchPdbHeaderGET"></a>
# **fetchPdbHeaderGET**
> PdbHeader fetchPdbHeaderGET(pdbId)

Retrieves PDB header info by a PDB id

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.PdbControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    PdbControllerApi apiInstance = new PdbControllerApi(defaultClient);
    String pdbId = "pdbId_example"; // String | PDB id, for example 1a37
    try {
      PdbHeader result = apiInstance.fetchPdbHeaderGET(pdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdbControllerApi#fetchPdbHeaderGET");
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
| **pdbId** | **String**| PDB id, for example 1a37 | |

### Return type

[**PdbHeader**](PdbHeader.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchPdbHeaderPOST"></a>
# **fetchPdbHeaderPOST**
> List&lt;PdbHeader&gt; fetchPdbHeaderPOST(pdbIds)

Retrieves PDB header info by a PDB id

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.PdbControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    PdbControllerApi apiInstance = new PdbControllerApi(defaultClient);
    List<String> pdbIds = Arrays.asList(); // List<String> | List of pdb ids, for example [\"1a37\",\"1a4o\"]
    try {
      List<PdbHeader> result = apiInstance.fetchPdbHeaderPOST(pdbIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdbControllerApi#fetchPdbHeaderPOST");
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
| **pdbIds** | [**List&lt;String&gt;**](String.md)| List of pdb ids, for example [\&quot;1a37\&quot;,\&quot;1a4o\&quot;] | |

### Return type

[**List&lt;PdbHeader&gt;**](PdbHeader.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

