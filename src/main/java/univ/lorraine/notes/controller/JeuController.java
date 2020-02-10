package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.Jeu;
import univ.lorraine.notes.service.IJeuService;

import java.util.List;

@Controller
public class JeuController {

    @Autowired
    private IJeuService jeuService;

    @GetMapping("/showJeux")
    public String showJeux(Model model) {
        List<Jeu> jeux = jeuService.findAll();

        model.addAttribute("jeux", jeux);

        return "showJeux";
    }
}
