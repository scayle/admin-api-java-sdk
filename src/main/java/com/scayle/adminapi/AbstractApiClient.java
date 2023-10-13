package com.scayle.adminapi;

import com.scayle.adminapi.exception.InvalidArgumentException;
import com.scayle.adminapi.factory.ServiceFactory;
import com.scayle.adminapi.http.HttpClient;
import com.scayle.adminapi.model.ApiConfiguration;

public abstract class AbstractApiClient {
    protected ApiConfiguration apiConfiguration;
    private ServiceFactory serviceFactory;

    public AbstractApiClient(ApiConfiguration apiConfiguration) {
        this.validateConfig(apiConfiguration);

        this.apiConfiguration = apiConfiguration;
        this.serviceFactory = new ServiceFactory(new HttpClient(apiConfiguration));
    }

    protected <T> T getService(String className) {
        return this.serviceFactory.getService(className);
    }

    /**
    *
    * @param apiConfiguration
    * @throws InvalidArgumentException
    */
    private void validateConfig(ApiConfiguration apiConfiguration) throws InvalidArgumentException {
        String url = apiConfiguration.getUrl();
        String accessToken = apiConfiguration.getAccessToken();

        if (url == null || url.isEmpty()) {
            throw new InvalidArgumentException("A valid API Url has to bet set");
        }

        if (accessToken == null || accessToken.isEmpty()) {
            throw new InvalidArgumentException("A valid AccessToken has to bet set");
        }
    }
}