package br.com.fmt.M02S07.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "id_nutricionista")
    private long id_nutricionista;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "id_paciente")
    private long id_paciente;

    private Date data_consulta;
    private String observacoes;





}
