package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.*;
import univ.lorraine.notes.repository.JeuRepository;

import java.util.List;

@Service
public class JeuService implements IJeuService {

    @Autowired
    private JeuRepository jeuRepository;

    @Override
    public List<Jeu> findAll() {
        return (List<Jeu>) jeuRepository.findAll();
    }

    @Override
    public void delete(Jeu jeu){
        jeuRepository.delete(jeu);
    }

    @Override
    public Jeu save(Jeu jeu) { return jeuRepository.save(jeu); }
}
