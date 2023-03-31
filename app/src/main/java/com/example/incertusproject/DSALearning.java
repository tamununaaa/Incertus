package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DSALearning extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsalearning);
        getSupportActionBar().hide();

        cv1 = findViewById(R.id.cv_algorithms);
        cv2 = findViewById(R.id.cv_arrays);
        cv3 = findViewById(R.id.cv_linkedl);
        cv4 = findViewById(R.id.cv_stacks);
        cv5 = findViewById(R.id.cv_queues);
        cv6 = findViewById(R.id.cv_sorting);
        cv7 = findViewById(R.id.cv_searching);
        cv8 = findViewById(R.id.cv_graphs);
        cv9 = findViewById(R.id.cv_trees);
        cv10 = findViewById(R.id.cv_hashing);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/data-structure-algorithm"));
                startActivity(urlIntent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/data-structure-array"));
                startActivity(urlIntent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/ds-linked-list"));
                startActivity(urlIntent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/data-structure-stack"));
                startActivity(urlIntent);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/data-structure-queue"));
                startActivity(urlIntent);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/bubble-sort"));
                startActivity(urlIntent);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/linear-search"));
                startActivity(urlIntent);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/ds-graph"));
                startActivity(urlIntent);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/tree"));
                startActivity(urlIntent);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlInent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/introduction-to-hashing"));
                startActivity(urlInent);
            }
        });




    }
}