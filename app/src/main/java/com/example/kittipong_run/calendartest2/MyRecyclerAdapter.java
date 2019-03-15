package com.example.kittipong_run.calendartest2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<Holder> {

    Context mContext;
   // List<Contact> mData;

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.setItem(position);

    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    private String[] mDataSet;

    public MyRecyclerAdapter (String[] dataset) {
        mDataSet = dataset;
    }
}
