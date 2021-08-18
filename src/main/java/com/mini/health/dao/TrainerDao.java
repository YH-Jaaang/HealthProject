package com.mini.health.dao;

import java.util.HashMap;
import java.util.List;

import com.mini.health.dto.RsvDto;
import com.mini.health.dto.Trainer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TrainerDao {
        public List<Trainer> postTrainer();

        public List<Trainer> getTrainermatch(HashMap<String, String> map);

        public void updateRsv(RsvDto rsvDto);

        public List<RsvDto> confirm(String id);
}
