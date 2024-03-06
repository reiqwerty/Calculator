package com.example.calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakananAdapater extends RecyclerView.Adapter<MakananAdapater.ViewHolder> {
    private Context context;
    private List<MakananModel> MakananList;
    private ItemClickListener mClickListener;

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
        Glide.with(holder.itemView.getContext())
                .load(mkn.getImgSrc())
                .into(holder.imgMkn);
    }

    @Override
    public int getItemCount() {
        return this.MakananList.size();}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNama, tvHarga;
        ImageView imgMkn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            imgMkn = itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }
    MakananModel getItem(int id) {
        return MakananList.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}




