package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    @GetMapping("/aanvragen-netwerkevents")
    public String aanvragenNetwerkevents(){

        return "admin/aanvragen-netwerkevents";
    }

    @GetMapping("/aanvragen-organisators")
    public String aanvragenOrganisators(){

        return "admin/aanvragen-organisators";
    }

    @GetMapping("/edit-netwerkevent")
    public String editNetwerkevent(Model model, @PathVariable(required = false) Integer id){
        if (id==null) return "netwerkeventdetails";
        Optional<Netwerkevent> optionalNetwerkevent = netwerkeventRepository.findById(id);
        if (optionalNetwerkevent.isPresent()) {
            model.addAttribute("netwerkevent", optionalNetwerkevent.get());
        }
        return "admin/edit-netwerkevent";
    }

    @GetMapping("/edit-organisator")
    public String editOrganisator(){

        return "admin/edit-organisator";
    }

    @GetMapping("/new-netwerkevent")
    public String newNetwerkevent(){

        return "admin/new-netwerkevent";
    }

    @GetMapping("/new-organisator")
    public String newOrganisator(){

        return "admin/new-organisator";
    }
}
