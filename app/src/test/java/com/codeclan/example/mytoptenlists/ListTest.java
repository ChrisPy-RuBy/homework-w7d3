package com.codeclan.example.mytoptenlists;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/24/17.
 */
public class ListTest {

    List list;

    @Test
    public void canGetTitle() {
        List list = new List("list",10,1);
        assertEquals("list", list.getList());
    }

    @Test
    public void numberOfItem() {
        List list = new List("list",10,1);
        assertEquals(10, list.getNumberOfItems());
    }

    @Test
    public void ranking() {
        List list = new List("list",10,1);
        assertEquals(1, list.getRanking());
    }

}