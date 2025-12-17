package com.noahchoga.UserManagementAPI.controller;

import com.noahchoga.UserManagementAPI.entity.User;
import com.noahchoga.UserManagementAPI.service.impl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceImp userServiceImp;

    @Autowired
    public UserController(UserServiceImp userServiceImp1) {
        this.userServiceImp = userServiceImp1;
    }

    //Endpoint to get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userServiceImp.findAllUsers();
    }

    //Endpoint to get user by id
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userServiceImp.findUserById(id);
    }

    //Endpoint to Post user
    @PostMapping("/create")
    public void addUser(@RequestBody User user) {
        userServiceImp.addUser(user);

    }

}
