package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Login extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            TextView username =(TextView) findViewById(R.id.username);
            TextView password =(TextView) findViewById(R.id.password);

            MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

            //admin and admin

            loginbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(username.getText().toString().equals("grupo2") && password.getText().toString().equals("87654321")){
                        //correct
                        Toast.makeText(Login.this,"DatosCorrecots",Toast.LENGTH_SHORT).show();
                    }else
                        //incorrect
                        Toast.makeText(Login.this,"Datos Incorrecto !!!",Toast.LENGTH_SHORT).show();
                }
            });
            MaterialButton Salirbtn= (MaterialButton) findViewById(R.id.Salirbtn);
            Salirbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    startActivity(intent);
                }
            });


        }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater =  getMenuInflater();
        inflater.inflate(R.menu.principal,menu);
        return true;
    }


}