package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.Charset;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
Spinner sede, gradoEstudio, spEspanol,spIngles;
TextView textPrueba;
RadioButton rbOcupado,rbEmpleado,rbIndependiente;
CheckBox chRedes,chSoftware,chArquitectura,chInformatica;
    static int valSede[] = new int[7];
    static int valempleo[][]= new int[7][22];
    static int valGradoEstudio[][] = new int[7][5];
    static int valEspanol[][] = new int[7][5];
    static int valIngles[][] = new int[7][5];
    static int valAreaInteres[][] = new int[7][5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sede = findViewById(R.id.spSede);
        textPrueba = findViewById(R.id.txtPrueba);
        rbOcupado = findViewById(R.id.rbOcupado);
        rbEmpleado = findViewById(R.id.rbEmpleado);
        rbIndependiente = findViewById(R.id.rbIndependiente);
        gradoEstudio = findViewById(R.id.spGradoEstudio);
        spEspanol=findViewById(R.id.spEspanol);
        spIngles =findViewById(R.id.spIngles);
        chRedes = findViewById(R.id.chRedes);
        chArquitectura = findViewById(R.id.chArquitectura);
        chSoftware = findViewById(R.id.chSoftware);
        chInformatica = findViewById(R.id.chInformatica);
        SpinnerSede();
        spGradoEstudio();
        spEspanol();
        spIngles();
    }



public static class StaticValue{
        static int position;
        static int gradoPosition;
        static int espanolPosition;
        static int inglesPosition;
//        static int sedeValor[];
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


    private void spGradoEstudio(){

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.gradoEstudio, android.R.layout.simple_spinner_item);
        gradoEstudio.setAdapter(adapter);
        gradoEstudio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
                //Toast.makeText(getApplicationContext(), "Hiciste click en " + item, Toast.LENGTH_SHORT).show();
                StaticValue.gradoPosition=pos;
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }

    private void spEspanol(){

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.idioma, android.R.layout.simple_spinner_item);
        spEspanol.setAdapter(adapter);
        spEspanol.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
                //Toast.makeText(getApplicationContext(), "Hiciste click en " + item, Toast.LENGTH_SHORT).show();
                StaticValue.espanolPosition=pos;
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }


    private void spIngles(){

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.idioma, android.R.layout.simple_spinner_item);
        spIngles.setAdapter(adapter);
        spIngles.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
                //Toast.makeText(getApplicationContext(), "Hiciste click en " + item, Toast.LENGTH_SHORT).show();
                StaticValue.inglesPosition=pos;
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
    //Toast.makeText(getApplicationContext(), "Posición: "+StaticValue.position+" | Valor: "+valSede[StaticValue.position], Toast.LENGTH_SHORT).show();
//rbEmpleo();


    if (rbOcupado.isChecked() == true) {
        valempleo[StaticValue.position][0]=valempleo[StaticValue.position][0]+1;
       // Toast.makeText(getApplicationContext(), "Desocupado | Posición: "+StaticValue.position+",1 | Valor: "+valempleo[StaticValue.position][1], Toast.LENGTH_SHORT).show();
    }
    if (rbEmpleado.isChecked() == true) {
        valempleo[StaticValue.position][1]=valempleo[StaticValue.position][1]+1;
        //Toast.makeText(getApplicationContext(), "Empleado | Posición: "+StaticValue.position+",2 | Valor: "+valempleo[StaticValue.position][2], Toast.LENGTH_SHORT).show();
    }
    if (rbIndependiente.isChecked() == true) {
        valempleo[StaticValue.position][2]=valempleo[StaticValue.position][2]+1;
        //Toast.makeText(getApplicationContext(), "Independiente | Posición: "+StaticValue.position+",3 | Valor: "+valempleo[StaticValue.position][3], Toast.LENGTH_SHORT).show();
    }


    valGradoEstudio[StaticValue.position][StaticValue.gradoPosition]++;
    //Toast.makeText(getApplicationContext(), "Grado Estudio | Posición: "+StaticValue.position+","+StaticValue.gradoPosition+" | "+valGradoEstudio[StaticValue.position][StaticValue.gradoPosition], Toast.LENGTH_SHORT).show();

    valEspanol[StaticValue.position][StaticValue.espanolPosition]++;
    //Toast.makeText(getApplicationContext(), "Idioma Espanol | Posición: "+StaticValue.position+","+StaticValue.espanolPosition+" | "+valEspanol[StaticValue.position][StaticValue.espanolPosition], Toast.LENGTH_SHORT).show();

    valIngles[StaticValue.position][StaticValue.inglesPosition]++;
    //Toast.makeText(getApplicationContext(), "Idioma Ingles | Posición: "+StaticValue.position+","+StaticValue.inglesPosition+" | "+valIngles[StaticValue.position][StaticValue.inglesPosition], Toast.LENGTH_SHORT).show();


    if (chRedes.isChecked()){
        valAreaInteres[StaticValue.position][0]++;
       // Toast.makeText(getApplicationContext(), "Redes | Posición: "+StaticValue.position+",0 | "+valAreaInteres[StaticValue.position][0], Toast.LENGTH_SHORT).show();
    }

    if (chArquitectura.isChecked()){
        valAreaInteres[StaticValue.position][1]++;
        //Toast.makeText(getApplicationContext(), "Arquitectura | Posición: "+StaticValue.position+",1 | "+valAreaInteres[StaticValue.position][1], Toast.LENGTH_SHORT).show();
    }

    if (chSoftware.isChecked()){
        valAreaInteres[StaticValue.position][2]++;
        //Toast.makeText(getApplicationContext(), "Software | Posición: "+StaticValue.position+",2 | "+valAreaInteres[StaticValue.position][2], Toast.LENGTH_SHORT).show();
    }

    if (chInformatica.isChecked()){
        valAreaInteres[StaticValue.position][3]++;
        //Toast.makeText(getApplicationContext(), "Informatica educativa | Posición: "+StaticValue.position+",3 | "+valAreaInteres[StaticValue.position][3], Toast.LENGTH_SHORT).show();
    }



    String azueroString = String.valueOf(valSede[0]);
    String azueroStringDesocupado = String.valueOf(valempleo[0][0]);
    String azueroStringEmpleado = String.valueOf(valempleo[0][1]);
    String azueroStringIndependiente = String.valueOf(valempleo[0][2]);

    String azueroStringTecnico = String.valueOf(valGradoEstudio[0][0]);
    String azueroStringLicenciatura = String.valueOf(valGradoEstudio[0][1]);
    String azueroStringPostgrado = String.valueOf(valGradoEstudio[0][2]);
    String azueroStringMaestria = String.valueOf(valGradoEstudio[0][3]);
    String azueroStringDoctorado = String.valueOf(valGradoEstudio[0][4]);

    String azueroStringEspanol0 = String.valueOf(valEspanol[0][0]);
    String azueroStringEspanol1_25 = String.valueOf(valEspanol[0][1]);
    String azueroStringEspanol25_50 = String.valueOf(valEspanol[0][2]);
    String azueroStringEspanol50_75 = String.valueOf(valEspanol[0][3]);
    String azueroStringEspanol75_100 = String.valueOf(valEspanol[0][4]);

    String azueroStringIngles0 = String.valueOf(valIngles[0][0]);
    String azueroStringIngles1_25 = String.valueOf(valIngles[0][1]);
    String azueroStringIngles25_50 = String.valueOf(valIngles[0][2]);
    String azueroStringIngles50_75 = String.valueOf(valIngles[0][3]);
    String azueroStringIngles75_100 = String.valueOf(valIngles[0][4]);

    String azueroStringRedes = String.valueOf(valAreaInteres[0][0]);
    String azueroStringArquitectura = String.valueOf(valAreaInteres[0][1]);
    String azueroStringSoftware = String.valueOf(valAreaInteres[0][2]);
    String azueroStringInformatica = String.valueOf(valAreaInteres[0][3]);


    Toast.makeText(this, ""+azueroString, Toast.LENGTH_SHORT).show();

    Intent i = new Intent(MainActivity.this,Result.class);
    i.putExtra("azueroString",azueroString);
    i.putExtra("azueroStringDesocupado",azueroStringDesocupado);
    i.putExtra("azueroStringEmpleado",azueroStringEmpleado);
    i.putExtra("azueroStringIndependiente",azueroStringIndependiente);

    i.putExtra("azueroStringTecnico",azueroStringTecnico);
    i.putExtra("azueroStringLicenciatura",azueroStringLicenciatura);
    i.putExtra("azueroStringPostgrado",azueroStringPostgrado);
    i.putExtra("azueroStringMaestria",azueroStringMaestria);
    i.putExtra("azueroStringDoctorado",azueroStringDoctorado);

    i.putExtra("azueroStringEspanol0",azueroStringEspanol0);
    i.putExtra("azueroStringEspanol1_25",azueroStringEspanol1_25);
    i.putExtra("azueroStringEspanol25_50",azueroStringEspanol25_50);
    i.putExtra("azueroStringEspanol50_75",azueroStringEspanol50_75);
    i.putExtra("azueroStringEspanol75_100",azueroStringEspanol75_100);

    i.putExtra("azueroStringIngles0",azueroStringIngles0);
    i.putExtra("azueroStringIngles1_25",azueroStringIngles1_25);
    i.putExtra("azueroStringIngles25_50",azueroStringIngles25_50);
    i.putExtra("azueroStringIngles50_75",azueroStringIngles50_75);
    i.putExtra("azueroStringIngles75_100",azueroStringIngles75_100);

    i.putExtra("azueroStringRedes",azueroStringRedes);
    i.putExtra("azueroStringArquitectura",azueroStringArquitectura);
    i.putExtra("azueroStringSoftware",azueroStringSoftware);
    i.putExtra("azueroStringInformatica",azueroStringInformatica);

    startActivity(i);
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