package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NetwerkeventsController {
    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    @GetMapping("/netwerkeventsList")
    public String netwerkeventsList(Model model){
        Iterable<Netwerkevent> allNetwerkevents = netwerkeventRepository.findAll();
        model.addAttribute("netwerkevents", allNetwerkevents);
        model.addAttribute("nrVenues", netwerkeventRepository.count());
        return "netwerkeventsList";
    }
}
