
# IndicatorQueryResp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alleleExist** | **Boolean** |  |  [optional]
**dataVersion** | **String** |  |  [optional]
**diagnosticImplications** | [**List&lt;Implication&gt;**](Implication.md) |  |  [optional]
**diagnosticSummary** | **String** |  |  [optional]
**geneExist** | **Boolean** |  |  [optional]
**geneSummary** | **String** |  |  [optional]
**highestDiagnosticImplicationLevel** | [**HighestDiagnosticImplicationLevelEnum**](#HighestDiagnosticImplicationLevelEnum) |  |  [optional]
**highestPrognosticImplicationLevel** | [**HighestPrognosticImplicationLevelEnum**](#HighestPrognosticImplicationLevelEnum) |  |  [optional]
**highestResistanceLevel** | [**HighestResistanceLevelEnum**](#HighestResistanceLevelEnum) |  |  [optional]
**highestSensitiveLevel** | [**HighestSensitiveLevelEnum**](#HighestSensitiveLevelEnum) |  |  [optional]
**hotspot** | **Boolean** |  |  [optional]
**lastUpdate** | **String** |  |  [optional]
**mutationEffect** | [**MutationEffectResp**](MutationEffectResp.md) |  |  [optional]
**oncogenic** | **String** |  |  [optional]
**otherSignificantResistanceLevels** | [**List&lt;OtherSignificantResistanceLevelsEnum&gt;**](#List&lt;OtherSignificantResistanceLevelsEnum&gt;) |  |  [optional]
**otherSignificantSensitiveLevels** | [**List&lt;OtherSignificantSensitiveLevelsEnum&gt;**](#List&lt;OtherSignificantSensitiveLevelsEnum&gt;) |  |  [optional]
**prognosticImplications** | [**List&lt;Implication&gt;**](Implication.md) |  |  [optional]
**prognosticSummary** | **String** |  |  [optional]
**query** | [**Query**](Query.md) |  |  [optional]
**treatments** | [**List&lt;IndicatorQueryTreatment&gt;**](IndicatorQueryTreatment.md) |  |  [optional]
**tumorTypeSummary** | **String** |  |  [optional]
**variantExist** | **Boolean** |  |  [optional]
**variantSummary** | **String** |  |  [optional]
**vus** | **Boolean** |  |  [optional]


<a name="HighestDiagnosticImplicationLevelEnum"></a>
## Enum: HighestDiagnosticImplicationLevelEnum
Name | Value
---- | -----
LEVEL_0 | &quot;LEVEL_0&quot;
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_2A | &quot;LEVEL_2A&quot;
LEVEL_2B | &quot;LEVEL_2B&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_R3 | &quot;LEVEL_R3&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
NO | &quot;NO&quot;


<a name="HighestPrognosticImplicationLevelEnum"></a>
## Enum: HighestPrognosticImplicationLevelEnum
Name | Value
---- | -----
LEVEL_0 | &quot;LEVEL_0&quot;
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_2A | &quot;LEVEL_2A&quot;
LEVEL_2B | &quot;LEVEL_2B&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_R3 | &quot;LEVEL_R3&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
NO | &quot;NO&quot;


<a name="HighestResistanceLevelEnum"></a>
## Enum: HighestResistanceLevelEnum
Name | Value
---- | -----
LEVEL_0 | &quot;LEVEL_0&quot;
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_2A | &quot;LEVEL_2A&quot;
LEVEL_2B | &quot;LEVEL_2B&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_R3 | &quot;LEVEL_R3&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
NO | &quot;NO&quot;


<a name="HighestSensitiveLevelEnum"></a>
## Enum: HighestSensitiveLevelEnum
Name | Value
---- | -----
LEVEL_0 | &quot;LEVEL_0&quot;
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_2A | &quot;LEVEL_2A&quot;
LEVEL_2B | &quot;LEVEL_2B&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_R3 | &quot;LEVEL_R3&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
NO | &quot;NO&quot;


<a name="List<OtherSignificantResistanceLevelsEnum>"></a>
## Enum: List&lt;OtherSignificantResistanceLevelsEnum&gt;
Name | Value
---- | -----
LEVEL_0 | &quot;LEVEL_0&quot;
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_2A | &quot;LEVEL_2A&quot;
LEVEL_2B | &quot;LEVEL_2B&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_R3 | &quot;LEVEL_R3&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
NO | &quot;NO&quot;


<a name="List<OtherSignificantSensitiveLevelsEnum>"></a>
## Enum: List&lt;OtherSignificantSensitiveLevelsEnum&gt;
Name | Value
---- | -----
LEVEL_0 | &quot;LEVEL_0&quot;
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_2A | &quot;LEVEL_2A&quot;
LEVEL_2B | &quot;LEVEL_2B&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_R3 | &quot;LEVEL_R3&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
NO | &quot;NO&quot;



