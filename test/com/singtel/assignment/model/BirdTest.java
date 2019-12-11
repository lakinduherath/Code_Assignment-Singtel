package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BirdTest {
	private Bird bird;
	
	public BirdTest() {
		this.bird = new Bird();
	}

	@Test
    public void flyTest() {       
        assertEquals("I am flying", bird.fly());
    }
      
    @Test
    public void singTest() {        
        assertEquals("I am singing", bird.sing());
    }
         
}