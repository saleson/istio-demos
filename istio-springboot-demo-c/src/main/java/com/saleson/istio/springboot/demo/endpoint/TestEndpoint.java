package com.saleson.istio.springboot.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestEndpoint {

    @GetMapping("/get")
    public String get(@RequestParam("a") String a) {
        return "V demo-c: test get and the parameter a is : " + a;
    }
}
