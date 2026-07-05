package com.brandverse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/favorites")
    public String favorites() {
        return "favorites";
    }

    @GetMapping("/history")
    public String history() {
        return "history";
    }

    @GetMapping("/settings")
    public String settings() {
        return "settings";
    }

    @GetMapping("/help")
    public String help() {
        return "help";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/fashion")
    public String fashion() {
        return "fashion";
    }

    @GetMapping("/footwear")
    public String footwear() {
        return "footwear";
    }

    @GetMapping("/beauty")
    public String beauty() {
        return "beauty";
    }

    @GetMapping("/accessories")
    public String accessories() {
        return "accessories";
    }

    @GetMapping("/sports")
    public String sports() {
        return "sports";
    }

    @GetMapping("/tech")
    public String tech() {
        return "tech";
    }

    @GetMapping("/travel")
    public String travel() {
        return "travel";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/trending")
    public String trending(){return "trending";}

    @GetMapping("/gohome")
    public String gohome(){return "gohome";}


}