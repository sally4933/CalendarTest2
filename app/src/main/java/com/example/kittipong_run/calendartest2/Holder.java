package com.example.kittipong_run.calendartest2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class Holder extends RecyclerView.ViewHolder {

    TextView tx_project;

    public Holder(View itemView) {
        super(itemView);
        tx_project = itemView.findViewById(R.id.tx_project);
    }
    
    public void setItem(int position) {
       // tx_project.setText(mDataset[position]);
    }
}
