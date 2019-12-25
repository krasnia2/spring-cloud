package com.krasniqi.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigClientController {

    @Value("${some.property}")
    private String someProperty;

    @GetMapping
    public String ping(){
        return "Config client up. Injected property from config server: " + someProperty;
    }
}
