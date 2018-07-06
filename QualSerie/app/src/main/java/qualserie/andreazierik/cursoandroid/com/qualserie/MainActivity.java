package qualserie.andreazierik.cursoandroid.com.qualserie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekbar;
    private ImageView imagemexibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekBarId);
        imagemexibicao = (ImageView) findViewById(R.id.imgemExibicaoId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int valorProgresso = i;

                if (valorProgresso == 1) {
                    imagemexibicao.setImageResource(R.drawable.pouco);
                }else if (valorProgresso == 2) {
                    imagemexibicao.setImageResource(R.drawable.medio);
                }else if (valorProgresso == 3) {
                    imagemexibicao.setImageResource(R.drawable.muito);
                }else if (valorProgresso == 4) {
                    imagemexibicao.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
