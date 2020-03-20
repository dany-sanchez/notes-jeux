package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.service.IEditeurService;

import javax.validation.Valid;
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

    @GetMapping("/addEditeur")
    public String showSignUpForm(Editeur editeur) {
        return "addEditeur";
    }

    @PostMapping("/addEditeur")
    public String addEditeur(@Valid Editeur editeur, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addEditeur";
        }

        editeurService.save(editeur);

        model.addAttribute("editeurs", editeurService.findAll());

        return "showEditeurs";
    }
}
