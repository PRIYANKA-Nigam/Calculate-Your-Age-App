package com.example.calculateyourage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText e;Button b;TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.editTextTextPersonName);
        b=(Button)findViewById(R.id.button);
        t=(TextView)findViewById(R.id.textView3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e.getText().toString().trim();
                int year= Calendar.getInstance().get(Calendar.YEAR);
                if(s.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter a Year",Toast.LENGTH_SHORT).show();
                }
                else if(s.compareTo(String.valueOf(year))>0){
                    Toast.makeText(MainActivity.this,"Year should be less than current year",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int my=year-Integer.parseInt(s);
                    t.setText("YOUR AGE IS " +my+ "YEARS");
                }
            }
        });
    }
}