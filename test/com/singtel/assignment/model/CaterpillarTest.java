package com.singtel.assignment.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class CaterpillarTest {

	private Caterpillar caterpillar;
	
	public CaterpillarTest() {
		caterpillar = new Caterpillar();
	}

	@Test
    public void walkTest() {       
        assertEquals("I am crawling", caterpillar.walk());
    }
	
	@Test
	public void metamorphosisTest() {
		assertNotNull(caterpillar.metamorphosis());
	}
}
