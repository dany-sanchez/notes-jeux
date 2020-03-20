package univ.lorraine.notes.service;

import univ.lorraine.notes.model.*;

import java.util.List;

public interface IJeuService {

    List<Jeu> findAll();

    Jeu save(Jeu jeu);

    void delete(Jeu jeu);
}
