package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.Charset;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
Spinner sede;
TextView textPrueba;
RadioButton rbOcupado,rbEmpleado,rbIndependiente;
    static int valSede[] = new int[7];
    static int valempleo[][]= new int[7][22];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sede = findViewById(R.id.spSede);
        SpinnerSede();
        textPrueba = findViewById(R.id.txtPrueba);
        rbOcupado = findViewById(R.id.rbOcupado);
        rbEmpleado = findViewById(R.id.rbEmpleado);
        rbIndependiente = findViewById(R.id.rbIndependiente);
    }



public static class StaticValue{
        static int position;
        static int sedeValor[];
}





private void SpinnerSede(){

    Integer[] imagenes= {R.drawable.imgazuero,R.drawable.imgbocas,R.drawable.imgveraguas,R.drawable.imgpanama,R.drawable.imgchiriqui,R.drawable.imgcocle,R.drawable.imgchorrera,R.drawable.imgcolon};

    ImageView imagenPortada = (ImageView) findViewById(R.id.imageView);

    ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.sede, android.R.layout.simple_spinner_item);
    sede.setAdapter(adapter);
    sede.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            Object item = parent.getItemAtPosition(pos);
            //Toast.makeText(getApplicationContext(), "Hiciste click en " + item, Toast.LENGTH_SHORT).show();
            imagenPortada.setImageResource(imagenes[pos]);
            StaticValue.position=pos;
        }
        public void onNothingSelected(AdapterView<?> parent) {
        }
    });


    }



public void exitMenu(View view){
    Intent goMenu = new Intent(MainActivity.this,Menu.class);
    startActivity(goMenu);
  //  this.finish();
}


public void procesar(View view){


   // int valSede[] = new int[8];
//    valSede[StaticValue.position]++;



/*
    String nombreSede[] = {"Azuero","Bocas", "Veraguas","Panama","Chiriqui","Cocle","Chorrera","Colon"};
    SharedPreferences preferences=getSharedPreferences(nombreSede[StaticValue.position], Context.MODE_PRIVATE);
    SharedPreferences.Editor editor=preferences.edit();
    editor.putInt(nombreSede[StaticValue.position], valSede[StaticValue.position]);
    editor.commit();
*/
    valSede[StaticValue.position]=valSede[StaticValue.position]+1;
    String resultado = String.valueOf(valSede[StaticValue.position]);
textPrueba.setText(resultado);
    Toast.makeText(getApplicationContext(), "Posición: "+StaticValue.position+" | Valor: "+valSede[StaticValue.position], Toast.LENGTH_SHORT).show();
//rbEmpleo();


    if (rbOcupado.isChecked() == true) {
        valempleo[StaticValue.position][1]=valempleo[StaticValue.position][1]+1;
        Toast.makeText(getApplicationContext(), "Desocupado | Posición: "+StaticValue.position+",1 | Valor: "+valempleo[StaticValue.position][1], Toast.LENGTH_SHORT).show();

    }
        if (rbEmpleado.isChecked() == true) {
            valempleo[StaticValue.position][2]=valempleo[StaticValue.position][2]+1;
            Toast.makeText(getApplicationContext(), "Empleado | Posición: "+StaticValue.position+",2 | Valor: "+valempleo[StaticValue.position][2], Toast.LENGTH_SHORT).show();

        }
            if (rbIndependiente.isChecked() == true) {
                valempleo[StaticValue.position][3]=valempleo[StaticValue.position][3]+1;
                Toast.makeText(getApplicationContext(), "Independiente | Posición: "+StaticValue.position+",3 | Valor: "+valempleo[StaticValue.position][3], Toast.LENGTH_SHORT).show();

            }






}
/*

    public void rbEmpleo(){


        if (rbOcupado.isChecked() == true) {
            valempleo[StaticValue.position][1]=valempleo[StaticValue.position][1]++;
            Toast.makeText(getApplicationContext(), "Desocupado | Posición: "+StaticValue.position+",1 | Valor: "+valempleo[StaticValue.position][1], Toast.LENGTH_SHORT).show();

        } else {
            if (rbEmpleado.isChecked() == true) {
                valempleo[StaticValue.position][2]=valempleo[StaticValue.position][2]++;
                Toast.makeText(getApplicationContext(), "Empleado | Posición: "+StaticValue.position+",2 | Valor: "+valempleo[StaticValue.position][2], Toast.LENGTH_SHORT).show();

            } else {
                if (rbIndependiente.isChecked() == true) {
                    valempleo[StaticValue.position][3]=valempleo[StaticValue.position][3]++;
                    Toast.makeText(getApplicationContext(), "Independiente | Posición: "+StaticValue.position+",3 | Valor: "+valempleo[StaticValue.position][3], Toast.LENGTH_SHORT).show();

                }
            }
        }


    }*/

}