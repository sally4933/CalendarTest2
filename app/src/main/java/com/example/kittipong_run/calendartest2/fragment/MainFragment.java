package com.example.kittipong_run.calendartest2.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kittipong_run.calendartest2.R;
import com.example.kittipong_run.calendartest2.recyclerview.BaseItem;
import com.example.kittipong_run.calendartest2.recyclerview.CardViewItem;
import com.example.kittipong_run.calendartest2.recyclerview.MainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {


    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_layout, container, false);

        //Add recyclerview
        recyclerView = (RecyclerView) container.findViewById(R.id.recycler_v);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));

       // recyclerView.setLayoutManager(new LinearLayoutManager(, LinearLayoutManager.VERTICAL,false));
        adapter = new MainAdapter();
        adapter.setItemList(createItem());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<BaseItem> createItem() {
        List<BaseItem> itemList = new ArrayList<>();
        itemList.add(new CardViewItem()
                .setImage(R.drawable.star_fill)
                .setText("Project 3"));
        itemList.add(new CardViewItem()
                .setImage(R.drawable.star)
                .setText("Project 1"));
        itemList.add(new CardViewItem()
                .setImage(R.drawable.star)
                .setText("Project 2"));
        return itemList;
    }
}
