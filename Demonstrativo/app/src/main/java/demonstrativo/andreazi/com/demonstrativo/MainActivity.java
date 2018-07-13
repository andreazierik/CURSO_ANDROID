package demonstrativo.andreazi.com.demonstrativo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText salario;
    private TextView resultadoUm;
    private TextView resultadoDois;
    private TextView resultadoTres;
    private TextView resultadoQuatro;

    private Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salario = (EditText) findViewById(R.id.salarioId);
        resultadoUm = (TextView) findViewById(R.id.resutadoUmId);
        resultadoDois = (TextView) findViewById(R.id.resutadoDoisId);
        resultadoTres = (TextView) findViewById(R.id.resutadoTresId);
        resultadoQuatro = (TextView) findViewById(R.id.resutadoQuatroId);

        botaoCalcular = (Button) findViewById(R.id.calcularId);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recupera o que foi digitado
                String recSalario = salario.getText().toString();

                //Verifica se salario vazio
                if (recSalario.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, digite o salário!", Toast.LENGTH_LONG).show();
                }else{

                    //Recupera salário
                    int resultFinalString = Integer.parseInt(recSalario);

                    //Gerar o resultado do salário em 55%
                    int resultUmFinal = (resultFinalString * 55) / 100;
                    resultadoUm.setText("Essenciais (55%): " + resultUmFinal);

                    int resultDoisFinal = (resultFinalString * 5) / 100;
                    resultadoDois.setText("Educação (5%): " + resultDoisFinal);

                    int resultTresFinal = (resultFinalString * 10) / 100;
                    resultadoTres.setText("Qual quer (10%): " + resultTresFinal);

                    int resultQuatroFinal = (resultFinalString * 30) / 100;
                    resultadoQuatro.setText("Poupança (30%): " + resultQuatroFinal);

                }

            }
        });

    }
}
