package com.example.myretrofitapplication.api;

import com.example.myretrofitapplication.modle.Datapost;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Websrevice {

        @GET("posts")
        Call<List<Datapost>> getdata();
}
