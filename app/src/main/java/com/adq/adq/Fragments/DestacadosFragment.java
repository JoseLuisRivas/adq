package com.adq.adq.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adq.adq.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestacadosFragment extends Fragment {


    public DestacadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Retorna una vista que voy a inflar
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destacados, container, false);



    }


}
