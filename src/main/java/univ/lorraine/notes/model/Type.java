package univ.lorraine.notes.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "type_jeu")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "nom_type")
    private String nom;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "type")
    private Collection<Jeu> jeux;

    public Type() {
    }

    public Type(String nom, Collection<Jeu> jeux) {
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

    @Override
    public String toString() {
        return "Type{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
