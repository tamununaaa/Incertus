package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CS_Subjects extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_subjects);
        getSupportActionBar().hide();

        cv1 = findViewById(R.id.cv_os);
        cv2 = findViewById(R.id.cv_dbms);
        cv3 = findViewById(R.id.cv_networking);
        cv4 = findViewById(R.id.cv_oops);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/operating_system/os_overview.htm"));
                startActivity(urlIntent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/dbms-tutorial"));
                startActivity(urlIntent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/fundamentals-of-computer-networking"));
                startActivity(urlIntent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/java-oops-concepts"));
                startActivity(urlIntent);
            }
        });
    }

}