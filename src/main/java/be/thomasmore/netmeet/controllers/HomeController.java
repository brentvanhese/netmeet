package be.thomasmore.netmeet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model){

        return "index";
    }

    @GetMapping({"/overOns"})
    public String overOns(Model model){
        return "overOns";
    }
}
