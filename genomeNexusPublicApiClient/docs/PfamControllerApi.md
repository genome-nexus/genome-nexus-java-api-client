# PfamControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPfamDomainsByAccessionGET**](PfamControllerApi.md#fetchPfamDomainsByAccessionGET) | **GET** /pfam/domain/{pfamAccession} | Retrieves a PFAM domain by a PFAM domain ID
[**fetchPfamDomainsByPfamAccessionPOST**](PfamControllerApi.md#fetchPfamDomainsByPfamAccessionPOST) | **POST** /pfam/domain | Retrieves PFAM domains by PFAM domain accession IDs
[**fetchPfamDomainsGET**](PfamControllerApi.md#fetchPfamDomainsGET) | **GET** /pfam/domain | Retrieves all PFAM domains


<a name="fetchPfamDomainsByAccessionGET"></a>
# **fetchPfamDomainsByAccessionGET**
> PfamDomain fetchPfamDomainsByAccessionGET(pfamAccession)

Retrieves a PFAM domain by a PFAM domain ID

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PfamControllerApi;


PfamControllerApi apiInstance = new PfamControllerApi();
String pfamAccession = "pfamAccession_example"; // String | A PFAM domain accession ID. For example PF02827
try {
    PfamDomain result = apiInstance.fetchPfamDomainsByAccessionGET(pfamAccession);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PfamControllerApi#fetchPfamDomainsByAccessionGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pfamAccession** | **String**| A PFAM domain accession ID. For example PF02827 |

### Return type

[**PfamDomain**](PfamDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchPfamDomainsByPfamAccessionPOST"></a>
# **fetchPfamDomainsByPfamAccessionPOST**
> List&lt;PfamDomain&gt; fetchPfamDomainsByPfamAccessionPOST(pfamAccessions)

Retrieves PFAM domains by PFAM domain accession IDs

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PfamControllerApi;


PfamControllerApi apiInstance = new PfamControllerApi();
List<String> pfamAccessions = Arrays.asList(new List<String>()); // List<String> | List of PFAM domain accession IDs. For example [\"PF02827\",\"PF00093\",\"PF15276\"]
try {
    List<PfamDomain> result = apiInstance.fetchPfamDomainsByPfamAccessionPOST(pfamAccessions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PfamControllerApi#fetchPfamDomainsByPfamAccessionPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pfamAccessions** | **List&lt;String&gt;**| List of PFAM domain accession IDs. For example [\&quot;PF02827\&quot;,\&quot;PF00093\&quot;,\&quot;PF15276\&quot;] |

### Return type

[**List&lt;PfamDomain&gt;**](PfamDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchPfamDomainsGET"></a>
# **fetchPfamDomainsGET**
> List&lt;PfamDomain&gt; fetchPfamDomainsGET()

Retrieves all PFAM domains

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PfamControllerApi;


PfamControllerApi apiInstance = new PfamControllerApi();
try {
    List<PfamDomain> result = apiInstance.fetchPfamDomainsGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PfamControllerApi#fetchPfamDomainsGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PfamDomain&gt;**](PfamDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

