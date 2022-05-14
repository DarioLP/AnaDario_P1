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
    TextView txtValSedechiriqui, txtValSedechiriquiDesocupado,txtValSedechiriquiEmpleado,txtValSedechiriquiIndependiente,
            txtValSedechiriquiTecnico,txtValSedechiriquiLicenciatura,txtValSedechiriquiPostgrado,txtValSedechiriquiMaestria,
            txtValSedechiriquiDoctorado,txtValSedechiriqui0Espanol,txtValSedechiriqui1_25Espanol,txtValSedechiriqui25_50Espanol,
            txtValSedechiriqui50_75Espanol,txtValSedechiriqui75_100Espanol,txtValSedechiriqui0Ingles,txtValSedechiriqui1_25Ingles,txtValSedechiriqui25_50Ingles,
            txtValSedechiriqui50_75Ingles,txtValSedechiriqui75_100Ingles,txtValSedechiriquiRedes, txtValSedechiriquiArquitectura,txtValSedechiriquiSoftware,txtValSedechiriquiInformatica;

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
            txtValSedecolonDoctorado,txtValSedecolon0Espanol,txtValSedecolon1_25Espanol,txtValSedecolon25_50Espanol,
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

            //Datos de sede Azuero
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


            //Datos de sede Bocas

            String BocasValString = extras.getString("BocasString");


            String BocasValStringDesocupado = extras.getString("BocasStringDesocupado");
            String BocasValStringEmpleado = extras.getString("BocasStringEmpleado");
            String BocasValStringIndependiente = extras.getString("BocasStringIndependiente");


            txtValSedeBocas= (TextView) findViewById(R.id.txtValSedeBocas);
            txtValSedeBocas.setText(BocasValString);

            txtValSedeBocasDesocupado = (TextView) findViewById(R.id.txtValBocasDesocupado);
            txtValSedeBocasDesocupado.setText(BocasValStringDesocupado);

            txtValSedeBocasEmpleado = (TextView) findViewById(R.id.txtValBocasEmpleado);
            txtValSedeBocasEmpleado.setText(BocasValStringEmpleado);

            txtValSedeBocasIndependiente = (TextView) findViewById(R.id.txtValBocasIndependiente);
            txtValSedeBocasIndependiente.setText(BocasValStringIndependiente);


            String BocasValStringTecnico = extras.getString("BocasStringTecnico");
            String BocasValStringLicenciatura = extras.getString("BocasStringLicenciatura");
            String BocasValStringPostgrado = extras.getString("BocasStringPostgrado");
            String BocasValStringMaestria = extras.getString("BocasStringMaestria");
            String BocasValStringDoctorado = extras.getString("BocasStringDoctorado");



            txtValSedeBocasTecnico = (TextView) findViewById(R.id.txtValBocasTecnico);
            txtValSedeBocasTecnico.setText(BocasValStringTecnico);

            txtValSedeBocasLicenciatura = (TextView) findViewById(R.id.txtValBocasLicenciatura);
            txtValSedeBocasLicenciatura.setText(BocasValStringLicenciatura);

            txtValSedeBocasPostgrado = (TextView) findViewById(R.id.txtValBocasPostgrado);
            txtValSedeBocasPostgrado.setText(BocasValStringPostgrado);

            txtValSedeBocasMaestria = (TextView) findViewById(R.id.txtValBocasMaestria);
            txtValSedeBocasMaestria.setText(BocasValStringMaestria);

            txtValSedeBocasDoctorado = (TextView) findViewById(R.id.txtValBocasDoctorado);
            txtValSedeBocasDoctorado.setText(BocasValStringDoctorado);


            String BocasValString0Espanol = extras.getString("BocasStringEspanol0");
            String BocasValString1_25Espanol = extras.getString("BocasStringEspanol1_25");
            String BocasValString25_50Espanol = extras.getString("BocasStringEspanol25_50");
            String BocasValString50_75Espanol = extras.getString("BocasStringEspanol50_75");
            String BocasValString75_100Espanol = extras.getString("BocasStringEspanol75_100");



            txtValSedeBocas0Espanol = (TextView) findViewById(R.id.txtValBocas0Espanol);
            txtValSedeBocas0Espanol.setText(BocasValString0Espanol);

            txtValSedeBocas1_25Espanol = (TextView) findViewById(R.id.txtValBocas1_25Espanol);
            txtValSedeBocas1_25Espanol.setText(BocasValString1_25Espanol);

            txtValSedeBocas25_50Espanol = (TextView) findViewById(R.id.txtValBocas25_50Espanol);
            txtValSedeBocas25_50Espanol.setText(BocasValString25_50Espanol);

            txtValSedeBocas50_75Espanol = (TextView) findViewById(R.id.txtValBocas50_75Espanol);
            txtValSedeBocas50_75Espanol.setText(BocasValString50_75Espanol);

            txtValSedeBocas75_100Espanol = (TextView) findViewById(R.id.txtValBocas75_100Espanol);
            txtValSedeBocas75_100Espanol.setText(BocasValString75_100Espanol);



            String BocasValString0Ingles = extras.getString("BocasStringIngles0");
            String BocasValString1_25Ingles = extras.getString("BocasStringIngles1_25");
            String BocasValString25_50Ingles = extras.getString("BocasStringIngles25_50");
            String BocasValString50_75Ingles = extras.getString("BocasStringIngles50_75");
            String BocasValString75_100Ingles = extras.getString("BocasStringIngles75_100");



            txtValSedeBocas0Ingles = (TextView) findViewById(R.id.txtValBocas0Ingles);
            txtValSedeBocas0Ingles.setText(BocasValString0Ingles);

            txtValSedeBocas1_25Ingles = (TextView) findViewById(R.id.txtValBocas1_25Ingles);
            txtValSedeBocas1_25Ingles.setText(BocasValString1_25Ingles);

            txtValSedeBocas25_50Ingles = (TextView) findViewById(R.id.txtValBocas25_50Ingles);
            txtValSedeBocas25_50Ingles.setText(BocasValString25_50Ingles);

            txtValSedeBocas50_75Ingles = (TextView) findViewById(R.id.txtValBocas50_75Ingles);
            txtValSedeBocas50_75Ingles.setText(BocasValString50_75Ingles);

            txtValSedeBocas75_100Ingles = (TextView) findViewById(R.id.txtValBocas75_100Ingles);
            txtValSedeBocas75_100Ingles.setText(BocasValString75_100Ingles);


            String BocasValStringRedes = extras.getString("BocasStringRedes");
            String BocasValStringArquitectura = extras.getString("BocasStringArquitectura");
            String BocasValStringSoftware = extras.getString("BocasStringSoftware");
            String BocasValStringInformatica = extras.getString("BocasStringInformatica");


            txtValSedeBocasRedes = (TextView) findViewById(R.id.txtValBocasRedes);
            txtValSedeBocasRedes.setText(BocasValStringRedes);

            txtValSedeBocasArquitectura = (TextView) findViewById(R.id.txtValBocasArquitectura);
            txtValSedeBocasArquitectura.setText(BocasValStringArquitectura);

            txtValSedeBocasSoftware = (TextView) findViewById(R.id.txtValBocasSoftware);
            txtValSedeBocasSoftware.setText(BocasValStringSoftware);

            txtValSedeBocasInformatica = (TextView) findViewById(R.id.txtValBocasInformatica);
            txtValSedeBocasInformatica.setText(BocasValStringInformatica);


            //Datos de sede veraguas

            String veraguasValString = extras.getString("veraguasString");


            String veraguasValStringDesocupado = extras.getString("veraguasStringDesocupado");
            String veraguasValStringEmpleado = extras.getString("veraguasStringEmpleado");
            String veraguasValStringIndependiente = extras.getString("veraguasStringIndependiente");


            txtValSedeveraguas= (TextView) findViewById(R.id.txtValSedeveraguas);
            txtValSedeveraguas.setText(veraguasValString);

            txtValSedeveraguasDesocupado = (TextView) findViewById(R.id.txtValveraguasDesocupado);
            txtValSedeveraguasDesocupado.setText(veraguasValStringDesocupado);

            txtValSedeveraguasEmpleado = (TextView) findViewById(R.id.txtValveraguasEmpleado);
            txtValSedeveraguasEmpleado.setText(veraguasValStringEmpleado);

            txtValSedeveraguasIndependiente = (TextView) findViewById(R.id.txtValveraguasIndependiente);
            txtValSedeveraguasIndependiente.setText(veraguasValStringIndependiente);


            String veraguasValStringTecnico = extras.getString("veraguasStringTecnico");
            String veraguasValStringLicenciatura = extras.getString("veraguasStringLicenciatura");
            String veraguasValStringPostgrado = extras.getString("veraguasStringPostgrado");
            String veraguasValStringMaestria = extras.getString("veraguasStringMaestria");
            String veraguasValStringDoctorado = extras.getString("veraguasStringDoctorado");



            txtValSedeveraguasTecnico = (TextView) findViewById(R.id.txtValveraguasTecnico);
            txtValSedeveraguasTecnico.setText(veraguasValStringTecnico);

            txtValSedeveraguasLicenciatura = (TextView) findViewById(R.id.txtValveraguasLicenciatura);
            txtValSedeveraguasLicenciatura.setText(veraguasValStringLicenciatura);

            txtValSedeveraguasPostgrado = (TextView) findViewById(R.id.txtValveraguasPostgrado);
            txtValSedeveraguasPostgrado.setText(veraguasValStringPostgrado);

            txtValSedeveraguasMaestria = (TextView) findViewById(R.id.txtValveraguasMaestria);
            txtValSedeveraguasMaestria.setText(veraguasValStringMaestria);

            txtValSedeveraguasDoctorado = (TextView) findViewById(R.id.txtValveraguasDoctorado);
            txtValSedeveraguasDoctorado.setText(veraguasValStringDoctorado);


            String veraguasValString0Espanol = extras.getString("veraguasStringEspanol0");
            String veraguasValString1_25Espanol = extras.getString("veraguasStringEspanol1_25");
            String veraguasValString25_50Espanol = extras.getString("veraguasStringEspanol25_50");
            String veraguasValString50_75Espanol = extras.getString("veraguasStringEspanol50_75");
            String veraguasValString75_100Espanol = extras.getString("veraguasStringEspanol75_100");



            txtValSedeveraguas0Espanol = (TextView) findViewById(R.id.txtValveraguas0Espanol);
            txtValSedeveraguas0Espanol.setText(veraguasValString0Espanol);

            txtValSedeveraguas1_25Espanol = (TextView) findViewById(R.id.txtValveraguas1_25Espanol);
            txtValSedeveraguas1_25Espanol.setText(veraguasValString1_25Espanol);

            txtValSedeveraguas25_50Espanol = (TextView) findViewById(R.id.txtValveraguas25_50Espanol);
            txtValSedeveraguas25_50Espanol.setText(veraguasValString25_50Espanol);

            txtValSedeveraguas50_75Espanol = (TextView) findViewById(R.id.txtValveraguas50_75Espanol);
            txtValSedeveraguas50_75Espanol.setText(veraguasValString50_75Espanol);

            txtValSedeveraguas75_100Espanol = (TextView) findViewById(R.id.txtValveraguas75_100Espanol);
            txtValSedeveraguas75_100Espanol.setText(veraguasValString75_100Espanol);



            String veraguasValString0Ingles = extras.getString("veraguasStringIngles0");
            String veraguasValString1_25Ingles = extras.getString("veraguasStringIngles1_25");
            String veraguasValString25_50Ingles = extras.getString("veraguasStringIngles25_50");
            String veraguasValString50_75Ingles = extras.getString("veraguasStringIngles50_75");
            String veraguasValString75_100Ingles = extras.getString("veraguasStringIngles75_100");



            txtValSedeveraguas0Ingles = (TextView) findViewById(R.id.txtValveraguas0Ingles);
            txtValSedeveraguas0Ingles.setText(veraguasValString0Ingles);

            txtValSedeveraguas1_25Ingles = (TextView) findViewById(R.id.txtValveraguas1_25Ingles);
            txtValSedeveraguas1_25Ingles.setText(veraguasValString1_25Ingles);

            txtValSedeveraguas25_50Ingles = (TextView) findViewById(R.id.txtValveraguas25_50Ingles);
            txtValSedeveraguas25_50Ingles.setText(veraguasValString25_50Ingles);

            txtValSedeveraguas50_75Ingles = (TextView) findViewById(R.id.txtValveraguas50_75Ingles);
            txtValSedeveraguas50_75Ingles.setText(veraguasValString50_75Ingles);

            txtValSedeveraguas75_100Ingles = (TextView) findViewById(R.id.txtValveraguas75_100Ingles);
            txtValSedeveraguas75_100Ingles.setText(veraguasValString75_100Ingles);


            String veraguasValStringRedes = extras.getString("veraguasStringRedes");
            String veraguasValStringArquitectura = extras.getString("veraguasStringArquitectura");
            String veraguasValStringSoftware = extras.getString("veraguasStringSoftware");
            String veraguasValStringInformatica = extras.getString("veraguasStringInformatica");


            txtValSedeveraguasRedes = (TextView) findViewById(R.id.txtValveraguasRedes);
            txtValSedeveraguasRedes.setText(veraguasValStringRedes);

            txtValSedeveraguasArquitectura = (TextView) findViewById(R.id.txtValveraguasArquitectura);
            txtValSedeveraguasArquitectura.setText(veraguasValStringArquitectura);

            txtValSedeveraguasSoftware = (TextView) findViewById(R.id.txtValveraguasSoftware);
            txtValSedeveraguasSoftware.setText(veraguasValStringSoftware);

            txtValSedeveraguasInformatica = (TextView) findViewById(R.id.txtValveraguasInformatica);
            txtValSedeveraguasInformatica.setText(veraguasValStringInformatica);



            //Datos de sede panama

            String panamaValString = extras.getString("panamaString");


            String panamaValStringDesocupado = extras.getString("panamaStringDesocupado");
            String panamaValStringEmpleado = extras.getString("panamaStringEmpleado");
            String panamaValStringIndependiente = extras.getString("panamaStringIndependiente");


            txtValSedepanama= (TextView) findViewById(R.id.txtValSedepanama);
            txtValSedepanama.setText(panamaValString);

            txtValSedepanamaDesocupado = (TextView) findViewById(R.id.txtValpanamaDesocupado);
            txtValSedepanamaDesocupado.setText(panamaValStringDesocupado);

            txtValSedepanamaEmpleado = (TextView) findViewById(R.id.txtValpanamaEmpleado);
            txtValSedepanamaEmpleado.setText(panamaValStringEmpleado);

            txtValSedepanamaIndependiente = (TextView) findViewById(R.id.txtValpanamaIndependiente);
            txtValSedepanamaIndependiente.setText(panamaValStringIndependiente);


            String panamaValStringTecnico = extras.getString("panamaStringTecnico");
            String panamaValStringLicenciatura = extras.getString("panamaStringLicenciatura");
            String panamaValStringPostgrado = extras.getString("panamaStringPostgrado");
            String panamaValStringMaestria = extras.getString("panamaStringMaestria");
            String panamaValStringDoctorado = extras.getString("panamaStringDoctorado");



            txtValSedepanamaTecnico = (TextView) findViewById(R.id.txtValpanamaTecnico);
            txtValSedepanamaTecnico.setText(panamaValStringTecnico);

            txtValSedepanamaLicenciatura = (TextView) findViewById(R.id.txtValpanamaLicenciatura);
            txtValSedepanamaLicenciatura.setText(panamaValStringLicenciatura);

            txtValSedepanamaPostgrado = (TextView) findViewById(R.id.txtValpanamaPostgrado);
            txtValSedepanamaPostgrado.setText(panamaValStringPostgrado);

            txtValSedepanamaMaestria = (TextView) findViewById(R.id.txtValpanamaMaestria);
            txtValSedepanamaMaestria.setText(panamaValStringMaestria);

            txtValSedepanamaDoctorado = (TextView) findViewById(R.id.txtValpanamaDoctorado);
            txtValSedepanamaDoctorado.setText(panamaValStringDoctorado);


            String panamaValString0Espanol = extras.getString("panamaStringEspanol0");
            String panamaValString1_25Espanol = extras.getString("panamaStringEspanol1_25");
            String panamaValString25_50Espanol = extras.getString("panamaStringEspanol25_50");
            String panamaValString50_75Espanol = extras.getString("panamaStringEspanol50_75");
            String panamaValString75_100Espanol = extras.getString("panamaStringEspanol75_100");



            txtValSedepanama0Espanol = (TextView) findViewById(R.id.txtValpanama0Espanol);
            txtValSedepanama0Espanol.setText(panamaValString0Espanol);

            txtValSedepanama1_25Espanol = (TextView) findViewById(R.id.txtValpanama1_25Espanol);
            txtValSedepanama1_25Espanol.setText(panamaValString1_25Espanol);

            txtValSedepanama25_50Espanol = (TextView) findViewById(R.id.txtValpanama25_50Espanol);
            txtValSedepanama25_50Espanol.setText(panamaValString25_50Espanol);

            txtValSedepanama50_75Espanol = (TextView) findViewById(R.id.txtValpanama50_75Espanol);
            txtValSedepanama50_75Espanol.setText(panamaValString50_75Espanol);

            txtValSedepanama75_100Espanol = (TextView) findViewById(R.id.txtValpanama75_100Espanol);
            txtValSedepanama75_100Espanol.setText(panamaValString75_100Espanol);



            String panamaValString0Ingles = extras.getString("panamaStringIngles0");
            String panamaValString1_25Ingles = extras.getString("panamaStringIngles1_25");
            String panamaValString25_50Ingles = extras.getString("panamaStringIngles25_50");
            String panamaValString50_75Ingles = extras.getString("panamaStringIngles50_75");
            String panamaValString75_100Ingles = extras.getString("panamaStringIngles75_100");



            txtValSedepanama0Ingles = (TextView) findViewById(R.id.txtValpanama0Ingles);
            txtValSedepanama0Ingles.setText(panamaValString0Ingles);

            txtValSedepanama1_25Ingles = (TextView) findViewById(R.id.txtValpanama1_25Ingles);
            txtValSedepanama1_25Ingles.setText(panamaValString1_25Ingles);

            txtValSedepanama25_50Ingles = (TextView) findViewById(R.id.txtValpanama25_50Ingles);
            txtValSedepanama25_50Ingles.setText(panamaValString25_50Ingles);

            txtValSedepanama50_75Ingles = (TextView) findViewById(R.id.txtValpanama50_75Ingles);
            txtValSedepanama50_75Ingles.setText(panamaValString50_75Ingles);

            txtValSedepanama75_100Ingles = (TextView) findViewById(R.id.txtValpanama75_100Ingles);
            txtValSedepanama75_100Ingles.setText(panamaValString75_100Ingles);


            String panamaValStringRedes = extras.getString("panamaStringRedes");
            String panamaValStringArquitectura = extras.getString("panamaStringArquitectura");
            String panamaValStringSoftware = extras.getString("panamaStringSoftware");
            String panamaValStringInformatica = extras.getString("panamaStringInformatica");


            txtValSedepanamaRedes = (TextView) findViewById(R.id.txtValpanamaRedes);
            txtValSedepanamaRedes.setText(panamaValStringRedes);

            txtValSedepanamaArquitectura = (TextView) findViewById(R.id.txtValpanamaArquitectura);
            txtValSedepanamaArquitectura.setText(panamaValStringArquitectura);

            txtValSedepanamaSoftware = (TextView) findViewById(R.id.txtValpanamaSoftware);
            txtValSedepanamaSoftware.setText(panamaValStringSoftware);

            txtValSedepanamaInformatica = (TextView) findViewById(R.id.txtValpanamaInformatica);
            txtValSedepanamaInformatica.setText(panamaValStringInformatica);



            //Datos de sede chiriqui

            String chiriquiValString = extras.getString("chiriquiString");


            String chiriquiValStringDesocupado = extras.getString("chiriquiStringDesocupado");
            String chiriquiValStringEmpleado = extras.getString("chiriquiStringEmpleado");
            String chiriquiValStringIndependiente = extras.getString("chiriquiStringIndependiente");


            txtValSedechiriqui= (TextView) findViewById(R.id.txtValSedechiriqui);
            txtValSedechiriqui.setText(chiriquiValString);

            txtValSedechiriquiDesocupado = (TextView) findViewById(R.id.txtValchiriquiDesocupado);
            txtValSedechiriquiDesocupado.setText(chiriquiValStringDesocupado);

            txtValSedechiriquiEmpleado = (TextView) findViewById(R.id.txtValchiriquiEmpleado);
            txtValSedechiriquiEmpleado.setText(chiriquiValStringEmpleado);

            txtValSedechiriquiIndependiente = (TextView) findViewById(R.id.txtValchiriquiIndependiente);
            txtValSedechiriquiIndependiente.setText(chiriquiValStringIndependiente);


            String chiriquiValStringTecnico = extras.getString("chiriquiStringTecnico");
            String chiriquiValStringLicenciatura = extras.getString("chiriquiStringLicenciatura");
            String chiriquiValStringPostgrado = extras.getString("chiriquiStringPostgrado");
            String chiriquiValStringMaestria = extras.getString("chiriquiStringMaestria");
            String chiriquiValStringDoctorado = extras.getString("chiriquiStringDoctorado");



            txtValSedechiriquiTecnico = (TextView) findViewById(R.id.txtValchiriquiTecnico);
            txtValSedechiriquiTecnico.setText(chiriquiValStringTecnico);

            txtValSedechiriquiLicenciatura = (TextView) findViewById(R.id.txtValchiriquiLicenciatura);
            txtValSedechiriquiLicenciatura.setText(chiriquiValStringLicenciatura);

            txtValSedechiriquiPostgrado = (TextView) findViewById(R.id.txtValchiriquiPostgrado);
            txtValSedechiriquiPostgrado.setText(chiriquiValStringPostgrado);

            txtValSedechiriquiMaestria = (TextView) findViewById(R.id.txtValchiriquiMaestria);
            txtValSedechiriquiMaestria.setText(chiriquiValStringMaestria);

            txtValSedechiriquiDoctorado = (TextView) findViewById(R.id.txtValchiriquiDoctorado);
            txtValSedechiriquiDoctorado.setText(chiriquiValStringDoctorado);


            String chiriquiValString0Espanol = extras.getString("chiriquiStringEspanol0");
            String chiriquiValString1_25Espanol = extras.getString("chiriquiStringEspanol1_25");
            String chiriquiValString25_50Espanol = extras.getString("chiriquiStringEspanol25_50");
            String chiriquiValString50_75Espanol = extras.getString("chiriquiStringEspanol50_75");
            String chiriquiValString75_100Espanol = extras.getString("chiriquiStringEspanol75_100");



            txtValSedechiriqui0Espanol = (TextView) findViewById(R.id.txtValchiriqui0Espanol);
            txtValSedechiriqui0Espanol.setText(chiriquiValString0Espanol);

            txtValSedechiriqui1_25Espanol = (TextView) findViewById(R.id.txtValchiriqui1_25Espanol);
            txtValSedechiriqui1_25Espanol.setText(chiriquiValString1_25Espanol);

            txtValSedechiriqui25_50Espanol = (TextView) findViewById(R.id.txtValchiriqui25_50Espanol);
            txtValSedechiriqui25_50Espanol.setText(chiriquiValString25_50Espanol);

            txtValSedechiriqui50_75Espanol = (TextView) findViewById(R.id.txtValchiriqui50_75Espanol);
            txtValSedechiriqui50_75Espanol.setText(chiriquiValString50_75Espanol);

            txtValSedechiriqui75_100Espanol = (TextView) findViewById(R.id.txtValchiriqui75_100Espanol);
            txtValSedechiriqui75_100Espanol.setText(chiriquiValString75_100Espanol);



            String chiriquiValString0Ingles = extras.getString("chiriquiStringIngles0");
            String chiriquiValString1_25Ingles = extras.getString("chiriquiStringIngles1_25");
            String chiriquiValString25_50Ingles = extras.getString("chiriquiStringIngles25_50");
            String chiriquiValString50_75Ingles = extras.getString("chiriquiStringIngles50_75");
            String chiriquiValString75_100Ingles = extras.getString("chiriquiStringIngles75_100");



            txtValSedechiriqui0Ingles = (TextView) findViewById(R.id.txtValchiriqui0Ingles);
            txtValSedechiriqui0Ingles.setText(chiriquiValString0Ingles);

            txtValSedechiriqui1_25Ingles = (TextView) findViewById(R.id.txtValchiriqui1_25Ingles);
            txtValSedechiriqui1_25Ingles.setText(chiriquiValString1_25Ingles);

            txtValSedechiriqui25_50Ingles = (TextView) findViewById(R.id.txtValchiriqui25_50Ingles);
            txtValSedechiriqui25_50Ingles.setText(chiriquiValString25_50Ingles);

            txtValSedechiriqui50_75Ingles = (TextView) findViewById(R.id.txtValchiriqui50_75Ingles);
            txtValSedechiriqui50_75Ingles.setText(chiriquiValString50_75Ingles);

            txtValSedechiriqui75_100Ingles = (TextView) findViewById(R.id.txtValchiriqui75_100Ingles);
            txtValSedechiriqui75_100Ingles.setText(chiriquiValString75_100Ingles);


            String chiriquiValStringRedes = extras.getString("chiriquiStringRedes");
            String chiriquiValStringArquitectura = extras.getString("chiriquiStringArquitectura");
            String chiriquiValStringSoftware = extras.getString("chiriquiStringSoftware");
            String chiriquiValStringInformatica = extras.getString("chiriquiStringInformatica");


            txtValSedechiriquiRedes = (TextView) findViewById(R.id.txtValchiriquiRedes);
            txtValSedechiriquiRedes.setText(chiriquiValStringRedes);

            txtValSedechiriquiArquitectura = (TextView) findViewById(R.id.txtValchiriquiArquitectura);
            txtValSedechiriquiArquitectura.setText(chiriquiValStringArquitectura);

            txtValSedechiriquiSoftware = (TextView) findViewById(R.id.txtValchiriquiSoftware);
            txtValSedechiriquiSoftware.setText(chiriquiValStringSoftware);

            txtValSedechiriquiInformatica = (TextView) findViewById(R.id.txtValchiriquiInformatica);
            txtValSedechiriquiInformatica.setText(chiriquiValStringInformatica);



            //Datos de sede cocle

            String cocleValString = extras.getString("cocleString");


            String cocleValStringDesocupado = extras.getString("cocleStringDesocupado");
            String cocleValStringEmpleado = extras.getString("cocleStringEmpleado");
            String cocleValStringIndependiente = extras.getString("cocleStringIndependiente");


            txtValSedecocle= (TextView) findViewById(R.id.txtValSedecocle);
            txtValSedecocle.setText(cocleValString);

            txtValSedecocleDesocupado = (TextView) findViewById(R.id.txtValcocleDesocupado);
            txtValSedecocleDesocupado.setText(cocleValStringDesocupado);

            txtValSedecocleEmpleado = (TextView) findViewById(R.id.txtValcocleEmpleado);
            txtValSedecocleEmpleado.setText(cocleValStringEmpleado);

            txtValSedecocleIndependiente = (TextView) findViewById(R.id.txtValcocleIndependiente);
            txtValSedecocleIndependiente.setText(cocleValStringIndependiente);


            String cocleValStringTecnico = extras.getString("cocleStringTecnico");
            String cocleValStringLicenciatura = extras.getString("cocleStringLicenciatura");
            String cocleValStringPostgrado = extras.getString("cocleStringPostgrado");
            String cocleValStringMaestria = extras.getString("cocleStringMaestria");
            String cocleValStringDoctorado = extras.getString("cocleStringDoctorado");



            txtValSedecocleTecnico = (TextView) findViewById(R.id.txtValcocleTecnico);
            txtValSedecocleTecnico.setText(cocleValStringTecnico);

            txtValSedecocleLicenciatura = (TextView) findViewById(R.id.txtValcocleLicenciatura);
            txtValSedecocleLicenciatura.setText(cocleValStringLicenciatura);

            txtValSedecoclePostgrado = (TextView) findViewById(R.id.txtValcoclePostgrado);
            txtValSedecoclePostgrado.setText(cocleValStringPostgrado);

            txtValSedecocleMaestria = (TextView) findViewById(R.id.txtValcocleMaestria);
            txtValSedecocleMaestria.setText(cocleValStringMaestria);

            txtValSedecocleDoctorado = (TextView) findViewById(R.id.txtValcocleDoctorado);
            txtValSedecocleDoctorado.setText(cocleValStringDoctorado);


            String cocleValString0Espanol = extras.getString("cocleStringEspanol0");
            String cocleValString1_25Espanol = extras.getString("cocleStringEspanol1_25");
            String cocleValString25_50Espanol = extras.getString("cocleStringEspanol25_50");
            String cocleValString50_75Espanol = extras.getString("cocleStringEspanol50_75");
            String cocleValString75_100Espanol = extras.getString("cocleStringEspanol75_100");



            txtValSedecocle0Espanol = (TextView) findViewById(R.id.txtValcocle0Espanol);
            txtValSedecocle0Espanol.setText(cocleValString0Espanol);

            txtValSedecocle1_25Espanol = (TextView) findViewById(R.id.txtValcocle1_25Espanol);
            txtValSedecocle1_25Espanol.setText(cocleValString1_25Espanol);

            txtValSedecocle25_50Espanol = (TextView) findViewById(R.id.txtValcocle25_50Espanol);
            txtValSedecocle25_50Espanol.setText(cocleValString25_50Espanol);

            txtValSedecocle50_75Espanol = (TextView) findViewById(R.id.txtValcocle50_75Espanol);
            txtValSedecocle50_75Espanol.setText(cocleValString50_75Espanol);

            txtValSedecocle75_100Espanol = (TextView) findViewById(R.id.txtValcocle75_100Espanol);
            txtValSedecocle75_100Espanol.setText(cocleValString75_100Espanol);



            String cocleValString0Ingles = extras.getString("cocleStringIngles0");
            String cocleValString1_25Ingles = extras.getString("cocleStringIngles1_25");
            String cocleValString25_50Ingles = extras.getString("cocleStringIngles25_50");
            String cocleValString50_75Ingles = extras.getString("cocleStringIngles50_75");
            String cocleValString75_100Ingles = extras.getString("cocleStringIngles75_100");



            txtValSedecocle0Ingles = (TextView) findViewById(R.id.txtValcocle0Ingles);
            txtValSedecocle0Ingles.setText(cocleValString0Ingles);

            txtValSedecocle1_25Ingles = (TextView) findViewById(R.id.txtValcocle1_25Ingles);
            txtValSedecocle1_25Ingles.setText(cocleValString1_25Ingles);

            txtValSedecocle25_50Ingles = (TextView) findViewById(R.id.txtValcocle25_50Ingles);
            txtValSedecocle25_50Ingles.setText(cocleValString25_50Ingles);

            txtValSedecocle50_75Ingles = (TextView) findViewById(R.id.txtValcocle50_75Ingles);
            txtValSedecocle50_75Ingles.setText(cocleValString50_75Ingles);

            txtValSedecocle75_100Ingles = (TextView) findViewById(R.id.txtValcocle75_100Ingles);
            txtValSedecocle75_100Ingles.setText(cocleValString75_100Ingles);


            String cocleValStringRedes = extras.getString("cocleStringRedes");
            String cocleValStringArquitectura = extras.getString("cocleStringArquitectura");
            String cocleValStringSoftware = extras.getString("cocleStringSoftware");
            String cocleValStringInformatica = extras.getString("cocleStringInformatica");


            txtValSedecocleRedes = (TextView) findViewById(R.id.txtValcocleRedes);
            txtValSedecocleRedes.setText(cocleValStringRedes);

            txtValSedecocleArquitectura = (TextView) findViewById(R.id.txtValcocleArquitectura);
            txtValSedecocleArquitectura.setText(cocleValStringArquitectura);

            txtValSedecocleSoftware = (TextView) findViewById(R.id.txtValcocleSoftware);
            txtValSedecocleSoftware.setText(cocleValStringSoftware);

            txtValSedecocleInformatica = (TextView) findViewById(R.id.txtValcocleInformatica);
            txtValSedecocleInformatica.setText(cocleValStringInformatica);


            //Datos de sede chorrera

            String chorreraValString = extras.getString("chorreraString");


            String chorreraValStringDesocupado = extras.getString("chorreraStringDesocupado");
            String chorreraValStringEmpleado = extras.getString("chorreraStringEmpleado");
            String chorreraValStringIndependiente = extras.getString("chorreraStringIndependiente");


            txtValSedechorrera= (TextView) findViewById(R.id.txtValSedechorrera);
            txtValSedechorrera.setText(chorreraValString);

            txtValSedechorreraDesocupado = (TextView) findViewById(R.id.txtValchorreraDesocupado);
            txtValSedechorreraDesocupado.setText(chorreraValStringDesocupado);

            txtValSedechorreraEmpleado = (TextView) findViewById(R.id.txtValchorreraEmpleado);
            txtValSedechorreraEmpleado.setText(chorreraValStringEmpleado);

            txtValSedechorreraIndependiente = (TextView) findViewById(R.id.txtValchorreraIndependiente);
            txtValSedechorreraIndependiente.setText(chorreraValStringIndependiente);


            String chorreraValStringTecnico = extras.getString("chorreraStringTecnico");
            String chorreraValStringLicenciatura = extras.getString("chorreraStringLicenciatura");
            String chorreraValStringPostgrado = extras.getString("chorreraStringPostgrado");
            String chorreraValStringMaestria = extras.getString("chorreraStringMaestria");
            String chorreraValStringDoctorado = extras.getString("chorreraStringDoctorado");



            txtValSedechorreraTecnico = (TextView) findViewById(R.id.txtValchorreraTecnico);
            txtValSedechorreraTecnico.setText(chorreraValStringTecnico);

            txtValSedechorreraLicenciatura = (TextView) findViewById(R.id.txtValchorreraLicenciatura);
            txtValSedechorreraLicenciatura.setText(chorreraValStringLicenciatura);

            txtValSedechorreraPostgrado = (TextView) findViewById(R.id.txtValchorreraPostgrado);
            txtValSedechorreraPostgrado.setText(chorreraValStringPostgrado);

            txtValSedechorreraMaestria = (TextView) findViewById(R.id.txtValchorreraMaestria);
            txtValSedechorreraMaestria.setText(chorreraValStringMaestria);

            txtValSedechorreraDoctorado = (TextView) findViewById(R.id.txtValchorreraDoctorado);
            txtValSedechorreraDoctorado.setText(chorreraValStringDoctorado);


            String chorreraValString0Espanol = extras.getString("chorreraStringEspanol0");
            String chorreraValString1_25Espanol = extras.getString("chorreraStringEspanol1_25");
            String chorreraValString25_50Espanol = extras.getString("chorreraStringEspanol25_50");
            String chorreraValString50_75Espanol = extras.getString("chorreraStringEspanol50_75");
            String chorreraValString75_100Espanol = extras.getString("chorreraStringEspanol75_100");



            txtValSedechorrera0Espanol = (TextView) findViewById(R.id.txtValchorrera0Espanol);
            txtValSedechorrera0Espanol.setText(chorreraValString0Espanol);

            txtValSedechorrera1_25Espanol = (TextView) findViewById(R.id.txtValchorrera1_25Espanol);
            txtValSedechorrera1_25Espanol.setText(chorreraValString1_25Espanol);

            txtValSedechorrera25_50Espanol = (TextView) findViewById(R.id.txtValchorrera25_50Espanol);
            txtValSedechorrera25_50Espanol.setText(chorreraValString25_50Espanol);

            txtValSedechorrera50_75Espanol = (TextView) findViewById(R.id.txtValchorrera50_75Espanol);
            txtValSedechorrera50_75Espanol.setText(chorreraValString50_75Espanol);

            txtValSedechorrera75_100Espanol = (TextView) findViewById(R.id.txtValchorrera75_100Espanol);
            txtValSedechorrera75_100Espanol.setText(chorreraValString75_100Espanol);



            String chorreraValString0Ingles = extras.getString("chorreraStringIngles0");
            String chorreraValString1_25Ingles = extras.getString("chorreraStringIngles1_25");
            String chorreraValString25_50Ingles = extras.getString("chorreraStringIngles25_50");
            String chorreraValString50_75Ingles = extras.getString("chorreraStringIngles50_75");
            String chorreraValString75_100Ingles = extras.getString("chorreraStringIngles75_100");



            txtValSedechorrera0Ingles = (TextView) findViewById(R.id.txtValchorrera0Ingles);
            txtValSedechorrera0Ingles.setText(chorreraValString0Ingles);

            txtValSedechorrera1_25Ingles = (TextView) findViewById(R.id.txtValchorrera1_25Ingles);
            txtValSedechorrera1_25Ingles.setText(chorreraValString1_25Ingles);

            txtValSedechorrera25_50Ingles = (TextView) findViewById(R.id.txtValchorrera25_50Ingles);
            txtValSedechorrera25_50Ingles.setText(chorreraValString25_50Ingles);

            txtValSedechorrera50_75Ingles = (TextView) findViewById(R.id.txtValchorrera50_75Ingles);
            txtValSedechorrera50_75Ingles.setText(chorreraValString50_75Ingles);

            txtValSedechorrera75_100Ingles = (TextView) findViewById(R.id.txtValchorrera75_100Ingles);
            txtValSedechorrera75_100Ingles.setText(chorreraValString75_100Ingles);


            String chorreraValStringRedes = extras.getString("chorreraStringRedes");
            String chorreraValStringArquitectura = extras.getString("chorreraStringArquitectura");
            String chorreraValStringSoftware = extras.getString("chorreraStringSoftware");
            String chorreraValStringInformatica = extras.getString("chorreraStringInformatica");


            txtValSedechorreraRedes = (TextView) findViewById(R.id.txtValchorreraRedes);
            txtValSedechorreraRedes.setText(chorreraValStringRedes);

            txtValSedechorreraArquitectura = (TextView) findViewById(R.id.txtValchorreraArquitectura);
            txtValSedechorreraArquitectura.setText(chorreraValStringArquitectura);

            txtValSedechorreraSoftware = (TextView) findViewById(R.id.txtValchorreraSoftware);
            txtValSedechorreraSoftware.setText(chorreraValStringSoftware);

            txtValSedechorreraInformatica = (TextView) findViewById(R.id.txtValchorreraInformatica);
            txtValSedechorreraInformatica.setText(chorreraValStringInformatica);


            //Datos de sede colon

            String colonValString = extras.getString("colonString");


            String colonValStringDesocupado = extras.getString("colonStringDesocupado");
            String colonValStringEmpleado = extras.getString("colonStringEmpleado");
            String colonValStringIndependiente = extras.getString("colonStringIndependiente");


            txtValSedecolon= (TextView) findViewById(R.id.txtValSedecolon);
            txtValSedecolon.setText(colonValString);

            txtValSedecolonDesocupado = (TextView) findViewById(R.id.txtValcolonDesocupado);
            txtValSedecolonDesocupado.setText(colonValStringDesocupado);

            txtValSedecolonEmpleado = (TextView) findViewById(R.id.txtValcolonEmpleado);
            txtValSedecolonEmpleado.setText(colonValStringEmpleado);

            txtValSedecolonIndependiente = (TextView) findViewById(R.id.txtValcolonIndependiente);
            txtValSedecolonIndependiente.setText(colonValStringIndependiente);


            String colonValStringTecnico = extras.getString("colonStringTecnico");
            String colonValStringLicenciatura = extras.getString("colonStringLicenciatura");
            String colonValStringPostgrado = extras.getString("colonStringPostgrado");
            String colonValStringMaestria = extras.getString("colonStringMaestria");
            String colonValStringDoctorado = extras.getString("colonStringDoctorado");



            txtValSedecolonTecnico = (TextView) findViewById(R.id.txtValcolonTecnico);
            txtValSedecolonTecnico.setText(colonValStringTecnico);

            txtValSedecolonLicenciatura = (TextView) findViewById(R.id.txtValcolonLicenciatura);
            txtValSedecolonLicenciatura.setText(colonValStringLicenciatura);

            txtValSedecolonPostgrado = (TextView) findViewById(R.id.txtValcolonPostgrado);
            txtValSedecolonPostgrado.setText(colonValStringPostgrado);

            txtValSedecolonMaestria = (TextView) findViewById(R.id.txtValcolonMaestria);
            txtValSedecolonMaestria.setText(colonValStringMaestria);

            txtValSedecolonDoctorado = (TextView) findViewById(R.id.txtValcolonDoctorado);
            txtValSedecolonDoctorado.setText(colonValStringDoctorado);


            String colonValString0Espanol = extras.getString("colonStringEspanol0");
            String colonValString1_25Espanol = extras.getString("colonStringEspanol1_25");
            String colonValString25_50Espanol = extras.getString("colonStringEspanol25_50");
            String colonValString50_75Espanol = extras.getString("colonStringEspanol50_75");
            String colonValString75_100Espanol = extras.getString("colonStringEspanol75_100");



            txtValSedecolon0Espanol = (TextView) findViewById(R.id.txtValcolon0Espanol);
            txtValSedecolon0Espanol.setText(colonValString0Espanol);

            txtValSedecolon1_25Espanol = (TextView) findViewById(R.id.txtValcolon1_25Espanol);
            txtValSedecolon1_25Espanol.setText(colonValString1_25Espanol);

            txtValSedecolon25_50Espanol = (TextView) findViewById(R.id.txtValcolon25_50Espanol);
            txtValSedecolon25_50Espanol.setText(colonValString25_50Espanol);

            txtValSedecolon50_75Espanol = (TextView) findViewById(R.id.txtValcolon50_75Espanol);
            txtValSedecolon50_75Espanol.setText(colonValString50_75Espanol);

            txtValSedecolon75_100Espanol = (TextView) findViewById(R.id.txtValcolon75_100Espanol);
            txtValSedecolon75_100Espanol.setText(colonValString75_100Espanol);



            String colonValString0Ingles = extras.getString("colonStringIngles0");
            String colonValString1_25Ingles = extras.getString("colonStringIngles1_25");
            String colonValString25_50Ingles = extras.getString("colonStringIngles25_50");
            String colonValString50_75Ingles = extras.getString("colonStringIngles50_75");
            String colonValString75_100Ingles = extras.getString("colonStringIngles75_100");



            txtValSedecolon0Ingles = (TextView) findViewById(R.id.txtValcolon0Ingles);
            txtValSedecolon0Ingles.setText(colonValString0Ingles);

            txtValSedecolon1_25Ingles = (TextView) findViewById(R.id.txtValcolon1_25Ingles);
            txtValSedecolon1_25Ingles.setText(colonValString1_25Ingles);

            txtValSedecolon25_50Ingles = (TextView) findViewById(R.id.txtValcolon25_50Ingles);
            txtValSedecolon25_50Ingles.setText(colonValString25_50Ingles);

            txtValSedecolon50_75Ingles = (TextView) findViewById(R.id.txtValcolon50_75Ingles);
            txtValSedecolon50_75Ingles.setText(colonValString50_75Ingles);

            txtValSedecolon75_100Ingles = (TextView) findViewById(R.id.txtValcolon75_100Ingles);
            txtValSedecolon75_100Ingles.setText(colonValString75_100Ingles);


            String colonValStringRedes = extras.getString("colonStringRedes");
            String colonValStringArquitectura = extras.getString("colonStringArquitectura");
            String colonValStringSoftware = extras.getString("colonStringSoftware");
            String colonValStringInformatica = extras.getString("colonStringInformatica");


            txtValSedecolonRedes = (TextView) findViewById(R.id.txtValcolonRedes);
            txtValSedecolonRedes.setText(colonValStringRedes);

            txtValSedecolonArquitectura = (TextView) findViewById(R.id.txtValcolonArquitectura);
            txtValSedecolonArquitectura.setText(colonValStringArquitectura);

            txtValSedecolonSoftware = (TextView) findViewById(R.id.txtValcolonSoftware);
            txtValSedecolonSoftware.setText(colonValStringSoftware);

            txtValSedecolonInformatica = (TextView) findViewById(R.id.txtValcolonInformatica);
            txtValSedecolonInformatica.setText(colonValStringInformatica);


        }else {
            Toast.makeText(this, "valor de Bunble es nulo", Toast.LENGTH_SHORT).show();
        }


    }




}