package com.codeclan.example.mytoptenlists;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by mac on 5/24/17.
 */

public class TopListsAdapter extends ArrayAdapter<List> {

    public TopListsAdapter(Context context, ArrayList<List> lists) {
        super(context, 0, lists);
    }
}
Ω