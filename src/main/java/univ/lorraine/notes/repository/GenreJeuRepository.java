package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.GenreJeu;

@Repository
public interface GenreJeuRepository extends CrudRepository<GenreJeu, Long> {
}
