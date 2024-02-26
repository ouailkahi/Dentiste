package ma.site.dentiste.entity;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Table("dentistes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dentiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;

    @Nullable
    private String nom;

    @Nullable
    private String adresse;

    @Nullable
    private String telephone;

    @Nullable
    private String email;

    @Nullable
    private String siteWeb;

    @Nullable
    private String specialite;

    @Nullable
    private String autresInfos;

}
