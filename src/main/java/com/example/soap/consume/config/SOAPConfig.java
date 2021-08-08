package com.example.soap.consume.config;

import com.example.soap.consume.client.SOAPClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SOAPConfig {


    @Bean("marshaller")
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.prateep.info.spring.soapws");
        return jaxb2Marshaller;
    }

    @Bean
    public SOAPClient soapClient(@Qualifier("marshaller") Jaxb2Marshaller jaxb2Marshaller) {
        SOAPClient soapClient = new SOAPClient();
        soapClient.setDefaultUri("http://localhost:8080/ws/states.wsdl");
        soapClient.setMarshaller(jaxb2Marshaller);
        soapClient.setUnmarshaller(jaxb2Marshaller);
        return soapClient;
    }
}
