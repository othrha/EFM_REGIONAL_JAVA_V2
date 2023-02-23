package com.example.efm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
    }
    public void calculer(View view) {

        double BMI,poids,taille;
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        poids=Double.parseDouble(edit1.getText().toString());
        taille=Double.parseDouble(edit2.getText().toString());

        BMI=poids/(703*taille*taille);

        if (BMI<18.5)
            Toast.makeText(this,"Underweight",Toast.LENGTH_SHORT).show();
        else if (BMI>=18.5 && BMI<25)
            Toast.makeText(this,"Normal",Toast.LENGTH_SHORT).show();
        else if (BMI>=25 && BMI<40)
            Toast.makeText(this,"Overweight",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Obese",Toast.LENGTH_SHORT).show();
    }
}