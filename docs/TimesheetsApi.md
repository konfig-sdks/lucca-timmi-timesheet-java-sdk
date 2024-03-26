# TimesheetsApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](TimesheetsApi.md#list) | **GET** /api/v3/timmitimesheets | List timesheets |
| [**listDue**](TimesheetsApi.md#listDue) | **GET** /api/v3/timmitimesheets/remindable | List due timesheets |


<a name="list"></a>
# **list**
> TimesheetsListResponse list().ownerId(ownerId).startsOn(startsOn).status(status).endsOn(endsOn).execute();

List timesheets

List all timesheets satisfying query filters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<OwnerId> ownerId = Arrays.asList(null); // User's identifier.
    String startsOn = "between,2022-01-01,2022-02-01"; // Filter on the start date of the timesheet.
    List<Status> status = Arrays.asList(null); // Filter on the timesheet workflow status.
    String endsOn = "until,2022-01-01"; // Filter on the end date of the timesheet.
    try {
      TimesheetsListResponse result = client
              .timesheets
              .list()
              .ownerId(ownerId)
              .startsOn(startsOn)
              .status(status)
              .endsOn(endsOn)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsListResponse> response = client
              .timesheets
              .list()
              .ownerId(ownerId)
              .startsOn(startsOn)
              .status(status)
              .endsOn(endsOn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#list");
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
| **ownerId** | [**List&lt;OwnerId&gt;**](OwnerId.md)| User&#39;s identifier. | [optional] |
| **startsOn** | **String**| Filter on the start date of the timesheet. | [optional] |
| **status** | [**List&lt;Status&gt;**](Status.md)| Filter on the timesheet workflow status. | [optional] |
| **endsOn** | **String**| Filter on the end date of the timesheet. | [optional] |

### Return type

[**TimesheetsListResponse**](TimesheetsListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listDue"></a>
# **listDue**
> TimesheetsListDueResponse listDue().ownerIds(ownerIds).legalEntityIds(legalEntityIds).managerIds(managerIds).start(start).end(end).execute();

List due timesheets

List timesheet that are not yet submitted (status: 0).  You must filter on either &#x60;ownerIds&#x60;, &#x60;managerIds&#x60; or &#x60;legalEntityIds&#x60;. As long as a timesheet is not submitted, its unique identifier is equal to zero.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<Integer> ownerIds = Arrays.asList(); // List unique identifier of submitters.
    List<Integer> legalEntityIds = Arrays.asList(); // List unique identifier of submitters' legal establishments.
    List<Integer> managerIds = Arrays.asList(); // List unique identifier of submitters' manager.
    LocalDate start = LocalDate.now(); // Prevent older timesheets to be returned.
    LocalDate end = LocalDate.now(); // Prevent earlier timesheets to be returned (date excluded). Defaults to today when not sent.
    try {
      TimesheetsListDueResponse result = client
              .timesheets
              .listDue()
              .ownerIds(ownerIds)
              .legalEntityIds(legalEntityIds)
              .managerIds(managerIds)
              .start(start)
              .end(end)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#listDue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsListDueResponse> response = client
              .timesheets
              .listDue()
              .ownerIds(ownerIds)
              .legalEntityIds(legalEntityIds)
              .managerIds(managerIds)
              .start(start)
              .end(end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#listDue");
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
| **ownerIds** | [**List&lt;Integer&gt;**](Integer.md)| List unique identifier of submitters. | [optional] |
| **legalEntityIds** | [**List&lt;Integer&gt;**](Integer.md)| List unique identifier of submitters&#39; legal establishments. | [optional] |
| **managerIds** | [**List&lt;Integer&gt;**](Integer.md)| List unique identifier of submitters&#39; manager. | [optional] |
| **start** | **LocalDate**| Prevent older timesheets to be returned. | [optional] |
| **end** | **LocalDate**| Prevent earlier timesheets to be returned (date excluded). Defaults to today when not sent. | [optional] |

### Return type

[**TimesheetsListDueResponse**](TimesheetsListDueResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

