package com.example.myretrofitapplication.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myretrofitapplication.R;
import com.example.myretrofitapplication.adapter.postadapter;
import com.example.myretrofitapplication.api.Apimanger;
import com.example.myretrofitapplication.modle.Datapost;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    postadapter postadapter;
    Viewmodelpost viewmodelpost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.resycler);
        postadapter=new postadapter();
        viewmodelpost=ViewModelProviders.of(this).get(Viewmodelpost.class);
        viewmodelpost.getdatafrom();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postadapter);

        viewmodelpost.mutableLiveData.observe(this, new Observer<List<Datapost>>() {
            @Override
            public void onChanged(List<Datapost> dataposts) {
                postadapter.setlist(dataposts);
            }
        });


    }
}
