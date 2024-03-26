package com.konfigthis.client;

import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.TimeEntriesApi;
import com.konfigthis.client.api.TimesheetsApi;
import com.konfigthis.client.api.WorkflowApi;

public class LuccaTimmiTimesheet {
    private ApiClient apiClient;
    public final ReportsApi reports;
    public final TimeEntriesApi timeEntries;
    public final TimesheetsApi timesheets;
    public final WorkflowApi workflow;

    public LuccaTimmiTimesheet() {
        this(null);
    }

    public LuccaTimmiTimesheet(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.reports = new ReportsApi(this.apiClient);
        this.timeEntries = new TimeEntriesApi(this.apiClient);
        this.timesheets = new TimesheetsApi(this.apiClient);
        this.workflow = new WorkflowApi(this.apiClient);
    }

}
