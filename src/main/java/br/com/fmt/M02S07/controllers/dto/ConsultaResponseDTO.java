package br.com.fmt.M02S07.controllers.dto;

import br.com.fmt.M02S07.entities.Nutricionista;
import br.com.fmt.M02S07.entities.Paciente;

import java.util.Date;

public class ConsultaResponseDTO {

    private Long id;
    private Nutricionista nutricionista;
    private Paciente paciente;
    private Date data;
    private String observacoes;

    public ConsultaResponseDTO(){}

    public ConsultaResponseDTO(Long id, Nutricionista nutricionista, Paciente paciente, Date data, String observacoes) {
        this.id = id;
        this.nutricionista = nutricionista;
        this.paciente = paciente;
        this.data = data;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
