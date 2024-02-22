package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recyclerClub extends AppCompatActivity {
    RecyclerView rvClub;
    ArrayList<ClubModel> listDataClub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_club);

        listDataClub = new ArrayList<>();
        rvClub  = findViewById(R.id.rvClub);

        ClubModel clubOne = new ClubModel();
        clubOne.setNama("Real Madrid");
        clubOne.setLiga("LaLiga");
        clubOne.setImgSrc(R.drawable.realmadrid);
        listDataClub.add(clubOne);

        ClubModel clubTwo = new ClubModel();
        clubTwo.setNama("Manchester City");
        clubTwo.setLiga("Premier League");
        clubTwo.setImgSrc(R.drawable.mci);
        listDataClub.add(clubTwo);

        ClubModel clubThree = new ClubModel();
        clubThree.setNama("Bayern Munchen");
        clubThree.setLiga("Bundelsliga");
        clubThree.setImgSrc(R.drawable.munchen);
        listDataClub.add(clubThree);

        ClubModel clubFour = new ClubModel();
        clubFour.setNama("AC Milan");
        clubFour.setLiga("Serie A");
        clubFour.setImgSrc(R.drawable.acmilan);
        listDataClub.add(clubFour);

        ClubModel clubFive = new ClubModel();
        clubFive.setNama("Paris Saint Germain");
        clubFive.setLiga("Ligue 1");
        clubFive.setImgSrc(R.drawable.psg);
        listDataClub.add(clubFive);

        ClubModel clubSix = new ClubModel();
        clubSix.setNama("AJAX Amsterdam");
        clubSix.setLiga("Eredivisie");
        clubSix.setImgSrc(R.drawable.ajax);
        listDataClub.add(clubSix);

        ClubModel clubSeven = new ClubModel();
        clubSeven.setNama("Al Nassr FC");
        clubSeven.setLiga("Saudi Professional League");
        clubSeven.setImgSrc(R.drawable.alnassr);
        listDataClub.add(clubSeven);

        rvClub.setLayoutManager(new LinearLayoutManager(this));
        rvClub.setAdapter(new ClubAdapater(getApplicationContext(),listDataClub));
    }
}