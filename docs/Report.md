

# Report

## Status  The generation of a report content is a background process. As long as this process is not complete, the report status stays `pending`. Once the report is complete, its status is set to `done`. May an error be encountered while generating its content, then its status is set to `error`.  The report content can only be viewed and downloaded once it is `done`.  ## Start & end dates  Start `startsOn` and end `endsOn` dates can be left `null`. In this case, default dates from the report-template are applied.  ## Filters  Filters are usually set in the report-template. But these can be overriden for a given report.  ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] [readonly] |
|**templateId** | **String** |  |  |
|**startsOn** | **LocalDate** |  |  [optional] |
|**endsOn** | **LocalDate** |  |  [optional] |
|**filters** | [**List&lt;ReportFiltersInner&gt;**](ReportFiltersInner.md) |  |  [optional] |
|**columns** | [**List&lt;ReportColumnsInner&gt;**](ReportColumnsInner.md) |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| DONE | &quot;done&quot; |
| ERROR | &quot;error&quot; |



