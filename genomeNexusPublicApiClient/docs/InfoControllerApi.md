# InfoControllerApi

All URIs are relative to *http://localhost:38080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVersionGET**](InfoControllerApi.md#fetchVersionGET) | **GET** /version | Retrieve Genome Nexus Version


<a name="fetchVersionGET"></a>
# **fetchVersionGET**
> AggregateSourceInfo fetchVersionGET()

Retrieve Genome Nexus Version

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.InfoControllerApi;


InfoControllerApi apiInstance = new InfoControllerApi();
try {
    AggregateSourceInfo result = apiInstance.fetchVersionGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoControllerApi#fetchVersionGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AggregateSourceInfo**](AggregateSourceInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

