package com.fanthus.springpractice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApplicationiPropertyController {

    @Value("${person.name}")
    public String name;

    @Value("${person.score:100}")   //没有提供这个属性则使用 100 作为默认值
    public String score;

    @GetMapping("/get/property/name")
    public String getPropertyName() {
        return "getProperty name : "+name;
    }

    @GetMapping("/get/property/score")
    public String getPropertyScore() {
        return "getProperty score : "+score;
    }
}
