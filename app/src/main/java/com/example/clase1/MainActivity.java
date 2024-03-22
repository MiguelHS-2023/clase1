package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtVal1, edtVal2;
    Button btnCalcular;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1 = findViewById(R.id.edtNum1);
        edtVal2 = findViewById(R.id.edtNum2);
        btnCalcular = findViewById(R.id.btn);

    }
}