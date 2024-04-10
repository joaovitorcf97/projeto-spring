package tech.joaovitor.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.joaovitor.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    
}
