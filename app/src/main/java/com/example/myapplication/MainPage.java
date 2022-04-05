package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainPage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.MainPage_layout, container, false );
        Button btnToOpenSoloContent = (Button) view.findViewById(R.id.buttonToSolo);
        btnToOpenSoloContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solo_doomstop soloDoomstop = new solo_doomstop();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).replace(R.id.mainLayout2, soloDoomstop, soloDoomstop.getTag()).commit();
            }
        });

        Button btnToOpenSocialContent = (Button) view.findViewById(R.id.buttonToSocial);
        btnToOpenSocialContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                social_doomstop socialDoomstop = new social_doomstop();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).replace(R.id.mainLayout2, socialDoomstop, socialDoomstop.getTag()).commit();
            }
        });

        Button btnToOpenLongContent = (Button) view.findViewById(R.id.buttonToLong);
        btnToOpenLongContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long_doomstop longDoomstop = new long_doomstop();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).replace(R.id.mainLayout2, longDoomstop, longDoomstop.getTag()).commit();
            }
        });

        Button btnToOpenToDoContent = (Button) view.findViewById(R.id.buttonToToDo);
        btnToOpenToDoContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                to_doomstop toDoomstop = new to_doomstop();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().setCustomAnimations(R.anim.enter_bottom_to_top, R.anim.exit_top_to_bottom).replace(R.id.mainLayout2, toDoomstop, toDoomstop.getTag()).commit();
            }
        });
        return view;
    }

}
