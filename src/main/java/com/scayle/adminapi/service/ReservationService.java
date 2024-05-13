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
public class ReservationService extends AbstractService {
    public ReservationService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Reservation> create(List<Reservation> model) throws ApiErrorException, ConnectionException {
        Class<Reservation> responseModel = (Class<Reservation>)(Class<?>)Reservation.class;

        return this.requestCollection("post", this.resolvePath("/reservations"), null, null, responseModel, model);
    }

    
    public ApiCollection<Reservation> create(List<Reservation> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Reservation> responseModel = (Class<Reservation>)(Class<?>)Reservation.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("post", this.resolvePath("/reservations"), query, null, responseModel, model);
    }

    
    public void delete(Identifier reservationIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/reservations/%s", reservationIdentifier), null, null, null);
    }

    
    public void delete(Identifier reservationIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/reservations/%s", reservationIdentifier), query, null, null);
    }

}
