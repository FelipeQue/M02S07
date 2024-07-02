package br.com.fmt.M02S07.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EnderecoRequestDTO {

    private String logradouro;
    private String estado;
    private String cidade;
    private String numero;
    private String cep;

}
