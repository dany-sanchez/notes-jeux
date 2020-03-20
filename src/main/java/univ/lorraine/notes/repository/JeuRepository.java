package univ.lorraine.notes.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.*;

import java.util.List;

@Repository
public interface JeuRepository extends CrudRepository<Jeu, Long> {}
