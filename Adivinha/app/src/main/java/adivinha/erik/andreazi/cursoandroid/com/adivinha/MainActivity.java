package adivinha.erik.andreazi.cursoandroid.com.adivinha;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botanJogar;
    private TextView textoResultado;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botanJogar = (Button) findViewById(R.id.botaoJogarId);
        textoResultado = (TextView) findViewById(R.id.resultadoId);

        //textoResultado.setText("Texto alterado");

        botanJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeorAleatorio = randomico.nextInt(10);
                textoResultado.setText("Número escolhido: " + numeorAleatorio);
            }
        });

    }

}
