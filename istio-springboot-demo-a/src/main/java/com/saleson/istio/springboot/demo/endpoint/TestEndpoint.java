package com.saleson.istio.springboot.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping("/test")
public class TestEndpoint {

    private static final String PREFIX = "V";
//    private static final String PREFIX = "Latest";

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/get")
    public String get(@RequestParam("a") String a) {
        return PREFIX + " test get and the parameter a is : " + a;
    }

    @GetMapping("/request-b")
    public String requestb(@RequestParam("a") String a, @RequestParam(value = "forward", required = false) String forward) {
        if (Objects.isNull(forward) || forward.length() == 0) {
            forward = "istio-springboot-demo-b";
        }
        String result = restTemplate.getForObject("http://" + forward + "/test/get?a=" + a, String.class);
        return PREFIX + " demo-a request " + forward + ": parameter a:" + a + "\n demo-b response:" + result;
    }
}
