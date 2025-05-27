package com.example.quickdish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodItemAdapter extends BaseAdapter {

    private Context context;
    private List<FoodItem> foodItemList;

    public FoodItemAdapter(Context context, List<FoodItem> foodItemList) {
        this.context = context;
        this.foodItemList = foodItemList;
    }

    @Override
    public int getCount() {
        return foodItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FoodItem item = foodItemList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        }

        ImageView foodImage = convertView.findViewById(R.id.foodImage);
        TextView foodName = convertView.findViewById(R.id.foodName);
        TextView foodDescription = convertView.findViewById(R.id.foodDescription);
        TextView foodPrice = convertView.findViewById(R.id.foodPrice);

        foodImage.setImageResource(item.getImageResId());
        foodName.setText(item.getName());
        foodDescription.setText(item.getDescription());
        foodPrice.setText("Rs. " + item.getPrice());

        return convertView;
    }
}
