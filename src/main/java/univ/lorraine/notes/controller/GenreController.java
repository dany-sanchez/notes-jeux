package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.service.IGenreService;

import javax.validation.Valid;
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

    @GetMapping("/addGenre")
    public String showSignUpForm(Genre genre) {
        return "addGenre";
    }

    @PostMapping("/addGenre")
    public String addGenre(@Valid Genre genre, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addGenre";
        }

        genreService.save(genre);

        model.addAttribute("genres", genreService.findAll());

        return "showGenres";
    }
}
