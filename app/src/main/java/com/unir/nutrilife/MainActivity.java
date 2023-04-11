package com.unir.nutrilife;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    EditText nome, peso, altura;
    Button botao;
    RadioGroup genero;
    String msg = "Todos os campos devem ser preenchidos!";
    Snackbar mySnackbar = Snackbar.make(view, msg, duration);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nomeEditText);
        altura = (EditText) findViewById(R.id.alturaEditText);
        peso = (EditText) findViewById(R.id.pesoEditText);
        botao = (Button) findViewById(R.id.buttonCalcular);
        RadioGroup genero = (RadioGroup) findViewById(R.id.RadioGroupGenero);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campoVazio();
            }
        });
    }

     public void campoVazio() {

        if (TextUtils.isEmpty(nome.getText().toString())) {
            nome.setError("Todos os campos devem ser preenchidos!");
            return;
        }
        if (TextUtils.isEmpty(altura.getText().toString())) {
            altura.setError("Todos os campos devem ser preenchidos!");
            return;
        }
        if (TextUtils.isEmpty(peso.getText().toString())) {
            peso.setError("Todos os campos devem ser preenchidos!");
            return;
        }
    }
public void onRadioButtonClicked(View view) {
    // Is the button now checked?
    boolean checked = ((RadioButton) view).isChecked();

    // Check which radio button was clicked
    switch(view.getId()) {
        case R.id.radioButtonFeminino:
            if (checked)

                break;
        case R.id.radioButtonMasculino:
            if (checked)

                break;
    }
}
}