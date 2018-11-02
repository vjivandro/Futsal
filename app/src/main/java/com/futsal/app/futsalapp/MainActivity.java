package com.futsal.app.futsalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonMateri, buttonLatihat, buttonTentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMateri = (Button) findViewById(R.id.buttonMateri);
        buttonLatihat = (Button) findViewById(R.id.buttonLatihan);
        buttonTentang = (Button) findViewById(R.id.buttonTentang);

        buttonMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MateriActivity.class);
                startActivity(intent);
            }
        });

        buttonLatihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MetodeLatihanActivity.class);
                startActivity(intent);
            }
        });

        buttonTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
    }
}
