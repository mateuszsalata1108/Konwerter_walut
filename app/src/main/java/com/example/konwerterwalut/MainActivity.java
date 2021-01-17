package com.example.konwerterwalut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.amount);
        sp1 = findViewById(R.id.from);
        sp2 = findViewById(R.id.to);
        b1 = findViewById(R.id.btn1);
        result = findViewById(R.id.result);

        double PLNtoUSD = 0.27;
        double PLNtoGBP = 0.20;
        double PLNtoJPY = 27.62;
        double PLNtoEUR = 0.22;

        double USDtoPLN = 3.76;
        double USDtoGBP = 0.74;
        double USDtoJPY = 103.84;
        double USDtoEUR = 0.83;

        double JPYtoPLN = 0.036;
        double JPYtoGBP = 0.0071;
        double JPYtoUSD = 0.0096;
        double JPYtoEUR = 0.0080;

        double EURtoPLN = 4.54;
        double EURtoGBP = 0.89;
        double EURtoUSD = 1.21;
        double EURtoJPY = 125.49;

        double GBPtoPLN= 5.11;
        double GBPtoEUR= 1.12;
        double GBPtoUSD= 1.36;
        double GBPtoJPY= 141.10;

        String[] from = {"PLN","USD","JPY","EUR","GBP"};
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(adapter);

        String[] to = {"PLN","USD","JPY","EUR","GBP"};
        ArrayAdapter adapter1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(adapter1);
        String walue = ed1.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(ed1.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Nie podano ilości", Toast.LENGTH_LONG).show();
                } else {
                    double value;
                    double amount = Double.parseDouble(ed1.getText().toString());
                    String converted;
                    if (sp1.getSelectedItem().toString().equals("PLN") && sp2.getSelectedItem().toString().equals("USD")) {
                        value = Math.round(amount * PLNtoUSD * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("PLN") && sp2.getSelectedItem().toString().equals("GBP")) {
                        value = Math.round(amount * PLNtoGBP * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("PLN") && sp2.getSelectedItem().toString().equals("JPY")) {
                        value = Math.round(amount * PLNtoJPY * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("PLN") && sp2.getSelectedItem().toString().equals("EUR")) {
                        value = Math.round(amount * PLNtoEUR * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("PLN")) {
                        value = Math.round(amount * USDtoPLN * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("GBP")) {
                        value = Math.round(amount * USDtoGBP * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("JPY")) {
                        value = Math.round(amount * USDtoJPY * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("EUR")) {
                        value = Math.round(amount * USDtoEUR * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("JPY") && sp2.getSelectedItem().toString().equals("PLM")) {
                        value = Math.round(amount * JPYtoPLN * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("JPY") && sp2.getSelectedItem().toString().equals("GBP")) {
                        value = Math.round(amount * JPYtoGBP * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("JPY") && sp2.getSelectedItem().toString().equals("USD")) {
                        value = Math.round(amount * JPYtoUSD * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("JPY") && sp2.getSelectedItem().toString().equals("EUR")) {
                        value = Math.round(amount * JPYtoEUR * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("PLN")) {
                        value = Math.round(amount * EURtoPLN * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("GBP")) {
                        value = Math.round(amount * EURtoGBP * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("USD")) {
                        value = Math.round(amount * EURtoUSD * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("JPY")) {
                        value = Math.round(amount * EURtoJPY * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("GBP") && sp2.getSelectedItem().toString().equals("PLN")) {
                        value = Math.round(amount * GBPtoPLN * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("GBP") && sp2.getSelectedItem().toString().equals("EUR")) {
                        value = Math.round(amount * GBPtoEUR * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("GBP") && sp2.getSelectedItem().toString().equals("USD")) {
                        value = Math.round(amount * GBPtoUSD * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else if (sp1.getSelectedItem().toString().equals("GBP") && sp2.getSelectedItem().toString().equals("JPY")) {
                        value = Math.round(amount * GBPtoJPY * 10000.0) / 10000.0;
                        converted = value + " " + sp2.getSelectedItem().toString();
                        result.setText(converted);
                    } else {
                        Toast.makeText(getApplicationContext(), "Wybierz różne waluty", Toast.LENGTH_LONG).show();
                    }
                }
            }
            });
        }
    }