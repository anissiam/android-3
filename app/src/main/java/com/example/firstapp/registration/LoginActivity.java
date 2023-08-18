package com.example.firstapp.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.firstapp.R;

public class LoginActivity extends AppCompatActivity {
    TextView textView ;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = findViewById(R.id.textView);
        btnBack = findViewById(R.id.btnBack);
        Intent intent = getIntent();
        String myText = intent.getStringExtra("text");

        textView.setText(myText);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}