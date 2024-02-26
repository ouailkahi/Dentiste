package ma.site.dentiste.service;

import ma.site.dentiste.entity.Dentiste;
import ma.site.dentiste.repository.DentisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DentisteService extends BaseService<Dentiste>{
    @Autowired
    private DentisteRepository dentisteRepository;
    @Override
    protected ReactiveCrudRepository<Dentiste, Long> getRepositoy() {
        return dentisteRepository;
    }

    @Override
    public Mono<Dentiste> update(Long id, Dentiste newData) {
        return dentisteRepository.findById(id).flatMap(existingData -> {
            if (newData.getNom() != null) {
                existingData.setNom(newData.getNom());
            }
            if (newData.getAdresse() != null) {
                existingData.setAdresse(newData.getAdresse());
            }
            if (newData.getTelephone() != null) {
                existingData.setTelephone(newData.getTelephone());
            }
            if (newData.getEmail() != null) {
                existingData.setEmail(newData.getEmail());
            }
            if (newData.getSiteWeb() != null) {
                existingData.setSiteWeb(newData.getSiteWeb());
            }
            if (newData.getSpecialite() != null) {
                existingData.setSpecialite(newData.getSpecialite());
            }
            if (newData.getAutresInfos() != null) {
                existingData.setAutresInfos(newData.getAutresInfos());
            }

            // Save the updated entity
            return dentisteRepository.save(existingData);
        });
    }
}
