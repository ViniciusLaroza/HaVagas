package ads.pdm.havagas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;

import ads.pdm.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;
    private Vagas vagas;
    private AlertDialog alertDialog;
    private static final String KEY_INPUT_NOME_COMPLETO = "KEY_INPUT_NOME_COMPLETO";
    private static final String KEY_INPUT_EMAIL = "KEY_INPUT_EMAIL";
    private static final String KEY_INPUT_TELEFONE = "KEY_INPUT_TELEFONE";
    private static final String KEY_INPUT_CELL = "KEY_INPUT_CELL";
    private static final String KEY_INPUT_SEXO = "KEY_INPUT_SEXO";
    private static final String KEY_INPUT_DATANASC = "KEY_INPUT_DATANASC";
    private static final String KEY_INPUT_ANOFORMACAO = "KEY_INPUT_ANOFORMACAO";
    private static final String KEY_INPUT_ANOCONCLUSAO = "KEY_INPUT_ANOCONCLUSAO";
    private static final String KEY_INPUT_INSTITUICAO = "KEY_INPUT_INSTITUICAO";
    private static final String KEY_INPUT_TITULO = "KEY_INPUT_TITULO";
    private static final String KEY_INPUT_ORIENTADOR = "KEY_INPUT_ORIENTADOR";
    private static final String KEY_INPUT_VAGAINTERESSE = "KEY_INPUT_VAGAINTERESSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        amb = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(amb.getRoot());

        if(savedInstanceState != null){
            amb.nomeCompleto.setText(savedInstanceState.getString(KEY_INPUT_NOME_COMPLETO, ""));
            amb.email.setText(savedInstanceState.getString(KEY_INPUT_EMAIL, ""));
            amb.telefone.setText(savedInstanceState.getString(KEY_INPUT_TELEFONE, ""));
            amb.cell.setText(savedInstanceState.getString(KEY_INPUT_CELL, ""));
            amb.feminino.setText(savedInstanceState.getString(KEY_INPUT_SEXO, ""));
            amb.dataNasc.setText(savedInstanceState.getString(KEY_INPUT_DATANASC, ""));
            amb.anoFormatura.setText(savedInstanceState.getString(KEY_INPUT_ANOFORMACAO, ""));
            amb.anoConclusao.setText(savedInstanceState.getString(KEY_INPUT_ANOCONCLUSAO, ""));
            amb.instituicao.setText(savedInstanceState.getString(KEY_INPUT_INSTITUICAO, ""));
            amb.titulo.setText(savedInstanceState.getString(KEY_INPUT_TITULO, ""));
            amb.orientador.setText(savedInstanceState.getString(KEY_INPUT_ORIENTADOR, ""));
            amb.vagaInteresse.setText(savedInstanceState.getString(KEY_INPUT_VAGAINTERESSE, ""));
        }

        String[] lsFormacao = getResources().getStringArray(R.array.formacao);
        amb.formacao.setAdapter(new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lsFormacao));



        amb.salvarBt.setOnClickListener((View view)-> {
            vagas = new Vagas(amb.nomeCompleto.getText().toString(),
                              amb.email.getText().toString(),
                              amb.cbEmail.isChecked(),
                              amb.telefone.getText().toString(),
                              amb.rbComercial.isChecked()?"Comercial" : "Fixo",
                              amb.cbCell.isChecked(),
                              amb.cell.getText().toString(),
                              amb.masculino.isChecked()?"Masculino" : "Feminino",
                              amb.dataNasc.getText().toString(),
                              amb.formacao.getSelectedItem().toString(),
                              amb.anoFormatura.getText().toString(),
                              amb.anoConclusao.getText().toString(),
                              amb.instituicao.getText().toString(),
                              amb.titulo.getText().toString(),
                              amb.orientador.getText().toString(),
                              amb.vagaInteresse.getText().toString());

            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setMessage(vagas.toString());
            alertDialog.create();
            alertDialog.show();
        });


        amb.limparBt.setOnClickListener((View view)-> {
            amb.nomeCompleto.setText("");
            amb.email.setText("");
            amb.cbEmail.setChecked(false);
            amb.telefone.setText("");
            amb.rbComercial.setChecked(false);
            amb.rbFixo.setChecked(false);
            amb.cbCell.setChecked(false);
            amb.cell.setText("");
            amb.masculino.setChecked(false);
            amb.feminino.setChecked(false);
            amb.dataNasc.setText("");
            amb.anoFormatura.setText("");
            amb.anoConclusao.setText("");
            amb.instituicao.setText("");
            amb.titulo.setText("");
            amb.orientador.setText("");
            amb.vagaInteresse.setText("");
        });

        amb.cbCell.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(amb.cbCell.isChecked()){
                    amb.telefoneCell.setVisibility(View.VISIBLE);
                }else{
                    amb.telefoneCell.setVisibility(View.GONE);
                }
            }
        });

        amb.formacao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(amb.formacao.getItemAtPosition(i).toString().equals("Fundamental") || amb.formacao.getItemAtPosition(i).toString().equals("Médio")){
                    amb.anoFormatura.setVisibility(View.VISIBLE);
                    amb.anoConclusao.setVisibility(View.GONE);
                    amb.instituicao.setVisibility(View.GONE);
                    amb.titulo.setVisibility(View.GONE);
                    amb.orientador.setVisibility(View.GONE);
                }
                else if(amb.formacao.getItemAtPosition(i).toString().equals("Graduação") || amb.formacao.getItemAtPosition(i).toString().equals("Especialização")){
                    amb.anoConclusao.setVisibility(View.VISIBLE);
                    amb.instituicao.setVisibility(View.VISIBLE);
                    amb.anoFormatura.setVisibility(View.GONE);
                    amb.titulo.setVisibility(View.GONE);
                    amb.orientador.setVisibility(View.GONE);
                }
                else{
                    amb.anoFormatura.setVisibility(View.GONE);
                    amb.anoConclusao.setVisibility(View.VISIBLE);
                    amb.instituicao.setVisibility(View.VISIBLE);
                    amb.titulo.setVisibility(View.VISIBLE);
                    amb.orientador.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_INPUT_NOME_COMPLETO, amb.nomeCompleto.getText().toString());
        outState.putString(KEY_INPUT_EMAIL, amb.email.getText().toString());
        outState.putString(KEY_INPUT_TELEFONE, amb.telefone.getText().toString());
        outState.putString(KEY_INPUT_CELL, amb.cell.getText().toString());
        outState.putString(KEY_INPUT_SEXO, amb.feminino.isChecked() ? "Feminino" : "Masculino");
        outState.putString(KEY_INPUT_DATANASC, amb.dataNasc.getText().toString());
        outState.putString(KEY_INPUT_ANOFORMACAO, amb.anoFormatura.getText().toString());
        outState.putString(KEY_INPUT_ANOCONCLUSAO, amb.anoConclusao.getText().toString());
        outState.putString(KEY_INPUT_INSTITUICAO, amb.instituicao.getText().toString());
        outState.putString(KEY_INPUT_TITULO, amb.titulo.getText().toString());
        outState.putString(KEY_INPUT_ORIENTADOR, amb.orientador.getText().toString());
        outState.putString(KEY_INPUT_VAGAINTERESSE, amb.vagaInteresse.getText().toString());


    }

}