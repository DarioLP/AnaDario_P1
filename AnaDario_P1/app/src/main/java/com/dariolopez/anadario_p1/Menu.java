package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

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
                this.finish();
                break;
            case R.id.btnResultado:
                Intent goResult = new Intent(Menu.this,Result.class);
                startActivity(goResult);
                this.finish();
                break;
            case R.id.btnSalir:
                finish();
                break;
        }


    }

    public void exitApp(View view){
        finish();
    }
}