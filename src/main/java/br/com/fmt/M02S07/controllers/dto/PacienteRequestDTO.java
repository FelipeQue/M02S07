package br.com.fmt.M02S07.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PacienteRequestDTO {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Long idEndereco;

}
