package ma.site.dentiste.controller;


import ma.site.dentiste.service.BaseService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public abstract class BaseController<T> {

    private final BaseService<T> service;

    protected BaseController(BaseService<T> baseService) {
        this.service = baseService;
    }

    @GetMapping ("/{id}")
    public Mono<T> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public Flux<T> findAll() {
        return service.findAll();
    }


    @PostMapping("/save")
    public Mono<T> save(@RequestBody T data) {
        return service.save(data);
    }
    @PostMapping("/saveAll")
    public Flux<T> saveAll(@RequestBody List<T> listData) {
        return service.saveAll(listData);
    }

    @PutMapping("/update/{id}")
    public Mono<T> updateById(@PathVariable Long id, @RequestBody T data){
        return service.update(id,data);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }
    @DeleteMapping("/deleteAll")
    public Mono<Void> deleteAll() {
        return service.deleteAll();
    }
}
