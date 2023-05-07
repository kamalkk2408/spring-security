package com.kishore.kamal.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

//    @RequestMapping(value="/get",method=RequestMethod.GET)
    @GetMapping(value = "/health")
    public String health(){
        System.out.printf("test");
        return "All is Well";
    }
}
