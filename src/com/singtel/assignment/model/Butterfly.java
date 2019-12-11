package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Flying;

public class Butterfly implements Flying{

	@Override
	public String fly() {
		return "I am flying";
	}

}
