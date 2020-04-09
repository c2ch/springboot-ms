package com.ms.springbootms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ms.springbootms.mapper")
public class SpringBootMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMsApplication.class, args);
    }

}
