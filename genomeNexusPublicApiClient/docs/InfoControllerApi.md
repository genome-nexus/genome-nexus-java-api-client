# InfoControllerApi

All URIs are relative to *http://genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVersionGET**](InfoControllerApi.md#fetchVersionGET) | **GET** /version | Retrieve Genome Nexus Version


<a name="fetchVersionGET"></a>
# **fetchVersionGET**
> Version fetchVersionGET()

Retrieve Genome Nexus Version

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.InfoControllerApi;


InfoControllerApi apiInstance = new InfoControllerApi();
try {
    Version result = apiInstance.fetchVersionGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoControllerApi#fetchVersionGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Version**](Version.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

