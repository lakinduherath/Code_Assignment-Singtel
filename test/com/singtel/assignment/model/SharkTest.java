package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SharkTest {
	
	private Shark shark;
	
	public SharkTest() {
		this.shark = new Shark();
	}

	@Test
	public void behaviourTest() {
		assertEquals("Eat other fish", shark.behaviour()); 
	}

	@Test
	public void featuresTest() {
		assertEquals("Large and grey", shark.features()); 		
	}
	
	
}
