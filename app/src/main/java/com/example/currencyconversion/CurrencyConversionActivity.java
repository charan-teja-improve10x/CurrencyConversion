package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.currencyconversion.databinding.ActivityCurrencyConversionBinding;

public class CurrencyConversionActivity extends AppCompatActivity {

    private ActivityCurrencyConversionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrencyConversionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}