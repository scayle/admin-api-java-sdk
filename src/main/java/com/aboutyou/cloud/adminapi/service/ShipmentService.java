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

    public Shipment create(Shipment model) throws ApiErrorException, ConnectionException {
        Class<Shipment> responseModel = (Class<Shipment>)(Class<?>)Shipment.class;

        return this.request("post", this.resolvePath("/fulfillment/shipments"), null, responseModel, model);
    }

    public Shipment create(Shipment model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Shipment> responseModel = (Class<Shipment>)(Class<?>)Shipment.class;

        return this.request("post", this.resolvePath("/fulfillment/shipments"), options, responseModel, model);
    }

}