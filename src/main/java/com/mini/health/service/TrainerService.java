package com.mini.health.service;

import java.util.HashMap;
import java.util.List;

import com.mini.health.dao.TrainerDao;
import com.mini.health.dto.RsvDto;
import com.mini.health.dto.Trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    @Autowired
    TrainerDao trainerdao;

    public List<Trainer> postTrainer() {
        return trainerdao.postTrainer();
    }

    public List<Trainer> getTrainermatch(HashMap<String, String> map) {
        return trainerdao.getTrainermatch(map);
    }
    public void updateRsv(RsvDto rsvDto) {
        trainerdao.updateRsv(rsvDto);
    }
    public List<RsvDto> confirm(String id){
        return trainerdao.confirm(id);
    }

}
