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

public class Weight extends AppCompatActivity {
    Spinner sp3,sp4;
    EditText e2;
    Button b2;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        e2 = findViewById(R.id.editTextNumber2);
        sp3 = findViewById(R.id.spinner3);
        sp4 = findViewById(R.id.spinner4);
        b2 = findViewById(R.id.button2);
        t2 = findViewById(R.id.textView18);

        String[] from = {"Kilogram"};
        ArrayAdapter ad3 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp3.setAdapter(ad3);

        String[] to = {"Gram","Pound","Tonne"};
        ArrayAdapter ad4 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp4.setAdapter(ad4);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ans2;
                Double weight = Double.parseDouble(e2.getText().toString());
                if(sp3.getSelectedItem().toString() == "Kilogram" && sp4.getSelectedItem().toString() == "Gram"){
                    ans2 = weight*1000.0;
                    Toast.makeText(getApplicationContext(),ans2.toString(),Toast.LENGTH_LONG).show();
                    t2.setText("" + ans2);
                }
                else if(sp3.getSelectedItem().toString() == "Kilogram" && sp4.getSelectedItem().toString() == "Pound"){
                    ans2 = weight*2.205;
                    Toast.makeText(getApplicationContext(),ans2.toString(),Toast.LENGTH_LONG).show();
                    t2.setText("" + ans2);
                }
                else if(sp3.getSelectedItem().toString() == "Kilogram" && sp4.getSelectedItem().toString() == "Tonne"){
                    ans2 = weight/1000;
                    Toast.makeText(getApplicationContext(),ans2.toString(),Toast.LENGTH_LONG).show();
                    t2.setText("" + ans2);
                }
            }
        });
    }
}