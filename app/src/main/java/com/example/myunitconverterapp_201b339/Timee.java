package com.example.myunitconverterapp_201b339;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Timee extends AppCompatActivity {

    Spinner sp5,sp6;
    EditText e3;
    Button b3;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timee);

        e3 = findViewById(R.id.editTextNumber3);
        sp5 = findViewById(R.id.spinner5);
        sp6 = findViewById(R.id.spinner6);
        b3 = findViewById(R.id.button3);
        t3 = findViewById(R.id.textViewans3);

        String[] from = {"Hour"};
        ArrayAdapter ad5 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp5.setAdapter(ad5);

        String[] to = {"Minute","Second","Day"};
        ArrayAdapter ad6 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp6.setAdapter(ad6);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ans3;
                Double value = Double.parseDouble(e3.getText().toString());
                if(sp5.getSelectedItem().toString() == "Hour" && sp6.getSelectedItem().toString() == "Minute"){
                    ans3 = value*60;
                    Toast.makeText(getApplicationContext(),ans3.toString(),Toast.LENGTH_LONG).show();
                    t3.setText("" + ans3);
                }
                else if(sp5.getSelectedItem().toString() == "Hour" && sp6.getSelectedItem().toString() == "Second"){
                    ans3 = value*3600;
                    Toast.makeText(getApplicationContext(),ans3.toString(),Toast.LENGTH_LONG).show();
                    t3.setText("" + ans3);
                }
                else if(sp5.getSelectedItem().toString() == "Hour" && sp6.getSelectedItem().toString() == "Day"){
                    ans3 = value/24;
                    Toast.makeText(getApplicationContext(),ans3.toString(),Toast.LENGTH_LONG).show();
                    t3.setText("" + ans3);
                }
            }
        });

    }
}