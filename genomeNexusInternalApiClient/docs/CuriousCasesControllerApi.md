# CuriousCasesControllerApi

All URIs are relative to *http://www.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchCuriousCasesGET**](CuriousCasesControllerApi.md#fetchCuriousCasesGET) | **GET** /curious_cases/{genomicLocation} | Retrieves Curious Cases info by a genomic location


<a name="fetchCuriousCasesGET"></a>
# **fetchCuriousCasesGET**
> CuriousCases fetchCuriousCasesGET(genomicLocation)

Retrieves Curious Cases info by a genomic location

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.CuriousCasesControllerApi;


CuriousCasesControllerApi apiInstance = new CuriousCasesControllerApi();
String genomicLocation = "genomicLocation_example"; // String | Genomic location, for example: 7,116411883,116411905,TTCTTTCTCTCTGTTTTAAGATC,-
try {
    CuriousCases result = apiInstance.fetchCuriousCasesGET(genomicLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuriousCasesControllerApi#fetchCuriousCasesGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genomicLocation** | **String**| Genomic location, for example: 7,116411883,116411905,TTCTTTCTCTCTGTTTTAAGATC,- |

### Return type

[**CuriousCases**](CuriousCases.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

