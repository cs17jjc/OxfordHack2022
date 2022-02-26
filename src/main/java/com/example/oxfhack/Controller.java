package com.example.oxfhack;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", "World");//This is data you want file to display, look for ${message} in html file
        return "template"; //This is the name of the html file
    }

    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "") String name,//Can use ?name= to set request params
            Model model) {

        model.addAttribute("message", name);

        return "template";
    }


}
