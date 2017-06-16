package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EcoPaths extends Fragment {


    public EcoPaths() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ecoPaths = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Item> ecoPath = new ArrayList<Item>();

        ecoPath.add(new Item(R.string.bozhenci_title,R.string.bozhentci_location, R.drawable.bojenci));

        ItemAdapter ecoPathAdapter = new ItemAdapter(getContext(), ecoPath);

        ListView listView = (ListView) ecoPaths.findViewById(R.id.list);

        listView.setAdapter(ecoPathAdapter);

        return ecoPaths;
    }

}
