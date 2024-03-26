# TimeEntriesApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMultiple**](TimeEntriesApi.md#createMultiple) | **POST** /api/v3/timeentries | Create new TimeEntries |
| [**deleteMultiple**](TimeEntriesApi.md#deleteMultiple) | **DELETE** /api/v3/timeentries | Delete multiple TimeEntries |
| [**getById**](TimeEntriesApi.md#getById) | **GET** /api/v3/timeentries/{timeEntryId} | Get a TimeEntry by id |
| [**listTimeEntries**](TimeEntriesApi.md#listTimeEntries) | **GET** /api/v3/timeentries | List TimeEntries |
| [**removeById**](TimeEntriesApi.md#removeById) | **DELETE** /api/v3/timeentries/{timeEntryId} | Delete a TimeEntry by id |
| [**updateById**](TimeEntriesApi.md#updateById) | **PUT** /api/v3/timeentries/{timeEntryId} | Update a TimeEntry by id |
| [**updateMultiple**](TimeEntriesApi.md#updateMultiple) | **PUT** /api/v3/timeentries | Update multiple TimeEntries |


<a name="createMultiple"></a>
# **createMultiple**
> TimeEntriesCreateMultipleResponse createMultiple().body(body).execute();

Create new TimeEntries

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1services~1time-entries/put)  You can create a single or multiple TimeEntries for a given user.  Beware, a new TimeEntry cannot intersect with a submitted or approved timesheet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    try {
      TimeEntriesCreateMultipleResponse result = client
              .timeEntries
              .createMultiple()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#createMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesCreateMultipleResponse> response = client
              .timeEntries
              .createMultiple()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#createMultiple");
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
| **body** | **Object**| Create a single of multiple TimeEntry (toggle body type). | [optional] |

### Return type

[**TimeEntriesCreateMultipleResponse**](TimeEntriesCreateMultipleResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteMultiple"></a>
# **deleteMultiple**
> deleteMultiple().timeEntriesDeleteMultipleRequestInner(timeEntriesDeleteMultipleRequestInner).execute();

Delete multiple TimeEntries

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1services~1time-entries/put)  Delete one or several TimeEntries. The \&quot;id\&quot; field of each TimeEntry must be sent and correspond to an existing TimeEntry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    try {
      client
              .timeEntries
              .deleteMultiple()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#deleteMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeEntries
              .deleteMultiple()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#deleteMultiple");
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
| **timeEntriesDeleteMultipleRequestInner** | [**List&lt;TimeEntriesDeleteMultipleRequestInner&gt;**](TimeEntriesDeleteMultipleRequestInner.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> TimeEntriesGetByIdResponse getById(timeEntryId).execute();

Get a TimeEntry by id

Retrieve a single TimeEntry identified by its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    Integer timeEntryId = 56; // Identifier of the TimeEntry.
    try {
      TimeEntriesGetByIdResponse result = client
              .timeEntries
              .getById(timeEntryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesGetByIdResponse> response = client
              .timeEntries
              .getById(timeEntryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#getById");
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
| **timeEntryId** | **Integer**| Identifier of the TimeEntry. | |

### Return type

[**TimeEntriesGetByIdResponse**](TimeEntriesGetByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listTimeEntries"></a>
# **listTimeEntries**
> TimeEntriesListTimeEntriesResponse listTimeEntries(paging).ownerId(ownerId).startsAt(startsAt).axisSectionsId(axisSectionsId).axisSectionsCode(axisSectionsCode).modifiedAt(modifiedAt).archivedAt(archivedAt).execute();

List TimeEntries

Retrieve a list of TimeEntries.  The &#x60;startsAt&#x60; query parameter can operate comparisons with a given date-time value: - &#x60;?startsAt&#x3D;2021-01-01&#x60;: strict equality. - &#x60;?startsAt&#x3D;since,2021-01-01&#x60;: greater than or equal. - &#x60;?startsAt&#x3D;until,2021-01-01&#x60;: lower than or equal. - &#x60;?startsAt&#x3D;between,2021-01-01,2021-01-31&#x60;: comprised between two dates.  To retrieve the total count of all TimeEntries (on all pages), please include the field &#x60;?field&#x3D;collection.count&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    String paging = "100,0"; // {offset},{limit}. Defaults to 0,1000.
    List<Object> ownerId = null; // User's identifier
    String startsAt = "between,2021-01-01,2021-02-01"; // {comparator},{date-time}
    List<Object> axisSectionsId = null; // Filter on a comma-separated list of AxisSections identifiers.
    List<Object> axisSectionsCode = null; // Filter on a comma-separated list of AxisSections codes.
    String modifiedAt = "since,2021-01-01T08:45:23Z"; // {comparator},{date-time}
    String archivedAt = "since,2021-01-01T08:45:23Z"; // {comparator},{date-time}
    try {
      TimeEntriesListTimeEntriesResponse result = client
              .timeEntries
              .listTimeEntries(paging)
              .ownerId(ownerId)
              .startsAt(startsAt)
              .axisSectionsId(axisSectionsId)
              .axisSectionsCode(axisSectionsCode)
              .modifiedAt(modifiedAt)
              .archivedAt(archivedAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#listTimeEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesListTimeEntriesResponse> response = client
              .timeEntries
              .listTimeEntries(paging)
              .ownerId(ownerId)
              .startsAt(startsAt)
              .axisSectionsId(axisSectionsId)
              .axisSectionsCode(axisSectionsCode)
              .modifiedAt(modifiedAt)
              .archivedAt(archivedAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#listTimeEntries");
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
| **paging** | **String**| {offset},{limit}. Defaults to 0,1000. | |
| **ownerId** | [**List&lt;Object&gt;**](Object.md)| User&#39;s identifier | [optional] |
| **startsAt** | **String**| {comparator},{date-time} | [optional] |
| **axisSectionsId** | [**List&lt;Object&gt;**](Object.md)| Filter on a comma-separated list of AxisSections identifiers. | [optional] |
| **axisSectionsCode** | [**List&lt;Object&gt;**](Object.md)| Filter on a comma-separated list of AxisSections codes. | [optional] |
| **modifiedAt** | **String**| {comparator},{date-time} | [optional] |
| **archivedAt** | **String**| {comparator},{date-time} | [optional] |

### Return type

[**TimeEntriesListTimeEntriesResponse**](TimeEntriesListTimeEntriesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(timeEntryId).execute();

Delete a TimeEntry by id

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1services~1time-entries/put)  Delete a single TimeEntry. Deletion is irrevocable.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    Integer timeEntryId = 56; // Identifier of the TimeEntry.
    try {
      client
              .timeEntries
              .removeById(timeEntryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeEntries
              .removeById(timeEntryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#removeById");
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
| **timeEntryId** | **Integer**| Identifier of the TimeEntry. | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateById"></a>
# **updateById**
> TimeEntriesUpdateByIdResponse updateById(timeEntryId).timeEntry(timeEntry).execute();

Update a TimeEntry by id

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1services~1time-entries/put)  Update fields of a single TimeEntry identified by its unique id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    OffsetDateTime startsAt = OffsetDateTime.now(); // The timeEntry start date and time. Please do NOT send any offset/timezone information (\\\"Z\\\", \\\"+01:00\\\", etc...).
    String duration = "00:00:00"; // Format: d.hh:mm:ss. Max: \\\"1.00:00:00\\\" (ie 24 hours).
    Integer unit = 0; // 0: Days (eg \\\"1/2 day\\\"). 1: Hours (eg \\\"8h15min\\\"). 2: Time (eg \\\"23:45:00\\\").
    Integer ownerId = 56; // The user's unique identifier.
    Integer timeEntryId = 56; // Identifier of the TimeEntry.
    Integer id = 56; // Unique identifier for this object.
    OffsetDateTime endsAt = OffsetDateTime.now();
    Integer authorId = 56; // Identifier of the user who initially created this TimeEntry.
    OffsetDateTime createdAt = OffsetDateTime.now();
    Integer creationSource = 0; // 0: Fallback on theoretical TimeEntries. 1: Application of bookmarked week. 2: Manual creation. 3: Import
    Integer modifierId = 56; // The unique identifier of the user who last updated the TimeEntry.
    Integer modifiedAt = 56; // Date and time when TimeEntry was last modified.
    Integer layer = 56; // 0: Actual. 1: Theoretical
    List<AxisSection> axisSections = Arrays.asList(); // When not in activity mode, send an empty array, or do not serialize this property.
    TimeEntryComment comment = new TimeEntryComment();
    Object timeTypeId = null;
    try {
      TimeEntriesUpdateByIdResponse result = client
              .timeEntries
              .updateById(startsAt, duration, unit, ownerId, timeEntryId)
              .id(id)
              .endsAt(endsAt)
              .authorId(authorId)
              .createdAt(createdAt)
              .creationSource(creationSource)
              .modifierId(modifierId)
              .modifiedAt(modifiedAt)
              .layer(layer)
              .axisSections(axisSections)
              .comment(comment)
              .timeTypeId(timeTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesUpdateByIdResponse> response = client
              .timeEntries
              .updateById(startsAt, duration, unit, ownerId, timeEntryId)
              .id(id)
              .endsAt(endsAt)
              .authorId(authorId)
              .createdAt(createdAt)
              .creationSource(creationSource)
              .modifierId(modifierId)
              .modifiedAt(modifiedAt)
              .layer(layer)
              .axisSections(axisSections)
              .comment(comment)
              .timeTypeId(timeTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#updateById");
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
| **timeEntryId** | **Integer**| Identifier of the TimeEntry. | |
| **timeEntry** | [**TimeEntry**](TimeEntry.md)|  | [optional] |

### Return type

[**TimeEntriesUpdateByIdResponse**](TimeEntriesUpdateByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateMultiple"></a>
# **updateMultiple**
> TimeEntriesUpdateMultipleResponse updateMultiple().body(body).execute();

Update multiple TimeEntries

&lt;!-- theme: warning --&gt;  &gt;#### Warning &gt; This endpoint will soon be deprecated, please use [Timmi Timesheet v4 API](Timmi-Timesheet.yaml/paths/~1timmi-timesheet~1services~1time-entries/put)  Update one or several TimeEntries. The \&quot;id\&quot; field must be sent and correspond to an existing TimeEntry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaTimmiTimesheet;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeEntriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaTimmiTimesheet client = new LuccaTimmiTimesheet(configuration);
    try {
      TimeEntriesUpdateMultipleResponse result = client
              .timeEntries
              .updateMultiple()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#updateMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeEntriesUpdateMultipleResponse> response = client
              .timeEntries
              .updateMultiple()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeEntriesApi#updateMultiple");
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
| **body** | **Object**| You can either update a single or multiple TimeEntries. Pick the correct body type accordingly. | [optional] |

### Return type

[**TimeEntriesUpdateMultipleResponse**](TimeEntriesUpdateMultipleResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

