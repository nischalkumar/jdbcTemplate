package com.foo.jdbcTemplate.controller;

import com.foo.jdbcTemplate.domain.User;
import com.foo.jdbcTemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public Long saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
