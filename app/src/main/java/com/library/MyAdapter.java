package com.library;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.library.Entities.UsersEntity;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private List<UsersEntity> userentity = new ArrayList<>();

    @NonNull
    @NotNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_kwellcome, parent, false);
        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyHolder holder, int position) {
        UsersEntity currentUserEntity = userentity.get(position);
        holder.textviewfirstname.setText(currentUserEntity.getU_firstname());
        holder.textviewlastname.setText(currentUserEntity.getU_lastname());


    }

    @Override
    public int getItemCount() {
        return userentity.size();
    }
    public void SetUserEntity(){
        this.userentity=userentity;
        notifyDataSetChanged();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        private TextView textviewfirstname;
        private TextView textviewlastname;

        public MyHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            textviewfirstname = itemView.findViewById(R.id.lenom);

        }
    }
}
