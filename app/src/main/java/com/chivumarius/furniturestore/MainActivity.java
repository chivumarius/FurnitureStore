package com.chivumarius.furniturestore;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // ▼ "PRINARY CARDS" ▼
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    private Context mContext;



    // ▼ SECONDARY PRINARY CARDS ▼
    private static RecyclerView.Adapter adapter2;
    private RecyclerView.LayoutManager layoutManager2;
    private static RecyclerView recyclerView2;
    private static ArrayList<DataModel> data2;




    // ▬ "ON CREATE()" METHOD ▬
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ▼ "CALLING" THE "METHODS" ▼
        InitiateMainCards();
        InitiateSecondaryCards();
    }





    // ▬ "INITIATE MAIN CARDS()" METHOD
    //      → FOR "PRIMARY CARDS" ▬
    private void InitiateMainCards() {

        // ▼ INSTANTIATION OF "PRIMARY CARDS IDS" ▼
        recyclerView = findViewById(R.id.recyclerViewPrimary);
        recyclerView.setHasFixedSize(true);


        // ▼ "CREATING" THE "LAYOUT MANAGER" AND SET IT "HORIZONTAL" ▼
        layoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
        );


        // ▼ SETTING THE "LAYOUT MANAGER" TO "RECICYCLER VIEW" ▼
        recyclerView.setLayoutManager(layoutManager);

        // ▼ SETTING THE "ITEM ANIMATOR" TO "DEFAULT ITEM ANIMATOR"
        //      → FOR "RECYCLER VIEW" ▼
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        // ▼ "GETTING DATA" FROM "MY DATA" CLASS ▼
        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }


        // ▼ ADDING THE "CUSTOM ADAPTER" ▼
        adapter = new CustomAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }




    // ▬ "INITIATE SECONDARY CARDS()" METHOD ▬
    private void InitiateSecondaryCards() {

        // ▼ INSTANTIATION OF "SECONDARY CARDS IDS" ▼
        recyclerView2 = findViewById(R.id.recyclerViewSecondary);
        recyclerView2.setHasFixedSize(true);


        // ▼ "CREATING" THE "LAYOUT MANAGER" AND SET IT "HORIZONTAL" ▼
        layoutManager2 = new LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
        );

        // ▼ SETTING THE "LAYOUT MANAGER" TO "RECYCLER VIEW 2" ▼
        recyclerView2.setLayoutManager(layoutManager2);

        // ▼ SETTING THE "ITEM ANIMATOR" TO "DEFAULT ITEM ANIMATOR"
        //      → FOR "RECYCLER VIEW 2" ▼
        recyclerView2.setItemAnimator(new DefaultItemAnimator());


        // ▼ G"ETTING DATA" FROM "MY DATA" CLASS ▼
        data2 = new ArrayList<DataModel>();
        for (int i = 0; i < MyData2.nameArray.length; i++) {
            data2.add(new DataModel(
                    MyData2.nameArray[i],
                    MyData2.versionArray[i],
                    MyData2.id_[i],
                    MyData2.drawableArray[i]
            ));
        }


        // ▼ ADDING THE "CUSTOM ADAPTER" ▼
        adapter2 = new CustomAdapter2(data2, this);


        recyclerView2.setAdapter(adapter2);
    }
}