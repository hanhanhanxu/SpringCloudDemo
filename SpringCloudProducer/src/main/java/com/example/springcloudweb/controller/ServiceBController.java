package com.example.springcloudweb.controller;

import com.example.springcloudweb.domain.Student;
import com.example.springcloudweb.domain.User;
import com.example.springcloudweb.feign.CustomerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class ServiceBController {

    @Resource
    private CustomerClient customerClient;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Service Producer!";
    }


    @GetMapping("/hello-c")
    public String sayHelloFromC() throws InterruptedException {
        log.info("sayHelloFromC...");
        return customerClient.getHello();
    }

    @GetMapping("/queryFormC")
    public Student queryFormC() {
        log.info("queryFormC...");
        return customerClient.queryAll();
    }

    @GetMapping("/queryFormCUser")
    public User queryFormCUser() {
        log.info("queryFormCUser...");
        return customerClient.queryAllUser();
    }
}
