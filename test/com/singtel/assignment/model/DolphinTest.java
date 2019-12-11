package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DolphinTest {

private Dolphin dolphin;
	
	public DolphinTest() {
		this.dolphin = new Dolphin();
	}
	
	@Test
	public void swimTest() {
		assertEquals("Dolphin swimming", dolphin.swim()); 
	}
}
