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
		String exprcted = "I am flying";
		String actual = bird.fly();
		
        assertEquals(exprcted, actual);
    }
      
    @Test
    public void singTest() { 
    	String exprcted = "I am singing";
		String actual = bird.sing();
		
		assertEquals(exprcted, actual);
    }
         
}