package com.mini.health.dao;

import com.mini.health.dto.LoginDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginDao {
    public LoginDto login(String id);
}
