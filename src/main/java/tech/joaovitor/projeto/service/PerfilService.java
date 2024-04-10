package tech.joaovitor.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.joaovitor.projeto.dto.PerfilDTO;
import tech.joaovitor.projeto.entity.PerfilEntity;
import tech.joaovitor.projeto.repository.PerfilRepository;

@Service
public class PerfilService {
    private PerfilRepository perfilRepository;

    public List<PerfilDTO> listarTodos() {
        List<PerfilEntity> perfis = perfilRepository.findAll();

        return perfis.stream().map(PerfilDTO::new).toList();
    }

    public PerfilDTO buscarPorId(Long id) {
        return new PerfilDTO(perfilRepository.findById(id).get());
    }

    public void inserir(PerfilDTO perfil) {
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        perfilRepository.save(perfilEntity);
    }

    public PerfilDTO alterar(PerfilDTO perfil) {
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        
        return new PerfilDTO(perfilRepository.save(perfilEntity));
    }

    public void excluir(Long id) {
        PerfilEntity perfilEntity = perfilRepository.findById(id).get();
        perfilRepository.delete(perfilEntity);
    }
}
