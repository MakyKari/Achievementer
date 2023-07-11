package ru.achievementer.courses.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dialog")
public class DialogController {
    @GetMapping()
    public String home(){
        return "dialog/home";
    }
}
