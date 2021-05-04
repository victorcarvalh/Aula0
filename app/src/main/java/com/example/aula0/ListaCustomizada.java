package com.example.aula0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaCustomizada extends AppCompatActivity {


    List<String> ListaNomes;
    static ListaCostumizadaAdapter adapter;
    ListView lstCostumizada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_customizada);

        //1° Passo: Preencher os itens que serão apresentados na lista
        ListaNomes = new ArrayList<String>();
        ListaNomes.add("Victor");
        ListaNomes.add("Carol");
        ListaNomes.add("Carolina");
        ListaNomes.add("Ricardo");
        ListaNomes.add("Anne");
        ListaNomes.add("Vinicius");

        // 2° Passo: Preencher o adaptador com os itens da lista e qual o layout da lista
        adapter = new ListaCostumizadaAdapter(this, ListaNomes);

        // 3° Passo: Setar o adaptador no listView
        lstCostumizada = (ListView)findViewById(R.id.lstCustomizada);
        lstCostumizada.setAdapter((adapter));
    }


}