package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShipmentService extends AbstractService {
    public ShipmentService(HttpClient httpClient) {
        super(httpClient);
    }

    public void create(Shipment model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/fulfillment/shipments"), null, null, model);
    }

    public void create(Shipment model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/fulfillment/shipments"), options, null, model);
    }

}