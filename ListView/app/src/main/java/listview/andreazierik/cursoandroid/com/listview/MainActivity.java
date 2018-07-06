package listview.andreazierik.cursoandroid.com.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {
            "Abatia",
            "Adrianopolis",
            "Agudos do Sul",
            "Almirante Tamandare",
            "Altamira do Parana",
            "Altania",
            "Alto Parana",
            "Alto Piquiri",
            "Alvorada do Sul",
            "Amapora",
            "Ampere",
            "Anahy",
            "Andira",
            "Angulo",
            "Antonina",
            "Antonio Olinto",
            "Apucarana",
            "Arapongas",
            "Arapoti",
            "Arapua",
            "Araruna",
            "Araucaria",
            "Ariranha do Ivai",
            "Assai",
            "Assis Chateaubriand",
            "Astorga",
            "Atalaia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adapter);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                String valorClicado = listaItens.getItemAtPosition( codigoPosicao ).toString();
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
