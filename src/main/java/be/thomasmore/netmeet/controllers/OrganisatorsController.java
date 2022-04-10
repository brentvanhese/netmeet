package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Organisator;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import be.thomasmore.netmeet.repositories.OrganisatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class OrganisatorsController {
    @Autowired
    private OrganisatorRepository organisatorRepository;

    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    //normale user (niet ingelogd)
    @GetMapping("/organisatorsList")
    public String netwerkeventsList(Model model, @RequestParam(required = false) String keyword){
        Iterable<Organisator> allOrganisators = organisatorRepository.findByKeyword(keyword);
        model.addAttribute("organisators", allOrganisators);
        model.addAttribute("nrOrganisators", allOrganisators.spliterator().getExactSizeIfKnown());
        model.addAttribute("keyword", keyword);
        return "organisatorsList";
    }

    @GetMapping({"/organisatordetails", "/organisatordetails/{id}"})
    public String venueDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "netwerkeventdetails";
        Optional<Organisator> optionalOrganisator = organisatorRepository.findById(id);
        if (optionalOrganisator.isPresent()) {
            model.addAttribute("organisator", optionalOrganisator.get());
            model.addAttribute("netwerkevents", netwerkeventRepository.findNetwerkeventByOrganisatorId(optionalOrganisator.get().getId()));
        }
        return "organisatordetails";
    }

    //organisator user (ingelogd)
}
