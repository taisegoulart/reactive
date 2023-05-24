package dev.ifrs.repository;

import dev.ifrs.model.Cat;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped //aqui significa que catRepository é um bean, não precisa mais dar new nele e vai estar disponível quando subir a aplicação
public class CatRepository implements PanacheRepository<Cat> {

    public Uni<Cat> persist (Cat entity){
        return PanacheRepository.super.persist(entity);    }
    
    
}
