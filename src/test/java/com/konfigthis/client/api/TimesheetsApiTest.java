/*
 * Timmi Timesheet API
 * Welcome on the documentation for the Timmi Timesheet API. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developers@lucca.fr
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import java.time.LocalDate;
import com.konfigthis.client.model.OwnerId;
import com.konfigthis.client.model.Status;
import com.konfigthis.client.model.TimesheetsListDueResponse;
import com.konfigthis.client.model.TimesheetsListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimesheetsApi
 */
@Disabled
public class TimesheetsApiTest {

    private static TimesheetsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimesheetsApi(apiClient);
    }

    /**
     * List timesheets
     *
     * List all timesheets satisfying query filters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        List<OwnerId> ownerId = null;
        String startsOn = null;
        List<Status> status = null;
        String endsOn = null;
        TimesheetsListResponse response = api.list()
                .ownerId(ownerId)
                .startsOn(startsOn)
                .status(status)
                .endsOn(endsOn)
                .execute();
        // TODO: test validations
    }

    /**
     * List due timesheets
     *
     * List timesheet that are not yet submitted (status: 0).  You must filter on either &#x60;ownerIds&#x60;, &#x60;managerIds&#x60; or &#x60;legalEntityIds&#x60;. As long as a timesheet is not submitted, its unique identifier is equal to zero.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDueTest() throws ApiException {
        List<Integer> ownerIds = null;
        List<Integer> legalEntityIds = null;
        List<Integer> managerIds = null;
        LocalDate start = null;
        LocalDate end = null;
        TimesheetsListDueResponse response = api.listDue()
                .ownerIds(ownerIds)
                .legalEntityIds(legalEntityIds)
                .managerIds(managerIds)
                .start(start)
                .end(end)
                .execute();
        // TODO: test validations
    }

}
