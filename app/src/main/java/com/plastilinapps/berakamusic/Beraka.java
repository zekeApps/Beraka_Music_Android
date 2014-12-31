package com.plastilinapps.berakamusic;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Toast;


public class Beraka extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beraka);
        /*
        ImageButton imageButton = (ImageButton) findViewById(R.id.loginButton);


        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                // Or read size directly from the view's width/height
                int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
                outline.setOval(0, 0, size, size);
            }
        };

        imageButton.setOutlineProvider(viewOutlineProvider);
        */

    }
    public void onClick(View v){
        Toast.makeText(this, "Welcome to Beraka Music Store", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);

    }
}
