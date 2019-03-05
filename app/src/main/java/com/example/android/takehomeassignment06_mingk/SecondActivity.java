package com.example.android.takehomeassignment06_mingk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        TextView receipt = (TextView)findViewById(R.id.receipt);
        double total = intent.getDoubleExtra("TOTAL",0);
        double tax = total * intent.getDoubleExtra("TAX PERCENTAGE",0);
        double tip = total * intent.getDoubleExtra("TIP PERCENTAGE",0);
        double grandTotal = total + tax + tip;
        receipt.setText("Total: " + total + "\nSales Tax: " + tax + "\nTip: " + tip + "\nGrand total: "+ grandTotal);
        setTitle("Your Receipt");
    }


}
