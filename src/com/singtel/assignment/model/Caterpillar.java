package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Walking;

public class Caterpillar implements Walking {

	@Override
	public String walk() {
		return "I am crawling";
	}
	
	public Butterfly metamorphosis() {
		return new Butterfly();
	}

}
