package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {

	private Cat cat;
	
	public CatTest() {
		this.cat = new Cat();
	}
	
	@Test
	public void soundTest() {
		assertEquals("Meow", cat.sound());
	}
}
