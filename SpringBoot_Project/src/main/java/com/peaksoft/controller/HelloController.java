package com.peaksoft.controller;

import com.peaksoft.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HelloController {
    @GetMapping
    public String mainView(Model model){
        model.addAttribute("companies",new Company());
        model.addAttribute("courses",new Course());
        model.addAttribute("teachers",new Teacher());
        model.addAttribute("groups",new Group());
        model.addAttribute("students",new Student());
        return "main";
    }
}
