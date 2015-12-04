package br.com.crud.entity;

import javax.persistence.*;

/**
 * Created by eosilva on 04/12/2015.
 */
@Entity
public class Cidade {
    @Id
    @GeneratedValue
    @Column(name = "idCidade")
    private Long id;

    @Column(length = 50)
    private String nome;

    @ManyToOne
    @JoinColumn(name="idUf")
    private Uf uf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
