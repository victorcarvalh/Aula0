package com.example.aula0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    EditText edtNome;
    Button btnApresentarNome;
    TextView txtNomeDigitado;
    CheckBox chkLembrar;
    RadioButton rdbopçao1;
    RadioButton rdbopçao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edtNome = (EditText)findViewById(R.id.edtNome);
        txtNomeDigitado = (TextView)findViewById(R.id.txtNomeDigiado);

        btnApresentarNome = (Button) findViewById(R.id.btnApresentarNome);
        btnApresentarNome.setOnClickListener(this);

        chkLembrar = (CheckBox)findViewById(R.id.chkLembrar);
        chkLembrar.setOnCheckedChangeListener(this);

        rdbopçao1 = (RadioButton) findViewById(R.id.rdbOpçao1);
        rdbopçao1.setOnCheckedChangeListener(this);
        rdbopçao2 = (RadioButton) findViewById(R.id.rdbOpçao2);
        rdbopçao2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == btnApresentarNome) {
            String nome =  edtNome.getText().toString();
            txtNomeDigitado.setText(nome);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        if (buttonView == chkLembrar) {
            if (b) {
                txtNomeDigitado.setText("Checkbox marcado");
            } else {
                txtNomeDigitado.setText("Checkbox desmarcado");
            }

        }else if (buttonView == rdbopçao1) {
            if (rdbopçao1.isChecked()){
                txtNomeDigitado.setText("Opção 1 marcada");

            }
        }else if (buttonView == rdbopçao2) {
            if (rdbopçao2.isChecked()){
                txtNomeDigitado.setText("Opção 2 marcada");
            }
        }


    }
}