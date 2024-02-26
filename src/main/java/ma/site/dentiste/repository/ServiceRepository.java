package ma.site.dentiste.repository;

import ma.site.dentiste.entity.Service;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ServiceRepository extends ReactiveCrudRepository<Service,Long> {
}
