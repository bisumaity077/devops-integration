package com.devops.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/up")
    public String getUP(){
        return "up" ;
    }

    @GetMapping("/down")
    public String getDown(){
        return "1" ;
    }
}
