package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //  http://localhost:8080/hello
    //  http://localhost:8080/hello?nickname=zhangsan
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String nickname){
        return "hello worl" + nickname;
    }
    //  http://localhost:8080/hellotest
    @RequestMapping(value = "/hellotest", method = RequestMethod.POST)
    public String helloTest(User user){
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        return "hello Post" ;
    }
}
