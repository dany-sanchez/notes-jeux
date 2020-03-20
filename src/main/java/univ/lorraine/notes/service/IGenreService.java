package univ.lorraine.notes.service;

import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.model.Genre;

import java.util.List;

public interface IGenreService {

    List<Genre> findAll();

    Genre save(Genre genre);

    Genre findById(int id);

    void delete(Genre genre);
}
