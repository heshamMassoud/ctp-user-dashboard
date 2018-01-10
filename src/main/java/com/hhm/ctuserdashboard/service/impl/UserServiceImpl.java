package com.hhm.ctuserdashboard.service.impl;

import com.hhm.ctuserdashboard.model.User;
import com.hhm.ctuserdashboard.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserServiceImpl implements UserService {


    @Override
    public Iterable<User> listAllUsers() {

        final ArrayList<User> users = new ArrayList<>();
        users.add(new User("Hesham"));
        users.add(new User("Lam"));
        users.add(new User("Luis"));
        return users;
    }

    @Override
    public User getUserById(String id) {
        return new User("Hesham");
    }

    @Override
    public User saveUser(User user) {
        return null;
    }
}
