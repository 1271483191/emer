package com.yunjing.emer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.yunjing.emer.dao")
public class EmerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmerApplication.class, args);
    }

}