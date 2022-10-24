package com.jmzd.ghazal.testdolphin2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.jmzd.ghazal.testdolphin2.databinding.ItemMovieBinding;
import com.jmzd.ghazal.testdolphin2.model.Movie;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    private ArrayList<Movie> items  ;
    private Context context ;

    public MoviesAdapter(ArrayList<Movie> items) {

        this.items = items ;

    }

    @NonNull
    @Override
    public MoviesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext() ;
        ItemMovieBinding v = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new MoviesAdapter.ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.ViewHolder holder, int position) {

        holder.binding.img.setImageDrawable(ContextCompat.getDrawable(context , items.get(position).getImage()));
        holder.binding.txt.setText(items.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemMovieBinding binding;

        public ViewHolder(@NonNull ItemMovieBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
