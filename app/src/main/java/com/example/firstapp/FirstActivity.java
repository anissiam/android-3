package com.example.firstapp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecActivity.class);
                intent.putExtra("Name", "anis");
                //startActivityForResult(intent , REQUEST_CODE);
                mStartForResult.launch(intent);

            }
        });
    }

    ActivityResultLauncher<Intent> mStartForResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK) {
                        Intent intent = result.getData();
                        String name = intent.getStringExtra("Name");
                        Toast.makeText(FirstActivity.this, name, Toast.LENGTH_SHORT).show();
                    }
                }
            });


    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){
            if (resultCode==RESULT_OK){
                if (data!=null){
                    Intent intent = data;
                    String name = intent.getStringExtra("Name");
                    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
                }
            }else if (resultCode==RESULT_CANCELED){
                Toast.makeText(this, "CANCELED", Toast.LENGTH_SHORT).show();
            }
        }
    }*/
}