package univ.lorraine.notes.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import univ.lorraine.notes.model.*;

import java.util.List;

@Repository
public interface JeuRepository extends CrudRepository<Jeu, Long> {

    @Query("SELECT j FROM Jeu j WHERE (:type is null or j.type = :type) and " +
            "(:genre is null or j.genre = :genre) and (:theme is null or j.theme = :theme) and " +
            "(:nombreJoueursMinimum is null or j.nombreJoueursMinimum = :nombreJoueursMinimum) and " +
            "(:nombreJoueursMaximum is null or j.nombreJoueursMaximum = :nombreJoueursMaximum) and " +
            "(:ageMinimum is null or j.ageMinimum = :ageMinimum) and (:editeur is null or j.editeur = :editeur)")
    List<Jeu> findJeusByTypeAndGenreAndThemeAndNombreJoueursMinimumAndNombreJoueursMaximumAndAgeMinimumAndEditeur(
            @Param("type") Type type, @Param("genre") Genre genre,
            @Param("theme") Theme theme, @Param("nombreJoueursMinimum") Integer NombreJoueursMinimum,
            @Param("nombreJoueursMaximum") Integer NombreJoueursMaximum, @Param("ageMinimum") Integer AgeMinimum,
            @Param("editeur") Editeur editeur);

}
