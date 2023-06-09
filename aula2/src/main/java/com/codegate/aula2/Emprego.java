package com.codegate.aula2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // diz que vai ser criada uma tabela na base de dados
public class Emprego {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) //  cria o ID automaticamente e diz que esse ID seria nossa primary key
    private long id;

    @NotNull
    @Size(min = 4)
    private String titulo;

    @NotNull
    @Size(min = 3)
    private String empresa;

    @NotNull
    @Size(min = 10)
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
