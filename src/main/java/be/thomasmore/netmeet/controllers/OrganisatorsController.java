package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Organisator;
import be.thomasmore.netmeet.repositories.OrganisatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class OrganisatorsController {
    @Autowired
    private OrganisatorRepository organisatorRepository;

    @GetMapping("/organisatorsList")
    public String netwerkeventsList(Model model){
        Iterable<Organisator> allOrganisators = organisatorRepository.findAll();
        model.addAttribute("organisators", allOrganisators);
        model.addAttribute("nrOrganisators", organisatorRepository.count());
        return "organisatorsList";
    }

    @GetMapping({"/organisatordetails", "/organisatordetails/{id}"})
    public String venueDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "netwerkeventdetails";
        Optional<Organisator> optionalOrganisator = organisatorRepository.findById(id);
        if (optionalOrganisator.isPresent()) {
            model.addAttribute("organisator", optionalOrganisator.get());
        }
        return "organisatordetails";
    }
}
