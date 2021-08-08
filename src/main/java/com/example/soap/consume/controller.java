package com.example.soap.consume;

import com.example.soap.consume.client.SOAPClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    private SOAPClient soapClient;

    public controller(SOAPClient soapClient) {
        this.soapClient = soapClient;
    }
    @GetMapping("/GetState/{id}")
    public ResponseEntity<?> getStateById(@PathVariable String id) {
        return new ResponseEntity<>(soapClient.getState(id), HttpStatus.OK);

    }
}
