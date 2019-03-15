package com.example.kittipong_run.calendartest2.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kittipong_run.calendartest2.R;

public class CardViewHolder extends BaseViewHolder {
    private ImageView imageView;
    private TextView textView;

    public CardViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.star_image);
        textView = (TextView) itemView.findViewById(R.id.tx_project);
    }
    public  void setImage(int image) {
        imageView.setImageResource(image);
    }

    public void setText (String text) {
        textView.setText(text);
    }
}
