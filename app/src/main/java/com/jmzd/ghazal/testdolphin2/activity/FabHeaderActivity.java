package com.jmzd.ghazal.testdolphin2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.databinding.ActivityFabHeaderBinding;

public class FabHeaderActivity extends AppCompatActivity {

    private ActivityFabHeaderBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_header);

        binding = ActivityFabHeaderBinding.inflate(getLayoutInflater()) ;

    }
}