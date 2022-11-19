package com.example.gitdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorld {


    @GetMapping("/hello")
    public String helloWorld(){

        int i = 1;

        return "hello world";
    }


    //增加数据
    @GetMapping("/hello2")
    public String helloWorld2(){
        return "test";
    }

    //增加数据3
    @GetMapping("/hello3")
    public String helloWorld3(){
        return "test3";
    }







}
