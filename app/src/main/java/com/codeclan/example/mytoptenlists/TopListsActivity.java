package com.codeclan.example.mytoptenlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopListsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lists_list);

        TopLists topLists = new TopLists();
        ArrayList<List> list = topLists.getList();

        TopListsAdapter listsAdapter = new TopListsAdapter(this, list);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(listsAdapter);
    }
}

