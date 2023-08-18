package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {
    int result ;
    TextView tvSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);


        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        Button btnSum = findViewById(R.id.btnSum);
        tvSum = findViewById(R.id.tvSum);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edit1.getText().toString());
                int n2 = Integer.parseInt(edit2.getText().toString());

                 result = n1 + n2;

                tvSum.setText(result + "");

            }
        });


       /* Bundle bundle = new Bundle();
        bundle.putString("Name", "Anis");


        Toast.makeText(this, bundle.getString("Name"), Toast.LENGTH_SHORT).show();*/

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("SUM_RESULT", result+ "");
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String result = savedInstanceState.getString("SUM_RESULT");

        tvSum.setText(result);
    }
}