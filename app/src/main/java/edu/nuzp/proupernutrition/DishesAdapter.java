package edu.nuzp.proupernutrition;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DishesAdapter extends ArrayAdapter<Dishes> {

    private LayoutInflater inflater;
    private int layout;
    private List<Dishes> dishes;

    public DishesAdapter(Context context, int resource, List<Dishes> dishes) {
        super(context, resource, dishes);
        this.dishes = dishes;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        TextView nameView = view.findViewById(R.id.name);
        TextView componentsView = view.findViewById(R.id.components);
        TextView countryView = view.findViewById(R.id.country);
        TextView authorView = view.findViewById(R.id.author);
        TextView cookingView = view.findViewById(R.id.cooking);

        Dishes dish = dishes.get(position);

        nameView.setText(dish.getDish());
        componentsView.setText(dish.getComponents());
        countryView.setText(dish.getCountry());
        authorView.setText(dish.getAuthor());
        cookingView.setText(dish.getCooking());
        return view;
    }
}
