package com.codeclan.example.mytoptenlists;

import java.util.ArrayList;
import java.util.zip.ZipEntry;

/**
 * Created by mac on 5/24/17.
 */

public class TopLists {

    private ArrayList<List> list;

    public TopLists() {
    list = new ArrayList<List>();
        list.add(new List("Top ten top tens", 10, 1));
        list.add(new List("47 bullshit reasons to learn coding", 47, 2));
        list.add(new List("Top 5 reasons no one likes you", 5, 3));
        list.add(new List("Attractive coders", 0 , 4));

    }
    public ArrayList<List> getList() {
        return new ArrayList<List>(list);
    }
}

