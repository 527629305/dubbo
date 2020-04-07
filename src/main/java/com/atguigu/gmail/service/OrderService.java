package com.atguigu.gmail.service;

import com.atguigu.gmail.bean.UserAddress;

import java.util.List;

/**
 * @author WuJun
 * @Date:15:04 2020/1/9
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param UserId
     */
    public List<UserAddress> initOrder(String UserId);
}
