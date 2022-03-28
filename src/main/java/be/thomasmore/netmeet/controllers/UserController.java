package be.thomasmore.netmeet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String login(Principal principal, Model model) {
        if (principal != null) return "redirect:/";
        return "user/login";
    }

    @GetMapping("/logout")
    public String logout(Principal principal, Model model){
        if (principal == null) return "redirect:/";
        return "user/logout";
    }
}
