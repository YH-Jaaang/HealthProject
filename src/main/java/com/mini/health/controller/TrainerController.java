package com.mini.health.controller;

import com.mini.health.service.TrainerService;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.mini.health.dto.RsvDto;
import com.mini.health.dto.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    TrainerService trainerservice;

    @GetMapping("/trainerlist")
    public void matchTrainer() {

    }

    @GetMapping("/survey")
    public void survey(Model model) {
        model.addAttribute("js", "/js/exercise.js");
    }

    @GetMapping("/trainermatch")
    public void getTrainermatch() {
    }

    @PostMapping("/trainermatch")
    public void trainermatch(@RequestParam("exer0") String exer0, @RequestParam("exer1") String exer1, Model model) {
        HashMap<String, String> map = new HashMap<>();
        map.put("exer0", exer0);
        map.put("exer1", exer1);
        List<Trainer> trainers = trainerservice.getTrainermatch(map);
        model.addAttribute("trainers", trainers);
    }
    @GetMapping("/reserve")
    public void reserve(HttpSession session, Model model) {
        List<RsvDto> confirm = trainerservice.confirm((String)session.getAttribute("id"));
        model.addAttribute("confirm", confirm);
    }

}
