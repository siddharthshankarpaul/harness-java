package com.sid.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, @Value("${version}") String appVersion) {
        model.addAttribute("name", "Sid");
        model.addAttribute("version", appVersion);
        return "index";
    }
    @GetMapping(value = "/status", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("{status:200}");
    }


}
