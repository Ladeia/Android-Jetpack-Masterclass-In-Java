package com.antonioladeia.dogsapp.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antonioladeia.dogsapp.R;


public class ListFragment extends Fragment {

    public ListFragment() {
    }


    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}