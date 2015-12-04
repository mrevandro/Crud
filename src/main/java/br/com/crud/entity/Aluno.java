package br.com.crud.entity;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by eosilva on 04/12/2015.
 */
@Entity
public class Aluno {
    @Id
    @Column(name = "idAluno")
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(length = 30)
    private String complemento;

    @Column(length = 5)
    private String numero;

    @Column(length = 10)
    private String telefone;

    @Column(length = 11)
    private String celular;

    @Column(length = 50)
    private String email;

    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;

    @Column(length = 11)
    private String cpf;

    @Column(length = 10)
    private String rg;

    @Column
    private Boolean ativo;


    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="idLogradouro")
    private Logradouro logradouro;

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
