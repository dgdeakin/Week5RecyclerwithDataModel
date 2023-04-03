package com.application.week5recyclerwithdatamodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    List<MyDataModel> personsList;

    public MyAdapter(Context context, List<MyDataModel> personsList) {
        this.context = context;
        this.personsList = personsList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        holder.name.setText(personsList.get(position).getName());
        holder.description.setText(personsList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return personsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);

        }
    }
}
