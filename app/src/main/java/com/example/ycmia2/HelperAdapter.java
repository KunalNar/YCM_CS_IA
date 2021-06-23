package com.example.ycmia2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HelperAdapter extends RecyclerView.Adapter {

    List<Fetchdata> fetchdatalist;

    public HelperAdapter(List<Fetchdata> fetchdata) {
        this.fetchdatalist = fetchdata;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        ViewHodlerClass viewHodlerClass = new ViewHodlerClass(view);


        return viewHodlerClass;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {

        ViewHodlerClass viewHolderClass =(ViewHodlerClass)holder;

        Fetchdata fetchdata = fetchdatalist.get(position);
        viewHolderClass.name.setText(fetchdata.getName());
        viewHolderClass.phone_number.setText(fetchdata.getPhone_number());
        viewHolderClass.address.setText(fetchdata.getAddress());

    }

    @Override
    public int getItemCount() {
        return fetchdatalist.size();
    }

    public class ViewHodlerClass extends RecyclerView.ViewHolder{
        TextView name,phone_number,address;

        public ViewHodlerClass(@NonNull @NotNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            phone_number = itemView.findViewById(R.id.phone);
            address = itemView.findViewById(R.id.address);

        }
    }
}
