package com.foo.jdbcTemplate.service;

import com.foo.jdbcTemplate.dao.UserDao;
import com.foo.jdbcTemplate.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public Long save(User user) {
        return userDao.saveUser(user);
    }
}
