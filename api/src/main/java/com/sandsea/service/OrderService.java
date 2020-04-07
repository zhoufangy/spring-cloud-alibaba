package com.sandsea.service;

import com.sandsea.model.UserAddress;

import java.util.List;

/**
 * Created by ZhouFangyuan on 2020-03-02.
 * Time: 23:10
 * Information:
 */
public interface OrderService {

    List<UserAddress> getUserAddressList(String userId);
}
