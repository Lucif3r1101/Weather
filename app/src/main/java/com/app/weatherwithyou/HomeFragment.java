package com.app.weatherwithyou;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment; //creates modal class to handle fragments

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        //Attach a fragment
        //Add a view
        //Add an inflator

        View v = inflater.inflate(R.layout.homefragment, null);
        return v;
    }
}
