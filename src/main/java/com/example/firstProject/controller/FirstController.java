package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi-friend")
    public String niceToMeetYou(Model model) {
        model.addAttribute("userName", "puppy");
        return  "greetings"; //templates/greetings.mustaches -> 브라우저로 전송!
    }
}
