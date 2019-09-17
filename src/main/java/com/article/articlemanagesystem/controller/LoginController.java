package com.article.articlemanagesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import static com.article.articlemanagesystem.util.PrintUtils.println;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        println("Login : " + username + " - " + password);
        if ("root".equals(username) && "root".equals(password)){
            request.getSession().setAttribute("user", "root");
            return "redirect:/";
        }else {

        }
        return null;
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().setAttribute("user", null);
        return "login";
    }
}
