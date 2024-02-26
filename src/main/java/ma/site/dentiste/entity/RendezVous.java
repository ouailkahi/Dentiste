package ma.site.dentiste.entity;

import javax.persistence.*;
import lombok.*;
import org.springframework.data.relational.core.mapping.Table;


import java.time.LocalDateTime;

@Entity
@Table("rendez_vous")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_patient")
    private String nomPatient;

    @Column(name = "date_heure")
    private LocalDateTime dateHeure;

    @Column(name = "telephone_patient")
    private String telephonePatient;

    @Column(name = "email_patient")
    private String emailPatient;

    @Column(name = "commentaire")
    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "dentiste_id", nullable = false)
    private Dentiste dentiste;
}
