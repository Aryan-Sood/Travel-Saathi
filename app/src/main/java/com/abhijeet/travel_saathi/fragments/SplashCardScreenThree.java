package com.abhijeet.travel_saathi.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhijeet.travel_saathi.R;


public class SplashCardScreenThree extends Fragment {


    public SplashCardScreenThree() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_card_screen_three, container, false);
    }
}