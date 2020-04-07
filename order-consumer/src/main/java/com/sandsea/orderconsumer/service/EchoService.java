package com.sandsea.orderconsumer.service;

import com.sandsea.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by ZhouFangyuan on 2020-04-08.
 * Time: 00:07
 * Information:
 */
@FeignClient(name = "order-provider")
public interface EchoService {
    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);

    @GetMapping(value = "/user/{userId}")
    List<User> userList(@PathVariable("userId") String userId);
}