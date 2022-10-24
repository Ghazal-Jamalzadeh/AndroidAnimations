package com.jmzd.ghazal.testdolphin2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.adapter.CarsAdapter;
import com.jmzd.ghazal.testdolphin2.adapter.ItemsAdapter;
import com.jmzd.ghazal.testdolphin2.databinding.ActivityCarsListBinding;
import com.jmzd.ghazal.testdolphin2.model.Car;

import java.util.ArrayList;

public class CarsListActivity extends AppCompatActivity {

    private ActivityCarsListBinding binding ;
    private ArrayList<Car> items =  new ArrayList<>()  ;
    private CarsAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_list);

        binding = ActivityCarsListBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        items.add(new Car("offroad 1" , 1200 , "kjncjev erv  bvgevg evgr vbgeg" , R.drawable.offroad_car_1));
        items.add(new Car("offroad 2" , 200000 , "kjncjev erv  bvgevghfd" , R.drawable.offroad_car_2));
        items.add(new Car("offroad 3" , 33200 , "kjncjev erv  bvgevg evgr vbgegkjncjev erv  bvgevg evgr vbgeg" , R.drawable.offroad_car_3));
        items.add(new Car("offroad 4" , 12400 , "kjncjev erv  bvgevg evghhhr vbgeg" , R.drawable.offroad_car_4));
        items.add(new Car("offroad 5" , 1200 , "kjncjev erv  bvgevg evgr vbgeg" , R.drawable.offroad_car_1));
        items.add(new Car("offroad 6" , 200000 , "kjncjev erv  bvgevghfd" , R.drawable.offroad_car_2));
        items.add(new Car("offroad 7" , 33200 , "kjncjev erv  bvgevg evgr vbgegkjncjev erv  bvgevg evgr vbgeg" , R.drawable.offroad_car_3));
        items.add(new Car("offroad 8" , 12400 , "kjncjev erv  bvgevg evghhhr vbgeg" , R.drawable.offroad_car_4));

        adapter = new CarsAdapter(items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this , RecyclerView.VERTICAL , false);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);

    }
}