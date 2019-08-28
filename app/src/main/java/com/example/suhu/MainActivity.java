package com.example.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtCelcius,edtKelvin,edtFarenheit,edtReamur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCelcius = (EditText) findViewById(R.id.edtCelcius);
        edtKelvin = (EditText) findViewById(R.id.edtKelvin);
        edtFarenheit = (EditText) findViewById(R.id.edtFarenheit);
        edtReamur = (EditText) findViewById(R.id.edtReamur);

    }
    public void SUHU(View view){
        double CLS = Double.parseDouble(edtCelcius.getText().toString());

        double KLV = CLS + 273;
        edtKelvin.setText(KLV + "");

        double FRH = (CLS * 1.8) + 32;
        edtFarenheit.setText(FRH + "");

        double RMR = CLS * 0.8;
        edtReamur.setText(RMR + "");

    }

    public void AC(View view){
        edtCelcius.setText("");
        edtReamur.setText("");
        edtKelvin.setText("");
        edtFarenheit.setText("");
    }

}
