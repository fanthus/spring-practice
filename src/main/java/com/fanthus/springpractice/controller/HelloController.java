package com.fanthus.springpractice.controller;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("this is hello world controller");
        return "Hello World11!";
    }
}
