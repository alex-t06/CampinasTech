package br.com.alex.agenda.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.com.alex.agenda.R;
import br.com.alex.agenda.dao.AlunoDAO;
import br.com.alex.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo aluno";
    private final AlunoDAO dao = new AlunoDAO();
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(TITULO_APPBAR);

        inicializacaoDosCampos();
        configuraBotaoSalvar();
    }

    private void configuraBotaoSalvar() {
        Button btnSalvar = findViewById(R.id.activity_formulario_aluno_btn_salvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno alunoCriado = criaAluno();
                salva(alunoCriado);
            }
        });
    }

    private void inicializacaoDosCampos() {
        campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        campoEmail = findViewById(R.id.activity_formulario_aluno_email);
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
    }

    private void salva(Aluno alunoCriado) {
        dao.salva(alunoCriado);

        finish();
    }

    private Aluno criaAluno() {
        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();
        String email = campoEmail.getText().toString();

        return new Aluno(nome, email, telefone);
    }
}