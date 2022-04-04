package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class NetwerkeventsController {
    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    private Logger logger = LoggerFactory.getLogger(NetwerkeventsController.class);

    @GetMapping("/netwerkeventsList")
    public String netwerkeventsList(Model model, @RequestParam(required = false) Integer provincieId, @RequestParam(required = false) Integer minAanwezigen, @RequestParam(required = false) Integer maxAanwezigen){
        Iterable<Netwerkevent> allNetwerkevents = netwerkeventRepository.findByFilterQuery(provincieId, minAanwezigen, maxAanwezigen);
        model.addAttribute("netwerkevents", allNetwerkevents);
        model.addAttribute("nrNetwerkevents", allNetwerkevents.spliterator().getExactSizeIfKnown());
        model.addAttribute("checkedProvincie", provincieId);
        model.addAttribute("minAanwezigen", minAanwezigen);
        model.addAttribute("maxAanwezigen", maxAanwezigen);
        return "netwerkeventsList";
    }

    @GetMapping({"/netwerkeventdetails", "/netwerkeventdetails/{id}"})
    public String netwerkeventDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "netwerkeventdetails";
        Optional<Netwerkevent> optionalNetwerkevent = netwerkeventRepository.findById(id);
        Optional<Netwerkevent> optionalPrev = netwerkeventRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Netwerkevent> optionalNext = netwerkeventRepository.findFirstByIdGreaterThanOrderById(id);
        if (optionalNetwerkevent.isPresent()) {
            model.addAttribute("netwerkevent", optionalNetwerkevent.get());
        }

        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", netwerkeventRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", netwerkeventRepository.findFirstByOrderByIdAsc().get().getId());
        }
        return "netwerkeventdetails";
    }
}
