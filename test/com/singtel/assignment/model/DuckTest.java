package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DuckTest {
	
	private Duck duck;
	
	public DuckTest() {
		this.duck = new Duck();
	}
	
	@Test
	public void chirpTest() {
		assertEquals("Quack, quack", duck.chirp());
	}

	@Test
	public void behaviourTest() {
		assertEquals("The duck can swim", duck.behaviour());
	}
	
	@Test
	public void swimTest() {
		assertEquals("I am swimming", duck.swim());
	}

}
