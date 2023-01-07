package com.doodle.apple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {
    @RequestMapping("/test")
    public String test(){
        return "hello";
    }
}
