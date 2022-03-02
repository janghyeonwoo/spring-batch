package com.example.springbatch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBatchApplicationTests {

    @Test
    void contextLoads() {
        List<String> na = new ArrayList<>();
        na.add("aaaa");
        System.out.println(na.stream().findAny());
    }

}
