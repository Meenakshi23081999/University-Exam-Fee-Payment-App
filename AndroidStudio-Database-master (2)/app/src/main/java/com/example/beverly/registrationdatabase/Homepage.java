package com.example.beverly.registrationdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Homepage extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        bt=(Button)findViewById(R.id.button);
        final Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"1st YEAR-Odd Sem","1st Year-Even Sem","2nd YEAR-Odd Sem","2nd Year-Even Sem","3rd YEAR-Odd Sem","3rd Year-Even Sem","4th YEAR-Odd Sem","4th Year-Even Sem"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(Homepage.this, sem1.class);
                        final Intent finalIntent = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                startActivity(finalIntent);
                            }
                        });
                        break;
                    case 1:
                        intent = new Intent(Homepage.this, sem2.class);
                        final Intent finalIntent1 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent1);
                            }
                        });
                        break;
                    case 2:
                        intent = new Intent(Homepage.this, sem3.class);
                        final Intent finalIntent2 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent2);
                            }
                        });
                        break;
                    case 3:
                        intent = new Intent(Homepage.this, sem4.class);
                        final Intent finalIntent3 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent3);
                            }
                        });
                        break;
                    case 4:
                        intent = new Intent(Homepage.this, sem5.class);
                        final Intent finalIntent4 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent4);
                            }
                        });
                        break;
                    case 5:
                        intent = new Intent(Homepage.this, sem6.class);
                        final Intent finalIntent5 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent5);
                            }
                        });
                        break;
                    case 6:
                        intent = new Intent(Homepage.this, sem7.class);
                        final Intent finalIntent6 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent6);
                            }
                        });
                        break;
                    case 7:
                        intent = new Intent(Homepage.this, sem8.class);
                        final Intent finalIntent7 = intent;
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(finalIntent7);
                            }
                        });
                        break;

                    }
                }
                public void onNothingSelected(AdapterView<?> parent) {

                }
        });

    }
}
