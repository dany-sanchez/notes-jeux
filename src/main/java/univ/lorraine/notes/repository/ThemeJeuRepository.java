package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.ThemeJeu;

@Repository
public interface ThemeJeuRepository extends CrudRepository<ThemeJeu, Long> {
}
