package com.example.materialdesigntablayoutpoc.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.materialdesigntablayoutpoc.BR;

public class FirstViewModel extends BaseObservable {

    private String testString;

    @Bindable
    public String getTestString() { return this.testString; }
    public void setTestString(String testString) {
        this.testString = testString;
        notifyPropertyChanged(BR.testString);
    }
}
