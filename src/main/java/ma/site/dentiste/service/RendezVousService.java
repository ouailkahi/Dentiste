package ma.site.dentiste.service;

import ma.site.dentiste.entity.Dentiste;
import ma.site.dentiste.entity.RendezVous;
import ma.site.dentiste.repository.DentisteRepository;
import ma.site.dentiste.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RendezVousService extends BaseService<RendezVous>{
    @Autowired
    private RendezVousRepository RendezVousRepository;
    @Override
    protected ReactiveCrudRepository<RendezVous, Long> getRepositoy() {
        return RendezVousRepository;
    }
}
