package com.peaksoft.controller;

import com.peaksoft.entity.User;
import com.peaksoft.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public String hello(){
        return "hello";
    }

    @GetMapping("/users")
    public String users(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }
    @GetMapping("/saveUser")
    private String save(Model model){
        model.addAttribute("user",new User());
        return "saveUser";
    }

    @GetMapping("/profile")
    public String profile(Model model, HttpServletRequest request){
        Principal principal = request.getUserPrincipal();
        model.addAttribute("user",userService.getUserByUserName(principal.getName()));
        return "profile";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
