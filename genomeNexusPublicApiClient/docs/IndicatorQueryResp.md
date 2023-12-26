

# IndicatorQueryResp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alleleExist** | **Boolean** |  |  [optional] |
|**dataVersion** | **String** |  |  [optional] |
|**diagnosticImplications** | [**List&lt;Implication&gt;**](Implication.md) |  |  [optional] |
|**diagnosticSummary** | **String** |  |  [optional] |
|**geneExist** | **Boolean** |  |  [optional] |
|**geneSummary** | **String** |  |  [optional] |
|**highestDiagnosticImplicationLevel** | [**HighestDiagnosticImplicationLevelEnum**](#HighestDiagnosticImplicationLevelEnum) |  |  [optional] |
|**highestFdaLevel** | [**HighestFdaLevelEnum**](#HighestFdaLevelEnum) |  |  [optional] |
|**highestPrognosticImplicationLevel** | [**HighestPrognosticImplicationLevelEnum**](#HighestPrognosticImplicationLevelEnum) |  |  [optional] |
|**highestResistanceLevel** | [**HighestResistanceLevelEnum**](#HighestResistanceLevelEnum) |  |  [optional] |
|**highestSensitiveLevel** | [**HighestSensitiveLevelEnum**](#HighestSensitiveLevelEnum) |  |  [optional] |
|**hotspot** | **Boolean** |  |  [optional] |
|**lastUpdate** | **String** |  |  [optional] |
|**mutationEffect** | [**MutationEffectResp**](MutationEffectResp.md) |  |  [optional] |
|**oncogenic** | **String** |  |  [optional] |
|**otherSignificantResistanceLevels** | [**List&lt;OtherSignificantResistanceLevelsEnum&gt;**](#List&lt;OtherSignificantResistanceLevelsEnum&gt;) |  |  [optional] |
|**otherSignificantSensitiveLevels** | [**List&lt;OtherSignificantSensitiveLevelsEnum&gt;**](#List&lt;OtherSignificantSensitiveLevelsEnum&gt;) |  |  [optional] |
|**prognosticImplications** | [**List&lt;Implication&gt;**](Implication.md) |  |  [optional] |
|**prognosticSummary** | **String** |  |  [optional] |
|**query** | [**Query**](Query.md) |  |  [optional] |
|**treatments** | [**List&lt;IndicatorQueryTreatment&gt;**](IndicatorQueryTreatment.md) |  |  [optional] |
|**tumorTypeSummary** | **String** |  |  [optional] |
|**variantExist** | **Boolean** |  |  [optional] |
|**variantSummary** | **String** |  |  [optional] |
|**vus** | **Boolean** |  |  [optional] |



## Enum: HighestDiagnosticImplicationLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



## Enum: HighestFdaLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



## Enum: HighestPrognosticImplicationLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



## Enum: HighestResistanceLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



## Enum: HighestSensitiveLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



## Enum: List&lt;OtherSignificantResistanceLevelsEnum&gt;

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



## Enum: List&lt;OtherSignificantSensitiveLevelsEnum&gt;

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3A | &quot;LEVEL_3A&quot; |
| LEVEL_3B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



