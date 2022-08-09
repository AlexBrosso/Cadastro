package com.projeto.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox checkCb;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;
    private EditText cidadeEt;
    private Spinner ufSp;
    private Button limparBt;
    private Button salvarBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        checkCb = findViewById(R.id.checkCb);
        masculinoRb = findViewById(R.id.masculinoRb);
        femininoRb = findViewById(R.id.femininoRb);
        cidadeEt = findViewById(R.id.cidadeEt);
        ufSp = findViewById(R.id.ufSp);
        limparBt = findViewById(R.id.limparBt);
        salvarBt = findViewById(R.id.salvarBt);
        limparBt.setOnClickListener(this);
        salvarBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(R.id.limparBt == view.getId()) {
            nomeEt.getText().clear();
            telefoneEt.getText().clear();
            emailEt.getText().clear();
            checkCb.setChecked(false);
            femininoRb.setChecked(false);
            masculinoRb.setChecked(true);
            cidadeEt.getText().clear();
            ufSp.setSelection(0);
        }
        else{
            String check = checkCb.isChecked() ? "Marcado" : "Não Marcado";
            String sexo = masculinoRb.isChecked() ? "Masculino" : "Feminino";
            Formulario formulario = new Formulario(nomeEt.getText().toString(), telefoneEt.getText().toString(), emailEt.getText().toString(), check, sexo, cidadeEt.getText().toString(), ((TextView) ufSp.getSelectedView()).getText().toString());
            Toast.makeText(this, formulario.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}