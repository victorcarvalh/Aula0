package com.example.aula0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    Spinner spnOpçao;
    TextView txvOpcaoSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txvOpcaoSelecionada = (TextView) findViewById(R.id.txvOpcaoSelecionada);
        //lista de informação
        ArrayList <String> opçao = new ArrayList<String>();
        ((ArrayList) opçao).add("Opção 1");
        ((ArrayList) opçao).add("Opção 2");
        ((ArrayList) opçao).add("Opção 3");

        //adaptador com o layout e as informações do spinner
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, opçao);

        //spinner preenchido
        spnOpçao = (Spinner) findViewById(R.id.spnOpçao);
        spnOpçao.setAdapter(adapter);

        //Listener
        spnOpçao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txvOpcaoSelecionada.setText(opçao.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}