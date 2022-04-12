package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.DecimalFormat;


public class solo_doomstop extends Fragment {

      TextView Activity;
      FloatingActionButton FavSolo;
//    Button GenerateActivity;

    private String url;
//    private String randomurl = "https://www.boredapi.com/api/activity";
    private RequestQueue requestQueue;
    private DecimalFormat df = new DecimalFormat("0.00");
//    public static FavouritesDatabase database;
    private int key;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solo_doomstop, container, false );
        Button btnToOpenSoloContent = (Button) view.findViewById(R.id.buttonSoloToHome);
        Button GenerateSolo = (Button) view.findViewById(R.id.generateSolo);
        Activity = view.findViewById(R.id.editTextTextMultiLine3);
        FavSolo = view.findViewById(R.id.floatingActionButton3);
        btnToOpenSoloContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).detach(solo_doomstop.this).commit();
            }
        });

        GenerateSolo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity.setText("Go for a run");
            }
        }));

//        FavSolo.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        }));

        return view;
    }


}