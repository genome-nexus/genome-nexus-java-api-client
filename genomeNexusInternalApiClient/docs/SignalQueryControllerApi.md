# SignalQueryControllerApi

All URIs are relative to *http://beta.genomenexus.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchSignalByKeywordGETUsingGET**](SignalQueryControllerApi.md#searchSignalByKeywordGETUsingGET) | **GET** /signal/search | Performs search by gene, protein change, variant or region.


<a name="searchSignalByKeywordGETUsingGET"></a>
# **searchSignalByKeywordGETUsingGET**
> List&lt;SignalQuery&gt; searchSignalByKeywordGETUsingGET(keyword, limit)

Performs search by gene, protein change, variant or region.

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.SignalQueryControllerApi;


SignalQueryControllerApi apiInstance = new SignalQueryControllerApi();
String keyword = "keyword_example"; // String | keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G>A
Integer limit = 56; // Integer | Max number of matching results to return
try {
    List<SignalQuery> result = apiInstance.searchSignalByKeywordGETUsingGET(keyword, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignalQueryControllerApi#searchSignalByKeywordGETUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**| keyword. For example BRCA; BRAF V600; 13:32906640-32906640; 13:g.32890665G&gt;A |
 **limit** | **Integer**| Max number of matching results to return | [optional]

### Return type

[**List&lt;SignalQuery&gt;**](SignalQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

