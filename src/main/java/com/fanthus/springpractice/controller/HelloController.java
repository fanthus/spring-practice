package com.fanthus.springpractice.controller;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello(String param) {
        Long value = Long.parseLong(param);
        log.info("this is hello world controller value {}", value);
        return "Hello World11!";
    }

}
