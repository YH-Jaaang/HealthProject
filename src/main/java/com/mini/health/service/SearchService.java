package com.mini.health.service;

import java.util.List;

import com.mini.health.dao.SearchDao;
import com.mini.health.dto.BestDto;
import com.mini.health.dto.ExerciseDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
    @Autowired
    SearchDao searchDao;
    public List<BestDto> best(){
        return searchDao.best();
    }
    public List<ExerciseDto> exercise(String exercise){
        return searchDao.exercise(exercise);
    }
    public void searchcount(String exercise){
        searchDao.searchcount(exercise);
    }
    
}
