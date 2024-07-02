package br.com.fmt.M02S07.controllers.dto;

import br.com.fmt.M02S07.entities.Nutricionista;
import br.com.fmt.M02S07.entities.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConsultaResponseDTO {

    private Nutricionista nutricionista;
    private Paciente paciente;
    private Date data_consulta;
    private String observacoes;

}
