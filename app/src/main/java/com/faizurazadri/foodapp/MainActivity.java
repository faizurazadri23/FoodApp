package com.faizurazadri.foodapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.faizurazadri.foodapp.adapter.AdapterFood;
import com.faizurazadri.foodapp.databinding.ActivityMainBinding;
import com.faizurazadri.foodapp.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private ArrayList<Food> foodArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        foodArrayList.addAll(FoodData.getListData());
        showFoodData();

    }

    private void showFoodData() {
        mainBinding.rvFood.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.rvFood.setHasFixedSize(true);
        AdapterFood adapterFood = new AdapterFood(foodArrayList, this);
        adapterFood.notifyDataSetChanged();
        mainBinding.rvFood.setAdapter(adapterFood);
    }

}