package com.faizurazadri.foodapp;

import com.faizurazadri.foodapp.model.Food;

import java.util.ArrayList;

public class FoodData {

    private static String[] foodName = {
            "Geprek Bensu",
            "Blenger Burger",
            "Eatlah",
            "By Anind",
            "Ayam Keprabon",
            "Tuku",
            "Roti Nogat",
            "HONU Poké & Matcha Bar",
            "Sate Taichan Goreng",
            "Bebek Kaleyo"
    };

    public static String[] food_Description = {
            "Menu ini berisi ayam geprek, telur, dan keju mozarella. Kejunya cheesy banget dan saling melengkapi dengan gurihnya ayam.",
            "Salah satu faktornya mungkin karena harganya yang bersahabat",
            "Rasa makanan yang ditawarkan memang tidak pernah mengecewakan.",
            "Menu ini memang terasa luar biasa. Maka tidak salah kalau Gojek memberikan gelar sebagai juara partner GoFood dengan invasi terbaik",
            "Penampilan sambalnya seperti sambal ulek, tapi rasanya ada sensasi kare yang enak sekali saat disantap dengan ayam gepreknya.",
            "Tuku menyabet penghargaan juara partner GoFood dengan pelanggan setia terbanyak. Memang tak perlu diragukan, Kopi Susu Tetangga memang cocok diandalkan sebagai mood booster pekerja kantoran atau pelajar setiap hari",
            "Roti Nogat dipilih sebagai juara makanan di GoFood yang paling sering dipesan orang sebagai menu sarapan pagi",
            "Two and Two yang akan memanjakan lidah kalian dengan sushi rice, tuna, salmon, creamy sauce, veggie, dan wakame. Semua bahannya dimarinasi dengan sempurna, sehingga rasanya enak walaupun dimakan dalam keadaan mentah. ",
            "ate taichan di sini dimasak dengan cara digoreng. Yang bikin rasanya makin mantap adalah sambalnya yang super pedas. ",
            "bebek goreng kremes, sate, sayur bunga pepaya, teri kacang, telor asin, pete, dan sambal"
    };

    public static String[] food_address = {
            "Bepbop Food Studio, Jl. Tebet Barat IX No. 1, Tebet, Jakarta",
            "Jl. Bumi No. 56, Blok M, Jakarta Selatan",
            "Jl. Bumi No. 26, Blok M, Jakarta. ",
            "Jl. Duren Tiga Indah 5 No.9, RT.11/RW.4, Duren Tiga, Pancoran, Jakarta Selatan.",
            "Jl. Bintaro Utama 5, Pondok Aren, Tangerang. ",
            "Jl. Cipete Raya No. 7, Fatmawati, Jakarta. ",
            "Ruko Pasar Modern BSD No. 15, Jl. Letnan Sutopo, Serpong, Tangerang. ",
            "Jl. H. Agus Salim No. 60, Thamrin, Jakarta. ",
            "Jl. Tebet Raya No.70, RT.2/RW.4, Tebet Tim., Kec. Tebet, Kota Jakarta Selatan. ",
            "Jl. KH Abdullah Syafei No. 49, Tebet, Jakarta."
    };

    public static int[] food_image = {
            R.drawable.food_1,
            R.drawable.food_2,
            R.drawable.food_3,
            R.drawable.food_4,
            R.drawable.food_5,
            R.drawable.food_6,
            R.drawable.food_7,
            R.drawable.food_8,
            R.drawable.food_9,
            R.drawable.food_10
    };

    public static String[] food_rate = {
            "4.7",
            "4.6",
            "4.9",
            "3.9",
            "4.0",
            "4.4",
            "4.2",
            "4.1",
            "3.8",
            "4.8"
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();

        for (int position = 0; position < foodName.length; position++){
            Food food = new Food();
            food.setFood_name(foodName[position]);
            food.setFood_Description(food_Description[position]);
            food.setFood_address(food_address[position]);
            food.setFood_image(food_image[position]);
            food.setFood_rate(food_rate[position]);
            list.add(food);
        }

        return list;
    }
}
