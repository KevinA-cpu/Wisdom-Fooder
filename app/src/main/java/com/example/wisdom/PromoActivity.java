package com.example.wisdom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wisdom.adapter.FoodAdapter_Column;
import com.example.wisdom.adapter.FoodAdapter_Row;
import com.example.wisdom.adapter.LocationAdapter_Column;
import com.example.wisdom.model.Food;
import com.example.wisdom.model.Location;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PromoActivity extends AppCompatActivity {

    RecyclerView locationRecycler;
    LocationAdapter_Column locationAdapter_column;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);


        //dummy data food
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Fruit salad mix", "Free delivery", "22.500", "18.500", "5 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));
        foodList.add(new Food("Fruit salad mix", "Free delivery", "22.500", "18.500", "6 left", R.drawable.assorted_sliced_fruits_in_white_ceramic_bowl_10927301));


        List<Location> locationList = new ArrayList<>();
        locationList.add(new Location("Delics Fruit Salad", "Jl. Jaya katwang no 4, Ngasem", "5.0","1 Km", foodList));
        locationList.add(new Location("Delics Fruit Salad", "Jl. Jaya katwang no 4, Ngasem", "5.0","1 Km", foodList));
        locationList.add(new Location("Delics Fruit Salad", "Jl. Jaya katwang no 4, Ngasem", "5.0","1 Km", foodList));
        setLocationRecycler(locationList);


        ImageView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });


        LinearLayout linearLayout = findViewById(R.id.optionsRow);
        final TextView[] selectedTextView = {null};

        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            final CardView cardView = (CardView) linearLayout.getChildAt(i);
            final TextView textView = (TextView) cardView.getChildAt(0);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isSelected = textView.isSelected();

                    // Revert to default state for previously selected view
                    if (selectedTextView[0] != null) {
                        selectedTextView[0].setSelected(false);
                        selectedTextView[0].setTextColor(Color.parseColor("#3E4462"));
                        ((CardView) selectedTextView[0].getParent()).setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    }

                    // Set selected state for clicked view
                    if (!isSelected) {
                        selectedTextView[0] = textView;
                        selectedTextView[0].setSelected(true);
                        selectedTextView[0].setTextColor(Color.parseColor("#FFFFFF"));
                        cardView.setCardBackgroundColor(Color.parseColor("#E84C4F"));
                    } else {
                        selectedTextView[0] = null;
                    }
                }
            });
        }

    }

    private void setLocationRecycler(List<Location> locationList){
        locationRecycler = findViewById(R.id.locationColumn);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        locationRecycler.setLayoutManager(layoutManager);
        locationAdapter_column = new LocationAdapter_Column(this, locationList);
        locationRecycler.setAdapter(locationAdapter_column);
    }
}