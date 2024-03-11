package com.abhijeet.travel_saathi.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import com.abhijeet.travel_saathi.R;
import com.abhijeet.travel_saathi.activities.Home_page;

public class SecondTimeSplashScreen extends AppCompatActivity {
    private MotionLayout motionLayout;
    private int[] transitionIds = {
            R.id.justScooter,
            R.id.findYourCompanyEnter,
            R.id.chooseADateEnter,
            R.id.travelTheWorldEntry,
            R.id.jitter1,
            R.id.jitter2,
            R.id.jitter3,
            R.id.jitter1,
            R.id.jitter4,
            R.id.travelTheWorldExit,
            R.id.chooseADateExit,
            R.id.findYourCompanyExit,
            R.id.end
    };
    private int currentTransitionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_time_splash_screen);

        motionLayout = findViewById(R.id.justScooterUp);
        motionLayout.setTransitionListener(transitionListener);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(transitionIds[currentTransitionIndex]);
            }
        }, 500); // Adjust the delay as needed
    }

    private MotionLayout.TransitionListener transitionListener = new MotionLayout.TransitionListener() {
        @Override
        public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {
        }

        @Override
        public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {
        }

        @Override
        public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {

            if (currentTransitionIndex < transitionIds.length - 1) {
                currentTransitionIndex++;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        motionLayout.transitionToState(transitionIds[currentTransitionIndex]);
                    }
                }, 500);
            }

            else {
                startActivity(new Intent(SecondTimeSplashScreen.this, Home_page.class));
                finish();
            }
        }

        @Override
        public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
        }
    };
}
