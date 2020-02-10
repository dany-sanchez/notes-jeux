package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.TypeJeu;
import univ.lorraine.notes.service.ITypeJeuService;

import java.util.List;

@Controller
public class TypeJeuController {

    @Autowired
    private ITypeJeuService typeJeuService;

    @GetMapping("showTypeJeuList")
    public String showTypeJeuList(Model model) {
        List<TypeJeu> typeJeuList = typeJeuService.findAll();

        model.addAttribute("typeJeuList", typeJeuList);

        return "showTypeJeuList";
    }
}
