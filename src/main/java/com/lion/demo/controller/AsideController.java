package com.lion.demo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aside")
public class AsideController {

    @ResponseBody
    @GetMapping("/stateMsg")
    public String stateMsg(String stateMsg, HttpSession session) {
        session.setAttribute("stateMsg", stateMsg);
        return "ok";
    }
}
