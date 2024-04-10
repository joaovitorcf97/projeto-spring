package tech.joaovitor.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.joaovitor.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{
    
}
