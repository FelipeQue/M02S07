package br.com.fmt.M02S07.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "nutricionista")
public class Nutricionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;
    private String matricula;
    private int tempo_experiencia;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private long id_endereco;

    @Column(nullable = false)
    private String crn;
    private String especialidade;





}
