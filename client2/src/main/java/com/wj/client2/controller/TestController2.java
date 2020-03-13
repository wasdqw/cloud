package com.wj.client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:
 * Function:
 * date:2020年03月13日 11:26
 *
 * @author jiewang27
 * @version 1.0
 * @since JDK 1.7
 */
@RestController
public class TestController2 {

    @Autowired
    RestTemplate restTemplate;

    //ribbon的调用方式
    @GetMapping("test")
    public String query( String userId){
        //下面这个地址就是2个服务端的   服务名称+新建的controller的开放接口...
        return restTemplate.getForObject("http://SPRINGCLOUD-EUREKA-CLIENT/list",String.class);
    }
}
