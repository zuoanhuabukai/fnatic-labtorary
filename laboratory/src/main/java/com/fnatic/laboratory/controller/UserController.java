package com.fnatic.laboratory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

}
