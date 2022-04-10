package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.AanvraagNetwerkevent;
import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.models.Organisator;
import be.thomasmore.netmeet.models.User;
import be.thomasmore.netmeet.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
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

    @Autowired
    private AanvragenNetwerkeventsRepository aanvragenNetwerkeventsRepository;
    @Autowired
    private LocatieRepository locatieRepository;
    @Autowired
    private VakgebiedRepository vakgebiedRepository;
    @Autowired
    private UserRepository userRepository;

    @ModelAttribute
    public AanvraagNetwerkevent findAanvraagNetwerkevent(Model model, @PathVariable(required = false) Integer id){
        if (id != null){
            Optional<AanvraagNetwerkevent> optionalAanvraagNetwerkevent = aanvragenNetwerkeventsRepository.findById(id);
            if (optionalAanvraagNetwerkevent.isPresent())return optionalAanvraagNetwerkevent.get();
        }
        return new AanvraagNetwerkevent();
    }

    @GetMapping({"/organisator/aanvraag-new-netwerkevent-organisator"})
    public String nieuwNetwerkevent(Model model, Principal principal){
        model.addAttribute("locaties", locatieRepository.findAll());
        model.addAttribute("organisators", organisatorRepository.findAll());
        model.addAttribute("vakgebieden", vakgebiedRepository.findAll());

        return "organisator/aanvraag-new-netwerkevent-organisator";
    }

    @PostMapping("/organisator/new-netwerkevent")
    public String newNetwerkeventPost(Model model, @ModelAttribute("netwerkevent") AanvraagNetwerkevent netwerkevent, Principal principal){
        Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
        if (optionalUser.isPresent()){
            Optional<Organisator> optionalOrganisator = organisatorRepository.findById(optionalUser.get().getOrganisator().getId());
            if(optionalOrganisator.isPresent()){
                netwerkevent.setOrganisator(optionalOrganisator.get());
            }
        }
        aanvragenNetwerkeventsRepository.save(netwerkevent);
        return "redirect:/netwerkeventsList/";
    }
}
