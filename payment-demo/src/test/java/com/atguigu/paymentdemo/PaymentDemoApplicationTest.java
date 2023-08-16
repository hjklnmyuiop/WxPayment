package com.atguigu.paymentdemo;

import com.atguigu.paymentdemo.config.WxPayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.security.PrivateKey;


/**
 * @Author: dev_guo
 * @Date: 2023/8/3 17:50
 */
@SpringBootTest
class PaymentDemoApplicationTest {
    @Resource
    private WxPayConfig wxPayConfig;


    @Test
    void testGetPrivateKey() {
//
//        //获取私钥路径
//        String privateKeyPath = wxPayConfig.getPrivateKeyPath();
//
//        //获取私钥
//        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);
//
//        System.out.println(privateKey);
    }

}