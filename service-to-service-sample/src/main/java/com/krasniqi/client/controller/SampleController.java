package com.krasniqi.client.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class SampleController {

//    @Autowired
//    private EurekaClient eurekaClient;

//    @Autowired
//    private RestTemplateBuilder restTemplateBuilder;

//    @GetMapping
//    public String callServiceFromRegistry(){
//        RestTemplate restTemplate = restTemplateBuilder.build();
//        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("sample-client", false);
//        String baseUrl = instanceInfo.getHomePageUrl();
//        ResponseEntity<String> response =
//                restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class);
//        return "Called from Client via Discovery Service: " + response.getBody();
//    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String callServiceFromRegistry(){

        String response =  restTemplate.getForEntity("http://sample-client/", String.class).getBody();
        return "Called from Client via Discovery Service: " + response;
    }
}
