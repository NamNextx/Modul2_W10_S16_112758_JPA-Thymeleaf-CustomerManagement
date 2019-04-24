package com.codegym.cm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/hello_Nam")
    public String helloNam(){
        return "index";
    }

}

