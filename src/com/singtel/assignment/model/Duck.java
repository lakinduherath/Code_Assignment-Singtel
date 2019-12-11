package com.singtel.assignment.model;

import com.singtel.assignment.model.features.BirdFeature;
import com.singtel.assignment.model.features.Swimming;

public class Duck implements BirdFeature, Swimming {

	@Override
	public String chirp() {
		return "Quack, quack";
	}

	@Override
	public String behaviour() {
		return "The duck can swim";
	}

	@Override
	public String swim() {
		return "I am swimming";
	}
}
