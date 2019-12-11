package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ChickenTest {
	
	private Chicken chicken;
	
	public ChickenTest() {
		this.chicken = new Chicken();
	}
	
	@Test
	public void chirpTest() {
		assertEquals("Cluck, cluck", chicken.chirp());
	}
	
	@Test
	public void behaviourTest() {
		assertEquals("The chicken cannot fly", chicken.behaviour());		
	}
}