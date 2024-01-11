package com.lizyaver.reminder_app.Activity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lizyaver.reminder_app.Models.Model;
import com.lizyaver.reminder_app.R;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myAdapterViewHolder> {

    List<Model> modelList;

    public myAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public myAdapter.myAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_notification_message, parent, false);
        return new myAdapter.myAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.myAdapterViewHolder holder, int position) {
        Model model = modelList.get(position);

        holder.date.setText(model.getDate());
        holder.message.setText(model.getTitle());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class myAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView message, date;
        public myAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            message = itemView.findViewById(R.id.message);
            date = itemView.findViewById(R.id.date);
        }
    }
}
