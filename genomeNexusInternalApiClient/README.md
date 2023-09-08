# genomeNexusInternalApiClient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.genome_nexus.client</groupId>
    <artifactId>genomeNexusInternalApiClient</artifactId>
    <version>1.1.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.genome_nexus.client:genomeNexusInternalApiClient:1.1.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/genomeNexusInternalApiClient-1.1.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.genome_nexus.*;
import org.genome_nexus.auth.*;
import org.genome_nexus.client.*;
import org.genome_nexus.client.AnnotationSummaryControllerApi;

import java.io.File;
import java.util.*;

public class AnnotationSummaryControllerApiExample {

    public static void main(String[] args) {
        
        AnnotationSummaryControllerApi apiInstance = new AnnotationSummaryControllerApi();
        String variant = "variant_example"; // String | Variant. For example 17:g.41242962_41242963insGA
        String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
        String projection = "ALL"; // String | Indicates whether to return summary for all transcripts or only for canonical transcript
        try {
            VariantAnnotationSummary result = apiInstance.fetchVariantAnnotationSummaryGET(variant, isoformOverrideSource, projection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationSummaryControllerApi#fetchVariantAnnotationSummaryGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:38080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnotationSummaryControllerApi* | [**fetchVariantAnnotationSummaryGET**](docs/AnnotationSummaryControllerApi.md#fetchVariantAnnotationSummaryGET) | **GET** /annotation/summary/{variant} | Retrieves VEP annotation summary for the provided variant
*AnnotationSummaryControllerApi* | [**fetchVariantAnnotationSummaryPOST**](docs/AnnotationSummaryControllerApi.md#fetchVariantAnnotationSummaryPOST) | **POST** /annotation/summary | Retrieves VEP annotation summary for the provided list of variants
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByGenomicLocationGET**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationGET) | **GET** /cancer_hotspots/genomic/{genomicLocation} | Retrieves hotspot annotations for a specific genomic location
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByGenomicLocationPOST**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationPOST) | **POST** /cancer_hotspots/genomic | Retrieves hotspot annotations for the provided list of genomic locations
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByHgvsGET**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsGET) | **GET** /cancer_hotspots/hgvs/{variant} | Retrieves hotspot annotations for a specific variant
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByHgvsPOST**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsPOST) | **POST** /cancer_hotspots/hgvs | Retrieves hotspot annotations for the provided list of variants
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByProteinLocationsPOST**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByProteinLocationsPOST) | **POST** /cancer_hotspots/proteinLocations | Retrieves hotspot annotations for the provided list of transcript id, protein location and mutation type
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByTranscriptIdGET**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByTranscriptIdGET) | **GET** /cancer_hotspots/transcript/{transcriptId} | Retrieves hotspot annotations for the provided transcript ID
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByTranscriptIdPOST**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByTranscriptIdPOST) | **POST** /cancer_hotspots/transcript | Retrieves hotspot annotations for the provided list of transcript ID
*CrossReferenceControllerApi* | [**fetchGeneXrefsGET1**](docs/CrossReferenceControllerApi.md#fetchGeneXrefsGET1) | **GET** /xrefs/{accession} | Perform lookups of Ensembl identifiers and retrieve their external references in other databases
*CuriousCasesControllerApi* | [**fetchCuriousCasesGET**](docs/CuriousCasesControllerApi.md#fetchCuriousCasesGET) | **GET** /curious_cases/{genomicLocation} | Retrieves Curious Cases info by a genomic location
*MutationAssessorControllerApi* | [**fetchMutationAssessorAnnotationGET**](docs/MutationAssessorControllerApi.md#fetchMutationAssessorAnnotationGET) | **GET** /mutation_assessor/{variant} | Retrieves mutation assessor information for the provided list of variants
*MutationAssessorControllerApi* | [**postMutationAssessorAnnotation**](docs/MutationAssessorControllerApi.md#postMutationAssessorAnnotation) | **POST** /mutation_assessor | Retrieves mutation assessor information for the provided list of variants
*MyVariantInfoControllerApi* | [**fetchMyVariantInfoAnnotationGET**](docs/MyVariantInfoControllerApi.md#fetchMyVariantInfoAnnotationGET) | **GET** /my_variant_info/variant/{variant} | Retrieves myvariant information for the provided list of variants
*MyVariantInfoControllerApi* | [**postMyVariantInfoAnnotation**](docs/MyVariantInfoControllerApi.md#postMyVariantInfoAnnotation) | **POST** /my_variant_info/variant | Retrieves myvariant information for the provided list of variants
*NucleotideContextControllerApi* | [**fetchNucleotideContextAnnotationGET**](docs/NucleotideContextControllerApi.md#fetchNucleotideContextAnnotationGET) | **GET** /nucleotide_context/{variant} | Retrieves nucleotide context information for the provided list of variants
*NucleotideContextControllerApi* | [**postNucleotideContextAnnotation**](docs/NucleotideContextControllerApi.md#postNucleotideContextAnnotation) | **POST** /nucleotide_context | Retrieves nucleotide context information for the provided list of variants
*SearchControllerApi* | [**searchAnnotationByKeywordGETUsingGET**](docs/SearchControllerApi.md#searchAnnotationByKeywordGETUsingGET) | **GET** /search | Performs index search.
*SignalMutationControllerApi* | [**fetchSignalMutationsByHgvsgGETUsingGET**](docs/SignalMutationControllerApi.md#fetchSignalMutationsByHgvsgGETUsingGET) | **GET** /signal/mutation/hgvs/{variant} | Retrieves SignalDB mutations by hgvgs variant
*SignalMutationControllerApi* | [**fetchSignalMutationsByHugoSymbolGETUsingGET**](docs/SignalMutationControllerApi.md#fetchSignalMutationsByHugoSymbolGETUsingGET) | **GET** /signal/mutation | Retrieves SignalDB mutations by Hugo Gene Symbol
*SignalMutationControllerApi* | [**fetchSignalMutationsByMutationFilterPOSTUsingPOST**](docs/SignalMutationControllerApi.md#fetchSignalMutationsByMutationFilterPOSTUsingPOST) | **POST** /signal/mutation | Retrieves SignalDB mutations by Mutation Filter
*SignalQueryControllerApi* | [**searchSignalByKeywordGETUsingGET**](docs/SignalQueryControllerApi.md#searchSignalByKeywordGETUsingGET) | **GET** /signal/search | Performs search by gene, protein change, variant or region.


## Documentation for Models

 - [AggregatedHotspots](docs/AggregatedHotspots.md)
 - [AlleleCount](docs/AlleleCount.md)
 - [AlleleFrequency](docs/AlleleFrequency.md)
 - [AlleleNumber](docs/AlleleNumber.md)
 - [Alleles](docs/Alleles.md)
 - [Cosmic](docs/Cosmic.md)
 - [CountByTumorType](docs/CountByTumorType.md)
 - [CuriousCases](docs/CuriousCases.md)
 - [Dbsnp](docs/Dbsnp.md)
 - [Gene](docs/Gene.md)
 - [GeneXref](docs/GeneXref.md)
 - [GeneralPopulationStats](docs/GeneralPopulationStats.md)
 - [GenomicLocation](docs/GenomicLocation.md)
 - [Gnomad](docs/Gnomad.md)
 - [Hg19](docs/Hg19.md)
 - [Hg38](docs/Hg38.md)
 - [Hgvs](docs/Hgvs.md)
 - [Homozygotes](docs/Homozygotes.md)
 - [Hotspot](docs/Hotspot.md)
 - [HrdScore](docs/HrdScore.md)
 - [Index](docs/Index.md)
 - [IndexSearch](docs/IndexSearch.md)
 - [IntegerRange](docs/IntegerRange.md)
 - [MutationAssessor](docs/MutationAssessor.md)
 - [Mutdb](docs/Mutdb.md)
 - [MyVariantInfo](docs/MyVariantInfo.md)
 - [MyVariantInfoClinVar](docs/MyVariantInfoClinVar.md)
 - [NucleotideContext](docs/NucleotideContext.md)
 - [ProteinLocation](docs/ProteinLocation.md)
 - [Rcv](docs/Rcv.md)
 - [SignalMutation](docs/SignalMutation.md)
 - [SignalMutationFilter](docs/SignalMutationFilter.md)
 - [SignalPopulationStats](docs/SignalPopulationStats.md)
 - [SignalQuery](docs/SignalQuery.md)
 - [Snpeff](docs/Snpeff.md)
 - [StatsByTumorType](docs/StatsByTumorType.md)
 - [TranscriptConsequenceSummary](docs/TranscriptConsequenceSummary.md)
 - [VariantAnnotationSummary](docs/VariantAnnotationSummary.md)
 - [Vcf](docs/Vcf.md)
 - [Vues](docs/Vues.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



