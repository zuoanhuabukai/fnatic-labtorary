package com.fnatic.laboratory.controller;

import com.fnatic.laboratory.model.User;
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

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(Long id){
        User u = new User();
        u.setId(1l);
        u.setName("Tom");
        u.setAge(20);

        return u;
    }

}
