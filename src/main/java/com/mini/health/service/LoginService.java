package com.mini.health.service;

import javax.servlet.http.HttpSession;

import com.mini.health.dao.LoginDao;
import com.mini.health.dto.LoginDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Service
public class LoginService {
    @Autowired
    LoginDao loginDao;

	public String login(String id, String pass, RedirectAttributes redirect, HttpSession session) {
		LoginDto dbLogin = loginDao.login(id);
		if(dbLogin==null){
			System.out.println("존재하지 않는 회원입니다. 회원가입해주세요.");
            redirect.addAttribute("dbAlert", "1");
			return "redirect:/health/login";
		}
		else {
			if(dbLogin.getPass().equals(pass)) {
                if(dbLogin.getMLevel().equals("1")){
				    session.setAttribute("id", id);
				    return "redirect:/health/index";
                }
                else{
                    session.setAttribute("id", id);
				    return "redirect:/trainerpage/index";
                }
			}
			else{
				System.out.println("비밀번호를 다시 입력해주세요.");
                redirect.addAttribute("dbAlert", "2");
				return "redirect:/health/login";
			}
		}

	}
}
