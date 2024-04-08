package com.trustify.railway.controller;

import com.trustify.railway.model.User;
import com.trustify.railway.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/")
    public Iterable<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/add")
    public User save(@RequestBody User user){
        return this.userService.save(user);
    }
}
