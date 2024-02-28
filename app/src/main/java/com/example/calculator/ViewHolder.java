package com.example.calculator;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView tvNama, tvHarga;
    ImageView imgMkn;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNama = itemView.findViewById(R.id.tvNama);
        tvHarga = itemView.findViewById(R.id.tvHarga);
        imgMkn = itemView.findViewById(R.id.img);
    }
}
