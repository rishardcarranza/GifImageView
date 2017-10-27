package com.example.richardcarranza.gifwebview;

import android.media.Image;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.imageView);

        //String gifUrl = "https://i.pinimg.com/originals/63/dd/d7/63ddd7f601b6c9961e83fc5f45bd67f5.gif";

        Glide
                .with(MainActivity.this)
                .load(R.drawable.mario_bross)
                .into(imgView);
    }
}
