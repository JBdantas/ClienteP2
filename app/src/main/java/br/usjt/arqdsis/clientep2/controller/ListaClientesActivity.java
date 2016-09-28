package br.usjt.arqdsis.clientep2.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import br.usjt.arqdsis.clientep2.R;
import br.usjt.arqdsis.clientep2.model.Cliente;
import br.usjt.arqdsis.clientep2.model.Data;

public class ListaClientesActivity extends AppCompatActivity {
// montando lista de clientes com array
    Cliente [] lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        //continuacao de montagem de lista
        lista = Data.buscaClientes(chave);

    }
}
