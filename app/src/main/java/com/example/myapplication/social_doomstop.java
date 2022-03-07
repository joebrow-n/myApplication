package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class social_doomstop extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social_doomstop, container, false );
        Button btnToOpenSoloContent = (Button) view.findViewById(R.id.buttonSocialToHome);
        btnToOpenSoloContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).detach(social_doomstop.this).commit();
            }
        });

        return view;
    }
}