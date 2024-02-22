package com.example.calculator;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView tvName, tvLiga;
    ImageView imgClub;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);
        tvLiga = itemView.findViewById(R.id.tvLiga);
        imgClub = itemView.findViewById(R.id.img);
    }
}
