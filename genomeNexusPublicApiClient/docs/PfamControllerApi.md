# PfamControllerApi

All URIs are relative to *http://www.genomenexus.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchPfamDomainsByAccessionGET**](PfamControllerApi.md#fetchPfamDomainsByAccessionGET) | **GET** /pfam/domain/{pfamAccession} | Retrieves a PFAM domain by a PFAM domain ID |
| [**fetchPfamDomainsByPfamAccessionPOST**](PfamControllerApi.md#fetchPfamDomainsByPfamAccessionPOST) | **POST** /pfam/domain | Retrieves PFAM domains by PFAM domain accession IDs |


<a id="fetchPfamDomainsByAccessionGET"></a>
# **fetchPfamDomainsByAccessionGET**
> PfamDomain fetchPfamDomainsByAccessionGET(pfamAccession)

Retrieves a PFAM domain by a PFAM domain ID

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.PfamControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    PfamControllerApi apiInstance = new PfamControllerApi(defaultClient);
    String pfamAccession = "pfamAccession_example"; // String | A PFAM domain accession ID. For example PF02827
    try {
      PfamDomain result = apiInstance.fetchPfamDomainsByAccessionGET(pfamAccession);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PfamControllerApi#fetchPfamDomainsByAccessionGET");
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
| **pfamAccession** | **String**| A PFAM domain accession ID. For example PF02827 | |

### Return type

[**PfamDomain**](PfamDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchPfamDomainsByPfamAccessionPOST"></a>
# **fetchPfamDomainsByPfamAccessionPOST**
> List&lt;PfamDomain&gt; fetchPfamDomainsByPfamAccessionPOST(pfamAccessions)

Retrieves PFAM domains by PFAM domain accession IDs

### Example
```java
// Import classes:
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.Configuration;
import org.genome_nexus.models.*;
import org.genome_nexus.client.PfamControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://www.genomenexus.org");

    PfamControllerApi apiInstance = new PfamControllerApi(defaultClient);
    List<String> pfamAccessions = Arrays.asList(); // List<String> | List of PFAM domain accession IDs. For example [\"PF02827\",\"PF00093\",\"PF15276\"]
    try {
      List<PfamDomain> result = apiInstance.fetchPfamDomainsByPfamAccessionPOST(pfamAccessions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PfamControllerApi#fetchPfamDomainsByPfamAccessionPOST");
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
| **pfamAccessions** | [**List&lt;String&gt;**](String.md)| List of PFAM domain accession IDs. For example [\&quot;PF02827\&quot;,\&quot;PF00093\&quot;,\&quot;PF15276\&quot;] | |

### Return type

[**List&lt;PfamDomain&gt;**](PfamDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

