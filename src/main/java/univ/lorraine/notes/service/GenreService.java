package univ.lorraine.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.lorraine.notes.model.Editeur;
import univ.lorraine.notes.model.Genre;
import univ.lorraine.notes.model.Jeu;
import univ.lorraine.notes.repository.GenreRepository;

import java.util.List;

@Service
public class GenreService implements IGenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private JeuService jeuService;

    @Override
    public List<Genre> findAll() {
        return (List<Genre>) genreRepository.findAll();
    }

    @Override
    public Genre save(Genre genre) { return (Genre) genreRepository.save(genre);}

    @Override
    public Genre findById(int id) {
        return (Genre) genreRepository.findById((long)id).orElseThrow(() -> new IllegalArgumentException("Invalid genre Id:" + id));
    }

    @Override
    public void delete(Genre genre){
        for (Jeu jeu:genre.getJeux()) {
            jeu.setGenre(null);
            jeuService.save(jeu);
        }
        genreRepository.delete(genre);
    }
}
