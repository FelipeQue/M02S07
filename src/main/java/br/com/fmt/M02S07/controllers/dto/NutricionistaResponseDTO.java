package br.com.fmt.M02S07.controllers.dto;

import br.com.fmt.M02S07.entities.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NutricionistaResponseDTO {

    private Long id;
    private String nome;
    private String matricula;
    private int tempo_experiencia;
    private Endereco endereco;
    private String crn;
    private String especialidade;

}
