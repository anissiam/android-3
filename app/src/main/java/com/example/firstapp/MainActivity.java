package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String ss = intent.getStringExtra("DATA");

        Toast.makeText(this, ss, Toast.LENGTH_SHORT).show();
        Button button = findViewById(R.id.btn);
        EditText editText = findViewById(R.id.edtText);
        editText.setInputType(InputType.TYPE_CLASS_PHONE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String text = editText.getText().toString();

                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Text is empty", Toast.LENGTH_SHORT).show();
                    return;
                }



                text = "tel:" + text;
                Uri uri = Uri.parse(text);

                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);



               /* if (!text.contains("https://")){
                    Toast.makeText(MainActivity.this, "Plz add URL", Toast.LENGTH_SHORT).show();

                    return;
                }*/


               /* Uri uri = Uri.parse(text);
                Intent intent = new Intent();
                intent.setData(uri);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);*/


            }
        });
    }
}