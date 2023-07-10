package com.example.currencyconversion;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.currencyconversion.model.Currency;
import com.example.currencyconversion.network.CurrencyApi;
import com.example.currencyconversion.network.CurrencyService;
import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void fetchCurrencies() throws IOException {
        CurrencyService currencyService = new CurrencyApi().createCurrencyService();
        Call<Currency> currencyCall = currencyService.getCurrency("5gNNb0ABB84SCTJ68rrZIBx4JhnDD1jBLGKivVhI");
        Currency currency = currencyCall.execute().body();
        assertNotNull(currency);
        System.out.println(new Gson().toJson(currency));
    }

}