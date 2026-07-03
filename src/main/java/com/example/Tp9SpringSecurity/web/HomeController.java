package com.example.Tp9SpringSecurity.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Page d'accueil accessible après connexion.";
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "user";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}