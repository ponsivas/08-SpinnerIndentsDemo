package com.example.j8_spinnerindents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndroidActivity extends AppCompatActivity {

    Button HME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        HME = (Button) findViewById(R.id.HOME);

        HME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AndroidActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}