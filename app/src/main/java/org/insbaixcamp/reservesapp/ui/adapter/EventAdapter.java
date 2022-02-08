package org.insbaixcamp.reservesapp.ui.adapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.insbaixcamp.reservesapp.R;
import org.insbaixcamp.reservesapp.ui.models.Event;
import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

    protected ArrayList<Event> events;
    private View root;

    public EventAdapter( ArrayList<Event> events) {
        this.events = events;
    }

    //Hola

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(this.root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitol.setText(events.get(position).getNom());
        holder.tvPreu.setText(events.get(position).getPreu());
        holder.tvData.setText(events.get(position).getData());
        Picasso.get().load(events.get(position).getImatges().get(1));
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return events.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitol;
        TextView tvPreu;
        TextView tvData;
        ImageView ivImatge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitol = (TextView) itemView.findViewById(R.id.tvTitol);
            tvPreu = (TextView) itemView.findViewById(R.id.tvPreu);
            tvData = (TextView) itemView.findViewById(R.id.tvData);
            ivImatge = (ImageView) itemView.findViewById(R.id.ivImatge);
        }
    }
}
