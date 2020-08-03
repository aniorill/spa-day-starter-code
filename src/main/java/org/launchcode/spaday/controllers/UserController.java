package org.launchcode.spaday.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    
    @PostMapping("/user/add")
    public String displayAddUserForm(){
        return "add";
    }

}
