package com.dubbo.application;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dubbo.*")
@EnableDubboConfiguration
public class DzConsumersApplication {
    public static void main(String[] args) {
        SpringApplication.run(DzConsumersApplication.class, args);
    }
}
