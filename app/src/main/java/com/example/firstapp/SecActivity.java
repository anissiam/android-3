package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecActivity extends AppCompatActivity {
     String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent intent = getIntent();
        name = intent.getStringExtra("Name");

        Button button = findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = name.toUpperCase();

                Intent intent1 = new Intent();
                intent1.putExtra("Name", name);

                setResult(RESULT_OK, intent1);
                finish();


            }
        });

    }
}