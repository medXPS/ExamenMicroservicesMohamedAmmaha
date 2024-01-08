package com.microservices.APIGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/studentFallBack")
   public String studentFallBack(){
        return" Student service  is currently down ";
    }
    @GetMapping("/courseFallBack")
    public String courseFallBack(){
        return"Course  service  is currently down ";
    }

}
