package com.wj.client.controller;

import com.wj.client.service.UserService;
import com.wj.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:
 * Function:
 * date:2020年03月13日 11:09
 *
 * @author jiewang27
 * @version 1.0
 * @since JDK 1.7
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "young码农") String name) {
        return name + ",welcome to springcloud! server port:" + port;
    }

    @RequestMapping("/list")
    public String list() {
        return JSONUtil.success(userService.userList());
    }

}
