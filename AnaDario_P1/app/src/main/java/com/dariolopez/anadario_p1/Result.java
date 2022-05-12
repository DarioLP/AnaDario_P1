package com.dariolopez.anadario_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    TextView txtValSedeAzuero, txtValSedeAzueroDesocupado,txtValSedeAzueroEmpleado,txtValSedeAzueroIndependiente,
    txtValSedeAzueroTecnico,txtValSedeAzueroLicenciatura,txtValSedeAzueroPostgrado,txtValSedeAzueroMaestria,txtValSedeAzueroDoctorado;

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

/*
            i.putExtra("azueroStringTecnico",azueroStringTecnico);
            i.putExtra("azueroStringLicenciatura",azueroStringLicenciatura);
            i.putExtra("azueroStringPostgrado",azueroStringPostgrado);
            i.putExtra("azueroStringMaestria",azueroStringMaestria);
            i.putExtra("azueroStringDoctorado",azueroStringDoctorado);
*/

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

        }else {
            Toast.makeText(this, "valor de Bunble es nulo", Toast.LENGTH_SHORT).show();
        }


    }

}