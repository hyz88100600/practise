package com.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@author hanyunzhuo
 *@date 2020/6/22 15:42
 */
@SpringBootApplication
@RestController
public class SpringApplicationDemo {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplicationDemo.class,args);
    }

    @RequestMapping
    public  String  hello(){
        return "hello";
    }
}
