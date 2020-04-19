package com.mine.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Cloud2Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloud2Application.class, args);
    }

    @RequestMapping("/index")
    public String a(){
        return "123";
    }
}
