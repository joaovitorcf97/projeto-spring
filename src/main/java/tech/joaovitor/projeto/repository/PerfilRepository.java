package tech.joaovitor.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.joaovitor.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long>{
    
}
