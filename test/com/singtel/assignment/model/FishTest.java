package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FishTest {

	private Fish fish;
	
	public FishTest() {
		this.fish = new Fish();
	}

	@Test
	public void swimTest() {
		assertEquals("I am swimming", fish.swim()); 
	}
}
