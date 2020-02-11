package univ.lorraine.notes.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "editeur_jeu")
public class Editeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "nom_editeur")
    private String nom;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "editeur")
    private Collection<Jeu> jeux;

    public Editeur() {
    }

    public Editeur(String nom, Collection<Jeu> jeux) {
        this.nom = nom;
        this.jeux = jeux;
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

    public Collection<Jeu> getJeux() {
        return jeux;
    }

    public void setJeux(Collection<Jeu> jeux) {
        this.jeux = jeux;
    }
}
