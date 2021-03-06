package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.Theme;

@Repository
public interface ThemeRepository extends CrudRepository<Theme, Long> {
}
