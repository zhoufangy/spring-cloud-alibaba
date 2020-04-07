package com.sandsea.orderprovider.controller;

import com.sandsea.model.User;
import com.sandsea.service.AuthService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZhouFangyuan on 2020-04-08.
 * Time: 01:49
 * Information:
 */

@RestController
public class EchoController {
    @Resource
    private AuthService authService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "nacos registry, server port:" + serverPort + string;
    }

    @GetMapping(value = "/user/{string}")
    public Object userList(@PathVariable String string) {
        return authService.getUserList();
    }
}