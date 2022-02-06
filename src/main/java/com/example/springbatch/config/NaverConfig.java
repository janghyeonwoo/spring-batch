package com.example.springbatch.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Configuration
@ConfigurationProperties(prefix = "naver")
@PropertySource(value = {"naver.yml"}, factory = YamlLoadFactory.class)
@Getter
@Setter
@ToString
public class NaverConfig {
    private String secretKey;
    private String name;
}
