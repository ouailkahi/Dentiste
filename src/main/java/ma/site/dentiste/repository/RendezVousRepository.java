package ma.site.dentiste.repository;

import ma.site.dentiste.entity.RendezVous;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RendezVousRepository extends ReactiveCrudRepository <RendezVous,Long> {
}
