package com.example.nanorus.todo.view.MainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.nanorus.todo.presenter.MainActivity.MainActivityRotateSavePojo;


public class RotateFragment extends Fragment {
    MainActivityRotateSavePojo mSavePojo;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public MainActivityRotateSavePojo getSavePojo() {
        return mSavePojo;
    }

    public void setSavePojo(MainActivityRotateSavePojo savePojo) {
        mSavePojo = savePojo;
    }
}