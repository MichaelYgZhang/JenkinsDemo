package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello.jenkins..修改后123456";
    }
}
