package univ.lorraine.notes.service;

import univ.lorraine.notes.model.*;

import java.util.List;

public interface IJeuService {

    List<Jeu> findAll();

    Jeu save(Jeu jeu);

    void delete(Jeu jeu);

    List<Jeu> filter(Type type, Genre genre, Theme theme, Integer NombreJoueursMinimum, Integer NombreJoueursMaximum, Integer AgeMinimum, Editeur editeur);

}
