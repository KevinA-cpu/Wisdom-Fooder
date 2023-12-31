package com.example.wisdom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wisdom.R;
import com.example.wisdom.model.Food;

import java.util.List;

public class FoodAdapter_Row extends RecyclerView.Adapter<FoodAdapter_Row.FoodViewHolder> {

    Context context;
    List<Food> foodList;


    public FoodAdapter_Row(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_row_item, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(foodList.get(position).getFoodImage());
        holder.foodName.setText(foodList.get(position).getFoodName());
        holder.foodDescription.setText(foodList.get(position).getFoodDescription());
        holder.foodOriginalPrice.setText(foodList.get(position).getFoodOriginalPrice());
        holder.foodDiscountedPrice.setText(foodList.get(position).getFoodDiscountedPrice());
        holder.foodAmount.setText(foodList.get(position).getFoodAmount());




    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }


    public static final class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView foodName, foodDescription, foodOriginalPrice, foodDiscountedPrice, foodAmount;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage= itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodDescription = itemView.findViewById(R.id.foodDescription);
            foodOriginalPrice = itemView.findViewById(R.id.foodOriginalPrice);
            foodDiscountedPrice = itemView.findViewById(R.id.foodDiscountedPrice);
            foodAmount = itemView.findViewById(R.id.foodAmount);
        }
    }
}
