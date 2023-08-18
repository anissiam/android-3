package com.example.firstapp.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.firstapp.MainActivity;
import com.example.firstapp.R;
import com.google.android.material.button.MaterialButton;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    final static String TAG = "mylog StartActivity";
    MaterialButton btnLogin , btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.d(TAG, "onCreate");

        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(this);
        btnSignup.setOnClickListener(this);

        /*btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
            }
        });*/

       // setupViews();
    }

    /*private void setupViews() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(StartActivity.this, "LogIn", Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignup){

            /*new Toaster.Builder(this)
                    .setTitle(getString(R.string.info_title))
                    .setDescription(getString(R.string.info_description))
                    .setDuration(Toaster.LENGTH_SHORT)
                    .setStatus(Toaster.Status.INFO)
                    .show();*/
            //Toast.makeText(StartActivity.this, "Signup", Toast.LENGTH_SHORT).show();
            //btnSignup.setText("Bka bla bla ");

            Intent intent = new Intent(StartActivity.this , MainActivity.class);
            startActivity(intent);

        }

        if (view.getId()==R.id.btnLogin){
            Toast.makeText(StartActivity.this, "LogIn", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(StartActivity.this, LoginActivity.class);
            intent.putExtra("text", "Hello");
            startActivity(intent);
          //  finish();
        }
    }
}