package com.edureka.demoanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = findViewById(R.id.imgLogo);
    }

    public void doRotateAnimation(View view) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imgLogo.startAnimation(anim);

    }

    public void doAlphaAnimation(View view) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        imgLogo.startAnimation(anim);
    }

    public void doScaleAnimation(View view) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        imgLogo.startAnimation(anim);

    }

    public void doTransletAnimation(View view) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translet);
        imgLogo.startAnimation(anim);
    }

    public void doRCAnimation(View view) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rc);
        imgLogo.startAnimation(anim);
    }
}