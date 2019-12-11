package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ButterflyTest {

	private Butterfly butterfly = new Butterfly();
	
	public ButterflyTest() {
		butterfly = new Butterfly();
	}

	@Test
    public void flyTest() {       
        assertEquals("I am flying", butterfly.fly());
    }   
}
