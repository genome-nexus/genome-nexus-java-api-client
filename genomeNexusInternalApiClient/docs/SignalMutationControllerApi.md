# SignalMutationControllerApi

All URIs are relative to *http://localhost:38080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchSignalMutationsByHgvsgGETUsingGET**](SignalMutationControllerApi.md#fetchSignalMutationsByHgvsgGETUsingGET) | **GET** /signal/mutation/hgvs/{variant} | Retrieves SignalDB mutations by hgvgs variant
[**fetchSignalMutationsByHugoSymbolGETUsingGET**](SignalMutationControllerApi.md#fetchSignalMutationsByHugoSymbolGETUsingGET) | **GET** /signal/mutation | Retrieves SignalDB mutations by Hugo Gene Symbol
[**fetchSignalMutationsByMutationFilterPOSTUsingPOST**](SignalMutationControllerApi.md#fetchSignalMutationsByMutationFilterPOSTUsingPOST) | **POST** /signal/mutation | Retrieves SignalDB mutations by Mutation Filter


<a name="fetchSignalMutationsByHgvsgGETUsingGET"></a>
# **fetchSignalMutationsByHgvsgGETUsingGET**
> List&lt;SignalMutation&gt; fetchSignalMutationsByHgvsgGETUsingGET(variant)

Retrieves SignalDB mutations by hgvgs variant

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.SignalMutationControllerApi;


SignalMutationControllerApi apiInstance = new SignalMutationControllerApi();
String variant = "variant_example"; // String | A variant. For example 13:g.32890665G>A
try {
    List<SignalMutation> result = apiInstance.fetchSignalMutationsByHgvsgGETUsingGET(variant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignalMutationControllerApi#fetchSignalMutationsByHgvsgGETUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **String**| A variant. For example 13:g.32890665G&gt;A |

### Return type

[**List&lt;SignalMutation&gt;**](SignalMutation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchSignalMutationsByHugoSymbolGETUsingGET"></a>
# **fetchSignalMutationsByHugoSymbolGETUsingGET**
> List&lt;SignalMutation&gt; fetchSignalMutationsByHugoSymbolGETUsingGET(hugoGeneSymbol)

Retrieves SignalDB mutations by Hugo Gene Symbol

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.SignalMutationControllerApi;


SignalMutationControllerApi apiInstance = new SignalMutationControllerApi();
String hugoGeneSymbol = "hugoGeneSymbol_example"; // String | Hugo Symbol. For example BRCA1
try {
    List<SignalMutation> result = apiInstance.fetchSignalMutationsByHugoSymbolGETUsingGET(hugoGeneSymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignalMutationControllerApi#fetchSignalMutationsByHugoSymbolGETUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoGeneSymbol** | **String**| Hugo Symbol. For example BRCA1 | [optional]

### Return type

[**List&lt;SignalMutation&gt;**](SignalMutation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchSignalMutationsByMutationFilterPOSTUsingPOST"></a>
# **fetchSignalMutationsByMutationFilterPOSTUsingPOST**
> List&lt;SignalMutation&gt; fetchSignalMutationsByMutationFilterPOSTUsingPOST(mutationFilter)

Retrieves SignalDB mutations by Mutation Filter

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.SignalMutationControllerApi;


SignalMutationControllerApi apiInstance = new SignalMutationControllerApi();
SignalMutationFilter mutationFilter = new SignalMutationFilter(); // SignalMutationFilter | List of Hugo Gene Symbols. For example [\"TP53\", \"PIK3CA\", \"BRCA1\"]
try {
    List<SignalMutation> result = apiInstance.fetchSignalMutationsByMutationFilterPOSTUsingPOST(mutationFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignalMutationControllerApi#fetchSignalMutationsByMutationFilterPOSTUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutationFilter** | [**SignalMutationFilter**](SignalMutationFilter.md)| List of Hugo Gene Symbols. For example [\&quot;TP53\&quot;, \&quot;PIK3CA\&quot;, \&quot;BRCA1\&quot;] |

### Return type

[**List&lt;SignalMutation&gt;**](SignalMutation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

