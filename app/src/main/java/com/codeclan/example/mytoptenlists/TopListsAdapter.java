package com.codeclan.example.mytoptenlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mac on 5/24/17.
 */

public class TopListsAdapter extends ArrayAdapter<List> {

    public TopListsAdapter(Context context, ArrayList<List> lists) {
        super(context, 0, lists);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        List currentList = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(Integer.toString(currentList.getRanking()));

        TextView numberOfItems = (TextView) listItemView.findViewById(R.id.numberOfItems);
        numberOfItems.setText(Integer.toString(currentList.getNumberOfItems()));

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentList.getList().toString());


        listItemView.setTag(currentList);
        return listItemView;

    }
}
