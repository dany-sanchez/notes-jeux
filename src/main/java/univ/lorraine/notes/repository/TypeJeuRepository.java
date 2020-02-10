package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.TypeJeu;

@Repository
public interface TypeJeuRepository extends CrudRepository<TypeJeu, Long> {
}
