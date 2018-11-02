package com.futsal.app.futsalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futsal.app.futsalapp.MetodeLatihan.TataCaraPelaksanaanActivity;
import com.futsal.app.futsalapp.MetodeLatihan.VideoCaraPelaksanaanActivity;

public class MetodeLatihanActivity extends AppCompatActivity {

    Button buttonTataCara, buttonVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        buttonTataCara = (Button) findViewById(R.id.buttonTataCara);
        buttonVideo = (Button) findViewById(R.id.buttonVideo);

        buttonTataCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetodeLatihanActivity.this,TataCaraPelaksanaanActivity.class);
                startActivity(intent);
            }
        });

        buttonVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetodeLatihanActivity.this,VideoCaraPelaksanaanActivity.class);
                startActivity(intent);
            }
        });

    }
}
