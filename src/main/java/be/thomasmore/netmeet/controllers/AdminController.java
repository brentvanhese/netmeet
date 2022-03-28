package be.thomasmore.netmeet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/edit-netwerkevent")
    public String editNetwerkevent(){

        return "edit-netwerkevent";
    }
}
