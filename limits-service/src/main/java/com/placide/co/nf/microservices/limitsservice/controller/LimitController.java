package com.placide.co.nf.microservices.limitsservice.controller;

import com.placide.co.nf.microservices.limitsservice.bin.Limits;
import com.placide.co.nf.microservices.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {


    private final Configuration configuration;

    public LimitController(Configuration configuration) {
        this.configuration = configuration;
    }


    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
