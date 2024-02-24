package com.example.sportapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportViewHolder> {

    private List<Sport>sportList;
    private RecyclerView.ViewHolder holder;
    private int position;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }


    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflating the layout for each item in the recyler view
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout,parent,false);
        return new SportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {

        Sport sport = sportList.get(position);
        holder.textView.setText(sport.getSportName());
        holder.imageView.setImageResource(sport.getSportImg());
    }



    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;


        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView= itemView.findViewById(R.id.imageViewCard);
        }
    }
}
