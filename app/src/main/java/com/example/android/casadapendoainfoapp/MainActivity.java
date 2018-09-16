package com.example.android.casadapendoainfoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    ImageButton directionsBtn;
    ImageButton mapBtn;
    ImageButton faceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        directionsBtn = (ImageButton) findViewById(R.id.btnDirections);
        mapBtn =(ImageButton) findViewById(R.id.btnMap);
        faceBtn = (ImageButton) findViewById(R.id.btnFace);

    }



    public void onClick(View v)  {

        if(directionsBtn.isPressed()) {
            try {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=4QBQZ0UuCs8&feature=youtu.be"));
                startActivity(intent);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(mapBtn.isPressed()) {
            try {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://pt.scribd.com/document/380215830/Sintra-Map"));
                startActivity(intent);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(faceBtn.isPressed()) {
            try {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/Casa-da-Pend%C3%B4a-310019582348174/"));
                startActivity(intent);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
