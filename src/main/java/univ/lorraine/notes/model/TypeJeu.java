package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "type_jeu")
public class TypeJeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "nom_type")
    private String nom;

    public TypeJeu() {
    }

    public TypeJeu(String nom) {
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
