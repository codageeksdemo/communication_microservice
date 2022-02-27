package com.miracle.demo.communicationmicroservice.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

    @GetMapping("/")
    String home() {
        return "Hello, Welcome to Transform demo! " ;
    }

}