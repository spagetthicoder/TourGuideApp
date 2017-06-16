package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Museums extends Fragment {


    public Museums() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View museumView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Item> museum = new ArrayList<Item>();
        museum.add(new Item(R.string.clock_tower_title, R.string.clock_tower_location, R.drawable.clock_tower));
        museum.add(new Item(R.string.slaveykov_title, R.string.slaveykov_location, R.drawable.slaveykov));
        museum.add(new Item(R.string.daskalov_title, R.string.daskalov_location, R.drawable.daskalov));
        museum.add(new Item(R.string.icon_painting_title, R.string.icon_painting_location, R.drawable.icon_painting));
        museum.add(new Item(R.string.old_school_title, R.string.old_school_location, R.drawable.old_school));
        museum.add(new Item(R.string.raykov_title, R.string.raykov_location, R.drawable.raykov));

        ItemAdapter itemsAdapter = new ItemAdapter(getContext(), museum);

        ListView listView = (ListView) museumView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return museumView;
    }

}
