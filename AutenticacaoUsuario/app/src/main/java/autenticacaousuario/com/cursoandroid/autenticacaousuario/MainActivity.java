package autenticacaousuario.com.cursoandroid.autenticacaousuario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        //Cadastro
        /*firebaseAuth.createUserWithEmailAndPassword("erikidontknow@hotmail.com", "Dr@g0nboll! 10")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {//sucesso ao cadastrar usuario
                            Log.i("createUser", "Sucesso ao cadastrar usuário!!!");
                        }else{//erro ao cadastrar
                            Log.i("createUser", "Erro ao cadastrar usuário!!!", task.getException());
                        }

                    }
                });*/

        //Login do usuário
        /*firebaseAuth.signInWithEmailAndPassword("erikidontknow@hotmail.com", "Dr@g0nboll! 10")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {//sucesso ao cadastrar usuario
                            Log.i("signIn", "Sucesso ao fazer login do usuário!!!");
                        }else{//erro ao cadastrar
                            Log.i("signIn", "Erro ao fazer login do usuário!!!", task.getException());
                        }

                    }
                });*/

        //Deslogar usuário
        //firebaseAuth.signOut();

        //Verifica se logado
        if (firebaseAuth.getCurrentUser() != null) {
            Log.i("VerificaUsuario", "Usuário logado!!");
        }else {
            Log.i("VerificaUsuario", "Usuário não logado!!");
        }
    }
}
