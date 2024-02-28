package com.example.calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakananAdapater extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<MakananModel> MakananList;

    public MakananAdapater(Context context, List<MakananModel> makananList) {
        this.context = context;
        this.MakananList = makananList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MakananModel mkn = this.MakananList.get(position);
        holder.tvNama.setText(mkn.getNama());
        holder.tvHarga.setText(mkn.getHarga());
        holder.imgMkn.setImageResource(mkn.getImgSrc());
    }

    @Override
    public int getItemCount() {
        return this.MakananList.size();}
}
