package com.will_ros.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by will on 7/14/2017.
 */
@Controller
public class GreetingController {

    @RequestMapping({"/", "/greetings"})
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "Anonymous") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
