package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class WebhookEventService extends AbstractService {
    public WebhookEventService(HttpClient httpClient) {
        super(httpClient);
    }

    public ApiCollection<WebhookEvent> all() throws ApiErrorException, ConnectionException {
        Class<WebhookEvent> responseModel = (Class<WebhookEvent>)(Class<?>)WebhookEvent.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/events"), null, responseModel);
    }

    public ApiCollection<WebhookEvent> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookEvent> responseModel = (Class<WebhookEvent>)(Class<?>)WebhookEvent.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/events"), options, responseModel);
    }

}