package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.service.IThemeService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ThemeController {

    @Autowired
    private IThemeService themeService;

    @GetMapping("/showThemes")
    public String showThemes(Model model) {
        List<Theme> themes = themeService.findall();

        model.addAttribute("themes", themes);

        return "showThemes";
    }

    @GetMapping("/addTheme")
    public String showAddThemeForm(Theme theme) {
        return "addTheme";
    }

    @PostMapping("/addTheme")
    public String addTheme(@Valid Theme theme, BindingResult result, Model model) {
        if (result.hasErrors() || theme.getNom().trim().length() == 0) {
            model.addAttribute("Message","Erreur dans le formulaire !");
            return "addTheme";
        }

        themeService.save(theme);
        model.addAttribute("Message","Ajouté avec succès !");

        return "addTheme";
    }


    @GetMapping("/updateTheme/{id}")
    public String showUpdateThemeForm(@PathVariable("id") int id, Model model) {
        Theme theme = themeService.findById(id);

        model.addAttribute("theme", theme);
        return "updateTheme";
    }

    @PostMapping("/updateTheme/{id}")
    public String updateGenre(@PathVariable("id") long id, @Valid Theme theme,
                              BindingResult result, Model model) {
        if (result.hasErrors() || theme.getNom().trim().length() == 0) {
            model.addAttribute("Message","Erreur dans le formulaire !");
            theme.setId(id);
            return "updateTheme";
        }
        themeService.save(theme);
        model.addAttribute("Message","Edité avec succès !");
        return "updateTheme";
    }

    @GetMapping("/deleteTheme/{id}")
    public String deleteTheme(@PathVariable("id") int id, Model model) {
        Theme theme=themeService.findById(id);
        themeService.delete(theme);
        model.addAttribute("themes", themeService.findall());
        model.addAttribute("Message","Supprimé avec succès !");
        return "showThemes";
    }
}
