package com.example.dubboprovider.service;


import com.example.dubboapi.PersonService;
import org.apache.dubbo.config.annotation.Service;

@Service(timeout = 5000, version = "1.0", group = "demo-dubbo")
public class PersonServiceImpl implements PersonService {
    @Override
    public String getName(String name) {
        System.out.println("provider received: " + name);
        return name;
    }

}
