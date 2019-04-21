package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/hello_Nam")
    public String helloNam(){
        return "index";
    }
    @GetMapping("/hello_Duy")
    public String helloNam2(){
        return "index2";
    }
    @GetMapping("/hello_Thanh")
    public String helloThanh(){
        return "index2";
    }
    @GetMapping("/hello_mom")
    public String helloMom(){
        return "index";
    }
    @GetMapping("/Test")
    public String testMapping(){
        return "test";
    }
    @GetMapping("/Test1")
    public String testMapping1(){
        return "index";
    }
    @GetMapping("/test2")
    public String testMapping2(){
        return "index3";
    }
}

