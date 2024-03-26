

# TimeEntry

TimeEntries are the working time sequences spent by a user on any given day.  These ressources are exposed in the `/api/v3/timeentries` endpoint.  TimeEntries come in different **units** and **submission modes**.  ## About units & duration  Timmi Timesheet supports up to 3 different units when it comes to entering TimeEntries. These are: - `0: Days` In this case, the user does not enter the exact hours he/she started working, but rather the total duration spent as a fraction of a day. For example: \"John worked half a day on Monday\". - `1: Hours` In this case, the user still does not enter the exact hours, but only the duration spent in hours. For example: \"John worked 7h30min yesterday\". - `2: Time` In this unit, the user has to enter the actual time he/she started working, as well as the end time. For example: \"John started working at 08:00 for 3 hours, thus ending at 11:00\".  ```csharp enum TimeEntryUnit: {     Days = 0,     Hours = 1,     Time = 2 } ```  Whichever the unit, the TimeEntry is mainly determined by three properties: - `(int) ownerId`: The user it belongs to. - `(date-time) startsAt`: The date and time when the user started working. In `Days` and `Hours` units, the time part can only be `00:00:00` for \"morning\" (AM) or `12:00:00` for the \"afternoon\" (PM). - `(duration) duration`: The total time spent by the user from the time he/she started. In all units, this property is serialized as a string compliant with the Timespan formating: `d.hh:mm:ss` where `d` is the number of days (can be omitted if equal to zero which is in most cases), `hh` the number of hours, `mm` the number of minutes, and `ss` the number of seconds.  <!-- theme: warning --> > #### StartsAt and timezones > The `startsAt` date-time property must be considered a [floating](https://www.w3.org/International/wiki/FloatingTime) date-time. As such, no UTC offset should be sent when creating or editing a TimeEntry.  <!-- theme: warning --> > #### Max duration > A TimeEntry cannot have a duration longer than 24h00 (ie one full day).   Some examples : ```js // TIME UNIT // Case: \"John (id: 416) worked between 09:45 and 12:15 on January, 1st 2021.\" var timeEntry = {   \"ownerId\": 416,   \"startsAt\": \"2021-01-01 09:45:00\",   \"duration: \"02:30:00\",   \"unit\": 2 };  // HOURS UNIT // Case: \"John (id: 416) spent 4h45min working on January, 1st 2021 in the morning\" var timeEntry = {   \"ownerId\": 416,   \"startsAt\": \"2021-01-01 00:00:00\",   \"duration: \"04:45:00\",   \"unit\": 1 }  // DAYS UNIT // Case: \"John (id: 416) worked on the afternoon of January, 1st 2021\" var timeEntry = {   \"ownerId\": 416,   \"startsAt\": \"2021-01-01 12:00:00\",   \"duration: \"12:00:00\",   \"unit\": 0 } ```  ## About submission modes  There are 2 submission modes in Timmi Timesheet: - **Attendance**: the user is expected to enter the sequences of work without much detail. - **Activities**: the user is expected to enter the time spent on each task / project / whatever.  Therefore, TimeEntries in activities mode have a supplementary property: the set of task / project / cost center / ... the user worked on. These analytical items are called AxisSections. [More info here](docs/General/Resources/010.AxisSection.md).   ```json {   \"ownerId\": 416,   \"startsAt\": \"2021-01-01 00:00:00\",   \"duration: \"04:45:00\",   \"unit\": 1,   \"axisSections\": [     {       \"name\": \"R&D\",       \"axis\": {         \"name\": \"Cost centers\"       }     },     {       \"name\": \"My awesome project\",       \"axis\": {         \"name\": \"Projects\"       }     },     {       \"name\": \"Testing\",       \"axis\": {         \"name\": \"Tasks\"       }     }   ] } ```  ## About time types Each time-entry can reference a time type via its `timeTypeId` property.  Time types are a configured working time classification. It is generally used as a way of discriminating different types of working hours regarding compensation: - Attendance - Travels - etc...  Time types can only be used on users that belong to a specific regulation (ie time and attendance policy) mode: `timeTrackingMode: typed`. Whenever it is not the case, the `timeTypeId` property should be left `null`.  ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier for this object. |  [optional] [readonly] |
|**startsAt** | **OffsetDateTime** | The timeEntry start date and time. Please do NOT send any offset/timezone information (\&quot;Z\&quot;, \&quot;+01:00\&quot;, etc...). |  |
|**duration** | **String** | Format: d.hh:mm:ss. Max: \&quot;1.00:00:00\&quot; (ie 24 hours). |  |
|**unit** | [**UnitEnum**](#UnitEnum) | 0: Days (eg \&quot;1/2 day\&quot;). 1: Hours (eg \&quot;8h15min\&quot;). 2: Time (eg \&quot;23:45:00\&quot;). |  |
|**endsAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**ownerId** | **Integer** | The user&#39;s unique identifier. |  |
|**authorId** | **Integer** | Identifier of the user who initially created this TimeEntry. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**creationSource** | [**CreationSourceEnum**](#CreationSourceEnum) | 0: Fallback on theoretical TimeEntries. 1: Application of bookmarked week. 2: Manual creation. 3: Import |  [optional] |
|**modifierId** | **Integer** | The unique identifier of the user who last updated the TimeEntry. |  [optional] [readonly] |
|**modifiedAt** | **Integer** | Date and time when TimeEntry was last modified. |  [optional] [readonly] |
|**layer** | **Integer** | 0: Actual. 1: Theoretical |  [optional] [readonly] |
|**axisSections** | [**List&lt;AxisSection&gt;**](AxisSection.md) | When not in activity mode, send an empty array, or do not serialize this property. |  [optional] |
|**comment** | [**TimeEntryComment**](TimeEntryComment.md) |  |  [optional] |
|**timeTypeId** | **Object** |  |  [optional] |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: CreationSourceEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



