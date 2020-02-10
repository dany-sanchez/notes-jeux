package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.service.IThemeService;

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
}
