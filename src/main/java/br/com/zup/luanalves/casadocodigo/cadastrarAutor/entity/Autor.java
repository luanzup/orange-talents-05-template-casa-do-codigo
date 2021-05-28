package br.com.zup.luanalves.casadocodigo.cadastrarAutor.entity;

import br.com.zup.luanalves.casadocodigo.cadastrarAutor.dto.AutorDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String descricao;
    //private Date instanteDate = new Date(Calendar.getInstance().getTime().getTime());


    public Autor() {
    }

    public Autor(AutorDto autorDto) {
        this.nome = autorDto.getNome();
        this.email = autorDto.getEmail();
        this.descricao = autorDto.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

//    public Date getInstanteDate() {
//        return instanteDate;
//    }

}
