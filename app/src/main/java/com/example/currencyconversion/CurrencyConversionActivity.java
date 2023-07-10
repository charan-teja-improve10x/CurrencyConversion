package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.currencyconversion.databinding.ActivityCurrencyConversionBinding;

public class CurrencyConversionActivity extends AppCompatActivity {

    private ActivityCurrencyConversionBinding binding;
    private ArrayAdapter adapter;
    private String[] currencyTypes = {"Select", "Australian Dollar(AUD)", "Balgarian Lev(BGN)", "Brazil Real(BRL)", "Canadian Dollar(CAD)",
            "Swiss Franc(CHF)", "Chinese Yuan(CNY)", "Czech Krona(CZK)", "Danish Krone(DKK)", "Euro(EUR)", "Pound Sterling(GBP)",
            "Hong Kong Dollar(HKD)", "Croatian Kuna(HRK)", "Hungarian Forint(HUF)", "Indonesian Rupiah(IDR)", "New Israeli Sheqel(ILS)",
            "Indian Rupee(INR)", "Icelandic Krona(ISK)", "Japanese Yen(JPY)", "South Korean Won(KRW)", "Mexican Peso(MXN)",
            "Malaysian Ringgit(MYR)", "Norwegian Krone(NOK)", "New Zealand Dollar(NZD)", "Philippine Peso(PHP)", "Polish Zloty(PLN)",
            "Romanian Leu(RON)", "Russian Ruble(RUB)", "Swedish Krona(SEK)", "Singapore Dollar(SGD)", "Thai Baht(THB)", "Turkish Lira(TRY)",
            "USDollar(USD)", "South African Rand(ZAR)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrencyConversionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupAdapter();
        setupSpinners();
    }

    private void setupSpinners() {
        binding.fromSp.setAdapter(adapter);
        binding.toSp.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, currencyTypes);
    }
}