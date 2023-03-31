package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class LandingPage extends AppCompatActivity {

    protected int _splashTime = 2500;
    ImageView logo;
    TextView tv1, tv2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        getSupportActionBar().hide();
        logo = findViewById(R.id.logo);
        tv1 = findViewById(R.id.tv_incertus);
        tv2 = findViewById(R.id.tv_caption);

        logo.animate().translationY(100).rotation(720).setDuration(1000).start();

        openLogin();

    }

    private void openLogin() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
                Intent i3 = new Intent(LandingPage.this, LoginActivity.class);
                startActivity(i3);
            }
        }, _splashTime);
    }


}