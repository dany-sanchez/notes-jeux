package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "editeur_jeu")
public class Editeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "nom_editeur")
    private String nom;

    public Editeur() {
    }

    public Editeur(String nom) {
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
