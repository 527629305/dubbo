package com.atguigu.gmail.controller;

import com.atguigu.gmail.bean.UserAddress;
import com.atguigu.gmail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * @author WuJun
 * @Date:10:47 2020/1/10
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;


    //初始化订单
    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId") String userId){
        List<UserAddress> userAddresses = orderService.initOrder(userId);
        return  userAddresses;
    }
}
