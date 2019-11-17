package com.testgit.exemple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld(){
        assertEquals("Hello World", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10(){
        assertEquals(10, MessageBuilder.getNumber10());
    }

}
