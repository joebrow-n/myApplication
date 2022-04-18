package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class social_doomstop extends Fragment {

    TextView textView;
    @Override
    public void onCreate (Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        new CountDownTimer(86400000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                textView.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
            }

            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                textView.setText("00:00:00");
            }
        }.start();
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social_doomstop, container, false );

        /* ------ The following is used to implement a timer - needs to be refined ------ */
        textView = (TextView) view.findViewById(R.id.textView50);

        /* ------ End of timer ------ */

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
