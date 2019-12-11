package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ParrotTest {

	private Parrot parrotDog;
	private Parrot parrotCat;
	private Parrot parrotRooster;
	
	public ParrotTest(){
		this.parrotDog = new Parrot(new Dog());
		this.parrotCat = new Parrot(new Cat());
		this.parrotRooster = new Parrot(new Rooster());		
	}
		
	@Test
	public void singTestDog() {
		assertEquals("Woof, woof", parrotDog.sing());
	}
	
	@Test
	public void singTestCat() {
		assertEquals("Meow", parrotCat.sing());
	}
	
	@Test
	public void singTestRooster() {
		assertEquals("Cock-a-doodle-doo", parrotRooster.sing());
	}
}
