package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class long_doomstop extends Fragment {

    TextView Activity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_long_doomstop, container, false );
        Button btnToOpenSoloContent = (Button) view.findViewById(R.id.buttonLongToHome);
        Button GenerateLong = (Button) view.findViewById(R.id.generateLong);
        Activity = view.findViewById(R.id.editTextTextMultiLineLong);
        btnToOpenSoloContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).detach(long_doomstop.this).commit();
            }
        });

        GenerateLong.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity.setText("Learn to play the Guitar");
            }
        }));

        return view;
    }


}