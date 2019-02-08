package com.example.materialdesigntablayoutpoc.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesigntablayoutpoc.R;
import com.example.materialdesigntablayoutpoc.databinding.FragmentFirstBinding;
import com.example.materialdesigntablayoutpoc.viewmodels.FirstViewModel;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FragmentFirstBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
        FirstViewModel item = new FirstViewModel();
        item.setTestString("Hey from first VM");
        binding.setViewmodel(item);
        return binding.getRoot();
    }
}
