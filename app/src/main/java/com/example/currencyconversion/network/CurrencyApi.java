package com.example.currencyconversion.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyApi {

    public CurrencyService createCurrencyService() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.freecurrencyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        CurrencyService currencyService = retrofit.create(CurrencyService.class);
        return currencyService;
    }
}
