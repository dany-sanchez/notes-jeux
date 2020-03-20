package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String showSignUpForm(Theme theme) {
        return "addTheme";
    }

    @PostMapping("/addTheme")
    public String addTheme(@Valid Theme theme, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addTheme";
        }

        themeService.save(theme);

        model.addAttribute("themes", themeService.findall());

        return "showThemes";
    }
}
