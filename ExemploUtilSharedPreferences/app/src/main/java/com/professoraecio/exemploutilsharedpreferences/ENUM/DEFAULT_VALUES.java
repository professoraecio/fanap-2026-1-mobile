package com.professoraecio.exemploutilsharedpreferences.ENUM;

public enum DEFAULT_VALUES {

    // Caso o dado que for acessado com a chave (key)
    // esteja vazio (nenhum dado foi cadastrado antes)
    // neste caso eu retorno o valor de fábrica
    // também conhecido com default value

    USUARIO_DEFAULT_VALUE("admin"),
    SENHA_DEFAULT_VALUE("admin"),
    RESIDENCIA_DEFAULT_VALUE("home");

    public String valor;

    DEFAULT_VALUES(String valor){
        this.valor = valor;
    }

}
