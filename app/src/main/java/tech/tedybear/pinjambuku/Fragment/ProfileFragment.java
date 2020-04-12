package tech.tedybear.pinjambuku.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import tech.tedybear.pinjambuku.R;

/*
 * Created by Mochammad Tedy Fazrin on 4/12/20 7:36 PM
 * Copyright (c) 2020 . All rights reserved.
 */

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
