package com.faizurazadri.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.faizurazadri.foodapp.databinding.ItemFoodBinding;
import com.faizurazadri.foodapp.model.Food;

import java.util.ArrayList;

public class AdapterFood extends RecyclerView.Adapter<AdapterFood.ViewHolderFood> {

    private ArrayList<Food> foodArrayList;
    private Context context;

    public AdapterFood(ArrayList<Food> foodArrayList, Context context) {
        this.foodArrayList = foodArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderFood onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFoodBinding itemFoodBinding = ItemFoodBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolderFood(itemFoodBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFood holder, int position) {
        Food food = foodArrayList.get(position);
        holder.setBinding(food);
    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    public class ViewHolderFood extends RecyclerView.ViewHolder {
        final ItemFoodBinding binding;

        public ViewHolderFood(ItemFoodBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }

        void setBinding(Food food) {
            Glide.with(context)
                    .load(food.getFood_image())
                    .into(binding.imgFood);

            binding.foodName.setText(food.getFood_name());
            binding.foodDescription.setText(food.getFood_Description());
            binding.foodAddress.setText(food.getFood_address());
            binding.rateFood.setText(food.getFood_rate());
        }
    }
}
