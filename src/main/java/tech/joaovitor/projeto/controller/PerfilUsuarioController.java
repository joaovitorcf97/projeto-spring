package tech.joaovitor.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.joaovitor.projeto.dto.PerfilUsuarioDTO;
import tech.joaovitor.projeto.service.PerfilUsuarioService;

@RestController
@RequestMapping(value = "perfil-usuario")
public class PerfilUsuarioController {
    @Autowired
    private PerfilUsuarioService perfilUsuarioService;

    @GetMapping
    public List<PerfilUsuarioDTO> listarTodos() {
        return perfilUsuarioService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody PerfilUsuarioDTO PerfilUsuario) {
        perfilUsuarioService.inserir(PerfilUsuario);
    }

    @PutMapping
    public PerfilUsuarioDTO alterar(@RequestBody PerfilUsuarioDTO PerfilUsuario) {
        return perfilUsuarioService.alterar(PerfilUsuario);
    }

    @DeleteMapping("/:id")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        perfilUsuarioService.excluir(id);

        return ResponseEntity.ok().build();
    }
}
