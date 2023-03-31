package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserProfile extends AppCompatActivity {
    TextView tv;
    ImageView share;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        getSupportActionBar().hide();

        tv = findViewById(R.id.prediction_figure);
        share = findViewById(R.id.sharing_btn);



        Intent intent = getIntent();
        String s = intent.getStringExtra("key");
        tv.setText(s+"%");

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharing = new Intent(android.content.Intent.ACTION_SEND);
                sharing.setType("text/plain");
                sharing.putExtra(Intent.EXTRA_TEXT, "Hey there! INCERTUS predicted that my placement chances are " + s + "% !");
                startActivity(sharing);

            }
        });





    }
}