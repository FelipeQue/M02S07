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
public class ConsultaRequestDTO {

    // Aqui coloquei como necessárias as ids de nutricionista e paciente, para que o objeto seja buscado no Service
    private Long id_nutricionista;
    private Long id_paciente;
    private Date data_consulta;
    private String observacoes;

}
