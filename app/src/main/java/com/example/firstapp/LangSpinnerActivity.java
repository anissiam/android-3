package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class LangSpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_spinner);

        String[] lang = {"Java", "C++", "Dart", "PHP"};


        Spinner spinner = findViewById(R.id.spinner);
        ImageView imageView3 = findViewById(R.id.imageView3);
        //Dynamic

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item , lang );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
 /* ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item , lang );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);*/





        //Static
        /*ArrayAdapter adapter = ArrayAdapter.createFromResource(this ,R.array.Lang , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);*/


        /*LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) imageView3.getLayoutParams();
        params.width = 120;
// existing height is ok as is, no need to edit it
        imageView3.setLayoutParams(params);*/


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0 ){
                    imageView3.setImageResource(R.drawable.java);
                    return;
                }
                if (i == 1 ){
                    imageView3.setImageResource(R.drawable.c);
                    return;
                }
                if (i == 2 ){
                    imageView3.setImageResource(R.drawable.dart);
                    return;
                }
                if (i == 3 ){
                    imageView3.setImageResource(R.drawable.php);
                    return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}