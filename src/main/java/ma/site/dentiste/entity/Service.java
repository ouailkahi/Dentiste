package ma.site.dentiste.entity;

import javax.persistence.*;

import jakarta.annotation.Nullable;
import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@Table("services")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nullable
    private String nom;

    @Nullable
    private String description;
}
