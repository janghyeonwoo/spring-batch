package com.example.springbatch.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String getTest(){
        return "젠킨스성공";
    }

}
