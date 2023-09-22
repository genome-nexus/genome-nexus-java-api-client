# genomeNexusPublicApiClient

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
    <artifactId>genomeNexusPublicApiClient</artifactId>
    <version>1.1.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.genome_nexus.client:genomeNexusPublicApiClient:1.1.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/genomeNexusPublicApiClient-1.1.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.genome_nexus.*;
import org.genome_nexus.auth.*;
import org.genome_nexus.client.*;
import org.genome_nexus.client.AnnotationControllerApi;

import java.io.File;
import java.util.*;

public class AnnotationControllerApiExample {

    public static void main(String[] args) {
        
        AnnotationControllerApi apiInstance = new AnnotationControllerApi();
        String genomicLocation = "genomicLocation_example"; // String | A genomic location. For example 7,140453136,140453136,A,T
        String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
        String token = "token_example"; // String | Map of tokens. For example {\"source1\":\"put-your-token1-here\",\"source2\":\"put-your-token2-here\"}
        List<String> fields = Arrays.asList("annotation_summary"); // List<String> | Comma separated list of fields to include in the annotation (case-sensitive!). Defaults to \"annotation_summary\" if no value passed. Valid values: {annotation_summary, clinvar, hotspots, mutation_assessor, my_variant_info, nucleotide_context, oncokb, ptms, signal}
        try {
            VariantAnnotation result = apiInstance.fetchVariantAnnotationByGenomicLocationGET(genomicLocation, isoformOverrideSource, token, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationControllerApi#fetchVariantAnnotationByGenomicLocationGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://www.genomenexus.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnotationControllerApi* | [**fetchVariantAnnotationByGenomicLocationGET**](docs/AnnotationControllerApi.md#fetchVariantAnnotationByGenomicLocationGET) | **GET** /annotation/genomic/{genomicLocation} | Retrieves VEP annotation for the provided genomic location
*AnnotationControllerApi* | [**fetchVariantAnnotationByGenomicLocationPOST**](docs/AnnotationControllerApi.md#fetchVariantAnnotationByGenomicLocationPOST) | **POST** /annotation/genomic | Retrieves VEP annotation for the provided list of genomic locations
*AnnotationControllerApi* | [**fetchVariantAnnotationByIdGET**](docs/AnnotationControllerApi.md#fetchVariantAnnotationByIdGET) | **GET** /annotation/dbsnp/{variantId} | Retrieves VEP annotation for the give dbSNP id
*AnnotationControllerApi* | [**fetchVariantAnnotationByIdPOST**](docs/AnnotationControllerApi.md#fetchVariantAnnotationByIdPOST) | **POST** /annotation/dbsnp/ | Retrieves VEP annotation for the provided list of dbSNP ids
*AnnotationControllerApi* | [**fetchVariantAnnotationGET**](docs/AnnotationControllerApi.md#fetchVariantAnnotationGET) | **GET** /annotation/{variant} | Retrieves VEP annotation for the provided variant
*AnnotationControllerApi* | [**fetchVariantAnnotationPOST**](docs/AnnotationControllerApi.md#fetchVariantAnnotationPOST) | **POST** /annotation | Retrieves VEP annotation for the provided list of variants
*EnsemblControllerApi* | [**fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET**](docs/EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET) | **GET** /ensembl/canonical-gene/entrez/{entrezGeneId} | Retrieves Ensembl canonical gene id by Entrez Gene Id
*EnsemblControllerApi* | [**fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST**](docs/EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST) | **POST** /ensembl/canonical-gene/entrez | Retrieves canonical Ensembl Gene ID by Entrez Gene Ids
*EnsemblControllerApi* | [**fetchCanonicalEnsemblGeneIdByHugoSymbolGET**](docs/EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByHugoSymbolGET) | **GET** /ensembl/canonical-gene/hgnc/{hugoSymbol} | Retrieves Ensembl canonical gene id by Hugo Symbol
*EnsemblControllerApi* | [**fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST**](docs/EnsemblControllerApi.md#fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST) | **POST** /ensembl/canonical-gene/hgnc | Retrieves canonical Ensembl Gene ID by Hugo Symbols
*EnsemblControllerApi* | [**fetchCanonicalEnsemblTranscriptByHugoSymbolGET**](docs/EnsemblControllerApi.md#fetchCanonicalEnsemblTranscriptByHugoSymbolGET) | **GET** /ensembl/canonical-transcript/hgnc/{hugoSymbol} | Retrieves Ensembl canonical transcript by Hugo Symbol
*EnsemblControllerApi* | [**fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST**](docs/EnsemblControllerApi.md#fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST) | **POST** /ensembl/canonical-transcript/hgnc | Retrieves Ensembl canonical transcripts by Hugo Symbols
*EnsemblControllerApi* | [**fetchEnsemblTranscriptByTranscriptIdGET**](docs/EnsemblControllerApi.md#fetchEnsemblTranscriptByTranscriptIdGET) | **GET** /ensembl/transcript/{transcriptId} | Retrieves the transcript by an Ensembl transcript ID
*EnsemblControllerApi* | [**fetchEnsemblTranscriptsByEnsemblFilterPOST**](docs/EnsemblControllerApi.md#fetchEnsemblTranscriptsByEnsemblFilterPOST) | **POST** /ensembl/transcript | Retrieves Ensembl Transcripts by Ensembl transcript IDs, hugo Symbols, protein IDs, or gene IDs
*EnsemblControllerApi* | [**fetchEnsemblTranscriptsGET**](docs/EnsemblControllerApi.md#fetchEnsemblTranscriptsGET) | **GET** /ensembl/transcript | Retrieves Ensembl Transcripts by protein ID, and gene ID. Retrieves all transcripts in case no query parameter provided
*EnsemblControllerApi* | [**fetchGeneXrefsGET**](docs/EnsemblControllerApi.md#fetchGeneXrefsGET) | **GET** /ensembl/xrefs | Perform lookups of Ensembl identifiers and retrieve their external references in other databases
*InfoControllerApi* | [**fetchVersionGET**](docs/InfoControllerApi.md#fetchVersionGET) | **GET** /version | Retrieve Genome Nexus Version
*PdbControllerApi* | [**fetchPdbHeaderGET**](docs/PdbControllerApi.md#fetchPdbHeaderGET) | **GET** /pdb/header/{pdbId} | Retrieves PDB header info by a PDB id
*PdbControllerApi* | [**fetchPdbHeaderPOST**](docs/PdbControllerApi.md#fetchPdbHeaderPOST) | **POST** /pdb/header | Retrieves PDB header info by a PDB id
*PfamControllerApi* | [**fetchPfamDomainsByAccessionGET**](docs/PfamControllerApi.md#fetchPfamDomainsByAccessionGET) | **GET** /pfam/domain/{pfamAccession} | Retrieves a PFAM domain by a PFAM domain ID
*PfamControllerApi* | [**fetchPfamDomainsByPfamAccessionPOST**](docs/PfamControllerApi.md#fetchPfamDomainsByPfamAccessionPOST) | **POST** /pfam/domain | Retrieves PFAM domains by PFAM domain accession IDs
*PtmControllerApi* | [**fetchPostTranslationalModificationsByPtmFilterPOST**](docs/PtmControllerApi.md#fetchPostTranslationalModificationsByPtmFilterPOST) | **POST** /ptm/experimental | Retrieves PTM entries by Ensembl Transcript IDs
*PtmControllerApi* | [**fetchPostTranslationalModificationsGET**](docs/PtmControllerApi.md#fetchPostTranslationalModificationsGET) | **GET** /ptm/experimental | Retrieves PTM entries by Ensembl Transcript ID


## Documentation for Models

 - [AggregateSourceInfo](docs/AggregateSourceInfo.md)
 - [AlleleCount](docs/AlleleCount.md)
 - [AlleleFrequency](docs/AlleleFrequency.md)
 - [AlleleNumber](docs/AlleleNumber.md)
 - [Alleles](docs/Alleles.md)
 - [ArticleAbstract](docs/ArticleAbstract.md)
 - [Citations](docs/Citations.md)
 - [Clinvar](docs/Clinvar.md)
 - [ClinvarAnnotation](docs/ClinvarAnnotation.md)
 - [ColocatedVariant](docs/ColocatedVariant.md)
 - [Cosmic](docs/Cosmic.md)
 - [CountByTumorType](docs/CountByTumorType.md)
 - [Dbsnp](docs/Dbsnp.md)
 - [Drug](docs/Drug.md)
 - [EnsemblFilter](docs/EnsemblFilter.md)
 - [EnsemblGene](docs/EnsemblGene.md)
 - [EnsemblTranscript](docs/EnsemblTranscript.md)
 - [Exon](docs/Exon.md)
 - [Gene](docs/Gene.md)
 - [GeneXref](docs/GeneXref.md)
 - [GeneralPopulationStats](docs/GeneralPopulationStats.md)
 - [GenomeNexusInfo](docs/GenomeNexusInfo.md)
 - [GenomicLocation](docs/GenomicLocation.md)
 - [Gnomad](docs/Gnomad.md)
 - [Hg19](docs/Hg19.md)
 - [Hg38](docs/Hg38.md)
 - [Hgvs](docs/Hgvs.md)
 - [Homozygotes](docs/Homozygotes.md)
 - [Hotspot](docs/Hotspot.md)
 - [HotspotAnnotation](docs/HotspotAnnotation.md)
 - [HrdScore](docs/HrdScore.md)
 - [Implication](docs/Implication.md)
 - [IndicatorQueryResp](docs/IndicatorQueryResp.md)
 - [IndicatorQueryTreatment](docs/IndicatorQueryTreatment.md)
 - [IntegerRange](docs/IntegerRange.md)
 - [IntergenicConsequences](docs/IntergenicConsequences.md)
 - [MainType](docs/MainType.md)
 - [MutationAssessor](docs/MutationAssessor.md)
 - [MutationAssessorAnnotation](docs/MutationAssessorAnnotation.md)
 - [MutationEffectResp](docs/MutationEffectResp.md)
 - [Mutdb](docs/Mutdb.md)
 - [MyVariantInfo](docs/MyVariantInfo.md)
 - [MyVariantInfoAnnotation](docs/MyVariantInfoAnnotation.md)
 - [MyVariantInfoClinVar](docs/MyVariantInfoClinVar.md)
 - [NucleotideContext](docs/NucleotideContext.md)
 - [NucleotideContextAnnotation](docs/NucleotideContextAnnotation.md)
 - [OncokbAnnotation](docs/OncokbAnnotation.md)
 - [PdbHeader](docs/PdbHeader.md)
 - [PfamDomain](docs/PfamDomain.md)
 - [PfamDomainRange](docs/PfamDomainRange.md)
 - [PostTranslationalModification](docs/PostTranslationalModification.md)
 - [PtmAnnotation](docs/PtmAnnotation.md)
 - [PtmFilter](docs/PtmFilter.md)
 - [Query](docs/Query.md)
 - [Rcv](docs/Rcv.md)
 - [SignalAnnotation](docs/SignalAnnotation.md)
 - [SignalMutation](docs/SignalMutation.md)
 - [SignalPopulationStats](docs/SignalPopulationStats.md)
 - [Snpeff](docs/Snpeff.md)
 - [SourceVersionInfo](docs/SourceVersionInfo.md)
 - [StatsByTumorType](docs/StatsByTumorType.md)
 - [TranscriptConsequence](docs/TranscriptConsequence.md)
 - [TranscriptConsequenceSummary](docs/TranscriptConsequenceSummary.md)
 - [TumorType](docs/TumorType.md)
 - [UntranslatedRegion](docs/UntranslatedRegion.md)
 - [VEPInfo](docs/VEPInfo.md)
 - [VariantAnnotation](docs/VariantAnnotation.md)
 - [VariantAnnotationSummary](docs/VariantAnnotationSummary.md)
 - [Vcf](docs/Vcf.md)
 - [Version](docs/Version.md)
 - [Vues](docs/Vues.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



