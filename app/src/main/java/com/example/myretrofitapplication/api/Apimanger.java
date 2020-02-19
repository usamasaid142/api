package com.example.myretrofitapplication.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apimanger {

    private static Retrofit retrofit;

    private static Retrofit getinstance()
    {

        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }


    public static Websrevice getapi()
    {
        return getinstance().create(Websrevice.class);
    }
}
