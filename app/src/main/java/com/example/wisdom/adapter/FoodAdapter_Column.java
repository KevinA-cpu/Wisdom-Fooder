package com.example.wisdom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wisdom.R;
import com.example.wisdom.model.Food;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FoodAdapter_Column extends RecyclerView.Adapter<FoodAdapter_Column.FoodViewHolder> {

    Context context;
    List<Food> foodList;


    public FoodAdapter_Column(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_column_item, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(foodList.get(position).getFoodImage());
        holder.foodName.setText(foodList.get(position).getFoodName());
        holder.foodDescription.setText(foodList.get(position).getFoodDescription());
        holder.foodOriginalPrice.setText(foodList.get(position).getFoodOriginalPrice());
        holder.foodDiscountedPrice.setText(foodList.get(position).getFoodDiscountedPrice());


        // Get the food amount string
        String foodAmount = foodList.get(position).getFoodAmount();
        String numberPattern = "(\\d+)";
        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(foodAmount);

        if (matcher.find()) {
            // Extracted number from the food amount string
            String numberString = matcher.group();

            // Convert the extracted number to an integer
            int number = Integer.parseInt(numberString);

            if (number > 5) {
                // Set visibility to INVISIBLE if the number is greater than 5
                holder.foodAmount.setVisibility(View.INVISIBLE);
            } else {
                // Set visibility to VISIBLE otherwise
                holder.foodAmount.setText(foodAmount);
                holder.foodAmount.setVisibility(View.VISIBLE);
            }
        }


        holder.amountButton.setVisibility(View.GONE);
        holder.editButton.setVisibility(View.INVISIBLE);



        // Set click listener for the "Add" button
        holder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button press event
                // Update button visibility
                holder.addButton.setVisibility(View.GONE);
                holder.amountButton.setVisibility(View.VISIBLE);
                holder.editButton.setVisibility(View.VISIBLE);




            }
        });

        holder.amountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button press event
                // Update button visibility
                holder.addButton.setVisibility(View.VISIBLE);
                holder.amountButton.setVisibility(View.GONE);
                holder.editButton.setVisibility(View.INVISIBLE);

            }
        });



    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }


    public static final class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView foodName, foodDescription, foodOriginalPrice, foodDiscountedPrice, foodAmount;

        CardView addButton;
        TextView  amountButton;

        ImageView editButton;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage= itemView.findViewById(R.id.foodImagePromo);
            foodName = itemView.findViewById(R.id.foodNamePromo);
            foodDescription = itemView.findViewById(R.id.foodDescriptionPromo);
            foodOriginalPrice = itemView.findViewById(R.id.foodOriginalPricePromo);
            foodDiscountedPrice = itemView.findViewById(R.id.foodDiscountedPricePromo);
            foodAmount = itemView.findViewById(R.id.foodAmountPromo);

            addButton = itemView.findViewById(R.id.addButton);
            amountButton = itemView.findViewById(R.id.amountButton);
            editButton = itemView.findViewById(R.id.editButton);
        }
    }
}
