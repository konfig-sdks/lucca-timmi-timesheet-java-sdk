# ReportsApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBasedOnTemplate**](ReportsApi.md#createBasedOnTemplate) | **POST** /timmi-timesheet/api/reports | Create a new Report |
| [**downloadCsvReport**](ReportsApi.md#downloadCsvReport) | **GET** /timmi-timesheet/api/reports/{reportId}/download-csv | Download Report as CSV |
| [**downloadExcelReport**](ReportsApi.md#downloadExcelReport) | **GET** /timmi-timesheet/api/reports/{reportId}/download-excel | Download Report as Excel |


<a name="createBasedOnTemplate"></a>
# **createBasedOnTemplate**
> Report createBasedOnTemplate().report(report).execute();

Create a new Report

&lt;!-- theme: info --&gt; &gt; This endpoint does not adhere to the \&quot;v3 API endpoints\&quot; principles. The \&quot;fields\&quot; query parameter is not supported, but all fields are systematically returned.  A report can only be created based on an existing report-template. So you first need to retrieve the report-template unique identifier &#x60;templateId&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    String templateId = "templateId_example";
    Integer id = 56;
    String status = "pending";
    String name = "name_example";
    LocalDate startsOn = LocalDate.now();
    LocalDate endsOn = LocalDate.now();
    List<ReportFiltersInner> filters = Arrays.asList();
    List<ReportColumnsInner> columns = Arrays.asList();
    try {
      Report result = client
              .reports
              .createBasedOnTemplate(templateId)
              .id(id)
              .status(status)
              .name(name)
              .startsOn(startsOn)
              .endsOn(endsOn)
              .filters(filters)
              .columns(columns)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getName());
      System.out.println(result.getTemplateId());
      System.out.println(result.getStartsOn());
      System.out.println(result.getEndsOn());
      System.out.println(result.getFilters());
      System.out.println(result.getColumns());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#createBasedOnTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Report> response = client
              .reports
              .createBasedOnTemplate(templateId)
              .id(id)
              .status(status)
              .name(name)
              .startsOn(startsOn)
              .endsOn(endsOn)
              .filters(filters)
              .columns(columns)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#createBasedOnTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **report** | [**Report**](Report.md)|  | [optional] |

### Return type

[**Report**](Report.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a name="downloadCsvReport"></a>
# **downloadCsvReport**
> String downloadCsvReport(reportId).execute();

Download Report as CSV

&lt;!-- theme: info --&gt; &gt; This endpoint does not adhere to the \&quot;v3 API endpoints\&quot; principles.  Download a report content as an CSV file &#x60;.csv&#x60;.  Column delimiter and numbers formating depends on the authentified user&#39;s culture.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    Integer reportId = 56; // Identifier of the report.
    try {
      String result = client
              .reports
              .downloadCsvReport(reportId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadCsvReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .reports
              .downloadCsvReport(reportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadCsvReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **Integer**| Identifier of the report. | |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="downloadExcelReport"></a>
# **downloadExcelReport**
> String downloadExcelReport(reportId).execute();

Download Report as Excel

&lt;!-- theme: info --&gt; &gt; This endpoint does not adhere to the \&quot;v3 API endpoints\&quot; principles.  Download a report content as an Excel file &#x60;.xls&#x60;.  Column delimiter and numbers formating depends on the authentified user&#39;s culture.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    Integer reportId = 56; // Identifier of the report.
    try {
      String result = client
              .reports
              .downloadExcelReport(reportId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadExcelReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .reports
              .downloadExcelReport(reportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadExcelReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **Integer**| Identifier of the report. | |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

