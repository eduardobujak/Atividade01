package com.example.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tNome);
                TextView tsenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tsenha.getText().toString();


                if(login.equals(senha)){
                    Intent intent1 = new Intent(getApplicationContext(), Menu.class);
                    startActivity(intent1);
                }else{
                    altert("Erro");

                }



            }
        });

    }

    private void altert(String s) {

        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }


}