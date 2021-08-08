package com.example.soap.consume.client;


import com.prateep.info.spring.soapws.GetStateRequest;
import com.prateep.info.spring.soapws.GetStateResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

//@Component
public class SOAPClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(SOAPClient.class);

    public GetStateResponse getState(String stateId) {

        GetStateRequest request = new GetStateRequest();
        request.setId(stateId);

        log.info("Requesting location for " + stateId);

        GetStateResponse response = (GetStateResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8081/ws", request,
                        new SoapActionCallback(
                                "/GetStateRequest"));

        return response;
    }
}
