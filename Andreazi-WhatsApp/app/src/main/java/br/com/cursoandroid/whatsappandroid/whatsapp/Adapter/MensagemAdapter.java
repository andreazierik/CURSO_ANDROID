package br.com.cursoandroid.whatsappandroid.whatsapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.cursoandroid.whatsappandroid.whatsapp.R;
import br.com.cursoandroid.whatsappandroid.whatsapp.helper.Preferencias;
import br.com.cursoandroid.whatsappandroid.whatsapp.model.Mensagem;

public class MensagemAdapter extends ArrayAdapter<Mensagem> {

    private Context context;
    private ArrayList<Mensagem> mensagens;

    public MensagemAdapter(Context c, ArrayList<Mensagem> objects) {
        super(c, 0, objects);
        this.context = c;
        this.mensagens = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;

        //Verifica se a lista está preenchida
        if ( mensagens != null ){

            //Recuperar dados do usuario remetente
            Preferencias preferencias = new Preferencias(context);
            String idUsuarioRemetente = preferencias.getIdentificador();

            //Inicializa objeto para montagem do layout
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            //Recupera mensagem
            Mensagem mensagem = mensagens.get( position );

            //Montar view a partir do xml
            if (idUsuarioRemetente.equals( mensagem.getIdUsuario() ) ){
                view = inflater.inflate(R.layout.item_mensagem_direita, parent, false );
            }else {
                view = inflater.inflate(R.layout.item_mensagem_esquerda, parent, false );
            }

            //Recupera elemento para exibição
            TextView textoMensagem = (TextView) view.findViewById(R.id.tv_mensagem);
            textoMensagem.setText( mensagem.getMensagem() );

        }

        return view;

    }
}