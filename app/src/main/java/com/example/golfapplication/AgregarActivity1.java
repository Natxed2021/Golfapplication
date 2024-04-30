package com.example.golfapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AgregarActivity1 extends AppCompatActivity {
private EditText Skindejuego, Usuario, Numero;
private spinner tipo;
    private int contador;
    private Button TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agregar1);
        TextView = (android.widget.Button) findViewById(R.id.b_agregar);

    }


    public void Juegoporgolpe(View view){
           Intent Juegoporgolpe = new Intent(this,AgregarActivity1.class);
           startActivity(Juegoporgolpe);

    }
}