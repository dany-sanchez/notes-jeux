package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.service.IGenreService;

import java.util.List;

@Controller
public class GenreController {

    @Autowired
    private IGenreService genreService;

    @GetMapping("/showGenres")
    public String showGenres(Model model) {
        List<Genre> genres = genreService.findAll();

        model.addAttribute("genres", genres);

        return "showGenres";
    }
}
