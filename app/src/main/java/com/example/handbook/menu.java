package com.example.handbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //IrMenuPrincipal desplaza la vista del teléfono entre actividades
    public void irMenuPrincipal(View v){
        Intent menuPrincipal = new Intent(getBaseContext(), menu.class);
        startActivity(menuPrincipal);
    }
}