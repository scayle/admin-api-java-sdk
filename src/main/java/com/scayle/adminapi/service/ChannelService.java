package com.scayle.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.scayle.adminapi.exception.ApiErrorException;
import com.scayle.adminapi.exception.ConnectionException;
import com.scayle.adminapi.http.HttpClient;
import com.scayle.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ChannelService extends AbstractService {
    public ChannelService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public Channel createChannel(Integer companyId, ChannelCreateRequest model) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        return this.request("post", this.resolvePath("/companies/%s/channels", companyId), null, null, responseModel, model);
    }

    
    public Channel createChannel(Integer companyId, ChannelCreateRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/companies/%s/channels", companyId), query, null, responseModel, model);
    }

    
    public Channel getChannel(Integer companyId, Integer channelId) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        return this.request("get", this.resolvePath("/companies/%s/channels/%s", companyId, channelId), null, null, responseModel);
    }

    
    public Channel getChannel(Integer companyId, Integer channelId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/companies/%s/channels/%s", companyId, channelId), query, null, responseModel);
    }

    
    public ApiCollection<Channel> all(Integer companyId) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        return this.requestCollection("get", this.resolvePath("/companies/%s/channels", companyId), null, null, responseModel);
    }

    
    public ApiCollection<Channel> all(Integer companyId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/companies/%s/channels", companyId), query, null, responseModel);
    }

    
    public Channel updateChannel(Integer companyId, Integer channelId, ChannelUpdateRequest model) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        return this.request("put", this.resolvePath("/companies/%s/channels/%s", companyId, channelId), null, null, responseModel, model);
    }

    
    public Channel updateChannel(Integer companyId, Integer channelId, ChannelUpdateRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Channel> responseModel = (Class<Channel>)(Class<?>)Channel.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/companies/%s/channels/%s", companyId, channelId), query, null, responseModel, model);
    }

}
