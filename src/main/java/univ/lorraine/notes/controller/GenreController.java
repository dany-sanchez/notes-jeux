package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String showAddGenreForm(Genre genre) {
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

    @GetMapping("/updateGenre/{id}")
    public String showUpdateGenreForm(@PathVariable("id") int id, Model model) {
        Genre genre = genreService.findById(id);

        model.addAttribute("genre", genre);
        return "updateGenre";
    }

    @PostMapping("/updateGenre/{id}")
    public String updateGenre(@PathVariable("id") long id, @Valid Genre genre,
                                BindingResult result, Model model) {
        if (result.hasErrors()) {
            genre.setId(id);
            return "updateGenre";
        }
        genreService.save(genre);
        model.addAttribute("genres", genreService.findAll());
        return "showGenres";
    }

    @GetMapping("/deleteGenre/{id}")
    public String deleteGenre(@PathVariable("id") int id, Model model) {
        Genre genre=genreService.findById(id);
        genreService.delete(genre);
        model.addAttribute("genres", genreService.findAll());
        return "showGenres";
    }
}
