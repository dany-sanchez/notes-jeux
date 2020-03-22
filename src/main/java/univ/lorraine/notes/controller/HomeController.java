package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import univ.lorraine.notes.model.Jeu;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.service.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ITypeService typeService;
    @Autowired
    private IGenreService genreService;
    @Autowired
    private IThemeService themeService;
    @Autowired
    private IEditeurService editeurService;
    @Autowired
    private IJeuService jeuService;

    @GetMapping("/")
    public String index(Model model, Jeu jeu) {

        model.addAttribute("types", typeService.findAll());
        model.addAttribute("genres", genreService.findAll());
        model.addAttribute("themes", themeService.findall());
        model.addAttribute("editeurs", editeurService.findAll());
        return "index";
    }

    @PostMapping("/filteredList")
    public String filteredList(Jeu jeu,
                               BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("Message", "Erreur dans le formulaire !");
            model.addAttribute("types", typeService.findAll());
            model.addAttribute("genres", genreService.findAll());
            model.addAttribute("themes", themeService.findall());
            model.addAttribute("editeurs", editeurService.findAll());
            return "index";
        }
        model.addAttribute("Message", "Edité avec succès !");
        List<Jeu> jeux = jeuService.filter(jeu.getType(), jeu.getGenre(), jeu.getTheme(), jeu.getNombreJoueursMinimum(),
                jeu.getNombreJoueursMaximum(), jeu.getAgeMinimum(), jeu.getEditeur());
        model.addAttribute("jeux", jeux);
        return "filteredList";
    }
}
