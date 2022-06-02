package com.example.myunitconverterapp_201b339;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }
    public void clickCurrency(View view) {
        Intent intent = new Intent(this, Currency.class);
        startActivity(intent);
    }
    public void clickWeight(View view) {
        Intent intent2 = new Intent(this, Weight.class);
        startActivity(intent2);
    }
    public void clickTime(View view) {
        Intent intent3 = new Intent(this, Timee.class);
        startActivity(intent3);
    }
    public void clickLength(View view) {
        Intent intent4 = new Intent(this, Lengthh.class);
        startActivity(intent4);
    }
    public void clickArea(View view) {
        Intent intent5 = new Intent(this, Areaa.class);
        startActivity(intent5);
    }
    public void clickTemp(View view) {
        Intent intent6 = new Intent(this, Temp.class);
        startActivity(intent6);
    }
}