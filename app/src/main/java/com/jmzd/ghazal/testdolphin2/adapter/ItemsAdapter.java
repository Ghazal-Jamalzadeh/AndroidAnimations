package com.jmzd.ghazal.testdolphin2.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.activity.BigImage;
import com.jmzd.ghazal.testdolphin2.activity.CarsListActivity;
import com.jmzd.ghazal.testdolphin2.activity.FabHeaderActivity;
import com.jmzd.ghazal.testdolphin2.activity.LoginActivity;
import com.jmzd.ghazal.testdolphin2.activity.MoviePageActivity;
import com.jmzd.ghazal.testdolphin2.databinding.ItemMainBinding;
import com.jmzd.ghazal.testdolphin2.model.Item;

import java.util.ArrayList;
import java.util.Random;


public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private ArrayList<Item> items;
    private Context context;

    public ItemsAdapter(ArrayList<Item> items) {

        this.items = items;

    }

    @NonNull
    @Override
    public ItemsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        ItemMainBinding v = ItemMainBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ItemsAdapter.ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemsAdapter.ViewHolder holder, int position) {

        holder.binding.txt.setText(items.get(position).getTitle());

        if (position % 3 == 0) {
            holder.binding.card.setStrokeColor(ContextCompat.getColor(context, R.color.yellow));
            holder.binding.card.setCardBackgroundColor(ContextCompat.getColor(context, R.color.buttonsTextColor));
        } else if (position % 2 == 0) {
            holder.binding.card.setStrokeColor(ContextCompat.getColor(context, R.color.red));
            holder.binding.card.setCardBackgroundColor(ContextCompat.getColor(context, R.color.fieryRose));
        } else {
            holder.binding.card.setStrokeColor(ContextCompat.getColor(context, R.color.color_secondary));
            holder.binding.card.setCardBackgroundColor(ContextCompat.getColor(context, R.color.emerald));
        }

        holder.itemView.setOnClickListener(view -> {
            switch (items.get(position).getId()) {
                case 0:
                    context.startActivity(new Intent(context, FabHeaderActivity.class));
                    break;
                case 1:
                    context.startActivity(new Intent(context, MoviePageActivity.class));
                    break;
                case 2:
                    context.startActivity(new Intent(context, LoginActivity.class));
                    break;
                case 3:
                    context.startActivity(new Intent(context, CarsListActivity.class));
                    break;
                case 4:
                    context.startActivity(new Intent(context, BigImage.class));
                    break;
            }
        });


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemMainBinding binding;

        public ViewHolder(@NonNull ItemMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
