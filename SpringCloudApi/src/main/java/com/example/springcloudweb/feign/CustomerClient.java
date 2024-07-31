package com.example.springcloudweb.feign;

import com.example.springcloudweb.domain.Student;
import com.example.springcloudweb.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer-server")
public interface CustomerClient {


    @GetMapping("/hello")
    String getHello() throws InterruptedException;

    @GetMapping("/queryAll")
    Student queryAll();


    @GetMapping("/queryAllUser")
    User queryAllUser();
}
