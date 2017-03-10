package com.gr.jiang.spring.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang on 2017/3/10.
 */
@RestController
@RequestMapping("/user")
public class UserServiceController {
    @RequestMapping("/detail")
    public String detail(){
        return "## User ##";
    }
}
