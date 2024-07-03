package br.com.fmt.M02S07.controllers.dto;

import br.com.fmt.M02S07.entities.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PacienteResponseDTO {

    private Long id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;


}
