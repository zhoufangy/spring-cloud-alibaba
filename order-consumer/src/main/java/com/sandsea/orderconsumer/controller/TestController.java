package com.sandsea.orderconsumer.controller;

import com.sandsea.orderconsumer.service.EchoService;
import com.sandsea.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by ZhouFangyuan on 2020-04-07.
 * Time: 23:54
 * Information:
 */

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private EchoService echoService;
    @Value("${service-url.order-provider}")
    private String serverURL;

    @GetMapping(value = "/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject(serverURL+"/echo/"+str, String.class);
    }
    @GetMapping(value = "/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return echoService.echo(str);
    }

    @PostMapping(value = "/user/{userId}")
    public Object getUserList(@PathVariable String userId) {
//        return restTemplate.getForObject(serverURL+"/user/"+userId,String.class);
        return echoService.userList(userId);
    }

}