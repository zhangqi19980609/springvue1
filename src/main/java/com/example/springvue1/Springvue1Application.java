package com.example.springvue1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.ManagedBean;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.springvue1.Dao"})
public class Springvue1Application {

    public static void main(String[] args) {
        System.out.println("123");
        SpringApplication.run(Springvue1Application.class, args);
    }

}
