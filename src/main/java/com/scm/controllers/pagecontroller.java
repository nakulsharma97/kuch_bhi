package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Home Page");
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Home Page");
        model.addAttribute("github", "https://github.com/nakulsharma97");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(Model model) {
        return "services";
    }

    @RequestMapping("/contact")
    public String contactPage(Model model) {
        return "contact";
    }

    @RequestMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    @RequestMapping("/register")
    public String registerPage(Model model) {
        return "register";
    }

}
