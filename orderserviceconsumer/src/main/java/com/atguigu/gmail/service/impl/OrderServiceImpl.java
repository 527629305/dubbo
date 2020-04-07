package com.atguigu.gmail.service.impl;


import com.atguigu.gmail.bean.UserAddress;
import com.atguigu.gmail.service.OrderService;
import com.atguigu.gmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 1.将服务提供者注册到注册中心
 *      1）、导入dubbo依赖
 *      2）、操作zookepper的客户端（curator）
 *      3）、配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 * @author WuJun
 * @Date:15:05 2020/1/9
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public void initOrder(String UserId) {
        System.out.println("用户id:"+UserId);
        //1.查询用户的收货地址

        List<UserAddress> addressList = userService.getUserAddressList(UserId);
        for(UserAddress userAddress:addressList){
            System.out.println(userAddress.getUserAddress());
        }
    }
}
