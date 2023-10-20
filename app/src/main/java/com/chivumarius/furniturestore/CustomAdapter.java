package com.chivumarius.furniturestore;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;



public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    // ▼ "VARIABLES DECLARATION" ▼
    private ArrayList<DataModel> dataSet;
    private Context mContext;




    // ▼ "CONSTRUCTOR" METHOD ▬
    public CustomAdapter(ArrayList<DataModel> dataSet, Context mContext) {
        this.dataSet = dataSet;
        this.mContext = mContext;
    }



    // ▬ "ON CREATE VIEW HOLDER" METHOD ▬
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.item_cardview,
                        parent,
                        false
                );


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }





    // ▬ "ON BIND VIEW HOLDER" METHOD ▬
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        // ▼ INSTANTIATION OF "VARIABLES" ▼
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;


        // ▼ ADDING "DATA" FROM "TEXTVIEW" ▼
        textViewName.setText(dataSet.get(position).getName());
        textViewVersion.setText(dataSet.get(position).getVersion());


        // ▼ "LOADING" THE "IMAGES" ▼
        Glide
                .with(mContext)
                .load(dataSet.get(position).getImage())
                .apply(
                        RequestOptions.bitmapTransform
                        (new RoundedCorners(20))
                )
                .into(imageView);
    }






    // ▬ "GET ITEM COUNT" METHOD ▬
    @Override
    public int getItemCount() {
        return dataSet.size();
    }





    // ▬ "MY VIEW HOLDER" SUB-CLASS ▬
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // ▼ "VARIABLES DECLARATION" ▼
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        //ItemClickListener itemClickListener;  let's save it for later use


        // ▬ "CONSTRUCTOR" METHOD ▬
        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
            //itemView.setOnClickListener((View.OnClickListener) this);
        }



        // ▬ "ON CLICK" METHOD ▬
        @Override
        public void onClick(View view) {

        }
    }

}
