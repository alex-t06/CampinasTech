package br.com.alex.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.com.alex.agenda.R;
import br.com.alex.agenda.dao.AlunoDAO;
import br.com.alex.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDAO dao = new AlunoDAO();

        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        Button btnSalvar = findViewById(R.id.activity_formulario_aluno_btn_salvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno alunoCriado = new Aluno(nome, email, telefone);
                dao.salva(alunoCriado);

                finish();
            }
        });
    }
}