package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "jeu")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String nom;

    @ManyToOne(targetEntity = TypeJeu.class)
    @JoinColumn(name = "id_type", referencedColumnName = "id", nullable = false)
    private TypeJeu typeJeu;

    @ManyToOne(targetEntity = GenreJeu.class)
    @JoinColumn(name = "id_genre", referencedColumnName = "id", nullable = false)
    private GenreJeu genreJeu;

    @ManyToOne(targetEntity = ThemeJeu.class)
    @JoinColumn(name = "id_theme", referencedColumnName = "id", nullable = false)
    private ThemeJeu themeJeu;

    @ManyToOne(targetEntity = EditeurJeu.class)
    @JoinColumn(name = "id_editeur", referencedColumnName = "id", nullable = false)
    private EditeurJeu editeurJeu;

    @Basic(optional = false)
    private Integer AgeMinimum;

    @Basic(optional = false)
    private Integer NombreJoueursMinimum;

    @Basic(optional = false)
    private Integer NombreJoueursMaximum;
}
