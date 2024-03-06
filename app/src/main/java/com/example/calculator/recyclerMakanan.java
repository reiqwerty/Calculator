package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class recyclerMakanan extends AppCompatActivity implements MakananAdapater.ItemClickListener {
    RecyclerView rvMakanan;
    ArrayList<MakananModel> listDataMakanan;
    MakananAdapater adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_makananfav);

        listDataMakanan = new ArrayList<>();
        rvMakanan = findViewById(R.id.rvMakanan);

        MakananModel mknOne = new MakananModel();
        mknOne.setNama("Ayam Geprek");
        mknOne.setHarga("Rp8.000");
        mknOne.setImgSrc(R.drawable.geprek);
        listDataMakanan.add(mknOne);

        MakananModel mknTwo = new MakananModel();
        mknTwo.setNama("Indomie");
        mknTwo.setHarga("Rp4.000");
        mknTwo.setImgSrc(R.drawable.indomie);
        listDataMakanan.add(mknTwo);

        MakananModel mknThree = new MakananModel();
        mknThree.setNama("Soto");
        mknThree.setHarga("Rp4.000");
        mknThree.setImgSrc(R.drawable.soto);
        listDataMakanan.add(mknThree);

        MakananModel mknFour = new MakananModel();
        mknFour.setNama("Sushi");
        mknFour.setHarga("Rp18.000");
        mknFour.setImgSrc(R.drawable.sushi);
        listDataMakanan.add(mknFour);

        MakananModel mknFive = new MakananModel();
        mknFive.setNama("Kebab");
        mknFive.setHarga("Rp12.000");
        mknFive.setImgSrc(R.drawable.kebab);
        listDataMakanan.add(mknFive);

        MakananModel mknSix = new MakananModel();
        mknSix.setNama("Martabak");
        mknSix.setHarga("Rp18.000");
        mknSix.setImgSrc(R.drawable.martabak);
        listDataMakanan.add(mknSix);

        MakananModel mknSeven = new MakananModel();
        mknSeven.setNama("Roti Bakar");
        mknSeven.setHarga("Rp12.000");
        mknSeven.setImgSrc(R.drawable.rotibakar);
        listDataMakanan.add(mknSeven);

        adapter = new MakananAdapater(this, listDataMakanan);
        adapter.setClickListener(this);
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        rvMakanan.setAdapter(new MakananAdapater(getApplicationContext(),listDataMakanan));
        rvMakanan.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getNama() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}