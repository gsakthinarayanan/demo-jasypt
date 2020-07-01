package com.example.jasypt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test")
public class TestController {

    @GetMapping
    public String sayHello() {
        return "Hello World from Jasypt Test app";
    }
}
