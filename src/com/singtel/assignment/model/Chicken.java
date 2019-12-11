package com.singtel.assignment.model;

import com.singtel.assignment.model.features.BirdFeature;

public class Chicken implements BirdFeature {

	@Override
	public String chirp() {
		return "Cluck, cluck";
	}

	@Override
	public String behaviour() {
		return "The chicken cannot fly";
	}

}
