package be.thomasmore.netmeet.controllers;

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
        Optional<Organisator> optionalPrev = organisatorRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Organisator> optionalNext = organisatorRepository.findFirstByIdGreaterThanOrderById(id);
        if (optionalOrganisator.isPresent()) {
            model.addAttribute("organisator", optionalOrganisator.get());
            model.addAttribute("netwerkevents", netwerkeventRepository.findNetwerkeventByOrganisatorId(optionalOrganisator.get().getId()));
        }
        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", organisatorRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", organisatorRepository.findFirstByOrderByIdAsc().get().getId());
        }
        return "organisatordetails";
    }

    //organisator user (ingelogd)


    @Autowired
    private LocatieRepository locatieRepository;
    @Autowired
    private VakgebiedRepository vakgebiedRepository;
    @Autowired
    private UserRepository userRepository;

    @ModelAttribute
    public Netwerkevent findNetwerkevent(Model model, @PathVariable(required = false) Integer id){
        if (id != null){
            Optional<Netwerkevent> optionalNetwerkevent = netwerkeventRepository.findById(id);
            if (optionalNetwerkevent.isPresent())return optionalNetwerkevent.get();
        }
        return new Netwerkevent();
    }

    @GetMapping("/edit-netwerkevent/{id}")
    public String editNetwerkevent(Model model, @PathVariable(required = false) Integer id){
        model.addAttribute("locaties", locatieRepository.findAll());
        model.addAttribute("organisators", organisatorRepository.findAll());
        model.addAttribute("vakgebieden", vakgebiedRepository.findAll());
        return "admin/edit-netwerkevent";
    }

    @PostMapping("/edit-netwerkevent/{id}")
    public String editNetwerkeventPost(Model model, @PathVariable Integer id, @ModelAttribute("netwerkevent") Netwerkevent netwerkevent){
        netwerkeventRepository.save(netwerkevent);

        return "redirect:/netwerkeventdetails/"+id;
    }

    @GetMapping("/organisator/new-netwerkevent")
    public String newNetwerkevent(Model model){
        model.addAttribute("locaties", locatieRepository.findAll());
        model.addAttribute("organisators", organisatorRepository.findAll());
        model.addAttribute("vakgebieden", vakgebiedRepository.findAll());
        return "organisator/new-netwerkevent";
    }

    @PostMapping("/organisator/new-netwerkevent")
    public String newNetwerkeventPost(Model model, @ModelAttribute("netwerkevent") Netwerkevent netwerkevent, Principal principal){
        Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
        if (optionalUser.isPresent()){
            Optional<Organisator> optionalOrganisator = organisatorRepository.findById(optionalUser.get().getOrganisator().getId());
            if(optionalOrganisator.isPresent()){
                netwerkevent.setOrganisator(optionalOrganisator.get());
            }
        }
        netwerkeventRepository.save(netwerkevent);
        return "redirect:/netwerkeventdetails/"+netwerkevent.getId();
    }
}
