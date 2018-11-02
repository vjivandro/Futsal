package com.futsal.app.futsalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futsal.app.futsalapp.Materi.SejarahFutsalActivity;
import com.futsal.app.futsalapp.Tentang.DeskripsiActivity;
import com.futsal.app.futsalapp.Tentang.InfoActivity;
import com.futsal.app.futsalapp.Tentang.ProfilActivity;

public class TentangActivity extends AppCompatActivity {

    Button buttonProfil, buttonDeskripsi, buttonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        buttonProfil = (Button) findViewById(R.id.buttonProfil);
        buttonDeskripsi = (Button) findViewById(R.id.buttonDeskripsi);
        buttonInfo = (Button) findViewById(R.id.buttonInfo);

        buttonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangActivity.this,ProfilActivity.class);
                startActivity(intent);
            }
        });

        buttonDeskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangActivity.this,DeskripsiActivity.class);
                startActivity(intent);
            }
        });

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangActivity.this,InfoActivity.class);
                startActivity(intent);
            }
        });

    }
}
