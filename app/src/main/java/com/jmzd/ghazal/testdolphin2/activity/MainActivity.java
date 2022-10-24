package com.jmzd.ghazal.testdolphin2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.adapter.ItemsAdapter;
import com.jmzd.ghazal.testdolphin2.databinding.ActivityMainBinding;
import com.jmzd.ghazal.testdolphin2.model.Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding ;
    private ArrayList<Item> items = new ArrayList<>() ;
    private ItemsAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        items.add(new Item(0 , "0- fab header")) ;
        items.add(new Item(1 , "1- movies page")) ;
        items.add(new Item(2 , "2- login")) ;
        items.add(new Item(3 , "3- Cars List")) ;
        items.add(new Item(4 , "4- Big Image")) ;

        adapter = new ItemsAdapter(items);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3 , StaggeredGridLayoutManager.VERTICAL );
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);




    }
}