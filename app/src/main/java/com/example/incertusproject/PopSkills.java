package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PopSkills extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4, cv5, cv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_skills);

        cv1 = findViewById(R.id.cv_dataScience);
        cv2 = findViewById(R.id.cv_ml);
        cv3 = findViewById(R.id.cv_cyber);
        cv4 = findViewById(R.id.cv_powerbi);
        cv5 = findViewById(R.id.cv_cloud);
        cv6 = findViewById(R.id.cv_eth);
        getSupportActionBar().hide();

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/datascience/"));
                startActivity(intent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/ai/ai_machine_learning.asp"));
                startActivity(intent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/ai/ai_machine_learning.asp"));
                startActivity(intent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/power_bi/index.htm"));
                startActivity(intent);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/aws/aws_cloudessentials_cloudcomputing.php"));
                startActivity(intent);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/ethical-hacking/tutorials/"));
                startActivity(intent);
            }
        });
    }
}