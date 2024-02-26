package ma.site.dentiste.service;

import ma.site.dentiste.entity.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AvisService extends BaseService<Avis>{
    @Autowired
    private ma.site.dentiste.repository.AvisRepository RendezVousRepository;
    @Override
    protected ReactiveCrudRepository<Avis, Long> getRepositoy() {
        return RendezVousRepository;
    }
}
