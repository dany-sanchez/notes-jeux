package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}
