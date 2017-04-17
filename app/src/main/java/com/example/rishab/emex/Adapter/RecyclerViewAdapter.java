package com.example.rishab.emex.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.rishab.emex.JobHistoryModel.JobHistoryModel;
import com.example.rishab.emex.R;

import java.util.ArrayList;


/**
 * Created by Rishab on 15-04-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String JOB_HISTORY = "jobDone";
    private static final String MISSED_JOB = "jobMissed";
    private Context context;
    private ArrayList<JobHistoryModel> jobInfo;
    private String mode;


    /**
     *
     * @param context context
     * @param jobInfo jobinfo
     * @param mode mode
     */
    public RecyclerViewAdapter(final Context context, final ArrayList<JobHistoryModel> jobInfo, final String mode) {
        this.context = context;
        this.jobInfo = jobInfo;
        this.mode = mode;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        context = parent.getContext();
        View convertView;
        convertView = LayoutInflater.from(context).inflate(R.layout.recycler_rowview, parent, false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {
        JobHistoryModel obj = jobInfo.get(position);
        ViewHolder holder = (ViewHolder) viewHolder;
        if (mode.equals(JOB_HISTORY)) {
           // ViewHolder holder = (ViewHolder)holder;
            //holder.tvDriverNam.setText(obj.getDriverName());
            holder.tvDriverNam.setVisibility(View.GONE);
            holder.tvAmount.setText(obj.getmTotalamount());
            holder.tvRideTime.setText(obj.getmTotalRideTime());
            holder.tvDateTime.setText(obj.getmDateAndTime());
            holder.tvDistance.setText(obj.getmDistance());
            holder.tvStartAddr.setText(obj.getmPickupLocation());
            holder.tvEndAddr.setText(obj.getmDestination());
        } else {
            //holder.tvDriverNam.setText(obj.getDriverName());
            holder.tvAmount.setVisibility(View.GONE);
            holder.tvAmountTitle.setVisibility(View.GONE);
            holder.tvRideTime.setVisibility(View.GONE);
            //holder.tvRideTimeTitle.setVisibility(View.GONE);
            holder.tvDateTime.setText(obj.getmDateAndTime());
            holder.tvDistance.setText(obj.getmDistance());
            holder.tvStartAddr.setText(obj.getmPickupLocation());

            holder.tvEndAddr.setVisibility(View.GONE);
            holder.view.setVisibility(View.GONE);

        }



    }

    /**
     *
     * @return adapter
     */

    @Override
    public int getItemCount() {
        return jobInfo.size();
    }

    /**
     * viewholder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvDateTime, tvDistance, tvStartAddr, tvEndAddr,
                tvRideTime, tvAmount, tvDriverNam, tvRideTimeTitle, tvAmountTitle, tvDriverNameTitle;
        private View view;
        /**
         * @param itemView view itemView
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvDateTime = (TextView) itemView.findViewById(R.id.tvDateAndTime);
            tvDistance = (TextView) itemView.findViewById(R.id.tvDistanceKm);
            tvStartAddr = (TextView) itemView.findViewById(R.id.tvPickupAddress);
            tvEndAddr = (TextView) itemView.findViewById(R.id.tvDestinationAddress);
            tvRideTime = (TextView) itemView.findViewById(R.id.tvTotalRideTime);
            tvAmount = (TextView) itemView.findViewById(R.id.tvTotalAmount);
            tvDriverNam = (TextView) itemView.findViewById(R.id.tvDriverName);
            //tvRideTimeTitle = (TextView) itemView.findViewById(R.id.tvTotalRideTimeTitle);
            tvAmountTitle = (TextView) itemView.findViewById(R.id.tvTotalAmountTitle);
            //tvDriverNameTitle = (TextView) itemView.findViewById(R.id.tvDriverNameTitle);
            view = (View) itemView.findViewById(R.id.vLineHorizontalBelow);

        }

    }

}

