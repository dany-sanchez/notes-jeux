package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.GenreJeu;
import univ.lorraine.notes.service.IGenreJeuService;

import java.util.List;

@Controller
public class GenreJeuController {

    @Autowired
    private IGenreJeuService genreJeuService;

    @GetMapping("/showGenreJeuList")
    public String showGenreJeuList(Model model) {
        List<GenreJeu> genreJeuList = genreJeuService.findAll();

        model.addAttribute("genreJeuList", genreJeuList);

        return "showGenreJeuList";
    }
}
