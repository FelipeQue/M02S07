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
    private Long id_nutricionista;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "id_paciente")
    private Long id_paciente;

    private Date data_consulta;
    private String observacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_nutricionista() {
        return id_nutricionista;
    }

    public void setId_nutricionista(Long id_nutricionista) {
        this.id_nutricionista = id_nutricionista;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
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
