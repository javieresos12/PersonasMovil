package com.example.android.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
     private EditText txtcedula, txtnombre, txtApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        txtcedula=findViewById(R.id.txtcedula);
        txtApellido= findViewById(R.id.txtapellido);
        txtnombre= findViewById(R.id.txtnombre);

    }

    public void guardar (View v){
        String ced, nom, apell;
        ced= txtcedula.getText().toString();
        nom= txtnombre.getText().toString();
        apell= txtApellido.getText().toString();

        Persona p = new Persona(ced, nom, apell);
        p.guardar();
        Toast.makeText(this, getResources().getString(R.string.mensaje),Toast.LENGTH_SHORT).show();
        borrar();
    }

    public void limpiar (View v){
        borrar();
    }

    private void borrar(){
        txtcedula.setText("");
        txtnombre.setText("");
        txtApellido.setText("");
        txtcedula.requestFocus();
    }
}
