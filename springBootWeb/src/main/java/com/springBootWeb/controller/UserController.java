package com.springBootWeb.controller;

import com.springBootWeb.entities.User;
import com.springBootWeb.services.UserService;
import com.springBootWeb.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }

    public User addUser(User u){
        return userService.addUser(u);
    }
}
