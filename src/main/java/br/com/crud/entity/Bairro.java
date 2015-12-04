package br.com.crud.entity;

import javax.persistence.*;

/**
 * Created by eosilva on 04/12/2015.
 */
@Entity
public class Bairro {
    @Id
    @GeneratedValue
    @Column(name = "idBairro")
    private Long id;

    @Column(length = 50)
    private String nome;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="idCidade")
    private Cidade cidade;

//	@OneToMany
//	@JoinColumn(name="idBairro", insertable=false, updatable=false)
//	private List<Logradouro> logradouros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
