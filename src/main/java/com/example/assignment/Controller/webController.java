package com.example.assignment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {

    @GetMapping("/world")
    public String helloWorld(){

        return "Hello Friends";
    }
}
