package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void OnclickButtons(View view){

        switch (view.getId()){
            case R.id.btnFormulario:
                Intent goForm = new Intent(Menu.this,MainActivity.class);
                startActivity(goForm);
                break;

            case R.id.btnSalir:

                exitApp();
                break;
        }

    }

    public void exitApp(){ // Alerta que pregunta si deseamos salir o no

        AlertDialog.Builder exit = new AlertDialog.Builder(Menu.this);
        exit.setMessage("Desea Salir de la Aplicación?")
                .setCancelable(false)
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //finish();
                        finishAffinity();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog titulo= exit.create();
                titulo.setTitle("Salir");
                titulo.show();

    }

}