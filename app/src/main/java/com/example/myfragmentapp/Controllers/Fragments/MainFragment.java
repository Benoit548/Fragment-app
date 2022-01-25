package com.example.myfragmentapp.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfragmentapp.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout of MainFragment
        View result=inflater.inflate(R.layout.fragment_main, container, false);
        //Set onClickListener to button "SHOW ME DETAILS"
        result.findViewById(R.id.fragment_main_button).setOnClickListener((View.OnClickListener) this);

        return result;
    }
}