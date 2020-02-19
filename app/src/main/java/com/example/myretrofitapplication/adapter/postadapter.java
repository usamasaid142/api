package com.example.myretrofitapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myretrofitapplication.R;
import com.example.myretrofitapplication.modle.Datapost;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class postadapter extends RecyclerView.Adapter<postadapter.Viewholder> {

    List<Datapost> datapostList=new ArrayList<>();



    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.userid.setText("userid: "+datapostList.get(position).getUserId());
        holder.id.setText("Id: "+datapostList.get(position).getId()+"");
        holder.title.setText("Title: "+datapostList.get(position).getTitle());
        holder.body.setText("Body: "+datapostList.get(position).getBody());
    }

    @Override
    public int getItemCount() {

        return datapostList.size();
    }

    public void setlist(List<Datapost> dataposts)
    {
        this.datapostList=dataposts;

       notifyDataSetChanged();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        TextView userid,id,title,body;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            userid=itemView.findViewById(R.id.userid);
            id=itemView.findViewById(R.id.id);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);
        }
    }
}
