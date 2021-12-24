package com.torryhorris;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login() {

        return "login";
    }
    @GetMapping("/signUp")
    public String signUp() {

        return "signUp";
    }
}
