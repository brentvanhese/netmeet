package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class NetwerkeventsController {
    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    @GetMapping("/netwerkeventsList")
    public String netwerkeventsList(Model model){
        Iterable<Netwerkevent> allNetwerkevents = netwerkeventRepository.findAll();
        model.addAttribute("netwerkevents", allNetwerkevents);
        model.addAttribute("nrNetwerkevents", netwerkeventRepository.count());
        return "netwerkeventsList";
    }

    @GetMapping({"/netwerkeventdetails", "/netwerkeventdetails/{id}"})
    public String venueDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "netwerkeventdetails";
        Optional<Netwerkevent> optionalNetwerkevent = netwerkeventRepository.findById(id);
        if (optionalNetwerkevent.isPresent()) {
            model.addAttribute("netwerkevent", optionalNetwerkevent.get());
        }
        return "netwerkeventdetails";
    }
}
