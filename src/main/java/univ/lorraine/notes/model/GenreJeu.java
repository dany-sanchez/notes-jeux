package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "genre_jeu")
public class GenreJeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String nom;

    public GenreJeu() {
    }

    public GenreJeu(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
