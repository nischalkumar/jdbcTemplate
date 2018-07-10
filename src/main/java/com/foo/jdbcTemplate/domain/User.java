package com.foo.jdbcTemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
}
