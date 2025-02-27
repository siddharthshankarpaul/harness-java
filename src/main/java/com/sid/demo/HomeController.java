package com.sid.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, @Value("${version}") String appVersion) {
        model.addAttribute("name", "Sid");
        model.addAttribute("version", appVersion);
        return "index";
    }

    @GetMapping("/status")
    public String home() {
        System.out.println("in status");
        return "ok";
    }


}
