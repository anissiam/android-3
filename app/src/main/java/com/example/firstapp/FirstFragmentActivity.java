package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstFragmentActivity extends AppCompatActivity implements FirstFragment.OnDataSend {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_fragment);

        Button btnFirst = findViewById(R.id.btnFirst);
        Button btnSec = findViewById(R.id.btnSec);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FirstFragment fragment = new FirstFragment(this);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("TEXT_DATA" , "Anis Siam");




                fragment.setArguments(bundle);

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment).commit();

            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecFragment secFragment = new SecFragment();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, secFragment).commit();
            }
        });
    }

    @Override
    public void onData(int data) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        SecFragment secFragment = new SecFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("DATA" , data);
        secFragment.setArguments(bundle);

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, secFragment).commit();
    }
}