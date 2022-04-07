package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.repositories.LocatieRepository;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import be.thomasmore.netmeet.repositories.OrganisatorRepository;
import be.thomasmore.netmeet.repositories.VakgebiedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private NetwerkeventRepository netwerkeventRepository;
    @Autowired
    private LocatieRepository locatieRepository;
    @Autowired
    private OrganisatorRepository organisatorRepository;
    @Autowired
    private VakgebiedRepository vakgebiedRepository;

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

    @GetMapping("/new-netwerkevent")
    public String newNetwerkevent(Model model){
        model.addAttribute("locaties", locatieRepository.findAll());
        model.addAttribute("organisators", organisatorRepository.findAll());
        model.addAttribute("vakgebieden", vakgebiedRepository.findAll());
        return "admin/new-netwerkevent";
    }

    @PostMapping("/new-netwerkevent")
    public String newNetwerkeventPost(Model model, @ModelAttribute("netwerkevent") Netwerkevent netwerkevent){
        netwerkeventRepository.save(netwerkevent);
        return "redirect:/netwerkeventdetails/"+netwerkevent.getId();
    }

    @GetMapping("/aanvragen-netwerkevents")
    public String aanvragenNetwerkevents(){

        return "admin/aanvragen-netwerkevents";
    }

    @GetMapping("/aanvragen-organisators")
    public String aanvragenOrganisators(){

        return "admin/aanvragen-organisator";
    }

    @GetMapping("/edit-organisator")
    public String editOrganisator(){

        return "admin/edit-organisator";
    }

    @GetMapping("/new-organisator")
    public String newOrganisator(){

        return "admin/new-organisator";
    }
}
