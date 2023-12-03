package com.whut.wharf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.whut.wharf.mapper")
@SpringBootApplication
public class WharfApplication {

    public static void main(String[] args) {
        SpringApplication.run(WharfApplication.class, args);
    }

}
