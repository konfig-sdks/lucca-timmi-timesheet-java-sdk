# WorkflowApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveTimesheetsById**](WorkflowApi.md#approveTimesheetsById) | **POST** /timmi/services/workflow/approve | Approve Timesheets by id |
| [**cancelTimesheetById**](WorkflowApi.md#cancelTimesheetById) | **POST** /timmi/services/workflow/cancel | Cancel Timesheets by id |
| [**denyTimesheetById**](WorkflowApi.md#denyTimesheetById) | **POST** /timmi/services/workflow/deny | Deny Timesheets by id |
| [**invalidateTimesheetById**](WorkflowApi.md#invalidateTimesheetById) | **POST** /timmi/services/workflow/invalidate | Invalidate Timesheets by id |
| [**sendReminderEmail**](WorkflowApi.md#sendReminderEmail) | **POST** /timmi/services/workflow/remind | Remind Timesheets |
| [**submitTimesheet**](WorkflowApi.md#submitTimesheet) | **POST** /timmi/services/workflow/submit | Submit Timesheets |


<a name="approveTimesheetsById"></a>
# **approveTimesheetsById**
> WorkflowSendReminderEmailResponse approveTimesheetsById().workflowApproveTimesheetsByIdRequest(workflowApproveTimesheetsByIdRequest).execute();

Approve Timesheets by id

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](../reference/Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1api~1timesheets~1{id}~1approve/post)  Multiple approvals can be required, depending on the configuration.  Once all approvals needed are satisfied, the timesheet status is set to &#x60;2: Approved&#x60;.  Comprised TimeEntries can only be modified by rejecting the timesheet through the \&quot;invalidate\&quot; operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<WorkflowApproveTimesheetsByIdRequestTimesheetsInner> timesheets = Arrays.asList();
    try {
      WorkflowSendReminderEmailResponse result = client
              .workflow
              .approveTimesheetsById()
              .timesheets(timesheets)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#approveTimesheetsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSendReminderEmailResponse> response = client
              .workflow
              .approveTimesheetsById()
              .timesheets(timesheets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#approveTimesheetsById");
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
| **workflowApproveTimesheetsByIdRequest** | [**WorkflowApproveTimesheetsByIdRequest**](WorkflowApproveTimesheetsByIdRequest.md)|  | [optional] |

### Return type

[**WorkflowSendReminderEmailResponse**](WorkflowSendReminderEmailResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="cancelTimesheetById"></a>
# **cancelTimesheetById**
> WorkflowSendReminderEmailResponse cancelTimesheetById().workflowCancelTimesheetByIdRequest(workflowCancelTimesheetByIdRequest).execute();

Cancel Timesheets by id

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](../reference/Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1api~1timesheets~1{id}~1cancel/post)  Cancel a timesheet&#39;s submission. Can only be achieved by the original submitter as long as the timesheet&#39;s not approved.  Sets the timesheet status to &#x60;3&#x60; (rejected).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<WorkflowCancelTimesheetByIdRequestTimesheetsInner> timesheets = Arrays.asList();
    try {
      WorkflowSendReminderEmailResponse result = client
              .workflow
              .cancelTimesheetById()
              .timesheets(timesheets)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#cancelTimesheetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSendReminderEmailResponse> response = client
              .workflow
              .cancelTimesheetById()
              .timesheets(timesheets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#cancelTimesheetById");
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
| **workflowCancelTimesheetByIdRequest** | [**WorkflowCancelTimesheetByIdRequest**](WorkflowCancelTimesheetByIdRequest.md)|  | [optional] |

### Return type

[**WorkflowSendReminderEmailResponse**](WorkflowSendReminderEmailResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="denyTimesheetById"></a>
# **denyTimesheetById**
> WorkflowSendReminderEmailResponse denyTimesheetById().workflowDenyTimesheetByIdRequest(workflowDenyTimesheetByIdRequest).execute();

Deny Timesheets by id

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](../reference/Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1api~1timesheets~1{id}~1deny/post)  Denies a submitted timesheet pending approval. Sets its status to &#x60;3&#x60; (rejected) and a new timesheet may be submitted for this User and [StartsOn - EndsOn[.  Comment is mandatory.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<WorkflowDenyTimesheetByIdRequestTimesheetsInner> timesheets = Arrays.asList();
    try {
      WorkflowSendReminderEmailResponse result = client
              .workflow
              .denyTimesheetById()
              .timesheets(timesheets)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#denyTimesheetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSendReminderEmailResponse> response = client
              .workflow
              .denyTimesheetById()
              .timesheets(timesheets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#denyTimesheetById");
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
| **workflowDenyTimesheetByIdRequest** | [**WorkflowDenyTimesheetByIdRequest**](WorkflowDenyTimesheetByIdRequest.md)|  | [optional] |

### Return type

[**WorkflowSendReminderEmailResponse**](WorkflowSendReminderEmailResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="invalidateTimesheetById"></a>
# **invalidateTimesheetById**
> WorkflowSendReminderEmailResponse invalidateTimesheetById().workflowInvalidateTimesheetByIdRequest(workflowInvalidateTimesheetByIdRequest).execute();

Invalidate Timesheets by id

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](../reference/Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1api~1timesheets~1{id}~1invalidate/post)  Rejects an approved timesheet. Sets its status to &#x60;3&#x60; (rejected). A new timesheet may then be submitted for this User and [StartsOn - EndsOn[.  Comment is mandatory.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<WorkflowCancelTimesheetByIdRequestTimesheetsInner> timesheets = Arrays.asList();
    try {
      WorkflowSendReminderEmailResponse result = client
              .workflow
              .invalidateTimesheetById()
              .timesheets(timesheets)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#invalidateTimesheetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSendReminderEmailResponse> response = client
              .workflow
              .invalidateTimesheetById()
              .timesheets(timesheets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#invalidateTimesheetById");
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
| **workflowInvalidateTimesheetByIdRequest** | [**WorkflowInvalidateTimesheetByIdRequest**](WorkflowInvalidateTimesheetByIdRequest.md)|  | [optional] |

### Return type

[**WorkflowSendReminderEmailResponse**](WorkflowSendReminderEmailResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="sendReminderEmail"></a>
# **sendReminderEmail**
> WorkflowSendReminderEmailResponse sendReminderEmail().workflowSendReminderEmailRequest(workflowSendReminderEmailRequest).execute();

Remind Timesheets

Remind user of a due timesheet. Sends him/her an email.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<WorkflowSendReminderEmailRequestTimesheetsInner> timesheets = Arrays.asList();
    try {
      WorkflowSendReminderEmailResponse result = client
              .workflow
              .sendReminderEmail()
              .timesheets(timesheets)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#sendReminderEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSendReminderEmailResponse> response = client
              .workflow
              .sendReminderEmail()
              .timesheets(timesheets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#sendReminderEmail");
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
| **workflowSendReminderEmailRequest** | [**WorkflowSendReminderEmailRequest**](WorkflowSendReminderEmailRequest.md)| Timesheets are identified by startsAt, endsAt &amp; ownerId. | [optional] |

### Return type

[**WorkflowSendReminderEmailResponse**](WorkflowSendReminderEmailResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="submitTimesheet"></a>
# **submitTimesheet**
> WorkflowSendReminderEmailResponse submitTimesheet().workflowSubmitTimesheetRequest(workflowSubmitTimesheetRequest).execute();

Submit Timesheets

&lt;!-- theme: warning --&gt; &gt; #### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](../reference/Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1api~1timesheets~1submit/post)  Timesheet is created and its status is set to &#x60;1&#x60; (pending approval). In some cases, timesheet may then be automatically approved (&#x60;status: 2&#x60;), depending on the application settings.  Once submitted, all comprised TimeEntries for user can no longer be modified. In order to be able to modify them, the timesheet must first be rejected through &#x60;cancel&#x60;, &#x60;deny&#x60; or &#x60;invalidate&#x60; operations (depends on the current timesheet status).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    List<WorkflowSubmitTimesheetRequestTimesheetsInner> timesheets = Arrays.asList();
    try {
      WorkflowSendReminderEmailResponse result = client
              .workflow
              .submitTimesheet()
              .timesheets(timesheets)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#submitTimesheet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowSendReminderEmailResponse> response = client
              .workflow
              .submitTimesheet()
              .timesheets(timesheets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#submitTimesheet");
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
| **workflowSubmitTimesheetRequest** | [**WorkflowSubmitTimesheetRequest**](WorkflowSubmitTimesheetRequest.md)| Timesheets are identified by startsAt, endsAt &amp; ownerId. | [optional] |

### Return type

[**WorkflowSendReminderEmailResponse**](WorkflowSendReminderEmailResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


