package br.com.fmt.M02S07.controllers.dto;

import java.util.Date;

public class ConsultaRequestDTO {

    private Long idNutricionista;
    private Long idPaciente;
    private Date data;
    private String observacoes;

    public ConsultaRequestDTO(){
    }

    public ConsultaRequestDTO(Long idNutricionista, Long idPaciente, Date data, String observacoes) {
        this.idNutricionista = idNutricionista;
        this.idPaciente = idPaciente;
        this.data = data;
        this.observacoes = observacoes;
    }

    public Long getIdNutricionista() {
        return idNutricionista;
    }

    public void setIdNutricionista(Long idNutricionista) {
        this.idNutricionista = idNutricionista;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}
