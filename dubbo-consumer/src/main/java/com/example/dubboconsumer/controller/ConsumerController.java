package com.example.dubboconsumer.controller;

import com.example.dubboapi.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConsumerController {

    @Autowired
    private PersonService personService;
}
