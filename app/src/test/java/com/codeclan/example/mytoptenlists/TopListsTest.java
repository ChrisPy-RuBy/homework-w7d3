package com.codeclan.example.mytoptenlists;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/24/17.
 */
public class TopListsTest {

    @Test
    public void topListsTest() {
        TopLists topLists = new TopLists();
                assertEquals(4, topLists.getList().size());
    }

}