package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.Jeu;

@Repository
public interface JeuRepository extends CrudRepository<Jeu, Long> {
}
