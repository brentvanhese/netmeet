package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Locatie;
import be.thomasmore.netmeet.repositories.LocatieRepository;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class LocatieController {
    @Autowired
    private LocatieRepository locatieRepository;

    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    @GetMapping("/locatie-list")
    public String locatieList(Model model){
        Iterable<Locatie> allLocaties = locatieRepository.findAll();
        model.addAttribute("locaties", allLocaties);
        model.addAttribute("nrLocaties", locatieRepository.count());
        return "locatie-list";
    }

    @GetMapping({"/locatie-details", "/locatie-details/{id}"})
    public String venueDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "netwerkeventdetails";
        Optional<Locatie> optionalLocatie = locatieRepository.findById(id);
        if (optionalLocatie.isPresent()) {
            model.addAttribute("locatie", optionalLocatie.get());
            model.addAttribute("netwerkevents", netwerkeventRepository.findNetwerkeventByLocatieId(optionalLocatie.get().getId()));
        }
        return "locatie-details";
    }
}
