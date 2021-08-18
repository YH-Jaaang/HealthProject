package com.mini.health.dao;

import java.util.List;

import com.mini.health.dto.RsvDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TrainerPageDao {
    public List<RsvDto> confirm(String id);
}
