# PdbControllerApi

All URIs are relative to *http://www.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPdbHeaderGET**](PdbControllerApi.md#fetchPdbHeaderGET) | **GET** /pdb/header/{pdbId} | Retrieves PDB header info by a PDB id
[**fetchPdbHeaderPOST**](PdbControllerApi.md#fetchPdbHeaderPOST) | **POST** /pdb/header | Retrieves PDB header info by a PDB id


<a name="fetchPdbHeaderGET"></a>
# **fetchPdbHeaderGET**
> PdbHeader fetchPdbHeaderGET(pdbId)

Retrieves PDB header info by a PDB id

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PdbControllerApi;


PdbControllerApi apiInstance = new PdbControllerApi();
String pdbId = "pdbId_example"; // String | PDB id, for example 1a37
try {
    PdbHeader result = apiInstance.fetchPdbHeaderGET(pdbId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PdbControllerApi#fetchPdbHeaderGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pdbId** | **String**| PDB id, for example 1a37 |

### Return type

[**PdbHeader**](PdbHeader.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchPdbHeaderPOST"></a>
# **fetchPdbHeaderPOST**
> List&lt;PdbHeader&gt; fetchPdbHeaderPOST(pdbIds)

Retrieves PDB header info by a PDB id

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.PdbControllerApi;


PdbControllerApi apiInstance = new PdbControllerApi();
List<String> pdbIds = Arrays.asList(new List<String>()); // List<String> | List of pdb ids, for example [\"1a37\",\"1a4o\"]
try {
    List<PdbHeader> result = apiInstance.fetchPdbHeaderPOST(pdbIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PdbControllerApi#fetchPdbHeaderPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pdbIds** | **List&lt;String&gt;**| List of pdb ids, for example [\&quot;1a37\&quot;,\&quot;1a4o\&quot;] |

### Return type

[**List&lt;PdbHeader&gt;**](PdbHeader.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

