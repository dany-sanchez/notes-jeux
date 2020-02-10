package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
}
