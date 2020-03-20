package com.example.dubboconsumer.controller;

import com.example.dubboapi.PersonService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConsumerController {

    @Reference(version = "1.0", group = "demo-dubbo")
    private PersonService personService;

    @GetMapping("/test")
    public String test(){
        return personService.getName("aaaa");
    }
}
