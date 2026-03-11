package com.professoraecio.exemploutilsharedpreferences.ENUM;

public enum SHARED_PREFERENCES {

    // Contém todas as chaves de acesso
    // ao cofre de dados
    // exemplos:
    // usuario
    // senha
    // residencia
    // local trabalho...
    // USUARIO_KEY , SENHA_KEY , RESIDENCIA_KEY

    USUARIO_KEY("USUARIO_KEY"),
    SENHA_KEY("SENHA_KEY"),
    RESIDENCIA_KEY("RESIDENCIA_KEY");

    // KEY e a mesma coisa que chave...

    public String chave;

    SHARED_PREFERENCES(String chave){
        this.chave = chave;
    }
}
