package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Swimming;

public class Fish implements Swimming {

	@Override
	public String swim() {
		return "I am swimming";
	}

}
