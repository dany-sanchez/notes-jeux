package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "note_jeu")
public class Note implements Comparable<Note>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private Integer note;

    @Basic(optional = false)
    private String nomTesteur;

    @ManyToOne(targetEntity = Jeu.class)
    @JoinColumn(name = "id_jeu", referencedColumnName = "id", nullable = false)
    private Jeu jeu;

    public Note() {
    }

    public Note(Integer note, String nomTesteur, Jeu jeu) {
        this.note = note;
        this.nomTesteur = nomTesteur;
        this.jeu = jeu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public String getNomTesteur() {
        return nomTesteur;
    }

    public void setNomTesteur(String nomTesteur) {
        this.nomTesteur = nomTesteur;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note=" + note +
                ", nomTesteur='" + nomTesteur + '\'' +
                '}';
    }

    @Override
    public int compareTo(Note o) {
        if (getNote() == null || o.getNote() == null) {
            return 0;
        }
        return getNote().compareTo(o.getNote());
    }
}
