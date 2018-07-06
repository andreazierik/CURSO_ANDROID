package sharedpreferences.andreazierik.cursoandroid.com.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText textoNome;
    private Button botaoSalvar;
    private TextView textoResultado;

    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNome = (EditText) findViewById(R.id.textoId);
        botaoSalvar = (Button) findViewById(R.id.botaoId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if (textoNome.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Por favor, preencher o nome", Toast.LENGTH_SHORT).show();
                }else{
                    editor.putString("nome", textoNome.getText().toString());
                    editor.commit();
                    textoResultado.setText("Olá, " + textoNome.getText().toString());
                }
            }
        });

        //Recuperar os dados salvos
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        if (sharedPreferences.contains("nome")) {
            String nomedUsuario = sharedPreferences.getString("nome", "usuário não definido");
            textoResultado.setText("Olá, " + nomedUsuario);
        }else{
            textoResultado.setText("Olá, usuário não definido");
        }

    }
}
