package tech.joaovitor.projeto.dto;

import org.springframework.beans.BeanUtils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.joaovitor.projeto.entity.PerfilEntity;

@Getter
@Setter
@NoArgsConstructor
public class PerfilDTO {
    private Long id;
    private String descricao;

    public PerfilDTO(PerfilEntity perfilEntity) {
        BeanUtils.copyProperties(perfilEntity, this);
    }
}
