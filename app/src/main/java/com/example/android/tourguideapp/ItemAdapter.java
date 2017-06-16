package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbit2 on 15.6.2017 г..
 */

public class ItemAdapter extends ArrayAdapter<Item>{
    public ItemAdapter(Context context, ArrayList<Item> item) {
        super(context,0 , (List<Item>) item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.text1);
        // Get the Title name from the current Item object and
        // set this text on the name TextView
        titleTextView.setText(currentItem.getTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        final TextView locationTextView = (TextView) listItemView.findViewById(R.id.text2);
        // Get the Location  from the current Item object and
        // set this text on the number TextView
        locationTextView.setText(currentItem.getLocation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Item object and
        // set the image to imageView
        imageView.setImageResource(currentItem.getImageResourceId());


        locationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView location = (TextView) v;
                String currentAddress = location.getText().toString();
                direction(currentAddress);
            }
        });

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    //Create an intent to open google maps with the selected location
    private void direction(String location) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?").buildUpon().appendQueryParameter("q", location).build();
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(gmmIntentUri);
        getContext().startActivity(mapIntent);
    }
}
