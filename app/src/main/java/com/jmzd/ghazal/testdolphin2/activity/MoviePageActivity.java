package com.jmzd.ghazal.testdolphin2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.adapter.ItemsAdapter;
import com.jmzd.ghazal.testdolphin2.adapter.MoviesAdapter;
import com.jmzd.ghazal.testdolphin2.databinding.ActivityMoviePageBinding;
import com.jmzd.ghazal.testdolphin2.model.Movie;

import java.util.ArrayList;

public class MoviePageActivity extends AppCompatActivity {

    private ActivityMoviePageBinding binding ;
    private ArrayList<Movie> movies = new ArrayList<>() ;
    private MoviesAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMoviePageBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        movies.add(new Movie( "Rick & Morty", R.drawable.pic));
        movies.add(new Movie("Vikings", R.drawable.pic3));
        movies.add(new Movie("Squid games", R.drawable.pic4));
        movies.add(new Movie("Rick & Morty", R.drawable.pic));
        movies.add(new Movie("Vikings", R.drawable.pic3));
        movies.add(new Movie("Squid games", R.drawable.pic4));
        movies.add(new Movie("Rick & Morty", R.drawable.pic));
        movies.add(new Movie("Vikings", R.drawable.pic3));
        movies.add(new Movie("Squid games", R.drawable.pic4));
        movies.add(new Movie( "Rick & Morty", R.drawable.pic));
        movies.add(new Movie( "Vikings", R.drawable.pic3));

        adapter = new MoviesAdapter(movies);
        LinearLayoutManager layoutManager = new LinearLayoutManager( this , RecyclerView.VERTICAL , false);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);

    }
}