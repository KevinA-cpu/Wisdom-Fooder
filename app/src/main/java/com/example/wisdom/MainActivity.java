package com.example.wisdom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wisdom.adapter.FoodAdapter_Row;
import com.example.wisdom.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView foodRecycler;
    FoodAdapter_Row foodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dummy data food
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Fruit salad mix", "Delics Fruit salad, Ngasem", "22.500", "18.500", "5 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));
        foodList.add(new Food("Fruit salad mix", "Delics Fruit salad, Ngasem", "22.500", "18.500", "5 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));
        foodList.add(new Food("Fruit salad mix", "Delics Fruit salad, Ngasem", "22.500", "18.500", "5 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));
        foodList.add(new Food("Fruit salad mix", "Delics Fruit salad, Ngasem", "22.500", "18.500", "5 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));
        foodList.add(new Food("Fruit salad mix", "Delics Fruit salad, Ngasem", "22.500", "18.500", "5 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));

        setFoodRecycler(foodList);


        TextView allPromo = findViewById(R.id.allPromo);
        allPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });


        RelativeLayout notification = findViewById(R.id.notification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });

        TextView favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });

        TextView cheap = findViewById(R.id.cheap);
        cheap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });

        TextView trend = findViewById(R.id.trend);
        trend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });

        TextView more = findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });

        ImageView home = findViewById(R.id.home_icon);
                home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });
        ImageView shopping = findViewById(R.id.shopping_bag_icon);
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });
        ImageView search = findViewById(R.id.search_icon);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });
        ImageView user = findViewById(R.id.user_icon);
                user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setFoodRecycler(List<Food> foodList){
        foodRecycler = findViewById(R.id.foodRow);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        foodRecycler.setLayoutManager(layoutManager);
        foodAdapter = new FoodAdapter_Row(this, foodList);
        foodRecycler.setAdapter(foodAdapter);
    }



}