<div align="left">

[![Visit Lucca](./header.png)](https://lucca-hr.com)

# [Lucca](https://lucca-hr.com)

Welcome on the documentation for the Timmi Timesheet API.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lucca&serviceName=Timmi%20Timesheet&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lucca-timmi-timesheet-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lucca-timmi-timesheet-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lucca-timmi-timesheet-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://example.ilucca.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ReportsApi* | [**createBasedOnTemplate**](docs/ReportsApi.md#createBasedOnTemplate) | **POST** /timmi-timesheet/api/reports | Create a new Report
*ReportsApi* | [**downloadCsvReport**](docs/ReportsApi.md#downloadCsvReport) | **GET** /timmi-timesheet/api/reports/{reportId}/download-csv | Download Report as CSV
*ReportsApi* | [**downloadExcelReport**](docs/ReportsApi.md#downloadExcelReport) | **GET** /timmi-timesheet/api/reports/{reportId}/download-excel | Download Report as Excel
*TimeEntriesApi* | [**createMultiple**](docs/TimeEntriesApi.md#createMultiple) | **POST** /api/v3/timeentries | Create new TimeEntries
*TimeEntriesApi* | [**deleteMultiple**](docs/TimeEntriesApi.md#deleteMultiple) | **DELETE** /api/v3/timeentries | Delete multiple TimeEntries
*TimeEntriesApi* | [**getById**](docs/TimeEntriesApi.md#getById) | **GET** /api/v3/timeentries/{timeEntryId} | Get a TimeEntry by id
*TimeEntriesApi* | [**listTimeEntries**](docs/TimeEntriesApi.md#listTimeEntries) | **GET** /api/v3/timeentries | List TimeEntries
*TimeEntriesApi* | [**removeById**](docs/TimeEntriesApi.md#removeById) | **DELETE** /api/v3/timeentries/{timeEntryId} | Delete a TimeEntry by id
*TimeEntriesApi* | [**updateById**](docs/TimeEntriesApi.md#updateById) | **PUT** /api/v3/timeentries/{timeEntryId} | Update a TimeEntry by id
*TimeEntriesApi* | [**updateMultiple**](docs/TimeEntriesApi.md#updateMultiple) | **PUT** /api/v3/timeentries | Update multiple TimeEntries
*TimesheetsApi* | [**list**](docs/TimesheetsApi.md#list) | **GET** /api/v3/timmitimesheets | List timesheets
*TimesheetsApi* | [**listDue**](docs/TimesheetsApi.md#listDue) | **GET** /api/v3/timmitimesheets/remindable | List due timesheets
*WorkflowApi* | [**approveTimesheetsById**](docs/WorkflowApi.md#approveTimesheetsById) | **POST** /timmi/services/workflow/approve | Approve Timesheets by id
*WorkflowApi* | [**cancelTimesheetById**](docs/WorkflowApi.md#cancelTimesheetById) | **POST** /timmi/services/workflow/cancel | Cancel Timesheets by id
*WorkflowApi* | [**denyTimesheetById**](docs/WorkflowApi.md#denyTimesheetById) | **POST** /timmi/services/workflow/deny | Deny Timesheets by id
*WorkflowApi* | [**invalidateTimesheetById**](docs/WorkflowApi.md#invalidateTimesheetById) | **POST** /timmi/services/workflow/invalidate | Invalidate Timesheets by id
*WorkflowApi* | [**sendReminderEmail**](docs/WorkflowApi.md#sendReminderEmail) | **POST** /timmi/services/workflow/remind | Remind Timesheets
*WorkflowApi* | [**submitTimesheet**](docs/WorkflowApi.md#submitTimesheet) | **POST** /timmi/services/workflow/submit | Submit Timesheets


## Documentation for Models

 - [AxisSection](docs/AxisSection.md)
 - [Report](docs/Report.md)
 - [ReportColumnsInner](docs/ReportColumnsInner.md)
 - [ReportFiltersInner](docs/ReportFiltersInner.md)
 - [TimeEntriesCreateMultipleResponse](docs/TimeEntriesCreateMultipleResponse.md)
 - [TimeEntriesDeleteMultipleRequestInner](docs/TimeEntriesDeleteMultipleRequestInner.md)
 - [TimeEntriesGetByIdResponse](docs/TimeEntriesGetByIdResponse.md)
 - [TimeEntriesListTimeEntriesResponse](docs/TimeEntriesListTimeEntriesResponse.md)
 - [TimeEntriesListTimeEntriesResponseData](docs/TimeEntriesListTimeEntriesResponseData.md)
 - [TimeEntriesUpdateByIdResponse](docs/TimeEntriesUpdateByIdResponse.md)
 - [TimeEntriesUpdateMultipleResponse](docs/TimeEntriesUpdateMultipleResponse.md)
 - [TimeEntry](docs/TimeEntry.md)
 - [TimeEntryComment](docs/TimeEntryComment.md)
 - [Timesheet](docs/Timesheet.md)
 - [TimesheetOwner](docs/TimesheetOwner.md)
 - [TimesheetOwnerAllOf](docs/TimesheetOwnerAllOf.md)
 - [TimesheetUser](docs/TimesheetUser.md)
 - [TimesheetsListDueResponse](docs/TimesheetsListDueResponse.md)
 - [TimesheetsListResponse](docs/TimesheetsListResponse.md)
 - [TimesheetsListResponseData](docs/TimesheetsListResponseData.md)
 - [Transfer](docs/Transfer.md)
 - [WorkflowApproveTimesheetsByIdRequest](docs/WorkflowApproveTimesheetsByIdRequest.md)
 - [WorkflowApproveTimesheetsByIdRequestTimesheetsInner](docs/WorkflowApproveTimesheetsByIdRequestTimesheetsInner.md)
 - [WorkflowCancelTimesheetByIdRequest](docs/WorkflowCancelTimesheetByIdRequest.md)
 - [WorkflowCancelTimesheetByIdRequestTimesheetsInner](docs/WorkflowCancelTimesheetByIdRequestTimesheetsInner.md)
 - [WorkflowDenyTimesheetByIdRequest](docs/WorkflowDenyTimesheetByIdRequest.md)
 - [WorkflowDenyTimesheetByIdRequestTimesheetsInner](docs/WorkflowDenyTimesheetByIdRequestTimesheetsInner.md)
 - [WorkflowInvalidateTimesheetByIdRequest](docs/WorkflowInvalidateTimesheetByIdRequest.md)
 - [WorkflowSendReminderEmailRequest](docs/WorkflowSendReminderEmailRequest.md)
 - [WorkflowSendReminderEmailRequestTimesheetsInner](docs/WorkflowSendReminderEmailRequestTimesheetsInner.md)
 - [WorkflowSendReminderEmailResponse](docs/WorkflowSendReminderEmailResponse.md)
 - [WorkflowSendReminderEmailResponseItemsInner](docs/WorkflowSendReminderEmailResponseItemsInner.md)
 - [WorkflowSubmitTimesheetRequest](docs/WorkflowSubmitTimesheetRequest.md)
 - [WorkflowSubmitTimesheetRequestTimesheetsInner](docs/WorkflowSubmitTimesheetRequestTimesheetsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
