package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.nio.charset.Charset;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SpinnerSede();


    }









private void SpinnerSede(){

    Integer[] imagenes= {R.drawable.imgazuero,R.drawable.imgbocas,R.drawable.imgveraguas,R.drawable.imgpanama,R.drawable.imgchiriqui,R.drawable.imgcocle,R.drawable.imgchorrera,R.drawable.imgcolon};

    ImageView imagenPortada = (ImageView) findViewById(R.id.imageView);
    Spinner sede = (Spinner) findViewById(R.id.spSede);

    ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.sede, android.R.layout.simple_spinner_item);
    sede.setAdapter(adapter);
    sede.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            Object item = parent.getItemAtPosition(pos);
            Toast.makeText(getApplicationContext(), "Hiciste click en " + item, Toast.LENGTH_SHORT).show();


            imagenPortada.setImageResource(imagenes[pos]);



        }
        public void onNothingSelected(AdapterView<?> parent) {
        }
    });




    }



public void exitMenu(View view){
    Intent goMenu = new Intent(MainActivity.this,Menu.class);
    startActivity(goMenu);
    this.finish();
}




}