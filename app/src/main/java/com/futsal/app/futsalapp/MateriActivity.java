package com.futsal.app.futsalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futsal.app.futsalapp.Materi.FutsalLawsGameActivity;
import com.futsal.app.futsalapp.Materi.SejarahFutsalActivity;
import com.futsal.app.futsalapp.Materi.StoryBoardAplikasi;
import com.futsal.app.futsalapp.Materi.StoryBoardVideo;

public class MateriActivity extends AppCompatActivity {

    Button buttonSejarah, buttonFutsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        getSupportActionBar().setTitle("Daftar Materi");
        buttonSejarah = (Button) findViewById(R.id.buttonSejarah);
        buttonFutsal = (Button) findViewById(R.id.buttonFutsal);

        buttonSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MateriActivity.this,SejarahFutsalActivity.class);
                startActivity(intent);
            }
        });

        buttonFutsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MateriActivity.this,FutsalLawsGameActivity.class);
                startActivity(intent);

            }
        });
    }
}
