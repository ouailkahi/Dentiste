package ma.site.dentiste.service;

import ma.site.dentiste.entity.Dentiste;
import ma.site.dentiste.entity.Service;
import ma.site.dentiste.repository.DentisteRepository;
import ma.site.dentiste.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Service
public class Services extends BaseService<Service> {

    @Autowired
    private ServiceRepository serviceRepository;


    @Override
    protected ReactiveCrudRepository<Service, Long> getRepositoy() {
        return serviceRepository;
    }

    @Override
    public Mono<Service> update(Long id, Service newData) {
        return serviceRepository.findById(id).flatMap(existingData -> {
            if(newData.getNom() != null){
                existingData.setNom(newData.getNom());
            }

            if(newData.getDescription() != null){
                existingData.setDescription(newData.getDescription());
            }

            return serviceRepository.save(existingData);
        });
    }
}
