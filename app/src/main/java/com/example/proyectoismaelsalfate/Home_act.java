package com.example.proyectoismaelsalfate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import Objetos.Trajes;

public class Home_act extends AppCompatActivity {

    private Trajes tra = new Trajes();
    private VideoView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        video = findViewById(R.id.vw);

        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ruta);
        video.setVideoURI(uri);

        MediaController media = new MediaController(this);
        video.setMediaController(media);
        video.start();
    }

    public void Trajes(View view)
    {
        Intent i = new Intent(this, Trajes_act.class);
        Bundle bun = new Bundle();
        bun.putStringArray("trajes", tra.getTrajes());
        i.putExtras(bun);
        startActivity(i);
    }

}