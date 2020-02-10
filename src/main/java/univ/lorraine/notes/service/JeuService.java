package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Jeu;
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
}
