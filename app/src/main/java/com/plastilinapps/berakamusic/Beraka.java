package com.plastilinapps.berakamusic;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Toast;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;


public class Beraka extends Activity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "IcdZ34wALGOv8SOgcbzQ98WME";
    private static final String TWITTER_SECRET = "z9mD5ZStG1jC5doqespSftYUYfUBjIMGJdTWtFHr7N9YiJ5nK4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
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
