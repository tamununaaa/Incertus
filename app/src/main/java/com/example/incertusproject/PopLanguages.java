package com.example.incertusproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PopLanguages extends AppCompatActivity {

    TextView course_c, course_cpp, course_java, course_python, notes_c, notes_cpp, notes_java, notes_python;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_languages);
        getSupportActionBar().hide();

        course_c = findViewById(R.id.tv_c_course);
        course_cpp = findViewById(R.id.tv_cpp_course);
        course_java = findViewById(R.id.tv_java_course);
        course_python = findViewById(R.id.tv_py_course);

        notes_c = findViewById(R.id.tv_c_notes);
        notes_cpp = findViewById(R.id.tv_cpp_notes);
        notes_java = findViewById(R.id.tv_java_notes);
        notes_python = findViewById(R.id.tv_py_notes);

        course_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.coursera.org/specializations/c-programming"));
                startActivity(intent);
            }
        });

        course_cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.coursera.org/specializations/hands-on-cpp"));
                startActivity(intent);
            }
        });

        course_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.coursera.org/learn/java-introduction"));
                startActivity(intent);
            }
        });

        course_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.coursera.org/specializations/python-3-programming"));
                startActivity(intent);
            }
        });

        notes_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/c-language-introduction/"));
                startActivity(intent);
            }
        });

        notes_cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/c-plus-plus/"));
                startActivity(intent);
            }
        });

        notes_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/java/"));
                startActivity(intent);
            }
        });

        notes_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/python-programming-language/learn-python-tutorial/"));
                startActivity(intent);
            }
        });

    }
}