# SearchControllerApi

All URIs are relative to *http://localhost:38080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchAnnotationByKeywordGETUsingGET**](SearchControllerApi.md#searchAnnotationByKeywordGETUsingGET) | **GET** /search | Performs index search.


<a name="searchAnnotationByKeywordGETUsingGET"></a>
# **searchAnnotationByKeywordGETUsingGET**
> List&lt;IndexSearch&gt; searchAnnotationByKeywordGETUsingGET(keyword, limit)

Performs index search.

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.SearchControllerApi;


SearchControllerApi apiInstance = new SearchControllerApi();
String keyword = "keyword_example"; // String | keyword. For example 13:g.32890665G>A, TP53 p.R273C, BRAF c.1799T>A
Integer limit = 56; // Integer | Max number of matching results to return
try {
    List<IndexSearch> result = apiInstance.searchAnnotationByKeywordGETUsingGET(keyword, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchControllerApi#searchAnnotationByKeywordGETUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**| keyword. For example 13:g.32890665G&gt;A, TP53 p.R273C, BRAF c.1799T&gt;A |
 **limit** | **Integer**| Max number of matching results to return | [optional]

### Return type

[**List&lt;IndexSearch&gt;**](IndexSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

