package com.fanthus.springpractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication()
@EnableFeignClients(basePackages = {"com.fanthus.springpractice"})
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        //在 Application.properties 修改了
//        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
    }

}