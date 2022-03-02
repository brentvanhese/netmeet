package be.thomasmore.netmeet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NetwerkeventsController {
    @GetMapping("/netwerkeventsList")
    public String netwerkeventsList(Model model){

        return "netwerkeventsList";
    }
}
