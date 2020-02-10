package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.repository.GenreRepository;

import java.util.List;

@Service
public class GenreService implements IGenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<Genre> findAll() {
        return (List<Genre>) genreRepository.findAll();
    }
}
