package com.example.javaproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder> {

    private final LayoutInflater layoutInflater;
    private final List<State> states;

    public StateAdapter(LayoutInflater layoutInflater, List<State> states) {
        this.layoutInflater = layoutInflater;
        this.states = states;
    }

    @NonNull
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.test, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateAdapter.ViewHolder holder, int position) {
        State state = states.get(position);
        holder.flagImg.setImageResource((state.getFlag()));
        holder.capitalText.setText(state.getCapital());
        holder.countryText.setText(state.getName());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        final ImageView flagImg;
        final TextView capitalText;
        final TextView countryText;

        ViewHolder(View itemView){
            super(itemView);
            this.flagImg = itemView.findViewById(R.id.flagImageID);
            this.capitalText = itemView.findViewById(R.id.countryID);
            this.countryText = itemView.findViewById(R.id.capitalID);
        }
    }
}
