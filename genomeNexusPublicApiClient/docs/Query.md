
# Query

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alteration** | **String** |  |  [optional]
**alterationType** | **String** |  |  [optional]
**consequence** | **String** |  |  [optional]
**entrezGeneId** | **Integer** |  |  [optional]
**hgvs** | **String** |  |  [optional]
**hugoSymbol** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**proteinEnd** | **Integer** |  |  [optional]
**proteinStart** | **Integer** |  |  [optional]
**referenceGenome** | [**ReferenceGenomeEnum**](#ReferenceGenomeEnum) |  |  [optional]
**svType** | [**SvTypeEnum**](#SvTypeEnum) |  |  [optional]
**tumorType** | **String** |  |  [optional]


<a name="ReferenceGenomeEnum"></a>
## Enum: ReferenceGenomeEnum
Name | Value
---- | -----
GRCH37 | &quot;GRCh37&quot;
GRCH38 | &quot;GRCh38&quot;


<a name="SvTypeEnum"></a>
## Enum: SvTypeEnum
Name | Value
---- | -----
DELETION | &quot;DELETION&quot;
TRANSLOCATION | &quot;TRANSLOCATION&quot;
DUPLICATION | &quot;DUPLICATION&quot;
INSERTION | &quot;INSERTION&quot;
INVERSION | &quot;INVERSION&quot;
FUSION | &quot;FUSION&quot;
UNKNOWN | &quot;UNKNOWN&quot;



