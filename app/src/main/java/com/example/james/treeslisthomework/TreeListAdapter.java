package com.example.james.treeslisthomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by james on 05/07/2017.
 */

public class TreeListAdapter extends ArrayAdapter<Tree>{

    public TreeListAdapter(Context context, ArrayList<Tree> list){
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tree_menu_item, parent, false);
        }

        Tree currentTree = getItem(position);
        listItemView.setTag(currentTree);

        TextView nameView = (TextView) listItemView.findViewById(R.id.name_list_activity);
        nameView.setText(currentTree.getName());

        TextView ageView = (TextView) listItemView.findViewById(R.id.age_list_activity);
        ageView.setText(Integer.toString(currentTree.getAgeInYears()));

        TextView countryView = (TextView) listItemView.findViewById(R.id.country_of_origin_list_activity);
        countryView.setText(currentTree.getCountryOfOrigin());

        return listItemView;
    }

}
