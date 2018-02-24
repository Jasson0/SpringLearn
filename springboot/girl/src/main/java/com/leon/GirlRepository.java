package com.leon;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by leon on 2018/2/24.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}
