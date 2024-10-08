
# VariantAnnotationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alphaMissense** | [**AlphaMissense**](AlphaMissense.md) |  |  [optional]
**assemblyName** | **String** | Assembly name |  [optional]
**canonicalTranscriptId** | **String** | Canonical transcript id |  [optional]
**genomicLocation** | [**GenomicLocation**](GenomicLocation.md) | Genomic location |  [optional]
**intergenicConsequenceSummaries** | [**List&lt;IntergenicConsequenceSummary&gt;**](IntergenicConsequenceSummary.md) |  |  [optional]
**strandSign** | **String** | Strand (- or +) |  [optional]
**transcriptConsequenceSummaries** | [**List&lt;TranscriptConsequenceSummary&gt;**](TranscriptConsequenceSummary.md) | All transcript consequence summaries | 
**transcriptConsequenceSummary** | [**TranscriptConsequenceSummary**](TranscriptConsequenceSummary.md) | Most impactful transcript consequence of canonical transcript or if non-existent any transcript | 
**transcriptConsequences** | [**List&lt;TranscriptConsequenceSummary&gt;**](TranscriptConsequenceSummary.md) | (Deprecated) Transcript consequence summaries (list of one when using annotation/, multiple when using annotation/summary/ | 
**variant** | **String** | Variant key | 
**variantType** | **String** | Variant type |  [optional]
**vues** | [**Vues**](Vues.md) |  |  [optional]



