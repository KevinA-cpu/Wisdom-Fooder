package com.example.wisdom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wisdom.R;
import com.example.wisdom.model.Location;

import java.util.List;

public class LocationAdapter_Column  extends RecyclerView.Adapter<LocationAdapter_Column.LocationViewHolder> {

    Context context;
    List<Location> locationList;

    public LocationAdapter_Column(Context context, List<Location> locationList){
        this.context = context;
        this.locationList=locationList;
    }

    @NonNull
    @Override
    public LocationAdapter_Column.LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.location_column_item, parent, false);
        return new LocationAdapter_Column.LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationAdapter_Column.LocationViewHolder holder, int position) {

        holder.locationName.setText(locationList.get(position).getLocationName());
        holder.locationAddress.setText(locationList.get(position).getLocationAddress());
        holder.locationRating.setText(locationList.get(position).getLocationRating());
        holder.locationDistance.setText(locationList.get(position).getLocationDistance());
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        FoodAdapter_Column foodAdapter_column = new FoodAdapter_Column(context, locationList.get(position).getFoodList());
        holder.foodRecycler.setLayoutManager(layoutManager);
        holder.foodRecycler.setAdapter(foodAdapter_column);

    }


    @Override
    public int getItemCount() {
        return locationList.size();
    }

    public static final class LocationViewHolder extends RecyclerView.ViewHolder{

        RecyclerView foodRecycler;
        TextView locationName, locationAddress, locationRating, locationDistance;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            locationName = itemView.findViewById(R.id.locationName);
            locationAddress = itemView.findViewById(R.id.locationAddress);
            locationRating = itemView.findViewById(R.id.locationRating);
            locationDistance = itemView.findViewById(R.id.locationDistance);
            foodRecycler = itemView.findViewById(R.id.foodColumn);
        }
    }

}
