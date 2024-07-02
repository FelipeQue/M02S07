package br.com.fmt.M02S07.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NutricionistaRequestDTO {

    private String nome;
    private String matricula;
    private int tempo_experiencia;
    private Long id_endereco;
    private String crn;
    private String especialidade;

}
