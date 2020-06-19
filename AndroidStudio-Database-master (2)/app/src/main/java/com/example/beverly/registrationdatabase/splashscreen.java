package com.example.beverly.registrationdatabase;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.beverly.registrationdatabase.MainActivity;
import com.example.beverly.registrationdatabase.R;

public class splashscreen extends AppCompatActivity {
    Animation topanim,bottomanim;
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //Animation
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim=AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //setAnimation
        image=findViewById(R.id.imageView);
        text=findViewById(R.id.textView6);

        image.setAnimation(bottomanim);
        text.setAnimation(topanim);

        int SPLASH_DISPLAY_LENGTH = 5000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(splashscreen.this, MainActivity.class);
                startActivity(splash);
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
