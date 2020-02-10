package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.EditeurJeu;
import univ.lorraine.notes.repository.EditeurJeuRepository;

import java.util.List;

@Service
public class EditeurJeuService implements IEditeurJeuService {

    @Autowired
    private EditeurJeuRepository editeurJeuRepository;

    @Override
    public List<EditeurJeu> findAll() {
        return (List<EditeurJeu>) editeurJeuRepository.findAll();
    }
}
