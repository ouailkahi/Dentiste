package ma.site.dentiste.entity;

import javax.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import org.springframework.data.relational.core.mapping.Table;


@Entity
@Table( "avis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "note")
    private int note;

    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    @ManyToOne
    @JoinColumn(name = "dentiste_id", nullable = false)
    private Dentiste dentiste;
}

