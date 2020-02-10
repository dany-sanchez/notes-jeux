package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.service.IEditeurService;

import java.util.List;

@Controller
public class EditeurController {

    @Autowired
    private IEditeurService editeurService;

    @GetMapping("/showEditeurs")
    public String findEditeurs(Model model) {
        List<Editeur> editeurs = editeurService.findAll();

        model.addAttribute("editeurs", editeurs);

        return "showEditeurs";
    }
}
