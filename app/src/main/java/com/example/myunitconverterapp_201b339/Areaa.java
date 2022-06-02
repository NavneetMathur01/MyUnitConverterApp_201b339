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

public class Areaa extends AppCompatActivity {

    Spinner sp9,sp10;
    EditText e5;
    Button b5;
    TextView t5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaa);

        e5 = findViewById(R.id.editTextNumber5);
        sp9 = findViewById(R.id.spinner9);
        sp10 = findViewById(R.id.spinner10);
        b5 = findViewById(R.id.button5);
        t5 = findViewById(R.id.textViewans5);

        String[] from = {"Square Meter"};
        ArrayAdapter ad9 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp9.setAdapter(ad9);

        String[] to = {"Square Yard","Square Foot","Square Inch","Acre"};
        ArrayAdapter ad10 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp10.setAdapter(ad10);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ans5;
                Double a = Double.parseDouble(e5.getText().toString());
                if(sp9.getSelectedItem().toString() == "Square Meter" && sp10.getSelectedItem().toString() == "Square Yard"){
                    ans5 = a*1.196;
                    Toast.makeText(getApplicationContext(),ans5.toString(),Toast.LENGTH_LONG).show();
                    t5.setText("" + ans5);
                }
                else if(sp9.getSelectedItem().toString() == "Square Meter" && sp10.getSelectedItem().toString() == "Square Foot"){
                    ans5 = a*10.764;
                    Toast.makeText(getApplicationContext(),ans5.toString(),Toast.LENGTH_LONG).show();
                    t5.setText("" + ans5);
                }
                else if(sp9.getSelectedItem().toString() == "Square Meter" && sp10.getSelectedItem().toString() == "Square Inch"){
                    ans5 = a*1550;
                    Toast.makeText(getApplicationContext(),ans5.toString(),Toast.LENGTH_LONG).show();
                    t5.setText("" + ans5);
                }
                else if(sp9.getSelectedItem().toString() == "Square Meter" && sp10.getSelectedItem().toString() == "Acre"){
                    ans5 = a/4047;
                    Toast.makeText(getApplicationContext(),ans5.toString(),Toast.LENGTH_LONG).show();
                    t5.setText("" + ans5);
                }
            }
        });

    }
}