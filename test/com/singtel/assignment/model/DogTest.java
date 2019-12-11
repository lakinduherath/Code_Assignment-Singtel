package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DogTest {

	private Dog dog;
	
	public DogTest() {
		this.dog = new Dog();
	}
	
	@Test
	public void soundTest() {
		assertEquals("Woof, woof", dog.sound());
	}
}
