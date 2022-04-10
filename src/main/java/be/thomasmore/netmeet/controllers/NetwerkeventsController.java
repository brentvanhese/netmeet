package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.Netwerkevent;
import be.thomasmore.netmeet.models.User;
import be.thomasmore.netmeet.repositories.NetwerkeventRepository;
import be.thomasmore.netmeet.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@Controller
public class NetwerkeventsController {
    @Autowired
    private NetwerkeventRepository netwerkeventRepository;

    @Autowired
    private UserRepository userRepository;

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
    public String netwerkeventDetails(Model model, @PathVariable(required = false) Integer id, Principal principal) {
        if (id==null) return "netwerkeventdetails";
        Optional<Netwerkevent> optionalNetwerkevent = netwerkeventRepository.findById(id);
        Optional<Netwerkevent> optionalPrev = netwerkeventRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Netwerkevent> optionalNext = netwerkeventRepository.findFirstByIdGreaterThanOrderById(id);
        if (optionalNetwerkevent.isPresent()) {
            model.addAttribute("netwerkevent", optionalNetwerkevent.get());
            model.addAttribute("users", optionalNetwerkevent.get().getUsers());
            if(principal!=null){
                Optional<User> optionalUser = userRepository.findByUsername(principal.getName());
                model.addAttribute("user", optionalUser.get());
                if (optionalUser.isPresent()){
                    model.addAttribute("user", optionalUser.get());
                }
            }
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

    @PostMapping("/going")
    public String netwerkeventGoingPost(Principal principal, @RequestParam int netwerkeventId, @RequestParam int userId) {
        Optional<Netwerkevent> optionalNetwerkevent = netwerkeventRepository.findById(netwerkeventId);
        if (optionalNetwerkevent.isPresent() && principal!=null) {
            Netwerkevent netwerkevent = optionalNetwerkevent.get();
            Optional<User> optionalUser = userRepository.findById(userId);
            if (optionalUser.isPresent()) {
                User user = optionalUser.get();
                if (user.getUsername().equals(principal.getName())) {
                    Collection<User> goingUser = netwerkevent.getUsers();
                    if (goingUser.contains(user)) {
                        goingUser.remove(user);
                    } else {
                        goingUser.add(user);
                    }
                    netwerkevent.setUsers(goingUser);
                    netwerkeventRepository.save(netwerkevent);
                }
            }
        }
        return "redirect:/netwerkeventdetails/"+netwerkeventId;
    }
}
