package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.repository.EditeurRepository;

import java.util.List;

@Service
public class EditeurService implements IEditeurService {

    @Autowired
    private EditeurRepository editeurRepository;

    @Override
    public List<Editeur> findAll() {
        return (List<Editeur>) editeurRepository.findAll();
    }
}
