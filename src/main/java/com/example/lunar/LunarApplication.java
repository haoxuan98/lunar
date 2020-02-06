package com.example.lunar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.lunar.dao")
public class LunarApplication {

    public static void main(String[] args) {
        SpringApplication.run(LunarApplication.class, args);
    }


}
