package com.example.wide.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.out.println("HOME Start");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String id = request.getParameter("userId");
        if(id.equals("admin") || id.equals("admin123")) {
            return "login";
        }else {
           return "index";
        }
    }
}
