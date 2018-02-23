package com.leon.spring.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by leon on 2018/2/12.
 */
public abstract class BaseDao {
    public JdbcTemplate jdbcTemplate;

    // 注入JdbcTemplate实例
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
