package com.example.springcloudweb.controller;

import com.example.springcloudweb.domain.Student;
import com.example.springcloudweb.domain.User;
import com.example.springcloudweb.feign.CustomerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ServiceAController implements CustomerClient {

    @Override
    @GetMapping("/hello")
    public String getHello() throws InterruptedException {
        log.info("sayHello...");
        Thread.sleep(10);
        return "Hello from Service Customer!";
    }

    @Override
    @GetMapping("/queryAll")
    public Student queryAll() {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("riun");
        return s1;
    }

    @Override
    @GetMapping("/queryAllUser")
    public User queryAllUser() {
        User user = new User();
        user.setUsername("riun");
        user.setPassword("123456");
        return user;
    }
}
