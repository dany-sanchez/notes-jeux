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
    private Integer ageMinimum;

    @Basic(optional = false)
    private Integer nombreJoueursMinimum;

    @Basic(optional = false)
    private Integer nombreJoueursMaximum;

    public Jeu() {
    }

    public Jeu(String nom, Type type, Genre genre, Theme theme, Editeur editeur, Integer ageMinimum, Integer nombreJoueursMinimum, Integer nombreJoueursMaximum) {
        this.nom = nom;
        this.type = type;
        this.genre = genre;
        this.theme = theme;
        this.editeur = editeur;
        this.ageMinimum = ageMinimum;
        this.nombreJoueursMinimum = nombreJoueursMinimum;
        this.nombreJoueursMaximum = nombreJoueursMaximum;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Editeur getEditeur() {
        return editeur;
    }

    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }

    public Integer getAgeMinimum() {
        return ageMinimum;
    }

    public void setAgeMinimum(Integer ageMinimum) {
        this.ageMinimum = ageMinimum;
    }

    public Integer getNombreJoueursMinimum() {
        return nombreJoueursMinimum;
    }

    public void setNombreJoueursMinimum(Integer nombreJoueursMinimum) {
        this.nombreJoueursMinimum = nombreJoueursMinimum;
    }

    public Integer getNombreJoueursMaximum() {
        return nombreJoueursMaximum;
    }

    public void setNombreJoueursMaximum(Integer nombreJoueursMaximum) {
        this.nombreJoueursMaximum = nombreJoueursMaximum;
    }
}
