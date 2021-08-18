package com.mini.health.dao;

import java.util.List;

import com.mini.health.dto.BestDto;
import com.mini.health.dto.ExerciseDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SearchDao {
    public List<BestDto> best();
    public List<ExerciseDto> exercise(String exercise);
    public void searchcount(String exercise);
}
