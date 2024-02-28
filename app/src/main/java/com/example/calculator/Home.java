package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton btnKalku;
    ImageButton btnRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnKalku = (ImageButton) findViewById(R.id.btnKalku);
        btnRv = (ImageButton) findViewById(R.id.btnRv);
        btnKalku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kalkuPage = new Intent(Home.this,MainActivity.class);
                startActivity(kalkuPage);
            }
        });

        btnRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rvPage = new Intent(Home.this, recyclerMakanan.class);
                startActivity(rvPage);
            }
        });
    }


}