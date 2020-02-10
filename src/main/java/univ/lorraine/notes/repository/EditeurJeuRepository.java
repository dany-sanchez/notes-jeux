package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.EditeurJeu;

@Repository
public interface EditeurJeuRepository extends CrudRepository<EditeurJeu, Long> {
}
