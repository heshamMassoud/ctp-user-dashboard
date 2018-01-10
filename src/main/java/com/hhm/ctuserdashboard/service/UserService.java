package com.hhm.ctuserdashboard.service;

import com.hhm.ctuserdashboard.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Iterable<User> listAllUsers();

    User getUserById(String id);

    User saveUser(User user);
}
