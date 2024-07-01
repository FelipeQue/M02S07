package br.com.fmt.M02S07.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    private Date data_nascimento;

    @Column(nullable = false)
    private String cpf;

    private String telefone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private long id_endereco;

}
