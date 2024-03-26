

# Timesheet

## Definitions  Timesheets are TimeEntries containers. A timesheet belongs to a single user `owner` and ranges over several days `[startsOn - endsOn[` (endsOn excluded). Its range depends on the submission frequency set up in Timmi Timesheet (weekly / monthly).  A timesheet purpose is to ease the approval workflow: rather than approving each TimeEntry individually, they are approved in a weekly / monthly batch.  The approval workflow looks like this:  ![Timmi Timesheet - Approval workflow](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/xfjxCP2RUa4)  Thus, a timesheet: - is created upon submission ; - is \"pending approval\" (`status: 1`) as long as all approvers have not approved it ; - is \"approved\" (`status: 2`) once all approvers have approved it ; - may become \"rejected\" (`status: 3`) whenever:   - the submitter cancels the submission, which is possible as long as the timesheet is not fully approved ;   - one of the approvers denies the timesheet ;   - an administrator invalidates the timesheet, which is only possible once the timesheet is fully approved.  Once a timesheet is rejected, a new one has to be submitted and the workflow starts again.  ## Fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | - 0: the timesheet is yet to be submitted - 1: the timesheet has been submitted and approval is still pending - 2: the timesheet has been submitted and approved. - 3: the timesheet has been rejected (cancelled after submission, denied upon approval or invalidated after having been approved)  |  [optional] |
|**startsOn** | **LocalDate** |  |  [optional] |
|**endsOn** | **String** |  |  [optional] |
|**ownerId** | **Integer** |  |  [optional] |
|**owner** | [**TimesheetOwner**](TimesheetOwner.md) |  |  [optional] |
|**statuteId** | **Integer** | Identifier of the applicable \&quot;statute\&quot; (configuration). |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



