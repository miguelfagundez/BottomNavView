package com.devproject.miguelfagundez.bottomnavviewapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devproject.miguelfagundez.bottomnavviewapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Forum extends Fragment {

    public Forum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forum, container, false);
    }
}
