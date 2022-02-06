package com.example.springbatch;

import com.example.springbatch.config.NaverConfig;
import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("naver")
@RequiredArgsConstructor
@RestController
public class NaverContoller {

    private static final Logger logger = LoggerFactory.getLogger(NaverContoller.class);
    private final NaverConfig naverConfig;


    @GetMapping("/short_url")
    public ResponseEntity<String> getShortUrl(){
        logger.info("[naverConfig] : "+ naverConfig);
     return new ResponseEntity<>("naverConfig", HttpStatus.OK);
    }

}
