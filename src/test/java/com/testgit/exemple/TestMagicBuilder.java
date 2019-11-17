package com.testgit.exemple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLucky(){
        assertEquals(7, MagicBuilder.getLucky());
    }

}
