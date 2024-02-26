package ma.site.dentiste.repository;

import ma.site.dentiste.entity.Dentiste;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DentisteRepository extends ReactiveCrudRepository<Dentiste,Long> {
}

