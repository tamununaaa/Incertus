package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AptitudeLearning extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4, cv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_learning);
        getSupportActionBar().hide();

        cv1 = findViewById(R.id.cv_quant);
        cv2 = findViewById(R.id.cv_logreas);
        cv3 = findViewById(R.id.cv_verbal);
        cv4 = findViewById(R.id.cv_datainter);
        cv5 = findViewById(R.id.cv_visualreas);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/aptitude/quantitative"));
                startActivity(urlIntent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/reasoning"));
                startActivity(urlIntent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.assessmentday.co.uk/aptitudetests_verbal.htm"));
                startActivity(urlIntent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sawaal.com/aptitude-reasoning/quantitative-aptitude-data-interpretation-questions-and-answers.html"));
                startActivity(urlIntent);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://prepinsta.com/visual-reasoning/questions/"));
                startActivity(urlIntent);
            }
        });


    }
}