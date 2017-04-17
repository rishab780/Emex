package com.example.rishab.emex.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishab.emex.R;



/**
 * Created by Rishab on 14-04-2017.
 */

public class JobHistory extends Fragment {
    private static final String JOB_HISTORY = "jobDone";
    private static final String MISSED_JOB = "jobMissed";


    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragjobhistory_layout, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.vpSwipe);


        FragmentStatePagerAdapter fragmentStatePagerAdapter = new FragmentStatePagerAdapter(getChildFragmentManager()) {
            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public Fragment getItem(final int position) {
                if (position == 0) {
                    return new JobFragment(JOB_HISTORY);
                } else {
                    return new JobFragment(MISSED_JOB);
                }

            }
        };
        viewPager.setAdapter(fragmentStatePagerAdapter);
        return view;
    }
}

