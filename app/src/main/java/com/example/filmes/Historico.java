package com.example.filmes;

import java.io.Serializable;

public class Historico implements Serializable {

    private String nome;
    private int pass;

    public Historico(String nome, int pass)
    {
        this.nome=nome;
        this.pass=pass;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getpass() {
        return pass;
    }

    public void setpass(int pass) {
        this.pass = pass;
    }


}
