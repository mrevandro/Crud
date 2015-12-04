package br.com.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by eosilva on 04/12/2015.
 */
@Entity
public class Uf {
    @Id
    @GeneratedValue
    @Column(name = "idUf")
    private Long id;

    @Column(length = 2)
    private String sigla;

    @Column(length = 50)
    private String nome;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
}
