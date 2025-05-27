package com.example.quickdish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CustomerHomeActivity extends AppCompatActivity {

    private ListView foodListView;
    private FloatingActionButton cartButton;
    private ArrayList<String> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        // Initialize UI components
        foodListView = findViewById(R.id.foodListView);
        cartButton = findViewById(R.id.cartButton);

        // Create dummy list of food items (in-memory, offline)
        foodList = new ArrayList<>();
        foodList.add("Burger - Rs. 350");
        foodList.add("Pizza - Rs. 700");
        foodList.add("Biryani - Rs. 300");
        foodList.add("Pasta - Rs. 500");
        foodList.add("Fries - Rs. 150");
        foodList.add("Zinger - Rs. 400");

        // Attach adapter to ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                foodList
        );
        foodListView.setAdapter(adapter);

        // Set listener for Cart Button (FAB)
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Cart Activity (next step)
                Intent intent = new Intent(CustomerHomeActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}

