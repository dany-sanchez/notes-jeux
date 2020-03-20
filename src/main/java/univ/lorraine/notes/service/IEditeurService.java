package univ.lorraine.notes.service;

import univ.lorraine.notes.model.Editeur;

import java.util.List;

public interface IEditeurService {

    List<Editeur> findAll();

    Editeur save(Editeur editeur);

    Editeur findById(int id);

    void delete(Editeur editeur);
}
