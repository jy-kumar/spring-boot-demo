package com.test;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloMadam(){
        return "<h2>Welcome to my first Spring boot app.</h2>";
    }

    @GetMapping("/hello")
    public String hello(){
        return "<h2>Welcome JK.</h2>";
    }
}
