package univ.lorraine.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "note_jeu")
public class NoteJeu {

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
}
