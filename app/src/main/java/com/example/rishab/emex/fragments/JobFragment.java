package com.example.rishab.emex.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import com.example.rishab.emex.Adapter.RecyclerAdapter;
import com.example.rishab.emex.Adapter.RecyclerViewAdapter;
import com.example.rishab.emex.JobHistoryModel.JobHistoryModel;
import com.example.rishab.emex.R;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by Rishab on 15-04-2017.
 */

public class JobFragment extends Fragment {
    private static final String JOB_HISTORY = "jobDone";
    private static final  String MISSED_JOB = "jobMissed";
    private ArrayList<JobHistoryModel> jobInfos;
    private JobHistoryModel jobHistoryModel;
    private RecyclerView recyclerView;
    private String jobHistory;


    /**
     * job history
     */

    /**
     *
     * @param jobHistory job history
     */
    public JobFragment(final String jobHistory) {
        this.jobHistory = jobHistory;
    }


    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.job_fragment, container, false);
        init();
        if (jobHistory.equals(JOB_HISTORY)) {
            jobInfos.add(jobHistoryModel);
            RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), jobInfos, JOB_HISTORY);
            recyclerViewCommon(view, recyclerViewAdapter);
        } else {
            jobInfos.add(jobHistoryModel);
            RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), jobInfos, MISSED_JOB);
            recyclerViewCommon(view, recyclerViewAdapter);
        }
        return view;
    }

    /**
     * @param view                view
     * @param recyclerViewAdapter recycler view adapter
     */
    private void recyclerViewCommon(final View view, final RecyclerViewAdapter recyclerViewAdapter) {
        recyclerView = (RecyclerView) view.findViewById(R.id.rvJobHistory);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
    }

    /**
     * initilization
     */
    private void init() {
        jobInfos = new ArrayList<>();
        jobHistoryModel = new JobHistoryModel("Rishab Bansal", "55.5 km",
                "14 June, 2016 04:23 PM", "3846 W 38 Rd, Shiv Srishti Marg Mumbai",
                "Silver Oks Hospital, Laxmi Nagar,Mumbai", "20 min", "1870");
    }


}