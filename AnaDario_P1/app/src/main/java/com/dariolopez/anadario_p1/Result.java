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
    //Bocas
    TextView txtValSedeBocas, txtValSedeBocasDesocupado,txtValSedeBocasEmpleado,txtValSedeBocasIndependiente,
            txtValSedeBocasTecnico,txtValSedeBocasLicenciatura,txtValSedeBocasPostgrado,txtValSedeBocasMaestria,
            txtValSedeBocasDoctorado,txtValSedeBocas0Espanol,txtValSedeBocas1_25Espanol,txtValSedeBocas25_50Espanol,
            txtValSedeBocas50_75Espanol,txtValSedeBocas75_100Espanol,txtValSedeBocas0Ingles,txtValSedeBocas1_25Ingles,txtValSedeBocas25_50Ingles,
            txtValSedeBocas50_75Ingles,txtValSedeBocas75_100Ingles,txtValSedeBocasRedes, txtValSedeBocasArquitectura,txtValSedeBocasSoftware,txtValSedeBocasInformatica;
    //veraguas
    TextView txtValSedeveraguas, txtValSedeveraguasDesocupado,txtValSedeveraguasEmpleado,txtValSedeveraguasIndependiente,
            txtValSedeveraguasTecnico,txtValSedeveraguasLicenciatura,txtValSedeveraguasPostgrado,txtValSedeveraguasMaestria,
            txtValSedeveraguasDoctorado,txtValSedeveraguas0Espanol,txtValSedeveraguas1_25Espanol,txtValSedeveraguas25_50Espanol,
            txtValSedeveraguas50_75Espanol,txtValSedeveraguas75_100Espanol,txtValSedeveraguas0Ingles,txtValSedeveraguas1_25Ingles,txtValSedeveraguas25_50Ingles,
            txtValSedeveraguas50_75Ingles,txtValSedeveraguas75_100Ingles,txtValSedeveraguasRedes, txtValSedeveraguasArquitectura,txtValSedeveraguasSoftware,txtValSedeveraguasInformatica;
    //panama
    TextView txtValSedepanama, txtValSedepanamaDesocupado,txtValSedepanamaEmpleado,txtValSedepanamaIndependiente,
            txtValSedepanamaTecnico,txtValSedepanamaLicenciatura,txtValSedepanamaPostgrado,txtValSedepanamaMaestria,
            txtValSedepanamaDoctorado,txtValSedepanama0Espanol,txtValSedepanama1_25Espanol,txtValSedepanama25_50Espanol,
            txtValSedepanama50_75Espanol,txtValSedepanama75_100Espanol,txtValSedepanama0Ingles,txtValSedepanama1_25Ingles,txtValSedepanama25_50Ingles,
            txtValSedepanama50_75Ingles,txtValSedepanama75_100Ingles,txtValSedepanamaRedes, txtValSedepanamaArquitectura,txtValSedepanamaSoftware,txtValSedepanamaInformatica;
    //chiriqui
    TextView txtValSede, txtValSedeDesocupado,txtValSedeEmpleado,txtValSedeIndependiente,
            txtValSedeTecnico,txtValSedeLicenciatura,txtValSedePostgrado,txtValSedeMaestria,
            txtValSedeDoctorado,txtValSede0Espanol,txtValSede1_25Espanol,txtValSede25_50Espanol,
            txtValSede50_75Espanol,txtValSede75_100Espanol,txtValSede0Ingles,txtValSede1_25Ingles,txtValSede25_50Ingles,
            txtValSede50_75Ingles,txtValSede75_100Ingles,txtValSedeRedes, txtValSedeArquitectura,txtValSedeSoftware,txtValSedeInformatica;
    //cocle
    TextView txtValSedecocle, txtValSedecocleDesocupado,txtValSedecocleEmpleado,txtValSedecocleIndependiente,
            txtValSedecocleTecnico,txtValSedecocleLicenciatura,txtValSedecoclePostgrado,txtValSedecocleMaestria,
            txtValSedecocleDoctorado,txtValSedecocle0Espanol,txtValSedecocle1_25Espanol,txtValSedecocle25_50Espanol,
            txtValSedecocle50_75Espanol,txtValSedecocle75_100Espanol,txtValSedecocle0Ingles,txtValSedecocle1_25Ingles,txtValSedecocle25_50Ingles,
            txtValSedecocle50_75Ingles,txtValSedecocle75_100Ingles,txtValSedecocleRedes, txtValSedecocleArquitectura,txtValSedecocleSoftware,txtValSedecocleInformatica;
    //chorrera
    TextView txtValSedechorrera, txtValSedechorreraDesocupado,txtValSedechorreraEmpleado,txtValSedechorreraIndependiente,
            txtValSedechorreraTecnico,txtValSedechorreraLicenciatura,txtValSedechorreraPostgrado,txtValSedechorreraMaestria,
            txtValSedechorreraDoctorado,txtValSedechorrera0Espanol,txtValSedechorrera1_25Espanol,txtValSedechorrera25_50Espanol,
            txtValSedechorrera50_75Espanol,txtValSedechorrera75_100Espanol,txtValSedechorrera0Ingles,txtValSedechorrera1_25Ingles,txtValSedechorrera25_50Ingles,
            txtValSedechorrera50_75Ingles,txtValSedechorrera75_100Ingles,txtValSedechorreraRedes, txtValSedechorreraArquitectura,txtValSedechorreraSoftware,txtValSedechorreraInformatica;
    //colon
    TextView txtValSedecolon, txtValSedecolonDesocupado,txtValSedecolonEmpleado,txtValSedecolonIndependiente,
            txtValSedecolonTecnico,txtValSedecolonLicenciatura,txtValSedecolonPostgrado,txtValSedecolonMaestria,
            txtValSedecolonDoctorado,txtValSedecolon0Espanol,txtValcolonSede1_25Espanol,txtValSedecolon25_50Espanol,
            txtValSedecolon50_75Espanol,txtValSedecolon75_100Espanol,txtValSedecolon0Ingles,txtValSedecolon1_25Ingles,txtValSedecolon25_50Ingles,
            txtValSedecolon50_75Ingles,txtValSedecolon75_100Ingles,txtValSedecolonRedes, txtValSedecolonArquitectura,txtValSedecolonSoftware,txtValSedecolonInformatica;


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