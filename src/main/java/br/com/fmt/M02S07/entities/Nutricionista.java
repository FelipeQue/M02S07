package br.com.fmt.M02S07.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "nutricionista")
public class Nutricionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String matricula;
    private int tempo_experiencia;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Long id_endereco;

    @Column(nullable = false)
    private String crn;
    private String especialidade;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTempo_experiencia() {
        return tempo_experiencia;
    }

    public void setTempo_experiencia(int tempo_experiencia) {
        this.tempo_experiencia = tempo_experiencia;
    }

    public Long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Long id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
