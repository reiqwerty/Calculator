package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

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
        mknOne.setImgSrc("https://png.pngtree.com/png-clipart/20230319/original/pngtree-complete-geprek-chicken-with-fresh-vegetables-png-image_8996077.png");
        listDataMakanan.add(mknOne);

        MakananModel mknTwo = new MakananModel();
        mknTwo.setNama("Indomie");
        mknTwo.setHarga("Rp4.000");
        mknTwo.setImgSrc("https://www.indomie.com/uploads/product/category_dry-based-noodles_133948614.png");
        listDataMakanan.add(mknTwo);

        MakananModel mknThree = new MakananModel();
        mknThree.setNama("Soto");
        mknThree.setHarga("Rp4.000");
        mknThree.setImgSrc("https://png.pngtree.com/png-clipart/20220918/original/pngtree-soto-ayam-png-image_8622856.png");
        listDataMakanan.add(mknThree);

        MakananModel mknFour = new MakananModel();
        mknFour.setNama("Sushi");
        mknFour.setHarga("Rp18.000");
        mknFour.setImgSrc("https://img.lovepik.com/free-png/20211209/lovepik-delicious-sushi-png-image_401446268_wh1200.png");
        listDataMakanan.add(mknFour);

        MakananModel mknFive = new MakananModel();
        mknFive.setNama("Kebab");
        mknFive.setHarga("Rp12.000");
        mknFive.setImgSrc("https://static.vecteezy.com/system/resources/previews/025/268/633/original/kebab-with-ai-generated-free-png.png");
        listDataMakanan.add(mknFive);

        MakananModel mknSix = new MakananModel();
        mknSix.setNama("Martabak");
        mknSix.setHarga("Rp18.000");
        mknSix.setImgSrc("https://www.martabakboss.com/assets/martabak/menu/Manis/original.png");
        listDataMakanan.add(mknSix);

        MakananModel mknSeven = new MakananModel();
        mknSeven.setNama("Roti Bakar");
        mknSeven.setHarga("Rp12.000");
        mknSeven.setImgSrc("https://png.pngtree.com/png-clipart/20220228/original/pngtree-toast-bread-free-png-png-image_7323915.png");
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