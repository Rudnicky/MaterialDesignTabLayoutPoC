package com.example.materialdesigntablayoutpoc.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesigntablayoutpoc.R;
import com.example.materialdesigntablayoutpoc.databinding.FragmentSecondBinding;
import com.example.materialdesigntablayoutpoc.viewmodels.SecondViewModel;

public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSecondBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        SecondViewModel item = new SecondViewModel();
        item.setTestString("Hey from second VM");
        binding.setViewmodel(item);
        return binding.getRoot();
    }
}
