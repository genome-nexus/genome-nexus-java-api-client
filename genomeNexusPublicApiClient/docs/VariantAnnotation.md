

# VariantAnnotation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alleleString** | **String** | Allele string (e.g: A/T) |  [optional] |
|**annotationJSON** | **String** | Annotation data as JSON string |  [optional] |
|**annotationSummary** | [**VariantAnnotationSummary**](VariantAnnotationSummary.md) |  |  [optional] |
|**assemblyName** | **String** | NCBI build number |  [optional] |
|**clinvar** | [**ClinvarAnnotation**](ClinvarAnnotation.md) |  |  [optional] |
|**colocatedVariants** | [**List&lt;ColocatedVariant&gt;**](ColocatedVariant.md) |  |  [optional] |
|**end** | **Integer** | End position |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**genomicLocationExplanation** | **String** |  |  [optional] |
|**hgvsg** | **String** |  |  [optional] |
|**hotspots** | [**HotspotAnnotation**](HotspotAnnotation.md) |  |  [optional] |
|**id** | **String** | Variant id |  |
|**intergenicConsequences** | [**List&lt;IntergenicConsequences&gt;**](IntergenicConsequences.md) | intergenicConsequences |  |
|**mostSevereConsequence** | **String** | Most severe consequence |  [optional] |
|**mutationAssessor** | [**MutationAssessorAnnotation**](MutationAssessorAnnotation.md) |  |  [optional] |
|**myVariantInfo** | [**MyVariantInfoAnnotation**](MyVariantInfoAnnotation.md) |  |  [optional] |
|**nucleotideContext** | [**NucleotideContextAnnotation**](NucleotideContextAnnotation.md) |  |  [optional] |
|**oncokb** | [**OncokbAnnotation**](OncokbAnnotation.md) |  |  [optional] |
|**originalVariantQuery** | **String** | Original variant query |  |
|**ptms** | [**PtmAnnotation**](PtmAnnotation.md) |  |  [optional] |
|**seqRegionName** | **String** | Chromosome |  [optional] |
|**signalAnnotation** | [**SignalAnnotation**](SignalAnnotation.md) |  |  [optional] |
|**start** | **Integer** | Start position |  [optional] |
|**strand** | **Integer** | Strand (negative or positive) |  [optional] |
|**successfullyAnnotated** | **Boolean** | Status flag indicating whether variant was succesfully annotated |  [optional] |
|**transcriptConsequences** | [**List&lt;TranscriptConsequence&gt;**](TranscriptConsequence.md) | List of transcripts |  [optional] |
|**variant** | **String** | Variant key |  |



