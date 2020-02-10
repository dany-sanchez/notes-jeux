package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "jeu")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Column(name = "nom_jeu")
    private String nom;

    @ManyToOne(targetEntity = Type.class)
    @JoinColumn(name = "id_type", referencedColumnName = "id", nullable = false)
    private Type type;

    @ManyToOne(targetEntity = Genre.class)
    @JoinColumn(name = "id_genre", referencedColumnName = "id", nullable = false)
    private Genre genre;

    @ManyToOne(targetEntity = Theme.class)
    @JoinColumn(name = "id_theme", referencedColumnName = "id", nullable = false)
    private Theme theme;

    @ManyToOne(targetEntity = Editeur.class)
    @JoinColumn(name = "id_editeur", referencedColumnName = "id", nullable = false)
    private Editeur editeur;

    @Basic(optional = false)
    private Integer AgeMinimum;

    @Basic(optional = false)
    private Integer NombreJoueursMinimum;

    @Basic(optional = false)
    private Integer NombreJoueursMaximum;
}
