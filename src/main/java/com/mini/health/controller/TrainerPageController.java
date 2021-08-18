package com.mini.health.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.mini.health.dto.RsvDto;
import com.mini.health.service.TrainerPageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trainerpage")
public class TrainerPageController {
    @Autowired
    TrainerPageService trainerService;
    @GetMapping("/index")
    public void index() {
    }
    @GetMapping("/reserve")
    public void reserve(HttpSession session, Model model) {
        List<RsvDto> confirm = trainerService.confirm((String)session.getAttribute("id"));
        model.addAttribute("confirm", confirm);
        System.out.println("야호"+confirm);
    }
}