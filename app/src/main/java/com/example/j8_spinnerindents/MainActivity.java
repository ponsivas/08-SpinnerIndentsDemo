package com.example.j8_spinnerindents;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] SELECTED = {"SELECT","ANDROID","JAVA","TESTING"};
    Spinner SPIN;
    Button RST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RST = (Button)findViewById(R.id.RESET);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        SPIN = (Spinner) findViewById(R.id.SPINNER);
        SPIN.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the SELECTION list
        ArrayAdapter SLOT = new ArrayAdapter(this, android.R.layout.simple_spinner_item,SELECTED);
        SLOT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner
        SPIN.setAdapter(SLOT);

        RST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SPIN.setAdapter(SLOT);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String SELECTED = SPIN.getSelectedItem().toString();

        if (SELECTED.equals("ANDROID")) {
            Intent intent = new Intent(MainActivity.this,AndroidActivity.class);
            startActivity(intent);
        }

        if (SELECTED.equals("JAVA")) {
            Intent intent = new Intent(MainActivity.this,JavaActivity.class);
            startActivity(intent);
        }

        if (SELECTED.equals("TESTING")) {
            Intent intent = new Intent(MainActivity.this,TestingActivity.class);
            startActivity(intent);
        }

        if (SELECTED.equals("SELECT")) {
            Toast.makeText(getApplicationContext(), "Select any one item below in the spinner to change over to next activity, according to the item selected in the spinner", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}