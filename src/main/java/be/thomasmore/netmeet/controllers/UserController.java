package be.thomasmore.netmeet.controllers;

import be.thomasmore.netmeet.models.User;
import be.thomasmore.netmeet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/login")
    public String login(Principal principal, Model model) {
        if (principal != null) return "redirect:/";
        return "user/login";
    }

    @GetMapping("/logout")
    public String logout(Principal principal, Model model){
        if (principal == null) return "redirect:/";
        return "user/logout";
    }

    @GetMapping("/registreer")
    public String register(Principal principal) {
        if (principal != null) return "redirect:/";
        return "user/registreer";
    }

    @PostMapping("/register")
    public String registerPost(Principal principal,
                               @RequestParam String username,
                               @RequestParam String voornaam,
                               @RequestParam String achternaam,
                               @RequestParam String password) {
        if (principal != null) return "redirect:/";
        if (username==null || username.trim().equals("")) return "redirect:/";
        if (password==null || password.trim().equals("")) return "redirect:/";
        //userName = userName.trim();
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) return "redirect:/";
        String encodedPassword = encoder.encode(password.trim());
        User user = new User(username, voornaam, achternaam, encodedPassword, "ROLE_USER");
        userRepository.save(user);
        autologin(username, password.trim());
        return "redirect:/";
    }

    private void autologin(String userName, String password) {
        UsernamePasswordAuthenticationToken token
                = new UsernamePasswordAuthenticationToken(userName, password);
        try {
            Authentication auth = authenticationManager.authenticate(token);
            SecurityContext sc = SecurityContextHolder.getContext();
            sc.setAuthentication(auth);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
    }
}
