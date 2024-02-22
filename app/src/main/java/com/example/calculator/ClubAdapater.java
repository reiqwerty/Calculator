package com.example.calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClubAdapater extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<ClubModel> clubList;

    public ClubAdapater(Context context, List<ClubModel> clubList) {
        this.context = context;
        this.clubList = clubList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ClubModel clb = this.clubList.get(position);
        holder.tvName.setText(clb.getNama());
        holder.tvLiga.setText(clb.getLiga());
        holder.imgClub.setImageResource(clb.getImgSrc());
    }

    @Override
    public int getItemCount() {
        return this.clubList.size();}
}
