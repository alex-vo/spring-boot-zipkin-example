package com.example.service0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    @ResponseBody
    public String greeting() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8080/greeting", String.class);
        System.out.println("Received " + forEntity.getBody());
        return "ok";
    }
}
