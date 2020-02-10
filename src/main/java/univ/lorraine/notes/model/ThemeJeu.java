package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "theme_jeu")
public class ThemeJeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String nom;

    public ThemeJeu() {
    }

    public ThemeJeu(String nom) {
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
