package univ.lorraine.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.Type;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {
}
