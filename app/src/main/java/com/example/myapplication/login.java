package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login extends AppCompatActivity {

    EditText mUsername, mPassword;
    Button mLogin2Btn, mRegister2Btn;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUsername = findViewById(R.id.username_login);
        mPassword = findViewById(R.id.password_login);
        mLogin2Btn = findViewById(R.id.login2_BTN);
        mRegister2Btn = findViewById(R.id.register2_BTN);
        fAuth = FirebaseAuth.getInstance();

        mLogin2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mUsername.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mUsername.setError("Email ID required");
                    return;
            }
                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is required");
                    return;
            }

            //signing in the user

            fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(login.this, "LOGGED IN!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));

                    }else {
                        Toast.makeText(login.this, "ERROR", Toast.LENGTH_SHORT).show();

                    }

                }
            });
        }
    });

    //to take the user to the register page
        mRegister2Btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),register.class));
        }
    });
}
}