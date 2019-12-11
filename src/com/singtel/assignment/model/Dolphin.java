package com.singtel.assignment.model;

import com.singtel.assignment.model.features.Swimming;

public class Dolphin implements Swimming {

	@Override
	public String swim() {
		return "Dolphin swimming";
	}

}
