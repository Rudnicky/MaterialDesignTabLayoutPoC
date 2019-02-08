package com.example.materialdesigntablayoutpoc.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesigntablayoutpoc.R;
import com.example.materialdesigntablayoutpoc.databinding.FragmentThirdBinding;
import com.example.materialdesigntablayoutpoc.viewmodels.ThirdViewModel;

public class ThirdFragment extends Fragment {

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentThirdBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_third, container, false);
        ThirdViewModel item = new ThirdViewModel();
        item.setTestString("Yo from third VM");
        binding.setViewmodel(item);
        return binding.getRoot();
    }
}
