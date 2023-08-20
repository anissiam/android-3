package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);

        RadioButton radioButtonJava = findViewById(R.id.radioButtonJava);
        RadioButton radioButtonDart = findViewById(R.id.radioButtonDart);
        RadioButton radioButtonClear = findViewById(R.id.radioButtonClear);

        RadioGroup radioGroupe = findViewById(R.id.radioGroupe);
        ImageView imgLang = findViewById(R.id.imgLang);


        radioGroupe.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == radioButtonJava.getId()) {
                    imgLang.setImageDrawable(getDrawable(R.drawable.java));
                    return;
                }

                if (i == radioButtonDart.getId()) {
                    imgLang.setImageResource(R.drawable.dart);

                    return;
                }

                if (i == radioButtonClear.getId()) {
                    imgLang.setImageResource(0);

                    return;
                }


                /*switch (i){
                    case 0 :
                        Toast.makeText(LangActivity.this, "Java", Toast.LENGTH_SHORT).show();
                        break;
                    case  1 :
                        Toast.makeText(LangActivity.this, "Dart", Toast.LENGTH_SHORT).show();
                        break;
                }*/
            }
        });


        /*radioButtonJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    radioButtonDart.setChecked(false);
                }

            }
        });


        radioButtonDart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    radioButtonJava.setChecked(false);
                }


            }
        });
 */
    }
}