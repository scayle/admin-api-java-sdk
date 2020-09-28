package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.exception.InvalidArgumentException;
import com.aboutyou.cloud.adminapi.factory.ServiceFactory;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.ApiConfiguration;

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