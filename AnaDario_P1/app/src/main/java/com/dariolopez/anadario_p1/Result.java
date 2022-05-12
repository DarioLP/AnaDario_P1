package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    TextView txtValSedeAzuero, txtValSedeAzueroDesocupado,txtValSedeAzueroEmpleado,txtValSedeAzueroIndependiente,
    txtValSedeAzueroTecnico,txtValSedeAzueroLicenciatura,txtValSedeAzueroPostgrado,txtValSedeAzueroMaestria,
    txtValSedeAzueroDoctorado,txtValSedeAzuero0Espanol,txtValSedeAzuero1_25Espanol,txtValSedeAzuero25_50Espanol,
    txtValSedeAzuero50_75Espanol,txtValSedeAzuero75_100Espanol,txtValSedeAzuero0Ingles,txtValSedeAzuero1_25Ingles,txtValSedeAzuero25_50Ingles,
    txtValSedeAzuero50_75Ingles,txtValSedeAzuero75_100Ingles,txtValSedeAzueroRedes, txtValSedeAzueroArquitectura,txtValSedeAzueroSoftware,txtValSedeAzueroInformatica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

recibirDatos();

    }


    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();

        if(extras !=null){

            String azueroValString = extras.getString("azueroString");

            //Datos De epmpleo de sede Azuero
            String azueroValStringDesocupado = extras.getString("azueroStringDesocupado");
            String azueroValStringEmpleado = extras.getString("azueroStringEmpleado");
            String azueroValStringIndependiente = extras.getString("azueroStringIndependiente");


            txtValSedeAzuero = (TextView) findViewById(R.id.txtValSedeAzuero);
            txtValSedeAzuero.setText(azueroValString);

            txtValSedeAzueroDesocupado = (TextView) findViewById(R.id.txtValAzueroDesocupado);
            txtValSedeAzueroDesocupado.setText(azueroValStringDesocupado);

            txtValSedeAzueroEmpleado = (TextView) findViewById(R.id.txtValAzueroEmpleado);
            txtValSedeAzueroEmpleado.setText(azueroValStringEmpleado);

            txtValSedeAzueroIndependiente = (TextView) findViewById(R.id.txtValAzueroIndependiente);
            txtValSedeAzueroIndependiente.setText(azueroValStringIndependiente);


            String azueroValStringTecnico = extras.getString("azueroStringTecnico");
            String azueroValStringLicenciatura = extras.getString("azueroStringLicenciatura");
            String azueroValStringPostgrado = extras.getString("azueroStringPostgrado");
            String azueroValStringMaestria = extras.getString("azueroStringMaestria");
            String azueroValStringDoctorado = extras.getString("azueroStringDoctorado");



            txtValSedeAzueroTecnico = (TextView) findViewById(R.id.txtValAzueroTecnico);
            txtValSedeAzueroTecnico.setText(azueroValStringTecnico);

            txtValSedeAzueroLicenciatura = (TextView) findViewById(R.id.txtValAzueroLicenciatura);
            txtValSedeAzueroLicenciatura.setText(azueroValStringLicenciatura);

            txtValSedeAzueroPostgrado = (TextView) findViewById(R.id.txtValAzueroPostgrado);
            txtValSedeAzueroPostgrado.setText(azueroValStringPostgrado);

            txtValSedeAzueroMaestria = (TextView) findViewById(R.id.txtValAzueroMaestria);
            txtValSedeAzueroMaestria.setText(azueroValStringMaestria);

            txtValSedeAzueroDoctorado = (TextView) findViewById(R.id.txtValAzueroDoctorado);
            txtValSedeAzueroDoctorado.setText(azueroValStringDoctorado);


            /*
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
*/

            String azueroValString0Espanol = extras.getString("azueroStringEspanol0");
            String azueroValString1_25Espanol = extras.getString("azueroStringEspanol1_25");
            String azueroValString25_50Espanol = extras.getString("azueroStringEspanol25_50");
            String azueroValString50_75Espanol = extras.getString("azueroStringEspanol50_75");
            String azueroValString75_100Espanol = extras.getString("azueroStringEspanol75_100");



            txtValSedeAzuero0Espanol = (TextView) findViewById(R.id.txtValAzuero0Espanol);
            txtValSedeAzuero0Espanol.setText(azueroValString0Espanol);

            txtValSedeAzuero1_25Espanol = (TextView) findViewById(R.id.txtValAzuero1_25Espanol);
            txtValSedeAzuero1_25Espanol.setText(azueroValString1_25Espanol);

            txtValSedeAzuero25_50Espanol = (TextView) findViewById(R.id.txtValAzuero25_50Espanol);
            txtValSedeAzuero25_50Espanol.setText(azueroValString25_50Espanol);

            txtValSedeAzuero50_75Espanol = (TextView) findViewById(R.id.txtValAzuero50_75Espanol);
            txtValSedeAzuero50_75Espanol.setText(azueroValString50_75Espanol);

            txtValSedeAzuero75_100Espanol = (TextView) findViewById(R.id.txtValAzuero75_100Espanol);
            txtValSedeAzuero75_100Espanol.setText(azueroValString75_100Espanol);



            String azueroValString0Ingles = extras.getString("azueroStringIngles0");
            String azueroValString1_25Ingles = extras.getString("azueroStringIngles1_25");
            String azueroValString25_50Ingles = extras.getString("azueroStringIngles25_50");
            String azueroValString50_75Ingles = extras.getString("azueroStringIngles50_75");
            String azueroValString75_100Ingles = extras.getString("azueroStringIngles75_100");



            txtValSedeAzuero0Ingles = (TextView) findViewById(R.id.txtValAzuero0Ingles);
            txtValSedeAzuero0Ingles.setText(azueroValString0Ingles);

            txtValSedeAzuero1_25Ingles = (TextView) findViewById(R.id.txtValAzuero1_25Ingles);
            txtValSedeAzuero1_25Ingles.setText(azueroValString1_25Ingles);

            txtValSedeAzuero25_50Ingles = (TextView) findViewById(R.id.txtValAzuero25_50Ingles);
            txtValSedeAzuero25_50Ingles.setText(azueroValString25_50Ingles);

            txtValSedeAzuero50_75Ingles = (TextView) findViewById(R.id.txtValAzuero50_75Ingles);
            txtValSedeAzuero50_75Ingles.setText(azueroValString50_75Ingles);

            txtValSedeAzuero75_100Ingles = (TextView) findViewById(R.id.txtValAzuero75_100Ingles);
            txtValSedeAzuero75_100Ingles.setText(azueroValString75_100Ingles);


            String azueroValStringRedes = extras.getString("azueroStringRedes");
            String azueroValStringArquitectura = extras.getString("azueroStringArquitectura");
            String azueroValStringSoftware = extras.getString("azueroStringSoftware");
            String azueroValStringInformatica = extras.getString("azueroStringInformatica");


            txtValSedeAzueroRedes = (TextView) findViewById(R.id.txtValAzueroRedes);
            txtValSedeAzueroRedes.setText(azueroValStringRedes);

            txtValSedeAzueroArquitectura = (TextView) findViewById(R.id.txtValAzueroArquitectura);
            txtValSedeAzueroArquitectura.setText(azueroValStringArquitectura);

            txtValSedeAzueroSoftware = (TextView) findViewById(R.id.txtValAzueroSoftware);
            txtValSedeAzueroSoftware.setText(azueroValStringSoftware);

            txtValSedeAzueroInformatica = (TextView) findViewById(R.id.txtValAzueroInformatica);
            txtValSedeAzueroInformatica.setText(azueroValStringInformatica);



        }else {
            Toast.makeText(this, "valor de Bunble es nulo", Toast.LENGTH_SHORT).show();
        }


    }





}