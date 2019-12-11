package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class RoosterTest {

	private Rooster rooster;
	
	public RoosterTest() {
		this.rooster = new Rooster();
	}
	
	@Test
	public void chirpTest() {		
		assertEquals("Cock-a-doodle-doo", rooster.chirp());
	}
}
