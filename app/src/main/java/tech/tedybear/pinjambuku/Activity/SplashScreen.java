package tech.tedybear.pinjambuku.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import tech.tedybear.pinjambuku.Preferences;
import tech.tedybear.pinjambuku.R;


/*
 * Created by Mochammad Tedy Fazrin on 4/12/20 7:36 PM
 * Copyright (c) 2020 . All rights reserved.
 */

public class SplashScreen extends AppCompatActivity {
    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView tedy;
    Preferences preference;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        preference = new Preferences(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        logo = findViewById(R.id.logo);
        tedy = findViewById(R.id.version);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo.setAnimation(topAnim);
        tedy.setAnimation(bottomAnim);

        sharedPreferences = getApplicationContext().getSharedPreferences("MyPrefs", MODE_PRIVATE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.apply();

                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
