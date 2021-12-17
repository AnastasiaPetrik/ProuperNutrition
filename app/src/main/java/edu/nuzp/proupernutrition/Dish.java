package edu.nuzp.proupernutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);

        ListView dish = (ListView) findViewById(R.id.dish);

        Bundle arguments = getIntent().getExtras();
        ArrayList<Dishes> dishes = new ArrayList<Dishes>();
        if(arguments!=null){
            String dish1 = arguments.getString("dish");
            String components = arguments.getString("components");
            String country = arguments.getString("country");
            String author = arguments.getString("author");
            String cooking = arguments.getString("cooking");
            dishes.add(new Dishes(dish1, components,country,author,cooking));
            DishesAdapter dishAdapter = new DishesAdapter(this, R.layout.list_item, dishes);
            dish.setAdapter(dishAdapter);
        }
    }
}