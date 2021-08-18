package com.mini.health.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.mini.health.dto.Daily;
import com.mini.health.service.DailyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mycheck")
public class MyDataRestController {
    @Autowired
    DailyService dailyService;

    @GetMapping("/dailies")
    public List<Daily> getDailies(HttpSession session){
        return dailyService.getDailyList((String)session.getAttribute("id"));
    }
}

