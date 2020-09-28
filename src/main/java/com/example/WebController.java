package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model) {
        System.out.println("saying hello world Spring Boot...");
        model.addAttribute( "message",  "Greetings from Ralph Scronce");
        return "hello";
    }

}
