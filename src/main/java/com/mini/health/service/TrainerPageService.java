package com.mini.health.service;

import java.util.List;

import com.mini.health.dao.TrainerPageDao;
import com.mini.health.dto.RsvDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerPageService {
    @Autowired
    TrainerPageDao trainerdao;

    public List<RsvDto> confirm(String id){
        return trainerdao.confirm(id);
    }
}
