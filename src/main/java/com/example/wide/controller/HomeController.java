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
            request.setAttribute("msg", "로그인 성공");
            return "alert";
        }else {
           request.setAttribute("msg", "등록된 아이디가 아닙니다.");
           return "alert";
        }
    }
}
