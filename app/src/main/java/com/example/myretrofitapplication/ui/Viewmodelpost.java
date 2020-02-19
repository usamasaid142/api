package com.example.myretrofitapplication.ui;

import com.example.myretrofitapplication.api.Apimanger;
import com.example.myretrofitapplication.modle.Datapost;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Viewmodelpost extends ViewModel {

    MutableLiveData<List<Datapost>> mutableLiveData=new MutableLiveData<>();

    public void getdatafrom()
    {
        Apimanger.getapi().getdata().enqueue(new Callback<List<Datapost>>() {
            @Override
            public void onResponse(Call<List<Datapost>> call, Response<List<Datapost>> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Datapost>> call, Throwable t) {

            }
        });
    }
}
