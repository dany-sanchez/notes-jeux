package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.EditeurJeu;
import univ.lorraine.notes.service.IEditeurJeuService;

import java.util.List;

@Controller
public class EditeurJeuController {

    @Autowired
    private IEditeurJeuService editeurJeuService;

    @GetMapping("/showEditeurJeuList")
    public String findEditeurJeuList(Model model) {
        List<EditeurJeu> editeurJeuList = editeurJeuService.findAll();

        model.addAttribute("editeurJeuList", editeurJeuList);

        return "showEditeurJeuList";
    }
}
