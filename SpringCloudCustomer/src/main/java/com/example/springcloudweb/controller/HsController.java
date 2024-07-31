package com.example.springcloudweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HanXu
 * @Date 2024/7/31 15:46
 * @Description
 */
@Slf4j
@RestController
public class HsController {

    @RequestMapping("hs")
    public String hs() {
        log.info("hs...");
        return  "ok";
    }
}
