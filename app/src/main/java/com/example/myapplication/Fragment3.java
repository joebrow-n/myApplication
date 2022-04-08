package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment3_layout, container, false );
    }



}

//    public void logout_settingsBTN (View view) {
//        FirebaseAuth.getInstance().signOut();
////        startActivity(new Intent(getApplicationContext(),login.class));
//        startActivity(new Intent(String.valueOf(login.class)));
////        finish();
//    }



