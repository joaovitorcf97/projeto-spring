package tech.joaovitor.projeto.dto;

import org.springframework.beans.BeanUtils;

import tech.joaovitor.projeto.entity.RecursoEntity;

public class RecursoDTO {
    private Long id;
    private String nome;
    private String chave;

    public RecursoDTO() {

    }

    public RecursoDTO(RecursoEntity recursoEntity) {
        BeanUtils.copyProperties(recursoEntity, this);
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getChave() {
        return chave;
    }
    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecursoDTO other = (RecursoDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
