package com.example.myapplication;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainPage extends Fragment {

    int pStatus = 0;
    int maxProgress = 170;
    private Handler progress_handler = new Handler();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mainpage_layout, container, false );
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

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.circular);
        final ProgressBar mProgress = (ProgressBar) view.findViewById(R.id.circularProgressbar);
        mProgress.setProgress(1);   // Main Progress
        mProgress.setSecondaryProgress(100); // Secondary Progress
        mProgress.setMax(100); // Maximum Progress
        mProgress.setProgressDrawable(drawable);

        TextView progress_text = (TextView) view.findViewById(R.id.progress_text);

        new Thread(new Runnable() {

            @Override
            public void run() {


                // TODO Auto-generated method stub
                while (pStatus < maxProgress) {
                    //TODO update this function for progress
                    pStatus += 1;

                    progress_handler.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            mProgress.setProgress((pStatus * 100) / maxProgress);
                            progress_text.setText(pStatus + "/" + maxProgress);

                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        // Just to display the progress slowly
                        Thread.sleep(8); //thread will take approx 1.5 seconds to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        return view;
    }

}
