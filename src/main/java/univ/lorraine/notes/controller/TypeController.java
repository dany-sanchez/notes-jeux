package univ.lorraine.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import univ.lorraine.notes.model.Theme;
import univ.lorraine.notes.model.Type;
import univ.lorraine.notes.service.ITypeService;

import javax.validation.Valid;
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

    @GetMapping("/addType")
    public String showSignUpForm(Type type) {
        return "addType";
    }

    @PostMapping("/addType")
    public String addTheme(@Valid Type type, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addType";
        }

        typeService.save(type);

        model.addAttribute("types", typeService.findAll());

        return "showTypes";
    }
}
