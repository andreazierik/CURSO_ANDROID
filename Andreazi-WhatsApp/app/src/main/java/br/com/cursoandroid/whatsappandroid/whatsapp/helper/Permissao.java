package br.com.cursoandroid.whatsappandroid.whatsapp.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.BoolRes;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

import br.com.cursoandroid.whatsappandroid.whatsapp.activity.LoginActivity;

public class Permissao {

    public static boolean validaPermissoes(int requestCode, LoginActivity activity, String[] permissoes ){

        if (Build.VERSION.SDK_INT >= 23) {

            List<String> listaPermissoes = new ArrayList<String>();

            // Percorrer as premissões passadas, verificando uma a uma se já tem a premissão liberada
            for (String permissao : permissoes ){

                Boolean validaPermissao = ContextCompat.checkSelfPermission( activity, permissao ) == PackageManager.PERMISSION_GRANTED;
                if ( !validaPermissao ) listaPermissoes.add(permissao);

            }

            //Caso a lista esteja vazia, não é necessário solicitar premissão
            if ( listaPermissoes.isEmpty() ) return true;

            String[] novasPermissoes = new String[ listaPermissoes.size() ];
            listaPermissoes.toArray( novasPermissoes );

            //Solicita permissão
            ActivityCompat.requestPermissions(activity, novasPermissoes, requestCode);

        }

        return true;

    }

}