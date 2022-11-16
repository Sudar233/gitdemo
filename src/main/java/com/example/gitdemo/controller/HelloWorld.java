package com.example.gitdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorld {


    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }



}
