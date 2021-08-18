package com.mini.health.dao;

import java.util.List;

import com.mini.health.dto.Daily;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DailyDao{
    public List<Daily> getDailiesList(String id);

    public void insertDaily(Daily daily);
    }

