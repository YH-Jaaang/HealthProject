package com.mini.health.controller;

import javax.servlet.http.HttpSession;

import com.mini.health.dto.Daily;
import com.mini.health.service.DailyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class MyDataController {

    @Autowired
    DailyService dailyService;
    // 데일리서비스 오토와이어 객체생성 추가

    // 김대영 수정 get매핑 보이드 mydata에서 수정
    @GetMapping("/daily-list")
    public void getDailies(Model model) {
        model.addAttribute("js", "/js/list.js");
    }

    @GetMapping("/mydata")
    public void dataDaily(Model model) {
        model.addAttribute("js", "/js/data.js");
        System.out.println("1번째 get");
    }

    @PostMapping("/mydata")
    public void postDaily(Model model, @ModelAttribute Daily daily, HttpSession session) {
        model.addAttribute("js", "/js/data.js");
        System.out.println(daily);
        System.out.println(daily);
        daily.setC_ID((String) session.getAttribute("id"));
        System.out.println(daily);
        dailyService.insertDaily(daily);
    }
}
