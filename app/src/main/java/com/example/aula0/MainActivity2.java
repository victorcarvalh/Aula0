package com.example.aula0;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button btnFechar;
    final String TAG = "SEGUNDA_TELA";

    /*Ciclo de vida da Activity*/
    //OnCreate
    //OnStart
    //OnRestart
    //OnResume
    //OnPause
    //OnStop
    //OnDestroy


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnFechar = (Button)findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(this);
        Log.i(TAG, "OnCreate");




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "ONSTART");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "ONRESUME");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "PAUSE");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"STOP");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "DESTROY");

    }
    @Override
    public void onClick(View view) {
        if (view == btnFechar) {
            finish();
        }
    }
}