package com.example.incertusproject;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    EditText rip_name, rip_email, rip_pass;
    Button rbtn;
    TextView goto_login;
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+", userID;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        rip_name = findViewById(R.id.reg_ip_name);
        rip_email = findViewById(R.id.reg_ip_email);
        rip_pass = findViewById(R.id.reg_ip_password);
        rbtn = findViewById(R.id.reg_btn);
        goto_login = findViewById(R.id.goto_log);
        progressDialog = new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();


        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        goto_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }

    private void registerUser() {

        String name = rip_name.getText().toString().trim();
        String email = rip_email.getText().toString().trim();
        String pass = rip_pass.getText().toString().trim();

        if(name.isEmpty())
        {
            rip_name.setError("Enter Name");
        }

        else if(email.isEmpty())
        {
            rip_email.setError("Enter Email");
        }

        else if(pass.isEmpty())
        {
            rip_pass.setError("Enter Password");
        }

        else if(!email.matches(emailPattern))
        {
            rip_email.setError("Enter a valid Email address");
        }

        else if(pass.length()<6)
        {
            rip_pass.setError("Password should contain more than 6 characters");
        }

        else {
            progressDialog.setMessage("Welcome " + name + " !");
            progressDialog.setTitle("Registration successful");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        progressDialog.dismiss();
                        sendUserToMainActvity();
                        Toast.makeText(RegisterActivity.this, "Welcome " + name, Toast.LENGTH_SHORT).show();

                    }
                    else{
                        progressDialog.dismiss();
                        Toast.makeText(RegisterActivity.this, "" + task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void sendUserToMainActvity() {
        String name = rip_name.getText().toString().trim();
        Intent intent = new Intent(RegisterActivity.this, Home.class)
                .putExtra("username",name);
        startActivity(intent);
    }
    }
