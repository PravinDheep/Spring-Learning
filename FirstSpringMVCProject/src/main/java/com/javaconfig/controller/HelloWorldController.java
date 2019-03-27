package com.javaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {


    public String sayHello(ModelMap model) {
        model.addAttribute("Greeting","Hello World");
        return "welcome";
    }
}