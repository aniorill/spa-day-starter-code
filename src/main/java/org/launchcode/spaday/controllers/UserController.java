package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    
    @GetMapping("add")
    public String displayAddUserForm(Model model){


        return "/user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify, @RequestParam String username, @RequestParam String email){
        model.addAttribute("username", username);
        model.addAttribute("email", email);

        Boolean passwordCorrect = verify.equals(user.getPassword());
        if(passwordCorrect){
            return "/user/index";
        } else {
            model.addAttribute("error", "Passwords do not match.");
            return "/user/add";
        }
    }
}

