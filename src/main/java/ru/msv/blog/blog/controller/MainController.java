package ru.msv.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Glavnay stranica");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "stranica pro nass");
        return "about";
    }

}
