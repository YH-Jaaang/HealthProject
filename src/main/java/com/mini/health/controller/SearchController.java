package com.mini.health.controller;



import java.util.List;

import com.mini.health.dto.BestDto;
import com.mini.health.dto.ExerciseDto;
import com.mini.health.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    SearchService searchSercvice;

    @GetMapping("/best")
    public void search(Model model) {
        List<BestDto> searchList = searchSercvice.best();
        model.addAttribute("searchList", searchList);
    }
    @GetMapping("/exercise")
    public void exercise(Model model) {
        model.addAttribute("js", "/js/search.js");
    }

    @PostMapping("/exercise")
    public void exercise(@RequestParam("exercise") String exercise, Model model) {
        List<ExerciseDto> searchList = searchSercvice.exercise(exercise);
        if(!searchList.isEmpty()){
            searchSercvice.searchcount(exercise);
            model.addAttribute("searchList", searchList);
        }
        model.addAttribute("js", "/js/search.js");
    }
    
}
