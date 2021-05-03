package com.example.aula0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaSimples extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lstSimples;
    List<String> itens;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_simples);

        //1° Passo: Preencher os itens que serão apresentados na lista
        itens = new ArrayList<String>();
        itens.add("item 1");
        itens.add("item 2");
        itens.add("item 3");
        itens.add("item 4");
        itens.add("item 5");

        // 2° Passo: Preencher o adaptador com os itens da lista e qual o layout da lista
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, itens);

        // 3° Passo: Setar o adaptador no listView
        lstSimples = findViewById(R.id.lstSimples);
        lstSimples.setAdapter(adapter);
        lstSimples.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(this, "item selecionado: " + (itens.get(position). toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "item selecionado: " + parent.getAdapter().getItem(position).toString(), Toast.LENGTH_LONG).show();
    }
}