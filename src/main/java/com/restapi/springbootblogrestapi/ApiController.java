package com.restapi.springbootblogrestapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    
}
