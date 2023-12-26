

# SignalQuery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alteration** | **String** | Matching Alteration (e.g: V600E) |  [optional] |
|**description** | **String** | Optional free-form text |  [optional] |
|**hugoSymbol** | **String** | Matching Hugo Gene Symbol (e.g: BRCA2, BRAF) |  [optional] |
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Match Type |  [optional] |
|**queryType** | [**QueryTypeEnum**](#QueryTypeEnum) | Query Type |  [optional] |
|**region** | **String** | Matching Region (e.g: 13:32968940-32968940) |  [optional] |
|**variant** | **String** | Matching HGVSG Variant (e.g: 17:g.37880220T&gt;C) |  [optional] |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| EXACT | &quot;EXACT&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| NO_MATCH | &quot;NO_MATCH&quot; |



## Enum: QueryTypeEnum

| Name | Value |
|---- | -----|
| GENE | &quot;GENE&quot; |
| ALTERATION | &quot;ALTERATION&quot; |
| VARIANT | &quot;VARIANT&quot; |
| REGION | &quot;REGION&quot; |



