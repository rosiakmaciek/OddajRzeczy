package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.model.User;
import pl.coderslab.repository.GiftRepository;
import pl.coderslab.repository.InstitutionRepository;
import pl.coderslab.repository.UserRepository;

@Controller
public class MainController {

    @Autowired
    private GiftRepository giftRepository;

    @Autowired
    private InstitutionRepository institutionRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model model) {

        model.addAttribute("user", new User());

        return "/index";
    }

}
