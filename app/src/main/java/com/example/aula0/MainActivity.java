package com.example.aula0;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String NOME_TELA = "activity_main";
    Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnMostrar = (Button)findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(this);
        /*btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(NOME_TELA, "BOTAO ACIONADO 2");
            }
        });*/

        Log.v(NOME_TELA, "LOG VERBOSE");
        Log.d(NOME_TELA, "LOG DEBUG");
        Log.i(NOME_TELA, "LOG INFO");
        Log.w(NOME_TELA, "LOG WARNING");
        Log.e(NOME_TELA, "LOG ERROR");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void CliqueDoBotao(View v) {
        Log.i(NOME_TELA, "BOTAO ACIONADO 1");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view == btnMostrar) {
            Log.i(NOME_TELA, "BOTAO ACIONADO 3");
            //mostrarAlerta();
            Intent it = new Intent(this, MainActivity2.class);
            startActivity(it);
        }
    }
    public void mostrarAlerta () {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Atenção");
        alert.setMessage(R.string.msg_alert);
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText( MainActivity.this, "Botão Ok Selecionado", Toast.LENGTH_LONG).show();
                dialogInterface.dismiss();

            }
        });
        alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText( MainActivity.this, R.string.toast_cancelar, Toast.LENGTH_LONG).show();

            }
        });

        alert.show();

    }
}