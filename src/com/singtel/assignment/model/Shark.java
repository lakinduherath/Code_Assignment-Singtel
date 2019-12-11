package com.singtel.assignment.model;

import com.singtel.assignment.model.features.FishFeatures;

public class Shark extends Fish implements FishFeatures {

	@Override
	public String behaviour() {
		return "Eat other fish";
	}

	@Override
	public String features() {
		return "Large and grey";
	}


}
