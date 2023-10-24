package com.fanthus.springpractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication()
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        //在 Application.properties 修改了
//        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
    }
}