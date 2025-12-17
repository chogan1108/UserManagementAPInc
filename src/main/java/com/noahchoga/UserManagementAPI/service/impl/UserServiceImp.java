package com.noahchoga.UserManagementAPI.service.impl;


import com.noahchoga.UserManagementAPI.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1L, "Noah", "noah@gmail.com"));
        userList.add(new User(2L, "Xinah", "xinah@gmail.com"));
        userList.add(new User(3L, "Mycah", "mycah@gmail.com"));
        userList.add(new User(4L, "Zayne", "zayne@gmail.com"));
    }

    public List<User> findAllUsers() {
        return userList;
    }

    public Optional<User> findUserById(Long id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    public void addUser(User user) {

        Long newId = userList.size() + 1L;
        user.setId(newId);
        userList.add(user);
    }

}
