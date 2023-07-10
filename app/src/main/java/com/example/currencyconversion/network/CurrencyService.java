package com.example.currencyconversion.network;

import com.example.currencyconversion.model.Currency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyService {

    @GET("v1/latest")
    Call<Currency> getCurrency(@Query("apikey") String apiKey);
}
