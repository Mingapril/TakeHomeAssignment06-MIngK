package com.example.android.takehomeassignment06_mingk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText amount;
    private EditText taxPercentage;
    private EditText tipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText)findViewById(R.id.amount);
        taxPercentage= (EditText)findViewById(R.id.tax_percentage);
        tipPercentage = (EditText)findViewById(R.id.tip_percentage);
    }



    public void buttonSubmit(View view){

        double amountNumber = Double.parseDouble(amount.getText().toString());
        double taxPercentageNumber = Double.parseDouble(taxPercentage.getText().toString());
        double tipPercentageNumber = Double.parseDouble(tipPercentage.getText().toString());

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("TOTAL",amountNumber);
        intent.putExtra("TAX PERCENTAGE", taxPercentageNumber);
        intent.putExtra("TIP PERCENTAGE",tipPercentageNumber);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }



    }

