package com.jmzd.ghazal.testdolphin2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jmzd.ghazal.testdolphin2.R;
import com.jmzd.ghazal.testdolphin2.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        binding = ActivityLoginBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());
    }
}