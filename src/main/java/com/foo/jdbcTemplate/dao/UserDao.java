package com.foo.jdbcTemplate.dao;

import com.foo.jdbcTemplate.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    public Long saveUser(User user) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("user").usingGeneratedKeyColumns("id");
        Map<String, String> params = new HashMap<>();
        params.put("name", user.getName());
        params.put("email", user.getEmail());
        return simpleJdbcInsert.executeAndReturnKey(params).longValue();
    }
}
