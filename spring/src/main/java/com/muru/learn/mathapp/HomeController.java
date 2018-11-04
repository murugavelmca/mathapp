package com.muru.learn.mathapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private AddService addService;
    @GetMapping("/home")
    public String hello(Model model) {
        model.addAttribute("name", "Spring Boot");
        addService.add(1,1);
        return "index";
    }

    @GetMapping("/error")
    public String erron(Model model) {
        return "error";
    }
}
