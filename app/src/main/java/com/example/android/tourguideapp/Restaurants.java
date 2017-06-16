package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurants extends Fragment {


    public Restaurants() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View restaurants = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Item> restaurant = new ArrayList<Item>();

        restaurant.add(new Item(R.string.beer_house_title, R.string.beer_house_location, R.drawable.beer_house));
        restaurant.add(new Item(R.string.domino_title, R.string.domino_location, R.drawable.domino));

        ItemAdapter restaurantAdapter = new ItemAdapter(getContext(), restaurant);

        ListView listView = (ListView) restaurants.findViewById(R.id.list);

        listView.setAdapter(restaurantAdapter);

        return restaurants;
    }

}
