package br.com.fmt.M02S07.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    private Date data_consulta;
    private String observacoes;

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

    public Date getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
