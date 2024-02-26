package ma.site.dentiste.service;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
@Service
public abstract class BaseService<T> {

    protected abstract ReactiveCrudRepository<T,Long> getRepositoy();

    public Mono<T> findById(Long id) {
        return getRepositoy().findById(id)
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,"This id is not exists")));
    }

    public Flux<T> findAll(){
        return getRepositoy().findAll();
    }

    public Mono<T> save(T data){
        return getRepositoy().save(data);
    }

    public Flux<T> saveAll(List<T> listData){
        return getRepositoy().saveAll(listData);
    }

    public Mono<T> update(Long id, T newData) {
        return findById(id).flatMap(existingData -> {
            // Update the existing entity with new data
            return save(newData);
        });
    }

    public Mono<Void> deleteById(Long id){
        return findById(id).flatMap(it -> getRepositoy().deleteById(id));


    }

    public Mono<Void> deleteAll(){
        return getRepositoy().deleteAll();
    }
}
