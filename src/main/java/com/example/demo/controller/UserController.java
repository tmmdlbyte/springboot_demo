package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public String getUerById(@PathVariable int id) {
        System.out.println(id);
        return "get user information by id";
    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String save(User user) {return "add user"; }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String update(User user) {return "update user"; }

    @DeleteMapping("/user/{id}")
    public String deleteUerById(@PathVariable int id) {
        System.out.println(id);
        return "delete user information by id";
    }
}
