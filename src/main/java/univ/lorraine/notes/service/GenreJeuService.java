package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.GenreJeu;
import univ.lorraine.notes.repository.GenreJeuRepository;

import java.util.List;

@Service
public class GenreJeuService implements IGenreJeuService {

    @Autowired
    private GenreJeuRepository genreJeuRepository;

    @Override
    public List<GenreJeu> findAll() {
        return (List<GenreJeu>) genreJeuRepository.findAll();
    }
}
