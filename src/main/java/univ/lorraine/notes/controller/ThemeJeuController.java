package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.ThemeJeu;
import univ.lorraine.notes.service.IThemeJeuService;

import java.util.List;

@Controller
public class ThemeJeuController {

    @Autowired
    private IThemeJeuService themeJeuService;

    @GetMapping("showThemeJeuList")
    public String showThemeJeuList(Model model) {
        List<ThemeJeu> themeJeuList = themeJeuService.findall();

        model.addAttribute("themeJeuList", themeJeuList);

        return "showThemeJeuList";
    }
}
