package com.jmzd.ghazal.testdolphin2.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.databinding.ItemCarsBinding;
import com.jmzd.ghazal.testdolphin2.databinding.ItemMovieBinding;
import com.jmzd.ghazal.testdolphin2.model.Car;
import com.jmzd.ghazal.testdolphin2.model.Movie;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.ViewHolder> {

    private ArrayList<Car> items  ;
    private Context context ;

    public CarsAdapter(ArrayList<Car> items) {

        this.items = items ;

    }

    @NonNull
    @Override
    public CarsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext() ;
        ItemCarsBinding v = ItemCarsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new CarsAdapter.ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull CarsAdapter.ViewHolder holder, int position) {

        Car item = items.get(position) ;

        holder.binding.image.setImageDrawable(ContextCompat.getDrawable(context , item.getImage()));
        holder.binding.title.setText(item.getModel());
        holder.binding.price.setText(String.valueOf(item.getPrice()));
        holder.binding.details.setText(item.getDescription());
        holder.binding.name.setText(item.getModel());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCarsBinding binding;

        public ViewHolder(@NonNull ItemCarsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
