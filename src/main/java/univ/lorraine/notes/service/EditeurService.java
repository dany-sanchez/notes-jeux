package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.model.Jeu;
import univ.lorraine.notes.repository.EditeurRepository;
import univ.lorraine.notes.repository.JeuRepository;

import java.util.List;

@Service
public class EditeurService implements IEditeurService {

    @Autowired
    private EditeurRepository editeurRepository;

    @Autowired
    private JeuService jeuService;

    @Override
    public List<Editeur> findAll() {
        return (List<Editeur>) editeurRepository.findAll();
    }

    @Override
    public Editeur save(Editeur editeur) { return (Editeur) editeurRepository.save(editeur);}

    @Override
    public Editeur findById(int id) {
        return (Editeur) editeurRepository.findById((long)id).orElseThrow(() -> new IllegalArgumentException("Invalid editeur Id:" + id));
    }

    @Override
    public void delete(Editeur editeur){
        for (Jeu jeu:editeur.getJeux()) {
            jeuService.delete(jeu);
        }
        editeurRepository.delete(editeur);
    }
}
