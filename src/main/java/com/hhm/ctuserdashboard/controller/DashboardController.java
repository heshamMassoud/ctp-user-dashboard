package com.hhm.ctuserdashboard.controller;

import com.hhm.ctuserdashboard.model.User;
import com.hhm.ctuserdashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/user")
public class DashboardController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public String getUser(@PathVariable final String id, final Model model){
        final User user = userService.getUserById(id);
        final String userName = user.getName();
        model.addAttribute("user", userName);
        return "user";
    }

    @RequestMapping("/")
    public String getAll(final Model model){
        final List<User> allUsers = StreamSupport.stream(userService.listAllUsers().spliterator(), false)
                .collect(Collectors.toList());
        model.addAttribute("listOfUsers", allUsers);
        return "table";
    }
}
