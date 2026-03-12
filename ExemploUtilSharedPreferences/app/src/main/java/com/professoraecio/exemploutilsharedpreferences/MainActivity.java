package com.professoraecio.exemploutilsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.professoraecio.exemploutilsharedpreferences.persistencia.Persistencia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Salvar o usuario
        Persistencia.salvarUsuario(this,"jose");

        // Carregar o usuario
        String usuario = Persistencia.lerUsuario(this);

    }
}