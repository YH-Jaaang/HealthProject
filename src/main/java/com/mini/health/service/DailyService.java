package com.mini.health.service;

import java.util.List;

import com.mini.health.dao.DailyDao;
import com.mini.health.dto.Daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyService {
    @Autowired
    DailyDao dailyDao;
    
    public List<Daily> getDailyList(String id){
        return dailyDao.getDailiesList(id);
    }
    public void insertDaily(Daily daily){
        dailyDao.insertDaily(daily);
    }
}
