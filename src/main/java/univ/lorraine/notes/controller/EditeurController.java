package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String showAddEditeurForm(Editeur editeur) {
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

    @GetMapping("/updateEditeur/{id}")
    public String showUpdateEditeurForm(@PathVariable("id") int id, Model model) {
        Editeur editeur = editeurService.findById(id);

        model.addAttribute("editeur", editeur);
        return "updateEditeur";
    }

    @PostMapping("/updateEditeur/{id}")
    public String updateEditeur(@PathVariable("id") long id, @Valid Editeur editeur,
                                BindingResult result, Model model) {
        if (result.hasErrors()) {
            editeur.setId(id);
            return "updateEditeur";
        }
        editeurService.save(editeur);
        model.addAttribute("editeurs", editeurService.findAll());
        return "showEditeurs";
    }

    @GetMapping("/deleteEditeur/{id}")
    public String deleteEditeur(@PathVariable("id") int id, Model model) {
        Editeur editeur=editeurService.findById(id);
        editeurService.delete(editeur);
        model.addAttribute("editeurs", editeurService.findAll());
        return "showEditeurs";
    }
}
