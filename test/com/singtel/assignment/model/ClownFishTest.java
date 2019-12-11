package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ClownFishTest {

	private ClownFish clownFish;
	
	public ClownFishTest() {
		this.clownFish = new ClownFish();
	}

	@Test
	public void behaviourTest() {
		assertEquals("Make jokes", clownFish.behaviour()); 
	}

	@Test
	public void featuresTest() {
		assertEquals("Small and colourful (orange)", clownFish.features()); 		
	}
}
