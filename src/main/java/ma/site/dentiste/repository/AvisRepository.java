package ma.site.dentiste.repository;

import ma.site.dentiste.entity.Avis;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AvisRepository extends ReactiveCrudRepository<Avis,Long> {
}
