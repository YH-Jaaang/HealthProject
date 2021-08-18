package com.mini.health.controller;

import javax.servlet.http.HttpSession;

import com.mini.health.dto.RsvDto;
import com.mini.health.service.LoginService;
import com.mini.health.service.TrainerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/health")
public class MainController {
    @Autowired
    LoginService loginService;
    @Autowired
    TrainerService trainerService;

    @GetMapping("/index")
    public void index(Model model) {
		model.addAttribute("js", "/js/search.js");
    }
    @PostMapping("/index")
    public String postRsv(@RequestParam("reserveTrainerName") String reserveTrainerName, @RequestParam("reserveComment") String reserveComment,@RequestParam("reserveDate") String reserveDate, HttpSession session) {
        // 멤버아이디 , 코멘트 테이블에 인서트
        RsvDto rsvDto = new RsvDto();
        rsvDto.setReserveUserId((String)session.getAttribute("id"));
        rsvDto.setReserveTrainerName(reserveTrainerName);
        rsvDto.setReserveComment(reserveComment);
        rsvDto.setReserveDate(reserveDate);
        trainerService.updateRsv(rsvDto);
        // 돌아올때 가져올것 멤버아이디
        return "redirect:/health/index";
    }
    @GetMapping("/login")
    public void login(@RequestParam(value="dbAlert", required=false) String dbAlert, Model model) {
        model.addAttribute("dbAlert", dbAlert);
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/health/index";
    }
    @GetMapping("/join")
    public void join() {
    }
    @PostMapping("/login")
	public String login(@RequestParam("id") String id, @RequestParam("pass") String pass, RedirectAttributes redirect,HttpSession session) {
        return loginService.login(id,pass,redirect,session);
	}
}
