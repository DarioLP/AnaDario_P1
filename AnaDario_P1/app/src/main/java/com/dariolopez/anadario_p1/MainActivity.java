package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
RadioButton rbOcupado,rbEmpleado,rbIndependiente;
CheckBox chRedes,chSoftware,chArquitectura,chInformatica;

    static int valSede[] = new int[8];
    static int valempleo[][]= new int[8][22];
    static int valGradoEstudio[][] = new int[8][5];
    static int valEspanol[][] = new int[8][5];
    static int valIngles[][] = new int[8][5];
    static int valAreaInteres[][] = new int[8][5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sede = findViewById(R.id.spSede);
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
}





private void SpinnerSede(){

    Integer[] imagenes= {R.drawable.imgazuero,R.drawable.imgbocas,R.drawable.imgveraguas,R.drawable.imgpanama,R.drawable.imgchiriqui,R.drawable.imgcocle,R.drawable.imgchorrera,R.drawable.imgcolon};

    ImageView imagenPortada = (ImageView) findViewById(R.id.imageView);

    ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.sede, android.R.layout.simple_spinner_item);
    sede.setAdapter(adapter);
    sede.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            Object item = parent.getItemAtPosition(pos);
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
                StaticValue.inglesPosition=pos;
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

public void procesar(View view){


    valSede[StaticValue.position]=valSede[StaticValue.position]+1;
    String resultado = String.valueOf(valSede[StaticValue.position]);


    if (rbOcupado.isChecked() == true) {
        valempleo[StaticValue.position][0]=valempleo[StaticValue.position][0]+1;
    }
    if (rbEmpleado.isChecked() == true) {
        valempleo[StaticValue.position][1]=valempleo[StaticValue.position][1]+1;
    }
    if (rbIndependiente.isChecked() == true) {
        valempleo[StaticValue.position][2]=valempleo[StaticValue.position][2]+1;
    }


    valGradoEstudio[StaticValue.position][StaticValue.gradoPosition]++;

    valEspanol[StaticValue.position][StaticValue.espanolPosition]++;

    valIngles[StaticValue.position][StaticValue.inglesPosition]++;


    if (chRedes.isChecked()){
        valAreaInteres[StaticValue.position][0]++;
    }

    if (chArquitectura.isChecked()){
        valAreaInteres[StaticValue.position][1]++;
    }

    if (chSoftware.isChecked()){
        valAreaInteres[StaticValue.position][2]++;
    }

    if (chInformatica.isChecked()){
        valAreaInteres[StaticValue.position][3]++;
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



    //Bocas

    String BocasString = String.valueOf(valSede[1]);
    String BocasStringDesocupado = String.valueOf(valempleo[1][0]);
    String BocasStringEmpleado = String.valueOf(valempleo[1][1]);
    String BocasStringIndependiente = String.valueOf(valempleo[1][2]);

    String BocasStringTecnico = String.valueOf(valGradoEstudio[1][0]);
    String BocasStringLicenciatura = String.valueOf(valGradoEstudio[1][1]);
    String BocasStringPostgrado = String.valueOf(valGradoEstudio[1][2]);
    String BocasStringMaestria = String.valueOf(valGradoEstudio[1][3]);
    String BocasStringDoctorado = String.valueOf(valGradoEstudio[1][4]);

    String BocasStringEspanol0 = String.valueOf(valEspanol[1][0]);
    String BocasStringEspanol1_25 = String.valueOf(valEspanol[1][1]);
    String BocasStringEspanol25_50 = String.valueOf(valEspanol[1][2]);
    String BocasStringEspanol50_75 = String.valueOf(valEspanol[1][3]);
    String BocasStringEspanol75_100 = String.valueOf(valEspanol[1][4]);

    String BocasStringIngles0 = String.valueOf(valIngles[1][0]);
    String BocasStringIngles1_25 = String.valueOf(valIngles[1][1]);
    String BocasStringIngles25_50 = String.valueOf(valIngles[1][2]);
    String BocasStringIngles50_75 = String.valueOf(valIngles[1][3]);
    String BocasStringIngles75_100 = String.valueOf(valIngles[1][4]);

    String BocasStringRedes = String.valueOf(valAreaInteres[1][0]);
    String BocasStringArquitectura = String.valueOf(valAreaInteres[1][1]);
    String BocasStringSoftware = String.valueOf(valAreaInteres[1][2]);
    String BocasStringInformatica = String.valueOf(valAreaInteres[1][3]);


    i.putExtra("BocasString",BocasString);
    i.putExtra("BocasStringDesocupado",BocasStringDesocupado);
    i.putExtra("BocasStringEmpleado",BocasStringEmpleado);
    i.putExtra("BocasStringIndependiente",BocasStringIndependiente);

    i.putExtra("BocasStringTecnico",BocasStringTecnico);
    i.putExtra("BocasStringLicenciatura",BocasStringLicenciatura);
    i.putExtra("BocasStringPostgrado",BocasStringPostgrado);
    i.putExtra("BocasStringMaestria",BocasStringMaestria);
    i.putExtra("BocasStringDoctorado",BocasStringDoctorado);

    i.putExtra("BocasStringEspanol0",BocasStringEspanol0);
    i.putExtra("BocasStringEspanol1_25",BocasStringEspanol1_25);
    i.putExtra("BocasStringEspanol25_50",BocasStringEspanol25_50);
    i.putExtra("BocasStringEspanol50_75",BocasStringEspanol50_75);
    i.putExtra("BocasStringEspanol75_100",BocasStringEspanol75_100);

    i.putExtra("BocasStringIngles0",BocasStringIngles0);
    i.putExtra("BocasStringIngles1_25",BocasStringIngles1_25);
    i.putExtra("BocasStringIngles25_50",BocasStringIngles25_50);
    i.putExtra("BocasStringIngles50_75",BocasStringIngles50_75);
    i.putExtra("BocasStringIngles75_100",BocasStringIngles75_100);

    i.putExtra("BocasStringRedes",BocasStringRedes);
    i.putExtra("BocasStringArquitectura",BocasStringArquitectura);
    i.putExtra("BocasStringSoftware",BocasStringSoftware);
    i.putExtra("BocasStringInformatica",BocasStringInformatica);


    //veraguas

    String veraguasString = String.valueOf(valSede[2]);
    String veraguasStringDesocupado = String.valueOf(valempleo[2][0]);
    String veraguasStringEmpleado = String.valueOf(valempleo[2][1]);
    String veraguasStringIndependiente = String.valueOf(valempleo[2][2]);

    String veraguasStringTecnico = String.valueOf(valGradoEstudio[2][0]);
    String veraguasStringLicenciatura = String.valueOf(valGradoEstudio[2][1]);
    String veraguasStringPostgrado = String.valueOf(valGradoEstudio[2][2]);
    String veraguasStringMaestria = String.valueOf(valGradoEstudio[2][3]);
    String veraguasStringDoctorado = String.valueOf(valGradoEstudio[2][4]);

    String veraguasStringEspanol0 = String.valueOf(valEspanol[2][0]);
    String veraguasStringEspanol1_25 = String.valueOf(valEspanol[2][1]);
    String veraguasStringEspanol25_50 = String.valueOf(valEspanol[2][2]);
    String veraguasStringEspanol50_75 = String.valueOf(valEspanol[2][3]);
    String veraguasStringEspanol75_100 = String.valueOf(valEspanol[2][4]);

    String veraguasStringIngles0 = String.valueOf(valIngles[2][0]);
    String veraguasStringIngles1_25 = String.valueOf(valIngles[2][1]);
    String veraguasStringIngles25_50 = String.valueOf(valIngles[2][2]);
    String veraguasStringIngles50_75 = String.valueOf(valIngles[2][3]);
    String veraguasStringIngles75_100 = String.valueOf(valIngles[2][4]);

    String veraguasStringRedes = String.valueOf(valAreaInteres[2][0]);
    String veraguasStringArquitectura = String.valueOf(valAreaInteres[2][1]);
    String veraguasStringSoftware = String.valueOf(valAreaInteres[2][2]);
    String veraguasStringInformatica = String.valueOf(valAreaInteres[2][3]);


    i.putExtra("veraguasString",veraguasString);
    i.putExtra("veraguasStringDesocupado",veraguasStringDesocupado);
    i.putExtra("veraguasStringEmpleado",veraguasStringEmpleado);
    i.putExtra("veraguasStringIndependiente",veraguasStringIndependiente);

    i.putExtra("veraguasStringTecnico",veraguasStringTecnico);
    i.putExtra("veraguasStringLicenciatura",veraguasStringLicenciatura);
    i.putExtra("veraguasStringPostgrado",veraguasStringPostgrado);
    i.putExtra("veraguasStringMaestria",veraguasStringMaestria);
    i.putExtra("veraguasStringDoctorado",veraguasStringDoctorado);

    i.putExtra("veraguasStringEspanol0",veraguasStringEspanol0);
    i.putExtra("veraguasStringEspanol1_25",veraguasStringEspanol1_25);
    i.putExtra("veraguasStringEspanol25_50",veraguasStringEspanol25_50);
    i.putExtra("veraguasStringEspanol50_75",veraguasStringEspanol50_75);
    i.putExtra("veraguasStringEspanol75_100",veraguasStringEspanol75_100);

    i.putExtra("veraguasStringIngles0",veraguasStringIngles0);
    i.putExtra("veraguasStringIngles1_25",veraguasStringIngles1_25);
    i.putExtra("veraguasStringIngles25_50",veraguasStringIngles25_50);
    i.putExtra("veraguasStringIngles50_75",veraguasStringIngles50_75);
    i.putExtra("veraguasStringIngles75_100",veraguasStringIngles75_100);

    i.putExtra("veraguasStringRedes",veraguasStringRedes);
    i.putExtra("veraguasStringArquitectura",veraguasStringArquitectura);
    i.putExtra("veraguasStringSoftware",veraguasStringSoftware);
    i.putExtra("veraguasStringInformatica",veraguasStringInformatica);


    //panama

    String panamaString = String.valueOf(valSede[3]);
    String panamaStringDesocupado = String.valueOf(valempleo[3][0]);
    String panamaStringEmpleado = String.valueOf(valempleo[3][1]);
    String panamaStringIndependiente = String.valueOf(valempleo[3][2]);

    String panamaStringTecnico = String.valueOf(valGradoEstudio[3][0]);
    String panamaStringLicenciatura = String.valueOf(valGradoEstudio[3][1]);
    String panamaStringPostgrado = String.valueOf(valGradoEstudio[3][2]);
    String panamaStringMaestria = String.valueOf(valGradoEstudio[3][3]);
    String panamaStringDoctorado = String.valueOf(valGradoEstudio[3][4]);

    String panamaStringEspanol0 = String.valueOf(valEspanol[3][0]);
    String panamaStringEspanol1_25 = String.valueOf(valEspanol[3][1]);
    String panamaStringEspanol25_50 = String.valueOf(valEspanol[3][2]);
    String panamaStringEspanol50_75 = String.valueOf(valEspanol[3][3]);
    String panamaStringEspanol75_100 = String.valueOf(valEspanol[3][4]);

    String panamaStringIngles0 = String.valueOf(valIngles[3][0]);
    String panamaStringIngles1_25 = String.valueOf(valIngles[3][1]);
    String panamaStringIngles25_50 = String.valueOf(valIngles[3][2]);
    String panamaStringIngles50_75 = String.valueOf(valIngles[3][3]);
    String panamaStringIngles75_100 = String.valueOf(valIngles[3][4]);

    String panamaStringRedes = String.valueOf(valAreaInteres[3][0]);
    String panamaStringArquitectura = String.valueOf(valAreaInteres[3][1]);
    String panamaStringSoftware = String.valueOf(valAreaInteres[3][2]);
    String panamaStringInformatica = String.valueOf(valAreaInteres[3][3]);


    i.putExtra("panamaString",panamaString);
    i.putExtra("panamaStringDesocupado",panamaStringDesocupado);
    i.putExtra("panamaStringEmpleado",panamaStringEmpleado);
    i.putExtra("panamaStringIndependiente",panamaStringIndependiente);

    i.putExtra("panamaStringTecnico",panamaStringTecnico);
    i.putExtra("panamaStringLicenciatura",panamaStringLicenciatura);
    i.putExtra("panamaStringPostgrado",panamaStringPostgrado);
    i.putExtra("panamaStringMaestria",panamaStringMaestria);
    i.putExtra("panamaStringDoctorado",panamaStringDoctorado);

    i.putExtra("panamaStringEspanol0",panamaStringEspanol0);
    i.putExtra("panamaStringEspanol1_25",panamaStringEspanol1_25);
    i.putExtra("panamaStringEspanol25_50",panamaStringEspanol25_50);
    i.putExtra("panamaStringEspanol50_75",panamaStringEspanol50_75);
    i.putExtra("panamaStringEspanol75_100",panamaStringEspanol75_100);

    i.putExtra("panamaStringIngles0",panamaStringIngles0);
    i.putExtra("panamaStringIngles1_25",panamaStringIngles1_25);
    i.putExtra("panamaStringIngles25_50",panamaStringIngles25_50);
    i.putExtra("panamaStringIngles50_75",panamaStringIngles50_75);
    i.putExtra("panamaStringIngles75_100",panamaStringIngles75_100);

    i.putExtra("panamaStringRedes",panamaStringRedes);
    i.putExtra("panamaStringArquitectura",panamaStringArquitectura);
    i.putExtra("panamaStringSoftware",panamaStringSoftware);
    i.putExtra("panamaStringInformatica",panamaStringInformatica);


    //chiriqui

    String chiriquiString = String.valueOf(valSede[4]);
    String chiriquiStringDesocupado = String.valueOf(valempleo[4][0]);
    String chiriquiStringEmpleado = String.valueOf(valempleo[4][1]);
    String chiriquiStringIndependiente = String.valueOf(valempleo[4][2]);

    String chiriquiStringTecnico = String.valueOf(valGradoEstudio[4][0]);
    String chiriquiStringLicenciatura = String.valueOf(valGradoEstudio[4][1]);
    String chiriquiStringPostgrado = String.valueOf(valGradoEstudio[4][2]);
    String chiriquiStringMaestria = String.valueOf(valGradoEstudio[4][3]);
    String chiriquiStringDoctorado = String.valueOf(valGradoEstudio[4][4]);

    String chiriquiStringEspanol0 = String.valueOf(valEspanol[4][0]);
    String chiriquiStringEspanol1_25 = String.valueOf(valEspanol[4][1]);
    String chiriquiStringEspanol25_50 = String.valueOf(valEspanol[4][2]);
    String chiriquiStringEspanol50_75 = String.valueOf(valEspanol[4][3]);
    String chiriquiStringEspanol75_100 = String.valueOf(valEspanol[4][4]);

    String chiriquiStringIngles0 = String.valueOf(valIngles[4][0]);
    String chiriquiStringIngles1_25 = String.valueOf(valIngles[4][1]);
    String chiriquiStringIngles25_50 = String.valueOf(valIngles[4][2]);
    String chiriquiStringIngles50_75 = String.valueOf(valIngles[4][3]);
    String chiriquiStringIngles75_100 = String.valueOf(valIngles[4][4]);

    String chiriquiStringRedes = String.valueOf(valAreaInteres[4][0]);
    String chiriquiStringArquitectura = String.valueOf(valAreaInteres[4][1]);
    String chiriquiStringSoftware = String.valueOf(valAreaInteres[4][2]);
    String chiriquiStringInformatica = String.valueOf(valAreaInteres[4][3]);


    i.putExtra("chiriquiString",chiriquiString);
    i.putExtra("chiriquiStringDesocupado",chiriquiStringDesocupado);
    i.putExtra("chiriquiStringEmpleado",chiriquiStringEmpleado);
    i.putExtra("chiriquiStringIndependiente",chiriquiStringIndependiente);

    i.putExtra("chiriquiStringTecnico",chiriquiStringTecnico);
    i.putExtra("chiriquiStringLicenciatura",chiriquiStringLicenciatura);
    i.putExtra("chiriquiStringPostgrado",chiriquiStringPostgrado);
    i.putExtra("chiriquiStringMaestria",chiriquiStringMaestria);
    i.putExtra("chiriquiStringDoctorado",chiriquiStringDoctorado);

    i.putExtra("chiriquiStringEspanol0",chiriquiStringEspanol0);
    i.putExtra("chiriquiStringEspanol1_25",chiriquiStringEspanol1_25);
    i.putExtra("chiriquiStringEspanol25_50",chiriquiStringEspanol25_50);
    i.putExtra("chiriquiStringEspanol50_75",chiriquiStringEspanol50_75);
    i.putExtra("chiriquiStringEspanol75_100",chiriquiStringEspanol75_100);

    i.putExtra("chiriquiStringIngles0",chiriquiStringIngles0);
    i.putExtra("chiriquiStringIngles1_25",chiriquiStringIngles1_25);
    i.putExtra("chiriquiStringIngles25_50",chiriquiStringIngles25_50);
    i.putExtra("chiriquiStringIngles50_75",chiriquiStringIngles50_75);
    i.putExtra("chiriquiStringIngles75_100",chiriquiStringIngles75_100);

    i.putExtra("chiriquiStringRedes",chiriquiStringRedes);
    i.putExtra("chiriquiStringArquitectura",chiriquiStringArquitectura);
    i.putExtra("chiriquiStringSoftware",chiriquiStringSoftware);
    i.putExtra("chiriquiStringInformatica",chiriquiStringInformatica);

    //cocle

    String cocleString = String.valueOf(valSede[5]);
    String cocleStringDesocupado = String.valueOf(valempleo[5][0]);
    String cocleStringEmpleado = String.valueOf(valempleo[5][1]);
    String cocleStringIndependiente = String.valueOf(valempleo[5][2]);

    String cocleStringTecnico = String.valueOf(valGradoEstudio[5][0]);
    String cocleStringLicenciatura = String.valueOf(valGradoEstudio[5][1]);
    String cocleStringPostgrado = String.valueOf(valGradoEstudio[5][2]);
    String cocleStringMaestria = String.valueOf(valGradoEstudio[5][3]);
    String cocleStringDoctorado = String.valueOf(valGradoEstudio[5][4]);

    String cocleStringEspanol0 = String.valueOf(valEspanol[5][0]);
    String cocleStringEspanol1_25 = String.valueOf(valEspanol[5][1]);
    String cocleStringEspanol25_50 = String.valueOf(valEspanol[5][2]);
    String cocleStringEspanol50_75 = String.valueOf(valEspanol[5][3]);
    String cocleStringEspanol75_100 = String.valueOf(valEspanol[5][4]);

    String cocleStringIngles0 = String.valueOf(valIngles[5][0]);
    String cocleStringIngles1_25 = String.valueOf(valIngles[5][1]);
    String cocleStringIngles25_50 = String.valueOf(valIngles[5][2]);
    String cocleStringIngles50_75 = String.valueOf(valIngles[5][3]);
    String cocleStringIngles75_100 = String.valueOf(valIngles[5][4]);

    String cocleStringRedes = String.valueOf(valAreaInteres[5][0]);
    String cocleStringArquitectura = String.valueOf(valAreaInteres[5][1]);
    String cocleStringSoftware = String.valueOf(valAreaInteres[5][2]);
    String cocleStringInformatica = String.valueOf(valAreaInteres[5][3]);


    i.putExtra("cocleString",cocleString);
    i.putExtra("cocleStringDesocupado",cocleStringDesocupado);
    i.putExtra("cocleStringIndependiente",cocleStringIndependiente);

    i.putExtra("cocleStringTecnico",cocleStringTecnico);
    i.putExtra("cocleStringLicenciatura",cocleStringLicenciatura);
    i.putExtra("cocleStringPostgrado",cocleStringPostgrado);
    i.putExtra("cocleStringMaestria",cocleStringMaestria);
    i.putExtra("cocleStringDoctorado",cocleStringDoctorado);

    i.putExtra("cocleStringEspanol0",cocleStringEspanol0);
    i.putExtra("cocleStringEspanol1_25",cocleStringEspanol1_25);
    i.putExtra("cocleStringEspanol25_50",cocleStringEspanol25_50);
    i.putExtra("cocleStringEspanol50_75",cocleStringEspanol50_75);
    i.putExtra("cocleStringEspanol75_100",cocleStringEspanol75_100);


    i.putExtra("cocleStringIngles0",cocleStringIngles0);
    i.putExtra("cocleStringIngles1_25",cocleStringIngles1_25);
    i.putExtra("cocleStringIngles25_50",cocleStringIngles25_50);
    i.putExtra("cocleStringIngles50_75",cocleStringIngles50_75);
    i.putExtra("cocleStringIngles75_100",cocleStringIngles75_100);

    i.putExtra("cocleStringRedes",cocleStringRedes);
    i.putExtra("cocleStringArquitectura",cocleStringArquitectura);
    i.putExtra("cocleStringSoftware",cocleStringSoftware);
    i.putExtra("cocleStringInformatica",cocleStringInformatica);


    //chorrera

    String chorreraString = String.valueOf(valSede[6]);
    String chorreraStringDesocupado = String.valueOf(valempleo[6][0]);
    String chorreraStringEmpleado = String.valueOf(valempleo[6][1]);
    String chorreraStringIndependiente = String.valueOf(valempleo[6][2]);

    String chorreraStringTecnico = String.valueOf(valGradoEstudio[6][0]);
    String chorreraStringLicenciatura = String.valueOf(valGradoEstudio[6][1]);
    String chorreraStringPostgrado = String.valueOf(valGradoEstudio[6][2]);
    String chorreraStringMaestria = String.valueOf(valGradoEstudio[6][3]);
    String chorreraStringDoctorado = String.valueOf(valGradoEstudio[6][4]);

    String chorreraStringEspanol0 = String.valueOf(valEspanol[6][0]);
    String chorreraStringEspanol1_25 = String.valueOf(valEspanol[6][1]);
    String chorreraStringEspanol25_50 = String.valueOf(valEspanol[6][2]);
    String chorreraStringEspanol50_75 = String.valueOf(valEspanol[6][3]);
    String chorreraStringEspanol75_100 = String.valueOf(valEspanol[6][4]);

    String chorreraStringIngles0 = String.valueOf(valIngles[6][0]);
    String chorreraStringIngles1_25 = String.valueOf(valIngles[6][1]);
    String chorreraStringIngles25_50 = String.valueOf(valIngles[6][2]);
    String chorreraStringIngles50_75 = String.valueOf(valIngles[6][3]);
    String chorreraStringIngles75_100 = String.valueOf(valIngles[6][4]);

    String chorreraStringRedes = String.valueOf(valAreaInteres[6][0]);
    String chorreraStringArquitectura = String.valueOf(valAreaInteres[6][1]);
    String chorreraStringSoftware = String.valueOf(valAreaInteres[6][2]);
    String chorreraStringInformatica = String.valueOf(valAreaInteres[6][3]);


    i.putExtra("chorreraString",chorreraString);
    i.putExtra("chorreraStringDesocupado",chorreraStringDesocupado);
    i.putExtra("chorreraStringEmpleado",chorreraStringEmpleado);
    i.putExtra("chorreraStringIndependiente",chorreraStringIndependiente);

    i.putExtra("chorreraStringTecnico",chorreraStringTecnico);
    i.putExtra("chorreraStringLicenciatura",chorreraStringLicenciatura);
    i.putExtra("chorreraStringPostgrado",chorreraStringPostgrado);
    i.putExtra("chorreraStringMaestria",chorreraStringMaestria);
    i.putExtra("chorreraStringDoctorado",chorreraStringDoctorado);

    i.putExtra("chorreraStringEspanol0",chorreraStringEspanol0);
    i.putExtra("chorreraStringEspanol1_25",chorreraStringEspanol1_25);
    i.putExtra("chorreraStringEspanol25_50",chorreraStringEspanol25_50);
    i.putExtra("chorreraStringEspanol50_75",chorreraStringEspanol50_75);
    i.putExtra("chorreraStringEspanol75_100",chorreraStringEspanol75_100);


    i.putExtra("chorreraStringIngles0",chorreraStringIngles0);
    i.putExtra("chorreraStringIngles1_25",chorreraStringIngles1_25);
    i.putExtra("chorreraStringIngles25_50",chorreraStringIngles25_50);
    i.putExtra("chorreraStringIngles50_75",chorreraStringIngles50_75);
    i.putExtra("chorreraStringIngles75_100",chorreraStringIngles75_100);

    i.putExtra("chorreraStringRedes",chorreraStringRedes);
    i.putExtra("chorreraStringArquitectura",chorreraStringArquitectura);
    i.putExtra("chorreraStringSoftware",chorreraStringSoftware);
    i.putExtra("chorreraStringInformatica",chorreraStringInformatica);


    //colon

    String colonString = String.valueOf(valSede[7]);
    String colonStringDesocupado = String.valueOf(valempleo[7][0]);
    String colonStringEmpleado = String.valueOf(valempleo[7][1]);
    String colonStringIndependiente = String.valueOf(valempleo[7][2]);

    String colonStringTecnico = String.valueOf(valGradoEstudio[7][0]);
    String colonStringLicenciatura = String.valueOf(valGradoEstudio[7][1]);
    String colonStringPostgrado = String.valueOf(valGradoEstudio[7][2]);
    String colonStringMaestria = String.valueOf(valGradoEstudio[7][3]);
    String colonStringDoctorado = String.valueOf(valGradoEstudio[7][4]);

    String colonStringEspanol0 = String.valueOf(valEspanol[7][0]);
    String colonStringEspanol1_25 = String.valueOf(valEspanol[7][1]);
    String colonStringEspanol25_50 = String.valueOf(valEspanol[7][2]);
    String colonStringEspanol50_75 = String.valueOf(valEspanol[7][3]);
    String colonStringEspanol75_100 = String.valueOf(valEspanol[7][4]);

    String colonStringIngles0 = String.valueOf(valIngles[7][0]);
    String colonStringIngles1_25 = String.valueOf(valIngles[7][1]);
    String colonStringIngles25_50 = String.valueOf(valIngles[7][2]);
    String colonStringIngles50_75 = String.valueOf(valIngles[7][3]);
    String colonStringIngles75_100 = String.valueOf(valIngles[7][4]);

    String colonStringRedes = String.valueOf(valAreaInteres[7][0]);
    String colonStringArquitectura = String.valueOf(valAreaInteres[7][1]);
    String colonStringSoftware = String.valueOf(valAreaInteres[7][2]);
    String colonStringInformatica = String.valueOf(valAreaInteres[7][3]);


    i.putExtra("colonString",colonString);
    i.putExtra("colonStringDesocupado",colonStringDesocupado);
    i.putExtra("colonStringEmpleado",colonStringEmpleado);
    i.putExtra("colonStringIndependiente",colonStringIndependiente);

    i.putExtra("colonStringTecnico",colonStringTecnico);
    i.putExtra("colonStringLicenciatura",colonStringLicenciatura);
    i.putExtra("colonStringPostgrado",colonStringPostgrado);
    i.putExtra("colonStringMaestria",colonStringMaestria);
    i.putExtra("colonStringDoctorado",colonStringDoctorado);

    i.putExtra("colonStringEspanol0",colonStringEspanol0);
    i.putExtra("colonStringEspanol1_25",colonStringEspanol1_25);
    i.putExtra("colonStringEspanol25_50",colonStringEspanol25_50);
    i.putExtra("colonStringEspanol50_75",colonStringEspanol50_75);
    i.putExtra("colonStringEspanol75_100",colonStringEspanol75_100);


    i.putExtra("colonStringIngles0",colonStringIngles0);
    i.putExtra("colonStringIngles1_25",colonStringIngles1_25);
    i.putExtra("colonStringIngles25_50",colonStringIngles25_50);
    i.putExtra("colonStringIngles50_75",colonStringIngles50_75);
    i.putExtra("colonStringIngles75_100",colonStringIngles75_100);

    i.putExtra("colonStringRedes",colonStringRedes);
    i.putExtra("colonStringArquitectura",colonStringArquitectura);
    i.putExtra("colonStringSoftware",colonStringSoftware);
    i.putExtra("colonStringInformatica",colonStringInformatica);


    startActivity(i);
}

}