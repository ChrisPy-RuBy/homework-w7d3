package com.codeclan.example.mytoptenlists;

/**
 * Created by mac on 5/24/17.
 */

public class List {

    private String title;
    private int numberOfItems;
    private int ranking;


public List(String title, int numberOfItems, int ranking) {
        this.title = title;
        this.numberOfItems = numberOfItems;
        this.ranking = ranking;
    }

    public String getList() {
        return title;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getRanking() {
        return ranking;
    }
}
