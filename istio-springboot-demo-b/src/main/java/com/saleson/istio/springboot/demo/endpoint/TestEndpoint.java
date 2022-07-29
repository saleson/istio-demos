package com.saleson.istio.springboot.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestEndpoint {

//    private static final String PREFIX = "V";
    private static final String PREFIX = "Latest";

    @GetMapping("/get")
    public String get(@RequestParam("a") String a) {
        return PREFIX + " demo-b: test get and the parameter a is : " + a;
    }
}
