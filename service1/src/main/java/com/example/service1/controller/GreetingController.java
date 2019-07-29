package com.example.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting(HttpServletRequest req) {
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String h = headerNames.nextElement();
            System.out.println(h + "=" + req.getHeader(h));
        }
        return "blablabla";
    }
}
