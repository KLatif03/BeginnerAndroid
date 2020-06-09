package com.dicoding.picodiploma.mysubmissionap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.dicoding.picodiploma.mysubmissionap.Food;
import com.dicoding.picodiploma.mysubmissionap.FoodData;
import com.dicoding.picodiploma.mysubmissionap.ListFoodAdapter;
import com.dicoding.picodiploma.mysubmissionap.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);
        rvFood.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();

        RecyclerView recyclerView = findViewById(R.id.rv_food);
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(getBaseContext(), list)
    }

    private void showRecyclerList() {
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFood.setAdapter(listFoodAdapter);
    }
}
