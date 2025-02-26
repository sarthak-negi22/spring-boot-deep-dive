package com.sarthak.FirstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController         //  Specialized version of @Controller annotation, that this is a RESTful service
public class HelloController {

    @GetMapping("/hello")           // if any request comes under domainName/helo, spring will execute this method
    public String hello() {
        return "Hello World";
    }
}
