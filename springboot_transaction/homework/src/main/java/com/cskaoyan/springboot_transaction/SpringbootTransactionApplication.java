package com.cskaoyan.springboot_transaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.cskaoyan")
@SpringBootApplication
public class SpringbootTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransactionApplication.class, args);
    }

}
