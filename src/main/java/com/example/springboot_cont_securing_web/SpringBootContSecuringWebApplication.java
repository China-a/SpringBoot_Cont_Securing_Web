package com.example.springboot_cont_securing_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration( exclude={DataSourceAutoConfiguration.class,
        XADataSourceAutoConfiguration.class})

public class SpringBootContSecuringWebApplication {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(SpringBootContSecuringWebApplication.class, args);
    }

}
