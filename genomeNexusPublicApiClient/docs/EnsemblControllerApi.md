# EnsemblControllerApi

All URIs are relative to *http://localhost:38080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET**](EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET) | **GET** /ensembl/canonical-gene/entrez/{entrezGeneId} | Retrieves Ensembl canonical gene id by Entrez Gene Id
[**fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST**](EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST) | **POST** /ensembl/canonical-gene/entrez | Retrieves canonical Ensembl Gene ID by Entrez Gene Ids
[**fetchCanonicalEnsemblGeneIdByHugoSymbolGET**](EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByHugoSymbolGET) | **GET** /ensembl/canonical-gene/hgnc/{hugoSymbol} | Retrieves Ensembl canonical gene id by Hugo Symbol
[**fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST**](EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST) | **POST** /ensembl/canonical-gene/hgnc | Retrieves canonical Ensembl Gene ID by Hugo Symbols
[**fetchCanonicalEnsemblTranscriptByHugoSymbolGET**](EnsemblControllerApi.md#fetchCanonicalEnsemblTranscriptByHugoSymbolGET) | **GET** /ensembl/canonical-transcript/hgnc/{hugoSymbol} | Retrieves Ensembl canonical transcript by Hugo Symbol
[**fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST**](EnsemblControllerApi.md#fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST) | **POST** /ensembl/canonical-transcript/hgnc | Retrieves Ensembl canonical transcripts by Hugo Symbols
[**fetchEnsemblTranscriptByTranscriptIdGET**](EnsemblControllerApi.md#fetchEnsemblTranscriptByTranscriptIdGET) | **GET** /ensembl/transcript/{transcriptId} | Retrieves the transcript by an Ensembl transcript ID
[**fetchEnsemblTranscriptsByEnsemblFilterPOST**](EnsemblControllerApi.md#fetchEnsemblTranscriptsByEnsemblFilterPOST) | **POST** /ensembl/transcript | Retrieves Ensembl Transcripts by Ensembl transcript IDs, hugo Symbols, protein IDs, or gene IDs
[**fetchEnsemblTranscriptsGET**](EnsemblControllerApi.md#fetchEnsemblTranscriptsGET) | **GET** /ensembl/transcript | Retrieves Ensembl Transcripts by protein ID, and gene ID. Retrieves all transcripts in case no query parameter provided
[**fetchGeneXrefsGET**](EnsemblControllerApi.md#fetchGeneXrefsGET) | **GET** /ensembl/xrefs | Perform lookups of Ensembl identifiers and retrieve their external references in other databases


<a name="fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET"></a>
# **fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET**
> EnsemblGene fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET(entrezGeneId)

Retrieves Ensembl canonical gene id by Entrez Gene Id

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
String entrezGeneId = "entrezGeneId_example"; // String | An Entrez Gene Id. For example 23140
try {
    EnsemblGene result = apiInstance.fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET(entrezGeneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneId** | **String**| An Entrez Gene Id. For example 23140 |

### Return type

[**EnsemblGene**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST"></a>
# **fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST**
> List&lt;EnsemblGene&gt; fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST(entrezGeneIds)

Retrieves canonical Ensembl Gene ID by Entrez Gene Ids

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
List<String> entrezGeneIds = Arrays.asList(new List<String>()); // List<String> | List of Entrez Gene Ids. For example [\"23140\",\"26009\",\"100131879\"]
try {
    List<EnsemblGene> result = apiInstance.fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST(entrezGeneIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entrezGeneIds** | **List&lt;String&gt;**| List of Entrez Gene Ids. For example [\&quot;23140\&quot;,\&quot;26009\&quot;,\&quot;100131879\&quot;] |

### Return type

[**List&lt;EnsemblGene&gt;**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchCanonicalEnsemblGeneIdByHugoSymbolGET"></a>
# **fetchCanonicalEnsemblGeneIdByHugoSymbolGET**
> EnsemblGene fetchCanonicalEnsemblGeneIdByHugoSymbolGET(hugoSymbol)

Retrieves Ensembl canonical gene id by Hugo Symbol

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
String hugoSymbol = "hugoSymbol_example"; // String | A Hugo Symbol. For example TP53
try {
    EnsemblGene result = apiInstance.fetchCanonicalEnsemblGeneIdByHugoSymbolGET(hugoSymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchCanonicalEnsemblGeneIdByHugoSymbolGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| A Hugo Symbol. For example TP53 |

### Return type

[**EnsemblGene**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST"></a>
# **fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST**
> List&lt;EnsemblGene&gt; fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST(hugoSymbols)

Retrieves canonical Ensembl Gene ID by Hugo Symbols

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
List<String> hugoSymbols = Arrays.asList(new List<String>()); // List<String> | List of Hugo Symbols. For example [\"TP53\",\"PIK3CA\",\"BRCA1\"]
try {
    List<EnsemblGene> result = apiInstance.fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST(hugoSymbols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbols** | **List&lt;String&gt;**| List of Hugo Symbols. For example [\&quot;TP53\&quot;,\&quot;PIK3CA\&quot;,\&quot;BRCA1\&quot;] |

### Return type

[**List&lt;EnsemblGene&gt;**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchCanonicalEnsemblTranscriptByHugoSymbolGET"></a>
# **fetchCanonicalEnsemblTranscriptByHugoSymbolGET**
> EnsemblTranscript fetchCanonicalEnsemblTranscriptByHugoSymbolGET(hugoSymbol, isoformOverrideSource)

Retrieves Ensembl canonical transcript by Hugo Symbol

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
String hugoSymbol = "hugoSymbol_example"; // String | A Hugo Symbol. For example TP53
String isoformOverrideSource = "uniprot"; // String | Isoform override source. For example uniprot
try {
    EnsemblTranscript result = apiInstance.fetchCanonicalEnsemblTranscriptByHugoSymbolGET(hugoSymbol, isoformOverrideSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchCanonicalEnsemblTranscriptByHugoSymbolGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| A Hugo Symbol. For example TP53 |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional] [default to uniprot]

### Return type

[**EnsemblTranscript**](EnsemblTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST"></a>
# **fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST**
> List&lt;EnsemblTranscript&gt; fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST(hugoSymbols, isoformOverrideSource)

Retrieves Ensembl canonical transcripts by Hugo Symbols

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
List<String> hugoSymbols = Arrays.asList(new List<String>()); // List<String> | List of Hugo Symbols. For example [\"TP53\",\"PIK3CA\",\"BRCA1\"]
String isoformOverrideSource = "uniprot"; // String | Isoform override source. For example uniprot
try {
    List<EnsemblTranscript> result = apiInstance.fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST(hugoSymbols, isoformOverrideSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbols** | **List&lt;String&gt;**| List of Hugo Symbols. For example [\&quot;TP53\&quot;,\&quot;PIK3CA\&quot;,\&quot;BRCA1\&quot;] |
 **isoformOverrideSource** | **String**| Isoform override source. For example uniprot | [optional] [default to uniprot]

### Return type

[**List&lt;EnsemblTranscript&gt;**](EnsemblTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchEnsemblTranscriptByTranscriptIdGET"></a>
# **fetchEnsemblTranscriptByTranscriptIdGET**
> EnsemblTranscript fetchEnsemblTranscriptByTranscriptIdGET(transcriptId)

Retrieves the transcript by an Ensembl transcript ID

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
String transcriptId = "transcriptId_example"; // String | An Ensembl transcript ID. For example ENST00000361390
try {
    EnsemblTranscript result = apiInstance.fetchEnsemblTranscriptByTranscriptIdGET(transcriptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchEnsemblTranscriptByTranscriptIdGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptId** | **String**| An Ensembl transcript ID. For example ENST00000361390 |

### Return type

[**EnsemblTranscript**](EnsemblTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchEnsemblTranscriptsByEnsemblFilterPOST"></a>
# **fetchEnsemblTranscriptsByEnsemblFilterPOST**
> List&lt;EnsemblTranscript&gt; fetchEnsemblTranscriptsByEnsemblFilterPOST(ensemblFilter)

Retrieves Ensembl Transcripts by Ensembl transcript IDs, hugo Symbols, protein IDs, or gene IDs

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
EnsemblFilter ensemblFilter = new EnsemblFilter(); // EnsemblFilter | List of Ensembl transcript IDs. For example [\"ENST00000361390\", \"ENST00000361453\", \"ENST00000361624\"]<br>OR<br>List of Hugo Symbols. For example [\"TP53\", \"PIK3CA\", \"BRCA1\"]<br>OR<br>List of Ensembl protein IDs. For example [\"ENSP00000439985\", \"ENSP00000478460\", \"ENSP00000346196\"]<br>OR<br>List of Ensembl gene IDs. For example [\"ENSG00000136999\", \"ENSG00000272398\", \"ENSG00000198695\"]
try {
    List<EnsemblTranscript> result = apiInstance.fetchEnsemblTranscriptsByEnsemblFilterPOST(ensemblFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchEnsemblTranscriptsByEnsemblFilterPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ensemblFilter** | [**EnsemblFilter**](EnsemblFilter.md)| List of Ensembl transcript IDs. For example [\&quot;ENST00000361390\&quot;, \&quot;ENST00000361453\&quot;, \&quot;ENST00000361624\&quot;]&lt;br&gt;OR&lt;br&gt;List of Hugo Symbols. For example [\&quot;TP53\&quot;, \&quot;PIK3CA\&quot;, \&quot;BRCA1\&quot;]&lt;br&gt;OR&lt;br&gt;List of Ensembl protein IDs. For example [\&quot;ENSP00000439985\&quot;, \&quot;ENSP00000478460\&quot;, \&quot;ENSP00000346196\&quot;]&lt;br&gt;OR&lt;br&gt;List of Ensembl gene IDs. For example [\&quot;ENSG00000136999\&quot;, \&quot;ENSG00000272398\&quot;, \&quot;ENSG00000198695\&quot;] |

### Return type

[**List&lt;EnsemblTranscript&gt;**](EnsemblTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchEnsemblTranscriptsGET"></a>
# **fetchEnsemblTranscriptsGET**
> List&lt;EnsemblTranscript&gt; fetchEnsemblTranscriptsGET(geneId, proteinId, hugoSymbol)

Retrieves Ensembl Transcripts by protein ID, and gene ID. Retrieves all transcripts in case no query parameter provided

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
String geneId = "geneId_example"; // String | An Ensembl gene ID. For example ENSG00000136999
String proteinId = "proteinId_example"; // String | An Ensembl protein ID. For example ENSP00000439985
String hugoSymbol = "hugoSymbol_example"; // String | A Hugo Symbol For example ARF5
try {
    List<EnsemblTranscript> result = apiInstance.fetchEnsemblTranscriptsGET(geneId, proteinId, hugoSymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchEnsemblTranscriptsGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geneId** | **String**| An Ensembl gene ID. For example ENSG00000136999 | [optional]
 **proteinId** | **String**| An Ensembl protein ID. For example ENSP00000439985 | [optional]
 **hugoSymbol** | **String**| A Hugo Symbol For example ARF5 | [optional]

### Return type

[**List&lt;EnsemblTranscript&gt;**](EnsemblTranscript.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchGeneXrefsGET"></a>
# **fetchGeneXrefsGET**
> List&lt;GeneXref&gt; fetchGeneXrefsGET(accession)

Perform lookups of Ensembl identifiers and retrieve their external references in other databases

### Example
```java
// Import classes:
//import org.genome_nexus.ApiException;
//import org.genome_nexus.client.EnsemblControllerApi;


EnsemblControllerApi apiInstance = new EnsemblControllerApi();
String accession = "accession_example"; // String | Ensembl gene accession. For example ENSG00000169083
try {
    List<GeneXref> result = apiInstance.fetchGeneXrefsGET(accession);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblControllerApi#fetchGeneXrefsGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accession** | **String**| Ensembl gene accession. For example ENSG00000169083 |

### Return type

[**List&lt;GeneXref&gt;**](GeneXref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

