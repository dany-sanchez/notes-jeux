package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import univ.lorraine.notes.model.Type;
import univ.lorraine.notes.service.ITypeService;

import java.util.List;

@Controller
public class TypeController {

    @Autowired
    private ITypeService typeService;

    @GetMapping("/showTypes")
    public String showTypes(Model model) {
        List<Type> types = typeService.findAll();

        model.addAttribute("types", types);

        return "showTypes";
    }
}
