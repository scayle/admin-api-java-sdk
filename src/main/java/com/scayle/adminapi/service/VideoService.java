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
public class VideoService extends AbstractService {
    public VideoService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public VideoCreateResponse create(List<Video> model) throws ApiErrorException, ConnectionException {
        Class<VideoCreateResponse> responseModel = (Class<VideoCreateResponse>)(Class<?>)VideoCreateResponse.class;

        return this.request("post", this.resolvePath("/videos"), null, null, responseModel, model);
    }

    
    public VideoCreateResponse create(List<Video> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VideoCreateResponse> responseModel = (Class<VideoCreateResponse>)(Class<?>)VideoCreateResponse.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/videos"), query, null, responseModel, model);
    }

    
    public VideoUploadEntity update(String videoIdentifier, Video model) throws ApiErrorException, ConnectionException {
        Class<VideoUploadEntity> responseModel = (Class<VideoUploadEntity>)(Class<?>)VideoUploadEntity.class;

        return this.request("put", this.resolvePath("/videos/%s", videoIdentifier), null, null, responseModel, model);
    }

    
    public VideoUploadEntity update(String videoIdentifier, Video model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VideoUploadEntity> responseModel = (Class<VideoUploadEntity>)(Class<?>)VideoUploadEntity.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/videos/%s", videoIdentifier), query, null, responseModel, model);
    }

    
    public Video get(String videoIdentifier) throws ApiErrorException, ConnectionException {
        Class<Video> responseModel = (Class<Video>)(Class<?>)Video.class;

        return this.request("get", this.resolvePath("/videos/%s", videoIdentifier), null, null, responseModel);
    }

    
    public Video get(String videoIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Video> responseModel = (Class<Video>)(Class<?>)Video.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/videos/%s", videoIdentifier), query, null, responseModel);
    }

    
    public void delete(String videoIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/videos/%s", videoIdentifier), null, null, null);
    }

    
    public void delete(String videoIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/videos/%s", videoIdentifier), query, null, null);
    }

}
