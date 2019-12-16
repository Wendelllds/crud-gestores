package com.wendell.gestores.modelo;

import java.util.Arrays;
import java.util.List;

public enum SetorEnum {

    A("A","Administração"),
    T("T","Tecnologia"),
    R("R","Recursos Humanos"),
    H("H","Suporte Técnico");

    private SetorEnum(String sigla, String nome){

    }
    private String nome;
    private  String sigla;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }



}
